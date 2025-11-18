package basics;

public class VarPractice {

	
	static 
	{
	  System.out.println("I am Static Block");
	}
	 
	{
		System.out.println("I am Instance");
	}
	public VarPractice()
	{
		System.out.println("I am a constructor");
	}
	
	String a;                   //Global Variable
	static int b=100;           // static Global variable
	
	public static void m1()
	{
		int a=10;  // Local Variable
		System.out.println(a);
		new VarPractice().m4();
	}
	public static void m2()
	{
		System.out.println(new VarPractice().a);
		System.out.println(VarPractice.b);
		
	}
	public static void m3()
	{
				
		new VarPractice().m6();
	}
	public void m4()
	{
		System.out.println(new VarPractice().a);
		System.out.println(VarPractice.b);
		
	}
	public void m5()
	{
		int a=50;  // Local Variable
		System.out.println(a);
		VarPractice.m2();
	}
	public void m6()
	{
		System.out.println(new VarPractice().a);
		System.out.println(VarPractice.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VarPractice.m1();
		new VarPractice().m5();
		VarPractice.m3();

	
	}

}
