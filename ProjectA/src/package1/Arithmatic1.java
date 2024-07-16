// (((((10+2)+2)-2)*2)/2)))

package package1;

public class Arithmatic1 
{
public int sum(int a,int b) 
{
int c=a+b;
System.out.println("sum is "+c);
return c;
}
public int sub(int d,int e) 
{
	int f=d-e;
	System.out.println("sub is "+f);
	return f;
}
public int multi(int g,int h) 
{
 int i =g*h;
 System.out.println("multi is "+i);
 return i;
}
public int div(int j,int k) 
{
int l= j/k;
System.out.println("div is "+l );
return l;
}
public static void main(String[] args) 
{
Arithmatic1 obj=new Arithmatic1();
int sum1=obj.sum(10, 2);
int sum2=obj.sum(sum1, 2);
int sub=obj.sub(sum2, 2);
int multi =obj.multi(sum1, 2);
obj.div(multi, 2);
}
}
