package exception;
//Simple Try Catch
public class SimpleTryCatch {

	public static void main(String[] args)
	{
		try {
			int data=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occure");
			
		}
	}
}
