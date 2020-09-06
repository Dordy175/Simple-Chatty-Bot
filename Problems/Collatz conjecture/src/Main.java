import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(n);




        while(n >= 1){


            if(n == 1){

                break;

            }

            if(n == 2) {

                n /= 2;
                System.out.println(n);
                break;

            }else if(n % 2 != 0) {
                n = n * 3 + 1;
                System.out.println(n);
            }
            else {
                n /= 2;
                System.out.println(n);
            }



        }
    }
}