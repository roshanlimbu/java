class Emp{
    int eid;
    string post;
    string name; 
    public void show(){
      System.out.println(eid+ " : "+ post + " : " +name);
    }
}
public class TestStatic{
public static void main(String[] args) {
    Emp newObj= new emp();
    Emp.eid= 5;
    Emp.post="CEO";
    Emp.name= "Roshan";
  }
  System.out.println(newObj.eid);
  newObj.show();
}
