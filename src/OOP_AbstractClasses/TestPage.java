package OOP_AbstractClasses;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		
		
// Top casting for abstract parent classes:
// 
		Page pg = new LoginPage();
		
// Down Casting is not possible even at compile time because we can't create an object of the abstract class
		
	}

}
