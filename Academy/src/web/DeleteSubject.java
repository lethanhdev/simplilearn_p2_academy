package web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.DBConnection;

/**
 * Servlet implementation class DeleteSubject
 */
@WebServlet("/deleteSubject")
public class DeleteSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSubject() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String subjectName = request.getParameter("subjectName");


		try {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			InputStream in = getServletContext().getResourceAsStream("/config.properties");
			Properties props = new Properties();
			props.load(in);


			DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
			Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			stmt.executeUpdate("delete from subject where subjectName = '" + subjectName + "';");
			out.println("Successfully executed delete subject: " + subjectName + "<br>");


			System.out.println("delete from subject where subjectName = '" + subjectName +"';");
			
			stmt.close();
			out.println("<p><h3><a href=dashboard.jsp>Return to Dashboard</a></h3>");
			out.println("</body></html>");
			conn.closeConnection();


			out.println("</body></html>");
			conn.closeConnection();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
