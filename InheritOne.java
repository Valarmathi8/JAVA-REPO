class InheritOne
{
	void one()
	{
	System.out.println("Hello");
	}
}
class InheritTwo extends InheritOne
{
	void one()
	{
	System.out.println("World");
	}
public static void main(String ags[])
{
InheritOne io=new InheritOne();
io.one();
InheritTwo it=new InheritTwo();
it.one();
}
}	