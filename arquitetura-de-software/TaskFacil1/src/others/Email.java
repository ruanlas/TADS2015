package others;

public class Email {
	public static boolean isEmail(String email) {
		String regex = "\\w{1,}((\\.|-)\\w{1,})*@\\w{2,}\\.\\w{2,}(\\.\\w{2,4})?";
		return email.matches(regex);
	}
}
