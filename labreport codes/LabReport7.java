public class LabReport7 {
  // Declaring Instance variable
  float pi = 3.14f;

  // Static variable
  static int statNum = 10;

  // Local variable
  public void localVar(){
    String text = "This is local variable.";
    System.out.println(text);
  }

  // Method that uses instance variable
  public void instVar(){
    System.out.println("This is instance variable " + this.pi);
  }

  //  Method that uses static variable
  public static void statVar(){
    System.out.println("This is static variable " + statNum);
  }



  public static void main(String[] args) {
    LabReport7 localVariable = new LabReport7();
    LabReport7 instVariable = new LabReport7();
    // LabReport7 staticVariable = new LabReport7();

    localVariable.localVar();
    instVariable.instVar();
    statVar();
  }
}
