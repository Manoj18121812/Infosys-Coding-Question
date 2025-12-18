package Number;

public class PalindromeCheckNo {

    public static void main(String[] args) {

        int no = 121;

        int original=no;
        int rev=0;

        while(no!=0){
            rev = rev*10 + no%10;
            no= no/10;
        }

        if(original ==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
