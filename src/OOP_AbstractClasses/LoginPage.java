package OOP_AbstractClasses;

public class LoginPage extends Page {
	
	//LoginPage class constructor
	public LoginPage() {
		System.out.println("Login Page class constructor");
	}

	@Override
	public void title() {
		System.out.println("LP title");
		
	}

	@Override
	public void url() {
		System.out.println("LP url");
		
	}
	
	public void resetPassword() {// individual method
		System.out.println("LP Reset Password");
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Login Page loading time is 5 secs");
	}
	
	//Method hiding because it's a static method
	public static void pageCycle() {
		System.out.println("Login Page cycle");
	}

}
