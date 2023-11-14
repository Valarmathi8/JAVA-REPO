class Candy
{
	void taste()
	{
	System.out.println("tastes sweet!");
	}
}
class Chocolate extends Candy
{
	void taste()
	{
	super.taste();
	System.out.println("tastes chocolately");
	}
public static void main(String ags[])
{
Chocolate c=new Chocolate();
c.taste();
}
}