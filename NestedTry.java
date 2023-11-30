package exception;

public class NestedTry {

	public static void main(String[] args) {
		try
		{
			try 
			{
				try {
					int arr[]= {3,45,6,7};
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic Exception Occure");
					System.out.println("bloc 2");
				}
			}
			catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception Occure");
				System.out.println("bloc 1");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception Occure");
			System.out.println("main bloc");
		}
	}

}
