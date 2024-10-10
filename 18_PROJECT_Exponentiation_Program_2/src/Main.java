import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baseNumber, exponent = 1;
        int result = 1  ;

        System.out.print("Please enter the base number: ");
        baseNumber = scan.nextInt();

        System.out.print("Please enter the exponent: ");
        exponent = scan.nextInt();

/*         SHORTCUT           */

        /* result = (int) Math.pow(baseNumber, exponent);

        System.out.print("Result: " + result); */


        for (int i = 1; i <= exponent; i++) {
            result *= baseNumber;
        }
        System.out.print("Result :"+result);


    }


}
