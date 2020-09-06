import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        if(Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I' || Character.toUpperCase(ch) == 'O' || Character.toUpperCase(ch) == 'U'){
            return true;
        }else {
            return false;
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}