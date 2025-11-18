package basics;

public class Returntype {

	public static int add(int a, int b) {
		return (a + b);

	}

	public float sub(float a, float b) {
		return (a - b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int   addValue   = Returntype.add(6, 1); // method calling
		System.out.println(Returntype.add(6, 1));
		System.out.println(addValue);
		float subValue = new Returntype().sub(7.5f, 5.4f);
		System.out.println(new Returntype().sub(7.5f, 5.4f));
		System.out.println(subValue);
		System.out.println(addValue+subValue);
		System.out.println(addValue-subValue);
		System.out.println(addValue*subValue);
		System.out.println(addValue/subValue);
		System.out.println(addValue%subValue);

	}


	}


