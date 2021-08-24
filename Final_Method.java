 class main_method
{
	public final void show()
	{
		System.out.println("Parent method .");
		System.out.println("creation of same method in child will not allowed");
	}
}
class chilld extends main_method
{
	public void show2 ()
	{
		System.out.println("this method can't overriding");
		System.out.println("'show' method con't be used in child class");
	}
}
public class Final_Method {

	public static void main(String[] args) {

        
        chilld obj = new chilld();
		obj.show();
		obj.show2();
	}

}