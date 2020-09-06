import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // String newInput = input.replace("a","b"); // IMMUTABLE, pokud bez promenne navic musel by byt replace v Sys.out.println
        System.out.println(input.replace("a","b"));

    }
}