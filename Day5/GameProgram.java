package Day5.com;
import java.util.*;
public class GameProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Game: ");
        String name=sc.nextLine();
        System.out.println("Enter The Maximum Number of Players: ");
        int maxnumberofPlayers=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter The Game That has Time Limit: ");
        String timelimitgameName=sc.nextLine();
        System.out.println("Enetr The Maximum Number of Players That has Time Limit: ");
        int timelimitmaxnumberofPlayers=sc.nextInt();
        System.out.println("Enter The Time Limit in Minutes: ");
        int timeLimit=sc.nextInt();
        Game game=new Game(name,maxnumberofPlayers);
        GameWithTimeLimit gameWithTimeLimit=new GameWithTimeLimit(timelimitgameName,timelimitmaxnumberofPlayers,timeLimit);
        System.out.println(game.toString());
        System.out.println(gameWithTimeLimit.toString());

    }
}
