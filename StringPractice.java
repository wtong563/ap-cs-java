import java.util.Scanner;

public class StringPractice {

    public static void main(String[] argv) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three words:");
        String a = sc.nextLine();

        System.out.println("You just entered: " + a);

        //String a = "Happy saturday Everybody";
        System.out.println(a.length());

        boolean emptyOrNot = a.isEmpty();
        System.out.println("emptyOrNot is " + emptyOrNot);

        if (emptyOrNot)
            System.out.println("my string is empty");
        else
            System.out.println("my string is not empty");

        char b = a.charAt(1);
        System.out.println("character at position 1 is " + b);

        int firstSpace = a.indexOf(" ");
        int secondSpace = a.indexOf(" ", firstSpace + 1);
        System.out.println("space is at position: " + firstSpace);

        int a2 = a.indexOf("Happy");
        System.out.println("I found Happy at position: " + a2);

        String firstWord = a.substring(0, firstSpace);
        System.out.println("first word: " + firstWord);

        String secondWord = a.substring(firstSpace + 1, secondSpace);
        System.out.println("second word: " + secondWord);

        String thirdWord = a.substring(secondSpace, a.length());
        System.out.println("third word:" + thirdWord);

        boolean same = firstWord.equals(secondWord);
        System.out.println("same is: " + same);

        boolean same2 = (firstWord == secondWord);
        System.out.println("same2 is: " + same2);

        String anotherWord = secondWord;
        boolean same3 = (anotherWord == secondWord);
        System.out.println("same 3 is: " + same3);

        int c = firstWord.compareTo(secondWord);
        System.out.println("c = " + c);

        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter any word:");
        String pigTest = sca.nextLine();

        char pig1 = pigTest.charAt(0);

        String allVowels = "aeiouyAEIOUY";

        int pigLength = pigTest.length();

        System.out.println("your word in english is: " + pigTest);

        if (allVowels.indexOf(pig1) != -1) {
            System.out.println("your word in pig latin is: " + pigTest + "yay");
        }
        else {
            System.out.println(pigTest.substring(1, pigLength) + pig1 + "ay");
        }

    }
}