import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean endsWithBurg = input.toLowerCase().endsWith("burg");
        System.out.println(endsWithBurg);
    }
}