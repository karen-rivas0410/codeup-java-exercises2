public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//      1)Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 18;
        System.out.println(myFavoriteNumber);

//      2)Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hi, my name is Karen!";
        System.out.println(myString);

//      3)Change your code to assign a character value to myString. What do you notice?

//        myString = 'r'; //cannot be converted to string

//      4)Change your code to assign the value 3.14159 to myString. What happens?

//        myString = 3.14159; //double cannot be converted to string

//      5)Declare an long variable named myNumber, but do not assign anything to it.
//          Next try to print out myNumber to the console. What happens?

//        long myNumber;
//        System.out.println(myNumber); //it was not initialized

//      6)Change your code to assign the value 3.14 to myNumber. What do you notice?

//        long myNumber = 3.14; //incompatible type found double

//      7)Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        long myNumber = 123L;

//      8)Change your code to assign the value 123 to myNumber

//        long myNumber = 123;

//      Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does? bc 3.14 is a double has a decimal and is not an int

//      9)Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        float myNumber = 3.14F;  //added the F to the end

//        double almostPi = (double) myNumber; //can cast it explicitly

//        System.out.println(almostPi);

//       10)Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//       11)Try to create a variable named class. What happens?

//        String class = "hello"; //cant bc its one of the reserved words

//       12)Object is the most generic type in Java. You can assign any value to a variable of type Object.
//          What do you think will happen when the following code is run?

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) "three"; //cannot run compile error bc string cannot be converted to int
//        int three = (int) o; //runtime error exception

//        System.out.println();

//       13)Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;

//        x += 5;


//        int x = 3;
//        int y = 4;
//        y = y * x;

//        y *= x;


        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;

//        x /= y;
        y -= x;

        System.out.println(y);

//       14)What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        What happens if you increment a numeric variable past the type's capacity?

//        byte newNumber = 300; //cannot due error found in type
//        byte newNumber = -128; //goes from the opposite max it can do
//        newNumber--;

//        System.out.println(newNumber);

//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type















    }
}
