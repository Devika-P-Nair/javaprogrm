package inheritance;

public class HierarchialChildA extends HierarchialParent{
	public  void child1()
	{
		System.out.println("first child");
	}

	public static void main(String[] args) {
		
		HierarchialChildA obj=new HierarchialChildA();
		obj.displayparent();
		obj.child1();

	}

}
