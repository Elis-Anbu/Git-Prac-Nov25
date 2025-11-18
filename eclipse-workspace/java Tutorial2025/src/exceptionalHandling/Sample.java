package exceptionalHandling;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {4, 7, 8, 9};
		
		int b= 0;
		
		
		try {                                 //try block
			System.out.println(a[8]/b);
		    }
		
		catch(ArithmeticException e)          //block
		{
			System.out.println("Infinity");
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter value from 0 to 2");
		}
		catch (Exception e)
		{
			System.out.println("Please Check Your Code");
		}
		finally
		{
			System.out.println("Always Executable");
		}
		
		
		
		
		
		

	}


	}


