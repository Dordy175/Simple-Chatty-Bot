import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours1 = sc.nextInt();
        int minutes1 = sc.nextInt();
        int seconds1 = sc.nextInt();
        int firstMomentInSeconds = hours1 * 3600 + minutes1 * 60 + seconds1;

        int hours2 = sc.nextInt();
        int minutes2 = sc.nextInt();
        int seconds2 = sc.nextInt();
        int secondtMomentInSeconds = hours2 * 3600 + minutes2 * 60 + seconds2;

        int difference = secondtMomentInSeconds - firstMomentInSeconds;

        System.out.println(difference);
    }
}