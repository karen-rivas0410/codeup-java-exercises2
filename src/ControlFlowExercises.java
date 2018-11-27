import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Loop Basics
//        While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less
//        than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        int i = 100;
//
//        do {
//            System.out.print(i + " ");
//            i -= 5;
//        }while (i >= -15);

//        long i = 2;  //has to be a long and not an int
//        do {
//            System.out.print(i + "\n" );
//            i *= i;
//        }while (i < 1000000);

//        For
//        refactor the previous two exercises to use a for loop instead

//        for (int i = 5; i <= 15; i += 1) {
//            System.out.print(i + " ");
//        }

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.


//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 15 == 0){
//                System.out.println("Fizzbuzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }


//        Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//        What number would you like to go up to? 5
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a Integer: ");
//        int userInput = sc.nextInt();
//        System.out.println("\nHere is your table!\n");
//        System.out.println(("Number | Squared | Cubed"));
//        System.out.println("====== | ======= | ======");
//        for (int i = 1; i <= userInput; i += 1) {
//            int numSquared = (int) Math.pow(i, 2);
//            int numCubed = (int) Math.pow(i, 3);
//
//        String message =  i + "    " +
//                "  |   " + numSquared + "     |   " + numCubed;
//        System.out.println(message);
////        System.out.printf("%-6d | %-7d | %-5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3)); //ALTERNATIVE TO MY SOLUTION//
//        }

//        Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
        Scanner sc = new Scanner(System.in);
        boolean userContinues = true;
        do {
        System.out.println("Please enter a grade from 0 to 100: ");
        int userInput = sc.nextInt();
        for (int i = 0; i < userInput; i += 1); {
                if (userInput >= 88 && userInput <= 100){
                    System.out.println("Your grade is A");
                }else if (userInput >= 80 && userInput <= 87) {
                    System.out.println("Your grade is B");
                }else if (userInput >= 67 && userInput <= 79){
                    System.out.println("Your grade is C");
                }else if (userInput >= 60 && userInput <= 66){
                    System.out.println("Your grade is D");
                }else if (userInput >= 0 && userInput <= 59){
                    System.out.println("Yor grade is F: You are a failure!!");
                }
            }
            System.out.println("Do you want to continue? [Y/N]");
            String willContinue = sc.next();
            if (!willContinue.toLowerCase().startsWith("y")){
                userContinues = false;
            }

        }while (userContinues);



    }
}
