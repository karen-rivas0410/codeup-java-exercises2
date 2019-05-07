import java.util.Scanner;

public class MethodsExercises {
//    Basic Arithmetic
//    Create four separate methods. Each will perform an arithmetic operation:
//    Addition
//    Subtraction
//    Multiplication
//    Division
//    Add a modulus function that finds the modulus of two numbers

    public static void main(String[] args) {
//        System.out.println(add(2,4));
//        System.out.println(subtract(10,2));
//        System.out.println(multiply(4,2));
//        System.out.println(divide(15,5));
//        System.out.println(modulus(5, 3));
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your integer is: " + userInput);

        Scanner sc = new Scanner(System.in);
//        createFactorial(sc);

    }

//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtract(int s, int t) {
//        return s - t;
//    }
//
//    public static int multiply(int m, int n) {
//        return m * n;
//    }
//
//    public static int divide(int d, int e) {
//        return d / e;
//    }
//
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }

//    Create a method that validates that user input is in a certain range
//    The method signature should look like this:

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("This is not a number");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number is not in range");
            return getInteger(min, max);
        }
    }

//        Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

//        public static int calculateFactorial(int num) {
//            if (num == 0)
//                return 1;
//            else
//                return(num * (num - 1));
//        }

//        public static void createFactorial(Scanner sc) {
//            boolean willContinue = true;
//            do {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Please enter an integer from 1 to 10: ");
//                int userInt = getInteger(1, 12);
//                System.out.println(calculateFactorial(userInt));
//            }while (willContinue);

//        }
}
