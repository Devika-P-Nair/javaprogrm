package inheritance;

public class MultiLevelChild extends MultiLevelParentB {
	public void child()
	{
		System.out.println("its a new one");
	}
	public static void main(String[] args) {
		
		MultiLevelChild obj=new MultiLevelChild();
		obj.displaymultilevel();
		obj.multilevelb();
		obj.child();
	}

}
