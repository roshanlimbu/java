import java.util.*;
import java.util.List;
public class ArrayList {
  public static void main(String[] args) {
    List<String> names = List.of("Roshan", "Bishnu" , "Rohan");
    Iterator<String> it = names.iterator();
    while(it.hasNext()){
      String name = it.next();
      System.out.println(name);
    }
  }  
}
