
import java.util.Random;

import java.util.Scanner;

import static java.lang.System.exit;


public class PaperScissorsRockGame {
    //Static text values used in the Game
    public static String ROCK = "ROCK";
    public static String PAPER = "PAPER";
    public static String SCISSORS = "SCISSORS";
    public static String MACHINE = "MACHINE";
    public static String PLAYER = "PLAYER";

    //Number of games to be played
    public static int NUMBER_OF_GAMES = 3;


    public static String generateMachineChoice(Random r) {

        //Random choice for the machine player
        int valueCode;
        valueCode = r.nextInt(3) + 1;

        //Mapping numeric choice to game symbol
        String machineChoice = "";
        switch (valueCode){
            case 1:
                machineChoice = ROCK;
                break;
            case 2:
                machineChoice = PAPER;
                break;
            case 3:
                machineChoice = SCISSORS;
                break;
            default:
                break;
        }

        System.out.println("\nMachine says: I have made my choice");
        return machineChoice;
    }

    public static void listOptions() {
        System.out.println("Available options: \n1. Rock\n2. Paper\n3. Scissors\n4. Exit game");
    }

    public static String captureUserOption(Scanner scanner) {
        String userOption = "";
        System.out.println("\nChoose your might! : ");
        userOption = scanner.nextLine();

        //Mapping numeric choice to game symbol
        switch (userOption.trim()){
            case "1":
                userOption = ROCK;
                break;
            case "2":
                userOption = PAPER;
                break;
            case "3":
                userOption = SCISSORS;
                break;
            default:
                exit(0);
                break;
        }

        return userOption;
    }

    public static String decideWinner(String machineOption, String userOption) {

        //Static Game text:
        String winnerDecision = "None";
        String decisionMessage = "You managed to choose the same option! No winner this time ";
        String endGameMessage = "";
        String paperWins = "The paper wrapped the confused rock!";
        String rockWins = "The rock destroyed the weak scissors!";
        String scissorsWins = "The scissors inflicted a deadly cut to the paper!";

        //Game decision logic
        if (machineOption.equals(ROCK) && userOption.equalsIgnoreCase(SCISSORS)) {
            winnerDecision = MACHINE;
            decisionMessage = rockWins;
        } else if (machineOption.equals(SCISSORS) && userOption.equalsIgnoreCase(ROCK)) {
            winnerDecision = PLAYER;
            decisionMessage = rockWins;
        }

        if (machineOption.equals(SCISSORS) && userOption.equalsIgnoreCase(PAPER)) {
            winnerDecision = MACHINE;
            decisionMessage = scissorsWins;
        } else if (machineOption.equals(PAPER) && userOption.equalsIgnoreCase(SCISSORS)) {
            winnerDecision = PLAYER;
            decisionMessage = scissorsWins;
        }

        if (machineOption.equals(PAPER) && userOption.equalsIgnoreCase(ROCK)) {
            winnerDecision = MACHINE;
            decisionMessage = paperWins;
        } else if (machineOption.equals(ROCK) && userOption.equalsIgnoreCase(PAPER)) {
            winnerDecision = PLAYER;
            decisionMessage = paperWins;
        }

        endGameMessage = winnerDecision + " WINS! Decision: " + decisionMessage;
        return endGameMessage;
    }

    public static void main (String [] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String machineOption;
        String userOption;
        String winnerDecision;

        int gameCounter = 1;
        while (gameCounter <= NUMBER_OF_GAMES) {
            System.out.println("This is game " + gameCounter + " out of " + NUMBER_OF_GAMES + " games.");
            listOptions();

            machineOption = generateMachineChoice(random);
            userOption = captureUserOption(scanner);
            winnerDecision = decideWinner(machineOption, userOption);

            System.out.println("\nThe results are in!\nMachine option: " + machineOption + "\nUser option: " + userOption);
            System.out.println(winnerDecision);

            gameCounter++;

            if (gameCounter > NUMBER_OF_GAMES) {
                System.out.println("\nGAME OVER");
            }
        }
    }
}
