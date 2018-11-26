import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] arg){

//      1)Copy this code into your main method:
        double pi = 3.14159;

//        Write some java code that uses the variable pi to output the following:

        System.out.printf("The value of pi is approximately %f. %n", pi);

        //alternative would be

        String piMessage = String.format("The value of pi is approximately %f.", pi);
        System.out.println(piMessage);

//        Explore the Scanner Class
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?

//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: "); //if not an integer exception is thrown
        int userinput = sc.nextInt();
        System.out.println("Enter three words: ");
        String word1 = sc.next(); //does not go on if not three words/inputs
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.printf("%s %s %s %n",word1, word2, word3);


//        Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method,
//        then display that sentence back to the user.
//        do you capture all of the words?
        System.out.print("Enter a sentence: \n");
//        String userSentence = sc.next(); //do not capture all the words bc did not use the nextLine
        sc.nextLine(); //need this to get to user input or else program will continue and finish without displaying user input
        String userSentence = sc.nextLine();
        System.out.println(userSentence);








    }
}
