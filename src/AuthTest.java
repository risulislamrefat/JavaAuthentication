import static org.junit.Assert.*;

import org.junit.Test;

public class AuthTest {
	Auth auth = new Auth();

	@Test
	public void testPhone() {
		assertEquals("Valid", auth.phoneAuth(" 01767562116"));
	}

	@Test
	public void testEmail() {
		assertEquals("Valid", auth.emailValid("me@.com.my"));
	}

}
