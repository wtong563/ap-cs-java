public class HelloWorld {
    public static void doAddition(int a1, int a2) {
        System.out.println("total = " + (a1 + a2));
    }

    public static int addTwoNumber(int b1, int b2) {
        return b1 + b2;
    }

    public static void main(String[] argv) {
        int a1 = 3, a2 = 5;

        doAddition(a2, a1);
        doAddition(1, 100);
        doAddition(12, 10);
        doAddition(13, 1);

        int result = addTwoNumber(2, 3);
        System.out.println("I got result: " + result);

        result = addTwoNumber(a1, a2);
        System.out.println("I got result: " + result);

        System.out.println("Hello World");

        /*boolean b = true;

        boolean c = false;

        System.out.println("b = " + b);

        System.out.println("!b = " + !b);

        System.out.println("b && c = " + (b && c));

        System.out.println("b || c = " + (b || c));
        */

        double d = 1.93;
        System.out.println("d = " + d);

        int e = (int) d;
        System.out.println("e = " + e);

        int a = 1;
        int b = 2;

        System.out.println("a/b = " + a / b);

        System.out.println("(double)a/b= " + (double) a / b);

        char bigger;

        if (a > b) {
            bigger = 'a';
        } else {
            bigger = 'b';
        }

        System.out.println(bigger + " is larger");

            /* System.out.println("a is larger than b");

            System.out.println("Yes!");
        }

        else
            if (a<b)
            System.out.println("b is larger than a");
        else
            System.out.println("a and b are equal ");
            */


    }
}
