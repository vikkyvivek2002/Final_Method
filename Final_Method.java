final class main_method
{
	public void show()
	{
		System.out.println("Parent method .");
		System.out.println("creation of child will not allowed");
	}
}
class chilld 
{
	public void show ()
	{
		System.out.println("this method can't overriding");
	}
}
public class Final_Method {

	public static void main(String[] args) {

        main_method obj2 = new main_method();
        obj2.show();
        chilld obj = new chilld();
		obj.show();
	}

}