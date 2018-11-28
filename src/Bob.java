import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
        Scanner sc = new Scanner(System.in);
        boolean keepAsking = true;

        do {
            System.out.println("Say something to Bob!!!");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")){
                System.out.println("Sure");
            }else if (userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if (userInput.equals("")){
                System.out.println("Fine. Be that way!");
            }

            System.out.println("Do you want to continue talking with Bob? [y/n]");
            keepAsking = sc.nextLine().equals("yes");
        }while (keepAsking);

    }
}
