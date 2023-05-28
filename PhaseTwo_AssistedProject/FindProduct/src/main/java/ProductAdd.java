

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductAdd
 */
@WebServlet("/ProductAdd")
public class ProductAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAdd() {
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
		String price = request.getParameter("txtPrice");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345");
			
			String inscmd = "Insert into Product(pName, price) values(?, ?)";

			PreparedStatement ps = con.prepareStatement(inscmd);
			ps.setString(1, name);
			ps.setFloat(2, Float.parseFloat(price));

			int r = ps.executeUpdate();
			if (r >= 1) {
				/*
				 * out.print("Success add"); System.out.println("Success add");
				 */
				
				response.sendRedirect("ShowAllProduct");
			}
			else {
				out.print("Error add");
				System.out.println("Error add");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
