package others;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografar {
	private static MessageDigest md;
	static{
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	private static char[] hexCodes(byte[] text) {
		char[] saida = new char[text.length * 2];
		String hexaString;
		
		for (int i = 0; i < text.length; i++) {
			hexaString = "00" + Integer.toHexString(text[i]);
			hexaString.getChars(hexaString.length() - 2, hexaString.length(), saida, i * 2);
		}
		return saida;
	}
	
	public static String codificar(String texto) {
		return new String(hexCodes(md.digest(texto.getBytes())));
	}
}
