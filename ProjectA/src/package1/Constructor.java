// in ths program we will understand the use of constructor and how control can move from one 
//1 constructor to another using this keyword

package package1;

public class Constructor 
{
public Constructor() 
{
 this(10,20,30);
 System.out.println("Default constructor");
}
public Constructor(int a,int b,int c) 
{
	System.out.println("three parameterized constructor");
}
public Constructor(int a, int b) 
{
System.out.println("two parameterized constructor");	
}
public Constructor(int a) 
{
System.out.println("one parameterized constructor");	
}
public static void main(String[] args) 
{
Constructor obj=new Constructor();
Constructor obj1=new Constructor(10);
Constructor obj2=new Constructor(10,20);
}
}
