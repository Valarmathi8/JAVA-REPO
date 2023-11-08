class Fibonacci
{
	public static void main(String ags[])
	{
		int a=0,b=1;
		//System.out.println(a+" "+b);
	for(int i=2;i<=20;++i)
	{
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	}
}