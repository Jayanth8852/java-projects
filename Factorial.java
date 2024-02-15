public class Factorial
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i,fact=1;
for(i=1;i<=n;i++)
{
fact=fact*1;
}
System.out.println("Factorial of"+n+" is:"+fact);
}
}