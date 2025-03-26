package Exception;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		
		int age=1;
		if(age>18)
		{
			System.out.println("eligible");
		}
		else
		{
			throw new VotingException("age under 18");
		}

	}

}
