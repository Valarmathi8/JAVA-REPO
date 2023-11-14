class MethOver1
{
	void talk()
	{
	System.out.println("Hello");
	}
	void talk(String name)
	{
	System.out.println("Hello " + name);
	}
public static void main(String ags[])
{
MethOver1 mo = new MethOver1();
mo.talk("Valar");
}
}