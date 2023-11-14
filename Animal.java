abstract class Animal
{
	abstract void speak();
	abstract void eat();
}
class Dog extends Animal
{
	void speak()
	{
	System.out.println("woof");
	}
	void eat()
	{
	System.out.println("num num");
	}
public static void main(String ags[])
{
Dog d=new Dog();
d.speak();
d.eat();
}
}