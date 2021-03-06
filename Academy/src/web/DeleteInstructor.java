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
 * Servlet implementation class DeleteInstructor
 */
@WebServlet("/deleteInstructor")
public class DeleteInstructor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteInstructor() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

		try {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			InputStream in = getServletContext().getResourceAsStream("/config.properties");
			Properties props = new Properties();
			props.load(in);


			DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
			Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			stmt.executeUpdate("delete from instructor where firstName = '" + firstName + "' and lastName = '" + lastName + "';");
			out.println("Successfully executed delete instructor: " + firstName + " " + lastName + "<br>");

			System.out.println("delete from instructor where firstName = '" + firstName + "' and lastName = '" + lastName + "';");
			
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
