package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {

	@BeforeTest
	public void setup()
	{
		System.out.println("beforetest");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("beforemethod url loading");
	}
	
	@Test(priority = 4,invocationCount =3)
	public void test1()
	{
		System.out.println("test1");
	}
	
	
	@Test(priority = 3,dependsOnMethods =3)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 1,enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(priority = 2)
	public void test()
	{
		System.out.println("test4");
	}
	
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("aftermethod");
		
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
}