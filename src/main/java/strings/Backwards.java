package strings;

public class Backwards {
    public static void main(String[] args) {
        reverseString("");
    }

    public static void reverseString(String text){
        for(int i = text.length()-1 ; i >=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
