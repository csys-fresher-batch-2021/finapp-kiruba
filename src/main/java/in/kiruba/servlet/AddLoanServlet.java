package in.kiruba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kiruba.model.Loansdb;
import in.kiruba.service.AddloansService;

/**
 * Servlet implementation class AddLoanServlet
 */
@WebServlet("/AddLoanServlet")
public class AddLoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLoanServlet() {
        super();
      
    }

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String loanName=request.getParameter("loanName");
			Loansdb inputLoan=new Loansdb(loanName);
			PrintWriter out=response.getWriter();
			

				if(AddloansService.addloans2(inputLoan)) {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("Addloans.jsp");
					requestDispatcher.forward(request,response);
					
				
					out.println("Added");
				}
		} catch (IOException | ServletException e) {
		
			e.printStackTrace();
		}
		
	}

}
