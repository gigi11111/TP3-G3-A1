package isep.redede;

import java.util.Scanner;

public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;
    // On decrit brievement la logique du jeu
    public void play() {
        while (true) {
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }
// On declare et implemente les autres methodes mentionnees plus haut
    private static void createPlayers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("veulliez choisir le nom du joueur 1, chez les blancs");
    String name = new scanner.nextLine();
    public Player player1 = Player(name, 0);
    System.out.println("veulliez choisir le nom du joueur 2, chez les noirs");
    String name = new scanner.nextLine();
    Player player2 = Player(name, 1);
    public currentPlayer = player1;
}
    private static void initialiseBoard() {
//initialisation de l'échiquier
    }
    private static void printBoard() {
    }
    private boolean isCheckMate(){
        //est il en échec et mat ?
        return false;
    }
    private boolean isValidMove(String move){
        return isValidMove();
    }
    private void updateBoard(String move){
        // met à jour l'affichage du tableau
    }
    private void switchPlayer(){
        if (currentPlayer==player1){
            currentPlayer=player2;
        }
        else{
            currentPlayer=player2;
        }
    }
}
