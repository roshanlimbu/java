// wap to find the factorial using recursion
public class LabReport8{

  public void factorial(int n , int divisor){
    if(n==0|| n==1){
      System.out.println(1);
    } else {
      if(divisor<=n){
        if(n % divisor == 0){
          System.out.println(divisor);
        }
        factorial(n, divisor+1);
      }
    }
  }
  public static void main(String[] args){
    int num =10;
    LabReport8 fact = new LabReport8();
    fact.factorial(num, 1);


  }
}
