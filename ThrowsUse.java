package exception;
import java.io.*;
public class ThrowsUse 
{
	public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\NIKHIL\\OneDrive\\Desktop\\MC.txt");
        if (f.createNewFile()) {
            System.out.println("File Succefully Create...");
        } else {
            System.out.println("File Already exit...");
        }
    }
}
