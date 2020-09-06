//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        //scanner slouzi pro cteni dat
        Scanner scanner = new Scanner(System.in);

        //nacte po radcich
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        //vypise po radcich opacne
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

    }
}