class OverRide
{
	void petsBrag()
	{
	System.out.println("I have the best pet");
	}
	void dogsBrag()
	{
	petsBrag();
	System.out.println("I have the best dog");
	}
public static void main(String ags[])
{
OverRide or=new OverRide();
or.dogsBrag();
}
}