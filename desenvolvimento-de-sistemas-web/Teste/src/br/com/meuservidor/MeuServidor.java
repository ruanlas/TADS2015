package br.com.meuservidor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MeuServidor")
public class MeuServidor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //informa o tipo de dado de sa�da
		response.setCharacterEncoding("iso-8859-1"); // ou utf-8
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("Ol� Mundo");
//		response.getWriter().append("<br>");
//		response.getWriter().append("<b><script>alert('ola mundo!')</script>Aopa </b>");
		
		response.getWriter().append("<!DOCTYPE html>"
									+ "<html>"
										+ "<head>"
											+ "<meta charset='utf-8'>"
										+ "</head>"
										+ "<body>");
		for (int i = 0; i < 100; i++) {
			response.getWriter().append("<p>"+i+"</p>");
		}
		response.getWriter().append("</body>"
									+ "</html>");
		
	}

}
