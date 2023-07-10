import java.io.*;
public class CheckedExceptionExample {
  public static vofile_data(String args[]) {
    file_data = new FileInputStream("C:/Users/Roshan/Desktop/Hello.txt");
    int m;
    while ((m= file_data.read() !=-1) {
     System.out.println((char)m); 
    }
    file_data.close();
  }
}
