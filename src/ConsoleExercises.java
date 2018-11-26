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

//        Calculate the perimeter and area of Codeup's classrooms
//        Prompt the user to enter values of length and width of a classroom at Codeup.
//        Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle
//        is equal to 2 times the length plus 2 times the width.

        System.out.println("Enter the length of the Codeup classroom: ");
        double length = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the width of the Codeup classroom: ");
        double width = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the height of the Codeup classroom: ");
        double height = Double.parseDouble(sc.nextLine());


        double getArea = length * width;
        double getPerimeter = (2 * length) + (2 * width);
        double getVolume = length * width * height;
        System.out.println("This is the Area of the class room: " + getArea);
        System.out.println("This is the Perimeter of the class room: " + getPerimeter);
        System.out.println("This is the Volume of the class room: " + getVolume);

//        Bonuses
//        Accept decimal entries //done
//        Calculate the volume of the rooms in addition to the area and perimeter //done

//        sc.useDelimeter("\n"); //does not work

//        How does this change the way your program operates?
//        Rewrite your classroom calculating program to use nextInt method. If you added the line of code above to
//        your application, you should now have no trouble handling multiple pieces of user input.








    }
}
