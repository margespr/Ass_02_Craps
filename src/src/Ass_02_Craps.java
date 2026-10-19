import java.util.Random;
import java.util.Scanner;

public class Ass_02_Craps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("First roll");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You crapped out. You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("You rolled a natural. You win.");
            } else {
                int point = sum;
                System.out.println("The point is " + point);

                boolean rolling = true;
                while (rolling) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Next roll");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("Made point. You win.");
                        rolling = false;
                    } else if (sum == 7) {
                        System.out.println("Rolled a seven. You lose.");
                        rolling = false;
                    } else {
                        System.out.println("Trying for point");
                    }
                }
            }

            System.out.print("Play again (Y/N): ");
            playAgain = in.nextLine().trim();
            System.out.println();
        }

        System.out.println("Thanks for playing");
    }
}
