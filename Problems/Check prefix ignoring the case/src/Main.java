import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean startsWithJ = input.toLowerCase().startsWith("j");  // mohlo by byt i charAt(0);
        System.out.println(startsWithJ);




    }
}