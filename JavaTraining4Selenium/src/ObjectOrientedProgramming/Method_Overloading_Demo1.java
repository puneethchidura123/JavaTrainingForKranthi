package ObjectOrientedProgramming;

public class Method_Overloading_Demo1 {

	
	
	void add(int a,int b)
	{
		System.out.println("this is an overloaded integer method");
	}
	
	
	void add(float a,float b)
	{
		System.out.println("this is an overloaded floating method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overloading_Demo1 mod1 = new Method_Overloading_Demo1();
		mod1.add(1.1f, 7.7f);

	}

}
