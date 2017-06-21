import java.util.Scanner;

/*
This class takes an input string with variable letter cases such as input = abCDeFQWertY and,
pops the output with opposite letter cases, ex. ABcdEfqwERTy.
*/

public class ChangeCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        String temp = "";
        Character [] arr = new Character[ch.length()];

        if(ch.length()<101){ // Can alter the length of input string here!! Also should not be hardcoded like here. Here it is just for simple illustration.
            for(int i=0; i<ch.length(); i++){
                arr[i] = ch.charAt(i);
                //System.out.println(arr[i]);
                if(Character.isLowerCase(arr[i])){
                    temp += arr[i].toString().toUpperCase();}
                else if (Character.isUpperCase(arr[i])){
                    temp += arr[i].toString().toLowerCase();}
                else
                {
                    System.out.println("Something is wrong probably!");
                }
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
