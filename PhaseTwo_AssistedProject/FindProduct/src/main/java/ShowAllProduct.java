

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowAllProduct
 */
@WebServlet("/ShowAllProduct")
public class ShowAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345");

			PreparedStatement ps = con.prepareStatement("Select * from Product");
			ResultSet rs = ps.executeQuery();
			out.print("<a href='ProductAdd.html'>New Product Register</a>");
			out.print("<hr />");
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Product Id</th><th>Product Name</th><th>price</th></tr>");
			
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>" + rs.getInt("pId") + "</td>");
				out.print("<td>" + rs.getString("pName") + "</td>");
				out.print("<td>" + rs.getFloat("price") + "</td>");
				out.print("</tr>");
			}
			
			out.print("</table>");
		}
		catch(Exception ex)
		{
			//res = ex.getMessage();
			ex.printStackTrace();
		}
	}

}
