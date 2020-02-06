import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPlayers = 3;
        System.out.println("Number of enemies: ");
        int numberOfEnemies = in.nextInt();

        Encounter e = new Encounter(numberOfPlayers, numberOfEnemies);


    }
}
