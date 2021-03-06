package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InstructorDao;
import model.Instructor;


@WebServlet("/addInstructor")
public class InstructorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private InstructorDao instructorDao;

    public void init() {
        instructorDao = new InstructorDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Instructor instructor = new Instructor();
        instructor.setFirstName(firstName);
        instructor.setLastName(lastName);
        instructor.setUsername(username);
        instructor.setPassword(password);
        instructor.setAddress(address);
        instructor.setContact(contact);


        try {
        	instructorDao.addInstructor(instructor);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("detailsInstructor.jsp");
    }
} 