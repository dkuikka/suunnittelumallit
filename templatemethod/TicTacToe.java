/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;
import java.util.Scanner;

/**
 *
 * @author dani
 */

/*
    Does not validate player choices, so unlike traditional tic-tac-toe
    the player is able to overwrite his opponents choices
*/
public class TicTacToe extends Game {
    Scanner scanner;
    int[] board;
    int player;

    @Override
    void initializeGame() {
        board = new int[] {3,4,5, 6,7,8, 9,10,11}; // dummy values
        scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe");
        System.out.println("Here is Your Board visualized");
        System.out.println("[0][1][2]");
        System.out.println("[3][4][5]");
        System.out.println("[6][7][8]");
    }

    @Override
    void makePlay(int player) {
        this.player = player;
        System.out.println("player " + player + " turn, make your choice (0-8): ");
        int playerChoice = scanner.nextInt();
        board[playerChoice] = player;
    }

    @Override
    boolean endOfGame() {
        if (board[0] == board[1] && board[1] == board[2]) {
            return true;
        } else if (board[3] == board[4] && board[4] == board[5]){
            return true;
        } else if (board[6] == board[7] && board[7] == board[8]){
            return true;
        } else if (board[0] == board[3] && board[3] == board[6]){
            return true;
        } else if (board[1] == board[4] && board[4] == board[7]){
            return true;
        } else if (board[2] == board[5] && board[5] == board[8]){
            return true;
        } else if (board[0] == board[4] && board[4] == board[8]){
            return true;
        } else if (board[2] == board[4] && board[4] == board[6]){
            return true;
        }
        return false;
    }

    @Override
    void printWinner() {
        System.out.println("Player " + player + " is the winner!");
    }
    
}
