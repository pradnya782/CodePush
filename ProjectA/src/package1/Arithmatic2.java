// (((((10*2)+2)-2)/2))

package package1;

public class Arithmatic2 
{
public int multi(int a,int b) 
{
int c = a*b;
System.out.println("multi is "+c);
return c;
}
public int sum(int d,int e) 
{
int f = d+e;
System.out.println("sum is "+f);
return f;
}
public int sub(int g,int h) 
{
int i = g-h;
System.out.println("sub is "+i);
return i;
}
public void div(int j,int k) 

{
	int l=j/k;
	System.out.println("div is "+l);
}
public static void main(String[] args) 
{
	Arithmatic2 obj=new Arithmatic2();
	int multi=obj.multi(10, 2);
	int sum=obj.sum(multi, 2);
	int sub=obj.sub(sum, 2);
	obj.div(sub, 2);
}
}
