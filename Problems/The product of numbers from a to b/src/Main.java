import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();
        long product = 1;

        for (long i = num1; i < num2; i++) {
            product *= i;
        }

        System.out.println(product);
    }
}