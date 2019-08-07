
 class Var
{
	double width;
	double height;
	double length;
	double radius;
}
public class Volume
{
	public static void main(String args[])
	{
		Var v = new Var();
		v.length=10;
		v.height=5;
		v.width=7;
		v.radius=8;
		double volc=v.length*v.height*v.width;
		double vols=(4*v.radius*v.radius*v.radius)/3;
		System.out.println("The volume of sphere is:"+ vols);
		System.out.println("The volume of cuboid is:"+ volc);
	}
}
		
		
