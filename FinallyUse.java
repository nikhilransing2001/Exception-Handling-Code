package exception;
//Finally Use
public class FinallyUse {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception  Occure");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("ArrayIndexOutOfBounds Exception Occure");
		}
		catch (Exception e) {
			System.out.println("Handel The All Exception");
		}
		finally {
			System.out.println("All Code Run");
		}
	}

}
