class Person
{
	String name;
	int age;
	String degree;
	public Person(String name,int age)
	{
	this.name=name;
	this.age=age;
	System.out.println(name+age);
	}
}
class Teacher extends Person
{
	public Teacher(String name,int age,String degree)
	{
	super.Person("Dharma",30);
	System.out.println(name+age+degree);
	}	
public static void main(String ags[])
{
Teacher t=new Teacher();
t.Teacher("Dhana",32,"PhD");
}
}