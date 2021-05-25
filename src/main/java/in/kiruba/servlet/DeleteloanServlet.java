package in.kiruba.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.kiruba.model.Loansdb;
import in.kiruba.service.DeleteloansService;

/**
 * Servlet implementation class DeleteloanServlet
 */
@WebServlet("/DeleteloanServlet")
public class DeleteloanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteloanServlet() {
        super();
    }
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String loanName=request.getParameter("loanName");
			Loansdb inputLoan=new Loansdb(loanName);
			
			

				if(DeleteloansService.deleteLoans2(inputLoan)) {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("DeleteLoan.jsp");
					requestDispatcher.forward(request,response);
					
				
					
				}
		} catch (ServletException | IOException e) {
	
			e.printStackTrace();
		}
	}

	

}
