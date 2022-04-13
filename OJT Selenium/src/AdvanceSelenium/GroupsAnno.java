package AdvanceSelenium;

import org.testng.annotations.Test;

public class GroupsAnno {
	
	@Test(groups="jbk")
	public void test01(){
		
	}

	@Test(groups="jbk")
	public void test02(){
		
	}


	@Test(invocationCount=5)
	public void test03(){
		
	}


	@Test(groups="jbk1")
	public void test04(){
		
	}


	@Test(groups="jbk1")
	public void test05(){
		
	}


}
