package web;

import dao.DBConnection;
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

/**
 * Servlet implementation class ViewTeach
 */
@WebServlet("/viewLearn")
public class ViewLearn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewLearn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			//InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			InputStream in = getServletContext().getResourceAsStream("/config.properties");

			Properties props = new Properties();
			props.load(in);

			DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
			
			Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String learnSql = "SELECT studentName, student.lastName, className from learn left join student on learn.studentName=student.firstName;";

			ResultSet rst = stmt.executeQuery(learnSql);

			out.println("<h3>Students' Assigned Classes</h3><hr>");
			while (rst.next()) {
				out.println(rst.getString("studentName") + " " + rst.getString("lastName") + ": " + rst.getString("className") + "<Br>");
			}

			stmt.close();
			out.println("<p><h3><a href=dashboard.jsp>Return to Dashboard</a></h3>");
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