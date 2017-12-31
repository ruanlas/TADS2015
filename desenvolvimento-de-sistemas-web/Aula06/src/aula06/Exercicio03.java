package aula06;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercicio03
 */
@WebServlet("/Exercicio03")
public class Exercicio03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.setAttribute("mensagem", "Ola mundo");
		String parametro = request.getParameter("page");
		request.getRequestDispatcher("Exec3/"+parametro+".html").forward(request, response);
		//response.sendRedirect("Exec3/"+parametro +".html");
	}

}
