class Box
{
	double width;
	double height;
	double length;

	Box()
	{
		System.out.println("Jagga Don");
		width=10;
		height=10;
		length=10;
	}
	double vol()
	{
		return (height*width*length);
	}
	void result()
	{
	System.out.println(vol());
	}
}
public class BoxDemo4
{
	public static void main(String args[])
	{
		Box b1 =new Box();
		double vol=b1.vol();
		b1.result();
		System.out.println(+vol);
	}
}
