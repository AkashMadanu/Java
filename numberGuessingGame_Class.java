import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame_Class
{
    public static void main(String[] args)
    {
        Game g1 = new Game();
        g1.takeUserInput();
        g1.check();

        System.out.println("Number of guesses are : " + g1.getGuesses());
    }
}

class Game
{
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int userInput,compInput;
    private int guesses;
    public Game()
    {
        int cInput = random.nextInt(100);
//        System.out.println(rand);
        compInput=cInput;
    }
    public void takeUserInput()
    {
        System.out.println("Enter a number");

    }
    public void check()
    {
        do {
            userInput = input.nextInt();
            guesses++;
            if (userInput < compInput) {
                System.out.println("Higher Number Please");
            } else if (userInput > compInput) {
                System.out.println("Lower Numebr Please");
            } else if (userInput == compInput) {
                System.out.println("Congratulation!!! you WON ");
                break;
            }
        }while (userInput!=compInput);
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
}