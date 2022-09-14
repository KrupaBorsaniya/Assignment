abstract class animal
{
	void legs()
	{
		System.out.println("all animal have 4 legs.");
	}
	abstract void eat();
	abstract void sound();
}
class dog extends animal
{
	void eat()
	{
		System.out.println("meat eating");
	}
	void sound()
	{
		System.out.println("Bow Bow...");
	}
}
public class abstractdemo {

	public static void main(String[] args) {
		dog d=new dog();
		d.legs();
		d.eat();
		d.sound();

	}

}
