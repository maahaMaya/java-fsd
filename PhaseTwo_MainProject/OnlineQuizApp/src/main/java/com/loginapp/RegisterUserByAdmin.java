package com.loginapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUserByAdmin
 */
@WebServlet("/RegisterUserByAdmin")
public class RegisterUserByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterUserByAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("user_name");
		String emaiId = request.getParameter("user_email");
		String password = request.getParameter("user_password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineQuiz", "root", "12345");

			PreparedStatement preparedStatement = con
					.prepareStatement("INSERT INTO User(uEmail, uName, uPassword) VALUES (?, ?, ?);");
			preparedStatement.setString(1, emaiId);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, password);

			int r = preparedStatement.executeUpdate();
			if (r >= 1) {				
				response.sendRedirect("ShowAllUser");
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
