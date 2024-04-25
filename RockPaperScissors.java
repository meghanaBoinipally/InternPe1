import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter your choice: rock, paper, or scissors");

        String userChoice = scanner.nextLine().toLowerCase();

        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            return;
        }

        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer choice: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("rock")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You lose! Paper covers rock.");
            } else {
                System.out.println("You win! Rock smashes scissors.");
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You lose! Scissors cut paper.");
            } else {
                System.out.println("You win! Paper covers rock.");
            }
        } else if (userChoice.equals("scissors")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You lose! Rock smashes scissors.");
            } else {
                System.out.println("You win! Scissors cut paper.");
            }
        }
    }
}
