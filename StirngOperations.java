import java.util.*;
class StringOperations
{
public static void main(String args[])
{
String first=" ",second=" ";
Scanner sc = new Scanner(System.in);
System.out.println(" String Operations :");
System.out.println(" Enter first string : ");
first = sc.nextLine();
System.out.println(" Enter second string : ");
second = sc.nextLine();
System.out.println(" The strings are :" + first + "," + second);
System.out.println(" The length of first string is : " + first.length());
System.out.println(" The length of second string is : " + second.length());
System.out.println(" The Concatenation is : "+ first.concat(" "+second));
System.out.println(" The UpperCase of "+ first +" is :" + first.toUpperCase());
System.out.println(" The LowerCase of " + first +" is :" + first.toLowerCase());
System.out.println("Enter the occurance of a character in " +first+ ":");
String str=sc.next();
char c = str.charAt(0);
System.out.println(" The " + c + " occurs at position "+first.indexOf(c)+"in "+ first);
System.out.println("The Substring of"+ first + " starting from index 3 and ending aat 6 is :" + first.substring(3,7));
System.out.println(" Replacing 'a' with 'o' in" + first + " is :" + first.replace('a','o'));
boolean check = first.equals(second);
if(!check)
System.out.println(first + " and "+second+" are not same");
else
System.out.println(first + " and "+second+" are same");

}
}
