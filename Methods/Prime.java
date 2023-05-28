public class Prime{
  public static void main(String[]args){
    prime();
  }
  public static void prime(){
    int n = 5;
    if(n==2){
      System.out.println("The number is prime.");
    } else if(n!=2){
      int counter =0; 
      for(int i=1; i<=5; i++){
        if(5%i==0){
          counter++;
        }
      }
        System.out.println(counter);

      if(counter ==2){
        System.out.println("The number is prime.");
      } else{
        System.out.println("The number is not prime.");
      }
    }
  }
}
