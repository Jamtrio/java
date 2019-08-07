class Box
{
	double width;
	double height;
	double length;
	void volume()
	{
		System.out.print("Volume is ")	;
		System.out.println(width*height*length);
	}
}
public class BoxDemo3
{
	public static void main(string args[])
	{
		Box b1 = new Box();
		Box b2 = new Box();
		b1.length=10;
		b1.height=5;
		b1.width=7;
		b2.length=10;
		b2.height=5;
		b2.width=5;
		b1.volume();
		b2.volume();
	}
}
		
		
