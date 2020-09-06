import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1, n2, n3, n4;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();

        System.out.println((--n1) + " " + (--n2) + " " + (--n3) + " " + (--n4));

    }
}