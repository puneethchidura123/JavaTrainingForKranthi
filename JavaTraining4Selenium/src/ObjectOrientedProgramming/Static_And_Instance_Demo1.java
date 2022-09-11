package ObjectOrientedProgramming;

public class Static_And_Instance_Demo1 {

	
	// attributes
	
	 static int x = 1;
	 int y = 2;
	 
	 
	// methods
	 
	 static void m1()
	 {
		 System.out.println("this is method m1");
	 }
	 
	 void m2()
	 {
		 System.out.println("this is method m2");
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(Static_And_Instance_Demo1.x);

Static_And_Instance_Demo1 said1 = new Static_And_Instance_Demo1();

//System.out.println(said1.y);

//Static_And_Instance_Demo1.m1();

said1.m2();

		
	}

}
