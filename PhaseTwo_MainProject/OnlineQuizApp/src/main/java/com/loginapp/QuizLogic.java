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
 * Servlet implementation class QuizLogic
 */
@WebServlet("/QuizLogic")
public class QuizLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizLogic() {
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
		
		String firstAnswer = request.getParameter("exampleFormControlSelect1");
		String secondAnswer = request.getParameter("exampleFormControlSelect2");
		String thirdAnswer = request.getParameter("exampleFormControlSelect3");
		String fourAnswer = request.getParameter("exampleFormControlSelect4");
		String fifthAnswer = request.getParameter("exampleFormControlSelect5");
		String sixthAnswer = request.getParameter("exampleFormControlSelect6");
		
		int marksObtain = 0;
		if(firstAnswer.equals("B")) {
			marksObtain++;
		}
		if(secondAnswer.equals("B")) {
			marksObtain++;
		}
		if(thirdAnswer.equals("C")) {
			marksObtain++;
		}
		if(fourAnswer.equals("B")) {
			marksObtain++;
		}
		if(fifthAnswer.equals("A")) {
			marksObtain++;
		}
		if(sixthAnswer.equals("B")) {
			marksObtain++;
		}
		
		if(marksObtain > 2) {
			HttpSession session = request.getSession();
			session.setAttribute("marksObtain", marksObtain);
			rd = request.getRequestDispatcher("/MarkSheet");
			rd.include(request, response);
		}
		else {
			out.print(
					"    <div style=\"width: 100%; margin-top: 3%; text-align: center; color: red; font-size: 40px;\">\r\n"
							+ "        <h6>Percebtage is below 50%..Try Again</h6>\r\n" + "    </div>");
			rd = request.getRequestDispatcher("/QuizPage.html");
			rd.include(request, response);
		}
	}

}
