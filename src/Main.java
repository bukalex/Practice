public class Main {
    public static void main(String[] args) {
        int[] array = new int[2];
        String str = "null";

        try{
            System.out.println(array[1]);
            System.out.println(str.length());
            Example example = new Example();
            Object clone = example.clone();
        }catch(CloneNotSupportedException | ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }
    }
}