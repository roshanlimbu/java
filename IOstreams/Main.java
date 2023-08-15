import java.io.FileInputStream;
import java.io.IOException;
public class Main{
    public static void main(String [] args){
        try{
            FileInputStream inputStream = new FileInputStream("file.txt");
            int data = inputStream.read();
            while(data!=-1){
                data = inputStream.read();
            }
            inputStream.close();

        } catch(IOException e){
        }
    }
}
