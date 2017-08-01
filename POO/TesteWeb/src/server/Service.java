package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import others.Cronometro;
import serialport.ComunicacaoSerial;
import serialport.ObterDadosSerial;
import testes.Teste;
import testes.Teste2;

@WebServlet("/Service")
public class Service extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		String dadoLido = request.getParameter("txtTempMax");
		System.out.println(dadoLido);
		int tempo = Integer.parseInt(dadoLido);
		Teste2 obj = new Teste2();
		obj.testeT(tempo);
		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("Primeira ServLer");
//		out.println("</body>");
//		out.println("</html>");
	}
	
}
