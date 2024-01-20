package testLearn;

import org.testng.annotations.Test;

public class TestClass {
	
	
	@Test (priority = 4, enabled = false)
	public void hellotest()
	{
		System.out.println("This is hello test1");
	}

	
	@Test (priority = 3, invocationCount = 5)
	public void hellotest1()
	{
		System.out.println("hello test2");
	}
	
	@Test(priority = 2,description = "this is hello description")
	public void hellotest2()
	{
		System.out.println("test 3");
	}
	
	@Test(priority = 1)
	public void hellotest3()
	{
		System.out.println("hello test 4");
	}
	

}
