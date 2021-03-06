package in.kiruba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import in.kiruba.model.Loan;
import in.kiruba.service.DisplayLoans;

/**
 * Servlet implementation class ListJSON
 */
@WebServlet("/ListJSON")
public class ListJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListJSON() {
        super();
  
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Loan> list=DisplayLoans.getLoanTypes();
		
				Gson gson = new Gson();
				String json = gson.toJson(list);
				System.out.println(" GSON JAR \n" +  json);
				
				PrintWriter out = response.getWriter();
				out.print(json);
				out.flush();
	}

	

}
