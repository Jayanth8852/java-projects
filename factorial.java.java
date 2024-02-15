import javax.xml.validation.Validator;

class Factorial
{
public static void main(String args[])
{
int num[] = new int[10];
if(args.length == 0)
{
System.out.println("No Command Line Arguments"):
}
for(int i=0; i<args.length;i++)
num[i] = Integer.parseInt(args[i]);
for (int i=0;i<args.length;i++)
{
int fact=1;
for(int j=1;j<=num[i];j++)
fact *=j;
System.out.println("The Factorial of "+ args[i]+"is :" + fact);
}
}
}