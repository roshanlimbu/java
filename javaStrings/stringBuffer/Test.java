public class Test{
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer("Hello");
        String newString = "world";
        sb.concat(newString);
        // sb.append("java");
        System.out.println(sb);
    }
}
