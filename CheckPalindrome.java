import java.util.Scanner;
/* 
This class checks whether the input string is a palindrome or not. It returns Yes and No for the cases respectively.
*/
public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        if (ch.equals(new StringBuilder(ch).reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
