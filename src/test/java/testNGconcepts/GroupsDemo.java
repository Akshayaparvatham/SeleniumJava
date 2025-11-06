package testNGconcepts;

import org.testng.annotations.Test;

public class GroupsDemo {
@Test(priority=1,groups="Regression")
public void m1()
{
	System.out.println("case 1");
}
@Test(priority=2,groups={"Regression","sanity"})
public void m2()
{
	System.out.println("case 2");
}
@Test(priority=3,groups="Regression")
public void m3()
{
	System.out.println("case 3");
}
@Test(priority=4,groups="smoke")
public void m4()
{
	System.out.println("case 4");
}
@Test(priority=5,groups="Regression")
public void m5()
{
	System.out.println("case 5");
}
@Test(priority=6,groups={"Regression","smoke"})
public void m6()
{
	System.out.println("case 6");
}
@Test(priority=7,groups={"smoke","sanity"})
public void m7()
{
	System.out.println("case 7");
}
@Test(priority=8,groups="smoke")
public void m8()
{
	System.out.println("case 8");
}
@Test(priority=9,groups="sanity")
public void m9()
{
	System.out.println("case 9");
}
@Test(priority=10,groups={"Regression","smoke"})
public void m10()
{
	System.out.println("case 10");
}
}
