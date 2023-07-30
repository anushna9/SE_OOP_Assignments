import java.util.Scanner;

class exception {

    void arthmaticException() {

        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            try {

                System.out.println("Enter 1st Number :");
                int num1 = sc.nextInt();

                System.out.println("Enter 2nd Number :");
                int num2 = sc.nextInt();
                double c = num1 / num2;
                System.out.println("Division is " + c);
                valid = true;
            } catch (Exception e) {
                System.out.println("Cannot Divide by Zero \nEnter Valid Denominator....\n");

            }
        }

    }

    void ArrayOutOfBound() {
        Scanner sc = new Scanner(System.in);
        boolean valid;
        valid = false;
        while (!valid) {
            try {

                System.out.print("Enter the size of array which you want to print :\n");
                int n = sc.nextInt();

                int[] array = new int[n];
                System.out.println("Enter the elements of the array: ");
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }

                System.out.print("Enter the Index No. of Element which you want to print :\n");
                int i = sc.nextInt();

                System.out.println(array[i] + " is present at given index");

                valid = true;
            } catch (Exception e) {

                System.out.println("Invalid Index try again...\n");

            }

        }
    }

    void NumberFormat() {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {

            try {
                System.out.print("Enter first number:: ");
                String num1 = sc.next();
                System.out.print("Enter Second number:: ");
                String num2 = sc.next();
                int a = Integer.parseInt(num1);// converting string to integer
                int b = Integer.parseInt(num2);// converting string to integer
                System.out.println("\nEntered Numbers are integers::" + a + " , " + b);
                valid = true;

            } catch (Exception e) {

                System.out.println("Numbers You have Enter are not Integers \nPlease try again...\n");
            }

        }
    }
}

public class main {

    public static void main(String[] args) {

        exception e = new exception();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("\nEnter the Choice which you want to check type of error\n"
                    + "1. Arithmaticexception\n"
                    + "2. NumberFormat\n"
                    + "3. ArrayIndexBound\n"
                    + "4. Exit\n");

            n = sc.nextInt();
            switch (n) {
                case 1:
                    e.arthmaticException();
                    break;
                case 2:
                    e.NumberFormat();
                    break;

                case 4:
                    n = 0;
                    break;

                case 3:
                    e.ArrayOutOfBound();
                    break;

                default:
                    System.out.println("INVALID INPUT !!!");
            }

        } while (n != 0);

    }

}