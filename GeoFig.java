import java.util.*;
class GeoFig
{
double area(double r)
{
return (3.14*r*r);
}
float area(float s)
{
return (s*s);
}
float area(float l,float b)
{
return (l*b);
}
double area(double b,double h)
{
return (0.5*b*h);
}
}
class GeoFig
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Geofig g = new Geofig();
System.out.println("Enter double value for radius of circle : ");
double r = sc.nextDouble();
System.out.println("Area of Circle = " + g.area(r));
System.out.println("Enter float value for side of a square : ");
float s= sc.nextFloat();
System.out.println("Area of Square= " + g.area(s));
System.out.println("Enter float value for length and breadth of Rectangle : ");
float l = sc.nextFloat();
float b = sc.nextFloat();
System.out.println("Area of Rectangle = " + g.area(l,b));
System.out.println("Enter double value for base and height of Rectangle : ");
double b1 = sc.nextDouble();
double h = sc.nextDouble();
System.out.println("Area of Triangle = " + g.area(b1,h));
}
}
