import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Buffer reader is a class which reads a character and  sequence of character
        // Scanner is the advanced method for reading input form user it was added in newer version
        System.out.println("enter the integer");
        Float x=Float.parseFloat(br.readLine());
        System.out.println("you entred "+x);
    }
}
