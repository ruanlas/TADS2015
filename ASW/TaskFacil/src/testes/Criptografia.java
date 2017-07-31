
package testes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
    private static MessageDigest md;
    
    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
    }
 
  private static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;
        
        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            System.out.println(hexString);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                                	hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
//        return hexString;
    }
 public static String crip(String name) {
	 //não deu certo
	 return new String(md.digest(name.getBytes()).toString());
}
  public static String criptografar(String pwd) {
        if (md != null) {
            return new String(hexCodes(md.digest(pwd.getBytes())));
        }
        return null;
    }
  
  public static void main(String[] args) {
//	  System.out.println(Criptografia.crip("ola"));
//	  System.out.println(Criptografia.crip("ola"));
	System.out.println(Criptografia.criptografar("leandro viadinho"));
//	System.out.println(Criptografia.criptografar("ola"));
  }
}

