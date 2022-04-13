package testNG;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=-1,dependsOnMethods="login")
	public void dashboard(){
		
		System.out.println("dashboard");
	}
	@Test
	public void c(){
		
		System.out.println("c");
	}
	@Test(priority=3)  //-3
	public void login(){
		
		System.out.println("login");
	}

}
