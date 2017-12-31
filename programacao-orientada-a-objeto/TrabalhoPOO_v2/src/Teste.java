import java.io.IOException;
import java.util.Scanner;

import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;

public class Teste {
	public static void main(String[] args) {
		ComunicacaoSerial com = new ComunicacaoSerial("COM3");

//		Cronometro cro = new Cronometro(4);
//		cro.start();
//		String i = "0";
//		Scanner scan = new Scanner(System.in);
//		while (i.equals("0")) {
//			i = scan.nextLine();
//			if(i.equals("1")){
//				try {
//					com.enviaDados('1');
//					System.out.println("Liga");
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}else if(i.equals("2")){
//				try {
//					System.out.println("Desliga");
//					com.enviaDados('2');
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}

		Scanner scan = new Scanner(System.in);
		char menu = '0';
		ObterDadosSerial obj = new ObterDadosSerial(com);
		while (menu != 's') {
			menu = scan.nextLine().charAt(0);
			
			try {
				com.enviaDados(menu);
				Cronometro cro = new Cronometro(4, com);
				cro.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		com.close();
	}
}