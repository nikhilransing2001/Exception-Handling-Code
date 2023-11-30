package exception;
//Multiple Try and One Catch
public class MultipleTry {

	public static void main(String[] args) 
	{
//		try {
//			int data=50/0;
//		}
		try {
			int data=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occure");
			
		}
	}
}
