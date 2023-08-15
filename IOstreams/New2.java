import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class New2 {
    public static void main(String[] args) {
        try{
            FileOutputStream outputStream = new FileOutputStream("file.txt");
            outputStream.write("hello World".getBytes());
            outputStream.close();
            FileInputStream inputStream = new FileInputStream("./file.txt");
            int data = inputStream.read();

            System.out.println(data);
            inputStream.close();

        } catch(IOException e){
            System.out.println(e);
        }
    }
}
