package ConditionalStatements;

public class Else_If_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 90;

		if(age >= 18 & age <60)
		{
		System.out.println("yes, this person is eligible for voting");
		}
		else if(age >= 60)
		{
		System.out.println("yes, this person is eligible for voting but he is a senior citizen");
		}
		else if(age <= 5)
		{
		System.out.println("no, this person is not eligible for voting as he is a kid");
		}
		else
		{
		System.out.println("no, this person is not eligible for voting");
		}
		
	}

}
