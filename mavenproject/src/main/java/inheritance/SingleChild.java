package inheritance;


public class SingleChild extends SingleParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SingleChild obj=new SingleChild();
       obj.displayparent();
       obj.displays1();
	}

	public void displays1()
	{
		System.out.println("child class");
	}
}
