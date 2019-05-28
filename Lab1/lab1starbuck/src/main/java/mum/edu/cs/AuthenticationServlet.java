package mum.edu.cs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.data.*;

import static java.util.Arrays.asList;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<String> opt0 = Arrays.asList("-", "--Choose Roast--");
		List<String> opt1 = Arrays.asList("dark", "Dark");
		List<String> opt2 = Arrays.asList("medium", "Medium");
		List<String> opt3 = Arrays.asList("light", "Light");
		List<List<String>> options = Arrays.asList(opt0, opt1, opt2, opt3);
		request.setAttribute("options", options);
		request.getRequestDispatcher("../advice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext ctx = request.getServletContext();
 
		String name = request.getParameter("name");
		String password = request.getParameter("password");

  		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		String expectedPassword = data.findPassword(name );
		
		if(expectedPassword == null || !expectedPassword.equals(password)) {
				
			response.sendRedirect("../index.jsp");
		} else {

			response.sendRedirect("../LoginSuccessful.html");
		}
	}

}
