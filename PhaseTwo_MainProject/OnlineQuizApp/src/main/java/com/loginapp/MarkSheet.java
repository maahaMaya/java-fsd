package com.loginapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MarkSheet
 */
@WebServlet("/MarkSheet")
public class MarkSheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarkSheet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		HttpSession session = request.getSession();
		
		String name = (String) session.getAttribute("userName");
		String email = (String) session.getAttribute("userEmail");
		int marks =  (int) session.getAttribute("marksObtain");
		
		out.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>MarkSheet</title>\r\n"
				+ "<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n"
				+ "	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "<body style=\"background-color: #f0f1f2;\">\r\n"
				+ "	<div class=\"container p-5\">\r\n"
				+ "		<div class=\"row\">\r\n"
				+ "			<div class=\"col-md-10 offset-md-1\">\r\n"
				+ "				<div class=\"card\">\r\n"
				+ "					<div class=\"card-body\">\r\n"
				+ "						<h1 class=\"text-center\">Mark Sheet</h1>\r\n"
				+ "                        <table class=\"table table-bordered\">\r\n"
				+ "                            <thead>\r\n"
				+ "                              <tr>\r\n"
				+ "                                <th>Name</th>\r\n"
				+ "                                <th>Email</th>\r\n"
				+ "                                <th>Total Questiom</th>\r\n"
				+ "                                <th>Right Answer</th>\r\n"
				+ "                                <th>Status</th>\r\n"
				+ "                                <th>Answer Sheet</th>\r\n"
				+ "                              </tr>\r\n"
				+ "                            </thead>\r\n"
				+ "                            <tbody>\r\n"
				+ "                              <tr>\r\n"
				+ "                                <td>"+ name +"</td>\r\n"
				+ "                                <td>"+email+" </td>\r\n"
				+ "                                <td>6</td>\r\n"
				+ "                                <td>"+ marks +"</td>\r\n"
				+ "                                <td>Pass</td>\r\n"
				+ "                                <td><a href=\"./AnswerSheet.html\">Click Me</a></td>\r\n"
				+ "                              </tr>\r\n"
				+ "                            </tbody>\r\n"
				+ "                          </table>\r\n"
				+ "					</div>\r\n"
				+ "				</div>\r\n"
				+ "			</div>\r\n"
				+ "		</div>\r\n"
				+ "	</div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n"
				+ "		integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n"
				+ "		integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n"
				+ "		integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		
	}

}
