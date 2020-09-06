class Main {
    public static void main(String[] args) {
        // put your code here
        System.out.println("Hello, Java!");

        //boolean testy
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b1 && !b2 && b3);
        
        b1 = false;
        b2 = true;
        b3 = false;
        System.out.println(b1 && b2 || b3);

        //ternary
        System.out.println("/nTernary 1.:");
        b1 = true;
        b2 = true;
        b3 = true;
        System.out.println((b1 && b2) ? b1 : (b2 || b3) ? b2 : b3);

        System.out.println("/nTernary 2.:");
        b1 = false;
        b2 = false;
        b3 = false;
        System.out.println((b1 && b2) ? b1 : (b2 || b3) ? b2 : b3);

        System.out.println("/nTernary 3.:");
        b1 = true;
        b2 = false;
        b3 = false;
        System.out.println((b1 && b2) ? b1 : (b2 || b3) ? b2 : b3);
        System.out.println("/nTernary 4.:");
        b1 = false;
        b2 = true;
        b3 = false;
        System.out.println((b1 && b2) ? b1 : (b2 || b3) ? b2 : b3);
        System.out.println("/nTernary 5.:");
        b1 = false;
        b2 = false;
        b3 = true;
        System.out.println((b1 && b2) ? b1 : (b2 || b3) ? b2 : b3);


        float f = (float) (20d + 20.02f); // 1
        long n = 10 + 2L;       // 2
        byte b = (byte) (n + 5);         // 3

        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        int c = 100;

        int magic = 0;
        while (c > 0) {
            c /= 10;
            magic++;
        }

        System.out.println("C: " + c + " ; Magic: " + magic);

        System.out.println("Branching statements -> how much numbers ");
        for (i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }
}