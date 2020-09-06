import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //delka
        int m = sc.nextInt(); //vyska
        int k = sc.nextInt();

        if((k <= m*n) && ( k%n == 0 || k%m == 0 ) ){

            if(n == 1 && k < n){
                System.out.println("YES");   // jedna rada
            }else if(m == 1 && k < m){
                System.out.println("YES");   // jeden sloupec
            }
            else if((n*m % 2 == 0 && k % 2 == 0) ){  // ctverce sude
                System.out.println("YES");
            }else if((m % 2 == 0 && n % 2 != 0)) {  // obdelnik licha delka
                if(k % m == 0 || k % n == 0 ){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }else if((n % 2 == 0 && m % 2 != 0)) {  // obdelnik licha delka
                if (k % m == 0 || k % n == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
            else if (n % 2 != 0 && m % 2 != 0){

                if (k % m == 0 || k % n == 0) {    // ctverec liche
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }else{
                System.out.println("NO");
            }


        }else{

            System.out.println("NO");


        }





    }
}