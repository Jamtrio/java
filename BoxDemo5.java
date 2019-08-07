class Box
{
	double width;
	double height;
	double length;

	Box(double w , double h , double l)
	{
		System.out.println("Jagga Don");
		width=w;
		height=h;
		length=l;
	}
	double vol()
	{
		return(width*height*length);
	}
}
public class BoxDemo5
{
	public static void main(String args[])
	{
		Box b1 = new Box(1,2,3);
		System.out.println(b1.vol());
	}
}