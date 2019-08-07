import java.util.*;
import java.io.*;
public class Area
{
		public static void rec(double a, double b)
		{	
			double arear;
			arear=a*b;
			System.out.println("The area of rectangle is :" + arear);
		}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		double a,b,areac,r,arear;
		System.out.println("Enter height and width of rectangle");
		a=s.nextDouble();
		b=s.nextDouble();
		
		System.out.print("Enter the radius of circle:");
		r=s.nextDouble();
		areac=3.14*r*r;
		
		System.out.println("The area of circle is :" + areac);
		rec(a,b);
	}
}
		
		