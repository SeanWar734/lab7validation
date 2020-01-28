import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HtmlTest {


	@Test
	public void twoVariables() {

		String html = "<p> </p>";

		Assertions.assertTrue(Lab7Regex.validateHtml(html));

	}
	
	@Test
	public void noClosingCarrot() {
		
		String html = "<p> </p";
		
		Assertions.assertFalse(Lab7Regex.validateHtml(html));

	}
	
	@Test
	public void oneNumberVariable() {
		
		String email = "</1>";
		
		Assertions.assertFalse(Lab7Regex.validateHtml(email));
		
	}
	
	@Test 
	public void s1Variable() {
		
		String email = "<s1> </s1>";
		
		Assertions.assertTrue(Lab7Regex.validateHtml(email));
		
	}
	
	@Test 
	public void bracketTest() {
		
		String email = "[a] [/a]";
		
		Assertions.assertFalse(Lab7Regex.validateHtml(email));
		
	}
	

}