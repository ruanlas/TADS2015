package org.ifsp.lp3;

public class ExecutorComandosString {
	
	public int executar(String comando, String texto) {
		String com = comando.toUpperCase();
		int numero = 0;
		
		if(com.equals("TAMANHO")){
			numero = texto.length();
		}else if(com.equals("CONTAR_VOGAIS")){
			int total_vogais = 0;
			for (int i = 0; i < texto.length(); i++) {
				String vogais = "aeiou";
				if(vogais.indexOf(texto.charAt(i)) >= 0){
					total_vogais++;
				}
			}
			numero = total_vogais;
		}
		return numero;
	}
}
