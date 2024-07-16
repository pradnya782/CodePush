package package1;

public class Arithmatic 
{
  public int sum(int a,int b) 
 {
	int c;
	c=a+b;
	System.out.println("sum result "+c);
	return c;
 }
  public int sub(int x,int y) 
  {
	int z;
	z=x-y;
	System.out.println("sub result "+z);
	return z;
  }
  public void multi(int a1,int a2) 
  {
	int result;
	result= a1*a2;
	System.out.println("Final result is " +result);
  }
  public static void main(String[] args) 
  {
	  Arithmatic ob=new Arithmatic();
	  int sumresult =ob.sum(10, 2);
	  int subresult=ob.sub(10, 2);
	  ob.multi(sumresult, subresult);
	
}
	
}
