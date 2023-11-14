class MethOver2
{
	void greet()
	{
	System.out.println("Hello");
	}
	void greet(String name)
	{
	System.out.println("Hello " + name);
	}
public static void main(String ags[])
{
MethOver2 mo=new MethOver2();
mo.greet();
mo.greet("Sansa");
}
}