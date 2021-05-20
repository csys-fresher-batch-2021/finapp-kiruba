package in.kiruba.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.kiruba.service.AdminLoginService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("adminName");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();
		
		session.setAttribute("ROLE", "ADMIN");
		
		boolean isValid=AdminLoginService.adminLogin(name, password);
		if(isValid) {
			
			response.sendRedirect("Addloans.jsp");
		}else {
			String message="Invalid Login";
			response.sendRedirect("AdminLogin.jsp?errorMessage="+message);
			
		}
		
		
		
	}

	

}
