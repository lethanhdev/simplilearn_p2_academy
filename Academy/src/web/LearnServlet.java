package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LearnDao;
import model.Learn;

/**
 * Servlet implementation class LearnServlet
 */
@WebServlet("/learn")
public class LearnServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LearnDao learnDao;

    public void init() {
        learnDao = new LearnDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName   = request.getParameter("firstName");
        String className   = request.getParameter("className");

        Learn l = new Learn();
        l.setFirstName(firstName);
        l.setClassName(className);

        try {        	
        	learnDao.addLearn(l);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("detailsLearn.jsp");
    }

}
