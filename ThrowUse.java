package exception;
//throw use
public class ThrowUse {

	public static void main(String[] args) 
	{
		int age = 15;
		if(age<18)
		{
			throw new ArithmeticException("Not Access Granted");
		}
		else {
			System.out.println("Access");
		}
	}

}
