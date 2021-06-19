class cal
{ 
int z;
public void add(int x,int y)
{ 
z= x+y;
System.out.println("the sum is " +z);  
}
public void sub(int x,int y)
{
z= x-y;
System.out.println("the sub is " +z); 
}
}
public class single_inheritance extends cal
{
public void mult(int x,int y)
{
z= x*y;
System.out.println("the multiply is " +z); 
}
public static void main(String args[])
{
int a = 5 ,b = 10;
single_inheritance demo = new single_inheritance();
demo.add(a,b);
demo.sub(a,b);
demo.mult(a,b);
}
}