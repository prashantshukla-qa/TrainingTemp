import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        System.out.println("Please enter a value");
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

        System.out.println("user entered :- " + userInput);

        input.close();
    }
    
}
