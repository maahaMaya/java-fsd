package com.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String emaiId = request.getParameter("user_email");
		String password = request.getParameter("user_password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineQuiz", "root", "12345");

			PreparedStatement preparedStatement = con
					.prepareStatement("SELECT * FROM User WHERE (uEmail=? AND uPassword=?);");
			preparedStatement.setString(1, emaiId);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				if (rs.getString("uEmail").equals("admin@gmail.com")) {
					response.sendRedirect("AdminWelcomePage.html");
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("userEmail", rs.getString("uEmail"));
					session.setAttribute("userName", rs.getString("uName"));
					response.sendRedirect("UserWelcomePage.html");
				}

			} else {
				out.print(
						"    <div style=\"width: 100%; margin-top: 3%; text-align: center; color: red; font-size: 40px;\">\r\n"
								+ "        <h6>Inavlid Email id and password......</h6>\r\n" + "    </div>");
				rd = request.getRequestDispatcher("/LoginPage.html");
				rd.include(request, response);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
