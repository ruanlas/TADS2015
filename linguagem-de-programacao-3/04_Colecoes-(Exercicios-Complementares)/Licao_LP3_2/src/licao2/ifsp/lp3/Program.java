package licao2.ifsp.lp3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaContas2 lista = new ListaContas2();
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
		Conta2 c1 = new Conta2(nomes.get(0), data, "3534342", "23323232");
		lista.adicionarConta(c1);
		lista.deposita(c1, 1070.00);
		lista.saca(c1, 70.00);
		try {
			data = sfd.parse("19/05/2001");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conta2 c2 = new Conta2(nomes.get(2), data, "2234342", "20023232");
		lista.adicionarConta(c2);
		lista.deposita(c2, 200.00);
		lista.saca(c2, 200.00);
		
		//transferindo utilizando o primeiro método: OK
		for (Conta2 conta : lista.listaConta()) {
			if(conta.nomeCliente().equals("Pedro")){
				for (Conta2 destinatario : lista.listaConta()) {
					if(destinatario.nomeCliente().equals("Augusto")){
						conta.transferir(destinatario, 300.00);	
					}
				}
			}
		}
		//Tranferindo utilizando o segundo método: OK
		for (Conta2 conta : lista.listaConta()) {
			if(conta.nomeCliente().equals("Augusto")){
				conta.transferir(lista.listaConta(), "Pedro", 300.00);
			}
		}
		//Transferindo Utilizando o terceiro método: OK
		for (Conta2 conta : lista.listaConta()) {
			if(conta.nomeCliente().equals("Pedro")){
				for (Conta2 destinatario : lista.listaConta()) {
					if (destinatario.nomeCliente().equals("Augusto")) {
						conta.transferir(lista.listaConta(), destinatario, 300.00);
					}
				}
			}
		}
		
		for (Conta2 cliente : lista.listaConta()) {
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
