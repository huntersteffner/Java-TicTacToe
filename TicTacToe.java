import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");
            char[][] board = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'},
                
            };

            char turn = 'X';
            printBoard(board);
            for(int i = 0; i<9;i++) {
                if(turn == 'X') {
                    int[] answers =  askUser(board);
                    board[answers[0]][answers[1]] = 'X';
                    printBoard(board);
                    checkWin(turn, board);
                    turn = 'O';
                } else {
                    int[] answers =  askUser(board);
                    board[answers[0]][answers[1]] = 'O';
                    printBoard(board);
                    checkWin(turn, board);
                    turn = 'X';
                }
            }

            

            scan.close();
        }

    public static void printBoard(char[][] array) {
        System.out.print("\n");
        for(int i = 0; i<array.length;i++) {
            System.out.print("\t");
            for(int j =0; j<array[i].length;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }
    
    

     public static int[] askUser(char[][] board) {
        System.out.print("Please pick a row and column number");
        int choice1 = scan.nextInt();
        int choice2 = scan.nextInt();

        while(choice1 > 2 || choice2 > 2) {
            System.out.print("Please enter numbers between 0 and 2.");
            choice1 = scan.nextInt();
            choice2 = scan.nextInt();
        }

        while(board[choice1][choice2] != '_') {
            System.out.print("Sorry, that spot is taken. Please try again.");
            choice1 = scan.nextInt();
            choice2 = scan.nextInt();
        };

        int[] choices = {choice1,choice2};
        return choices;
     }
   

     public static void checkWin(char turn, char[][] board) {
        if((board[0][0] == turn) && (board[0][1] == turn) && (board[0][2] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[1][0] == turn) && (board[1][1] == turn) && (board[1][2] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[2][0] == turn) && (board[2][1] == turn) && (board[2][2] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[0][0] == turn) && (board[1][0] == turn) && (board[2][0] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[0][1] == turn) && (board[1][1] == turn) && (board[2][1] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[0][2] == turn) && (board[1][2] == turn) && (board[2][2] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[0][0] == turn) && (board[1][1] == turn) && (board[2][2] == turn)) {
            System.out.println("Player " + turn + " wins!");
            System.exit(0);
        } else if((board[0][2] == turn) && (board[1][1] == turn) && (board[2][0] == turn)) {
            System.out.println("Player " + turn + " wins!");
            scan.close();
            System.exit(0);
        }
     }
    


}
