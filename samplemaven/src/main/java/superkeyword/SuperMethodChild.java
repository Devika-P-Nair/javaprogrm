package superkeyword;

public class SuperMethodChild extends SuperMethod {
	
	
	public void display1()
	{
		System.out.println("child");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperMethodChild obj=new SuperMethodChild();
		obj.display1();
	}

}
