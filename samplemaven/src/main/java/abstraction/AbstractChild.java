package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String args[])
	
	{
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method");
	}
	
	
}
