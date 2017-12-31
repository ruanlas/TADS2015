package aula06;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioHtml
 */
@WebServlet("/form")
public class Exercicio02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nome, sobrenome, correio_eletronico;
		nome = request.getParameter("nome");
		sobrenome = request.getParameter("sobrenome");
		correio_eletronico = request.getParameter("correio_eletronico");
		
		String resultado;
		
		if (nome.isEmpty() || sobrenome.isEmpty() || correio_eletronico.isEmpty()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resultado = "<p>Existem campos em branco no formul�rio.</p>"+
					"<p>Volte e preencha-o novamente</p>"+
					"<a href='formulario.html'>Formulario</a>";
		}else {
			response.setStatus(HttpServletResponse.SC_OK);
			resultado = "<p>Nome: "+nome+"</p>"+
					"<p>Sobrenome: "+sobrenome+"</p>"+
					"<p>Correio Eletr�nico: "+correio_eletronico+"</p>";
		}
		response.setContentType("text/html"); //informa o tipo de dado de sa�da
		response.setCharacterEncoding("iso-8859-1"); // ou utf-8
		response.getWriter().append(resultado);
	}

}
