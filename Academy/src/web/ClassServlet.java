package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassDao;
import model.ClassAca;


@WebServlet("/addClass")
public class ClassServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ClassDao classDao;

    public void init() {
        classDao = new ClassDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String className = request.getParameter("className");

        ClassAca c = new ClassAca();
        c.setClassName(className);

        try {        	
        	classDao.addClass(c);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("detailsClass.jsp");
    }
} 