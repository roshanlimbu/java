public class Array2 {
  public static void main(String[] args) {
    // int[] numbers = new int[3][4];
    // numbers[0][0] = 1;
    int arr[][] = {{1, 2, 3, }, {2, 4, 5, }, {5, 6, 7}};
    for(int i=0; i<3; i++){
      for(int j=0 ; j<3; j++){
        System.out.println(arr[i][j]);
      }
    }
  }
}
