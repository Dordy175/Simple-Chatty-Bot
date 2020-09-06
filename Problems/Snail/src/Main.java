import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int topReached = 0, days =0;

        while(topReached <= h){

            topReached = topReached + a;
            if(topReached >= h){
                days++;
                break;
            }
            topReached -= b;
            days++;
        }

        System.out.println(days);

    }
}