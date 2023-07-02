class Person{
  int id; 
  String FirstName;
  Person (int id, String FirstName){
    this.id=id;
    this.FirstName = FirstName;
  }
}
class Emp extends Person{
  String LastName;
  Emp(int id, String FirstName, String  LastName){
    super(id, FirstName);
    this.LastName = LastName;
  }
  void display(){
    System.out.println("id: "+ id + " " +"FirstName: " + FirstName + " " + "LastName: " + LastName);
  }
}

class Super{
  public static void main(String args []){
    Emp obj = new Emp(1001, "Roshan", "Limbu");
    obj.display();
  }
}
