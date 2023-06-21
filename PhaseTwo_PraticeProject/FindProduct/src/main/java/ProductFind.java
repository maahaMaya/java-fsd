

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductFind
 */
@WebServlet("/ProductFind")
public class ProductFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductFind() {
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
		
		String name = request.getParameter("txtPname");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345");
			

			PreparedStatement preparedStatement = con.prepareStatement("Select * from Product where pName= ?");
			preparedStatement.setString(1, name);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				out.println("<br/>" + "Product Id is : " + rs.getInt("pId") + "<br/>");
				out.println("Product name is : " + rs.getString("pName") + "<br/>");
				out.println("Product price is : " + rs.getFloat("price") + "<br/>");
			}
			else {
				out.println("PRODUCT IS NOT AVILABLE.........");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
