interface Bank{
  float rateOfInetrest();
}
class NIC implements Bank{
  public float rateOfInetrest(){
    return 9.15f;
  }
}
class Sanima implements Bank{
  public float rateOfInetrest(){
    return 9.7f;
  }
}
class Interface2{
 public static void main(String[]args){
    Bank b = new Sanima();
    System.out.println("ROI: " + b.rateOfInetrest() );
  }
}

