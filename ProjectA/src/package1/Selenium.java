package package1;

public class Selenium 
{
 public Selenium() 
 {
	System.out.println("Default constructor");
 } 
 public Selenium (int a)
 {
  	System.out.println("One parameterised constructor"); 
 }
 
 public Selenium (int a,int b)
 {
  	System.out.println("two parameterised constructor"); 
 }
public static void main(String[] args) 
{
 Selenium ob= new Selenium(12,45);	
}

}
