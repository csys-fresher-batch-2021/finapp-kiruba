package in.kiruba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.kiruba.service.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String name = request.getParameter("username");
		String password = request.getParameter("password");
        HttpSession session = request.getSession();
		
		
		session.setAttribute("LOGGED_IN_USER", name);

		boolean valid = UserService.login(name, password);
		if (valid) {

			out.println("Successfully login");
			response.sendRedirect("ListOfLoans.jsp");
		} else {
			String message = "Invalid credentials";
			response.sendRedirect("Login.jsp?errormessage=" + message);
		}
	}

}
