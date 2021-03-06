package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SubjectDao;
import model.Subject;


@WebServlet("/addSubject")
public class SubjectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private SubjectDao subjectDao;

    public void init() {
        subjectDao = new SubjectDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String subjectName = request.getParameter("subjectName");

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);

        try {        	
        	subjectDao.addSubject(subject);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("detailsSubject.jsp");
    }
} 