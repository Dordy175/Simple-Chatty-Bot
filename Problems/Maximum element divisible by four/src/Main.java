import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int lines = sc.nextInt();   // first parameter = number of lines

        for(int i = 0; i < lines; i++ ){
            int num = sc.nextInt();

            if(num % 4 == 0){
                max = num > max ? num : max;
            }
        }
        System.out.println(max);

    }
}