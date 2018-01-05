package licao.ifsp.lp3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaContas lista = new ListaContas();
		Date data = new Date();
		//Classe que converte String em Objeto data
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy"); //Vc passa no construtor o formato de data
											//dd != DD ///dd -> dia ///DD -> minuto
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("Paulo");
		nomes.add("Augusto");
		nomes.add("Marcio");
		nomes.add("Roberto");
		nomes.add("Riquelme");
		nomes.add("Fernando");
		nomes.add("Miguel");
		nomes.add("Romildo");
		try {
			data = sfd.parse("22/06/2000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conta c1 = new Conta(nomes.get(0), data, "3534342", "23323232");
		lista.adicionarConta(c1);
		lista.deposita(c1, 100.00);
		lista.saca(c1, 70.00);
		try {
			data = sfd.parse("19/05/2001");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conta c2 = new Conta(nomes.get(2), data, "2234342", "20023232");
		lista.adicionarConta(c2);
		lista.deposita(c2, 400.00);
		lista.saca(c2, 200.00);
		try {
			data = sfd.parse("03/02/2011");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conta c3 = new Conta(nomes.get(3), data, "3530042", "23323255");
		lista.adicionarConta(c3);
		lista.deposita(c3, 900.00);
		lista.saca(c3, 80.00);
		try {
			data = sfd.parse("17/02/2000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conta c4 = new Conta(nomes.get(4), data, "0034342", "23323211");
		lista.adicionarConta(c4);
		lista.deposita(c4, 500.00);
		lista.saca(c4, 500.00);
		
		for (Conta cliente : lista.listaConta()) {
			System.out.println("Cliente: "+cliente.nomeCliente());
			//o método 'format(date);' da classe SimpleDataFormat retorna uma String
			//formatada em dd/MM/yyyy como foi estabelecido no construtor da classe na
			//instancialização do Objeto 'sfd'
			System.out.println("Data Nascimento: "+sfd.format(cliente.dataNascimento()));
			System.out.println("Saldo: "+cliente.saldo());
			System.out.println("-----------------");
		}
	}
}
