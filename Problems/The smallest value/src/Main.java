import java.util.Scanner;

class Main {




    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        long n = 1;
        long newFact = 0;
        long counter = 1;



        while(newFact <= m){

            long fact = 1;
            for (long i = 2; i <= counter; i++) {
                fact = fact * i;
            }
            newFact = fact;
            ++counter;

        }


            System.out.println(counter-1);



    }



}

