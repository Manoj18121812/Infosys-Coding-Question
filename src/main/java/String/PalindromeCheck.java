package String;

public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "macdhdam";

        //USing StringBuidler
        /*String reversed= new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }*/

        //Using for loop

        boolean isPalindrome= true;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) !=str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("is palindrome");
        }else{
            System.out.println("isn't palindrome");
        }

    }
}
