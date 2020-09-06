import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int armySum = sc.nextInt();

        if(armySum >= 1){
            if(armySum <= 19){
                System.out.println("pack");
            }else if (armySum <= 249){
                System.out.println("throng");
            }else if (armySum<=999){
                System.out.println("zounds");
            }else{
                System.out.println("legion");
            }
        }
        else {
            System.out.println("no army");
        }
    }
}