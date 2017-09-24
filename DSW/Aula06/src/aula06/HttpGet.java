package aula06;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpGet
 */
@WebServlet("/DataHora")
public class HttpGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); //informa o tipo de dado de saída
		response.setCharacterEncoding("iso-8859-1"); // ou utf-8
		response.getWriter().append("<p>Data: "+LocalDate.now()+"</p>");
		response.getWriter().append("<p>Hora: "+LocalDateTime.now().toLocalTime()+"</p>");
	}

}
