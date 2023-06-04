public class MethodOverloading{
    static int AddMethod(int x, int y){
        return x+y;
     }
    static int AddMethod(int x, int y, int z){
        return x+y+z;
    }
    
    public static void main(String[]args){
        int result1 = AddMethod(10, 10);
        int result2 = AddMethod(10, 5, 20);
        System.out.println(result1);
        System.out.println("\n");
        System.out.println(result2);
    }
}