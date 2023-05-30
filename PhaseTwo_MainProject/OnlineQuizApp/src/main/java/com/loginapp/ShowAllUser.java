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
 * Servlet implementation class ShowAllUser
 */
@WebServlet("/ShowAllUser")
public class ShowAllUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowAllUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineQuiz", "root", "12345");

			PreparedStatement ps = con.prepareStatement("Select * from User");
			ResultSet rs = ps.executeQuery();
			out.print("<br/><br/>");
			out.print("<a href='AdminWelcomePage.html'>New User Register</a> &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <a href='LoginPage.html'>Logout</a> ");
			out.print("<hr />");
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>User Id</th><th>User Name</th><th>User Email</th></tr>");

			while (rs.next()) {
				out.print("<tr>");
				out.print("<td>" + rs.getInt("uId") + "</td>");
				out.print("<td>" + rs.getString("uName") + "</td>");
				out.print("<td>" + rs.getString("uEmail") + "</td>");
				out.print("</tr>");
			}

			out.print("</table>");
		} catch (Exception ex) {
			// res = ex.getMessage();
			ex.printStackTrace();
		}
	}

}
