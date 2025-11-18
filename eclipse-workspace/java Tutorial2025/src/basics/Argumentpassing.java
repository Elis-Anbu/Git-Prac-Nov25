package basics;

public class Argumentpassing {

	public static void add(int a, int b)
	{
	
		System.out.println(a+b);
	}
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int var1, int var2)
	{
		System.out.println(var1*var2);
	}
	public void div(int x, int y) //Arguments or Parameters
	{
		System.out.println(x/y);
		System.out.println(x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Argumentpassing.add(1, 3);
		Argumentpassing.add(4, 6);
		Argumentpassing.add(3, 6);
		Argumentpassing.sub(6,  7);
		new Argumentpassing().mul(8, 8);
		new Argumentpassing().mul(8, 7);
		new Argumentpassing().div(18, 9);
		

	

	}
}
