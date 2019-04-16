import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {

	private Pattern regexPattern;
	private Matcher regMatcher;

	public String phoneAuth(String phone) {
		phone = phone.trim();
		if (phone.isEmpty()) {
			return "Invalid";
		} else if (phone.length() == 11 || phone.length() == 14) {
			if (phone.startsWith("+88") || phone.startsWith("017") || phone.startsWith("018") || phone.startsWith("019")
					|| phone.startsWith("016") || phone.startsWith("013")) {
				return "Valid";
			} else
				return "Invalid";

		} else
			return "Invalid";
	}
    //not used 
	public String emailAuth(String email) {
		email = email.trim();

		if (email.isEmpty()) {
			return "Invalid";
		} else if (email.endsWith(".com") && email.contains("@")) {
			return "Valid";
		} else
			return "Invalid";
	}

	public String emailValid(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		// regexPattern =
		// Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
		regexPattern = Pattern.compile(ePattern);
		regMatcher = regexPattern.matcher(email);
		if (regMatcher.matches()) {
			return "Valid";
		} else {
			return "Invalid";
		}
	}
	//not used
	public String phoneValid(String phone) {
		//String ePattern = "/^(?:\+88|01)?(?:\d{11}|\d{13})$/";
		// regexPattern =
		// Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
		regexPattern = Pattern.compile("\\d{3}-\\d{7}");
		regMatcher = regexPattern.matcher(phone);
		if (regMatcher.matches()) {
			return "Valid";
		} else {
			return "Invalid";
		}
	}
}
