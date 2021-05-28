package in.kiruba.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kiruba.service.AdminLoginService;

/**
 * Servlet implementation class AddAdminservlet
 */
@WebServlet("/AddAdminservlet")
public class AddAdminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdminservlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter out=response.getWriter();
			String name=request.getParameter("username");
			String password=request.getParameter("password");
			boolean valid=AdminLoginService.addAdmin(name, password);
			if(valid) {
				
				out.println("Successfully added");
				
			}else {
				String message = "Already Exists";
				response.sendRedirect("AddAdmin.jsp?errormessage=" + message);
				
				
				
			}
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}

	

}
