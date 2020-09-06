import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int squareN = 1;
        int stopper = 0;

        while(stopper <= n ){


            stopper = squareN * squareN;
            if(stopper > n ){
                break;
            }
            System.out.println(stopper);

            squareN++;
        }


    }
}