// write a java program to initialize and display jagged array element with sum of each row
public class JaggedArray {
  public static void main(String[] args) {
    int jaggedArr[][] = {
    {1, 2, 3}, 
    {1, 2, 4, 5 }, 
    {4, 5, 9}
    };


    for(int i=0; i<jaggedArr.length; i++){
      int rowRes =0;
      for(int j=0; j<jaggedArr[i].length; j++){
        System.out.print(jaggedArr[i][j]+ " ");
        rowRes += jaggedArr[i][j];
      }
      System.out.println("Sum " + rowRes);
    }

  } 
}
