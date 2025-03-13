package inheritance;

public class HierarchialChildB extends HierarchialParent{
	
public void display2()
{
	System.out.println("new one");
}


public static void main(String args[])
{
	HierarchialChildB obj =new HierarchialChildB();
	obj.display2();
	obj.displayparent();

}
}