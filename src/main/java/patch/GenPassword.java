package patch;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

public class GenPassword {
	public static void printOut() {
		System.out.println(new Pbkdf2PasswordEncoder().encode("demo"));
	}
}
