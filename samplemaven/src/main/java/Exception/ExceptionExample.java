package Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a=10,b=0;
		try {
		int c=a/b;
		}
	/*	catch(ArithmeticException e)
		{
			b=2;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
		}*/
		
		finally
		{
			System.out.println("mandatory code");
		}
	}

}
