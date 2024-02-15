import java.util.*;
class SortOrder
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Array Size :");
int size = sc.nextInt();
int arr[] = new int[size];
System.out.println("Enter array elements :");
for(int i=0;i<size;i++) 






















    
{
System.out.println("Element number " + (i+1) + ":");
arr[i]=sc.nextInt();
}
System.out.println("Before Sorting :");
for(int i=0;i<size;i++)
System.out.println(" "+ arr[i]);
for(int i=0;i<size;i++)
{
int temp;
for(int j=i+1;j<size;j++)
{
if(arr[i] > arr[j])
{
temp= arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
}
System.out.println();
System.out.println("Ascending order :");
for(int i=0;i<size;i++)
System.out.println(" "+ arr[i]);
System.out.println();
System.out.println(" Descending order :");
for(int i=size-1;i>=0;i--)
System.out.println(" "+ arr[i]);
}
}
