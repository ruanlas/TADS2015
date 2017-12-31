package server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import others.Cronometro;
import others.MostrarStatusLedNoConsole;
import others.SaidaCronometroEmConsole;
import serialport.ComunicacaoSerial;

@WebServlet("/Controlador")
public class Service extends HttpServlet{
	private ComunicacaoSerial com;
	
	public Service() throws PortNotFoundException, IOException, PortInUseException, UnsupportedCommOperationException {
		this.com = new ComunicacaoSerial("COM3", new MostrarStatusLedNoConsole());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.actionBtnLigarLed(req);
		resp.sendRedirect("index.html");
	}
	private void actionBtnLigarLed(HttpServletRequest req) throws IOException {
		String dadoLido = req.getParameter("txtTempMax");
		int tempo = Integer.parseInt(dadoLido);
		com.ligaLed();
		Cronometro cronometro = new Cronometro(tempo, new SaidaCronometroEmConsole(com));
		cronometro.start();
	}
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("llllllllllllll");
//		ComunicacaoSerial com = ComunicacaoSerial.getComunicacaoSerial("COM3");
//		String dadoLido = req.getParameter("txtTempMax");
//		int tempo = Integer.parseInt(dadoLido);
//		com.enviaDados('1');
//		Cronometro cronometro = new Cronometro(tempo, com);
//		cronometro.start();
//		System.out.println(tempo);
//		resp.sendRedirect("index.html");
//	}
}
