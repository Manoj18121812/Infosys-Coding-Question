package String;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Manoj";
        //Using StringBuilder
/*
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
*/

        //Using For Loop

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }


    }
}
