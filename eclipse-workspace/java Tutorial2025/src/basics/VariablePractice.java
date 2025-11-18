package basics;

public class VariablePractice {

	static 
	{
	  System.out.println("I am Static Block");
	}
	 
	{
		System.out.println("I am Instance");
	}
	public VariablePractice()
	{
		System.out.println("I am a constructor");
	}
	
	String a;                   //Global Variable
	static int b=100;           // static Global variable
	
	public static void m1()
	{
		int a=10;  // Local Variable
		System.out.println(a);
		new VariablePractice().m4();
	}
	public static void m2()
	{
		System.out.println(new VariablePractice().a);
		System.out.println(VariablePractice.b);
		
	}
	public static void m3()
	{
				
		new VariablePractice().m6();
	}
	public void m4()
	{
		System.out.println(new VariablePractice().a);
		System.out.println(VariablePractice.b);
		
	}
	public void m5()
	{
		int a=50;  // Local Variable
		System.out.println(a);
		VariablePractice.m2();
	}
	public void m6()
	{
		System.out.println(new VariablePractice().a);
		System.out.println(VariablePractice.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariablePractice.m1();
		new VariablePractice().m5();
		VariablePractice.m3();

	

	}

}
