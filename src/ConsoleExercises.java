import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word.");
        String userWord1 = scanner.nextLine();
        System.out.println("Input word.");
        String userWord2 = scanner.nextLine();
        System.out.println("Input word.");
        String userWord3 = scanner.nextLine();
        System.out.format("%s%n%s%n%s%n", userWord1, userWord2, userWord3);

        System.out.println("Input a sentence.");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence: "+userSentence);

        System.out.format("The value of pi is approximately %s%n", pi);
        System.out.println("Input an integer: ");
        int userInt = scanner.nextInt();
        System.out.format("Your integer is %s%n%n", userInt);
    }
}
