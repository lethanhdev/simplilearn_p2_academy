package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeachDao;
import model.Teach;
/**
 * Servlet implementation class Teach
 */
@WebServlet("/teach")
public class TeachServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TeachDao teachDao;

    public void init() {
        teachDao = new TeachDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName   = request.getParameter("firstName");
        String className   = request.getParameter("className");
        String subjectName = request.getParameter("subjectName");


        Teach t = new Teach();
        t.setFirstName(firstName);
        t.setClassName(className);
        t.setSubjectName(subjectName);

        try {        	
        	teachDao.addTeach(t);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("detailsTeach.jsp");
    }
} 
