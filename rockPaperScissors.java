import java.awt.dnd.DragGestureEvent;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors
{
    public static void main(String[] args) {

       Random random = new Random();

       Scanner input = new Scanner(System.in);
       String uChoice=null,cChoice=null;
       int replay=0;
        int computer = 0, user;
do {
    //Random number b/w 0-99
    int rand = random.nextInt(100);

    //TAKING THE RANDOM COMPUTER INPUT //DISPLAYING COMPUTER CHOICE
    if (rand < 33)
    {
        computer = 1;
        cChoice="Rock";
    }
    else if (rand < 66)
    {
        computer = 2;
        cChoice="Paper";
    }
    else if (rand < 100)
    {
        computer = 3;
        cChoice="Scissors";
    }

//TAKING THE USER INPUT
    System.out.println("Choose 1 - \"rock\" or 2- \"paper\" or 3- \"scissors\" ");
    user = input.nextInt();

    //DECISION-MAKING
    if (user ==computer) {
        System.out.println("Draw");

    } else if (user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2) {
        System.out.println("***Y0U W!N***");
    } else if (computer == 1 && user == 3 || computer == 2 && user == 1 || computer == 3 && user == 2) {
        System.out.println("00PS...");
        System.out.println("BETTER LUCK NEXT TIME :)");
    } else {
        System.out.println("Invalid Entry");
        continue;
    }
//TO DISPLAY CHOICE  USER

    switch (user) {
        case 1 -> uChoice = "Rock";
        case 2 -> uChoice = "Paper";
        case 3 -> uChoice = "Scissors";
    }

    //PRINTIGN THE CHOICE OF USER AND THE COMPUTER
    System.out.println("Your choice - " + uChoice );
    System.out.println("Computer choice - " + cChoice );

    //USER CHOICE -TO PALY OR NOT
    System.out.println("Wanna Play Again?");
    System.out.println("Enter 1 to replay");
    replay = input.nextInt();

}while (replay==1);

//IF USER DON'T WANNA PLAY
        System.out.println("~SEE YOU AGAIN~");
        System.out.println("*****Thank You For Playing*****");


    }
}
