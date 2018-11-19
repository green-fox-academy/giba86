import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
    public static String ticTacResult(String filename){
        char x = 'X';
        char o = 'O';
        ArrayList<String> tictactoe = new ArrayList<>();
        try {
             for(String lines : Files.readAllLines(Paths.get(filename))){
                 tictactoe.add(lines);
             }
        } catch (IOException e){
            e.printStackTrace();
        }

        if(x == (tictactoe.get(0).charAt(0)) && x == (tictactoe.get(1).charAt(0)) && x == (tictactoe.get(2).charAt(0))
            || x == (tictactoe.get(0).charAt(1)) && x == (tictactoe.get(1).charAt(1)) && x == (tictactoe.get(2).charAt(1))
            || x == (tictactoe.get(0).charAt(2)) && x == (tictactoe.get(1).charAt(2)) && x == (tictactoe.get(1).charAt(2))
            || x == (tictactoe.get(0).charAt(0)) && x == (tictactoe.get(0).charAt(1)) && x == (tictactoe.get(0).charAt(2))
            || x == (tictactoe.get(1).charAt(0)) && x == (tictactoe.get(1).charAt(1)) && x == (tictactoe.get(1).charAt(2))
            || x == (tictactoe.get(2).charAt(0)) && x == (tictactoe.get(2).charAt(1)) && x == (tictactoe.get(2).charAt(2))
            || x == (tictactoe.get(0).charAt(0)) && x == (tictactoe.get(1).charAt(1)) && x == (tictactoe.get(2).charAt(2))
            || x == (tictactoe.get(2).charAt(2)) && x == (tictactoe.get(1).charAt(1)) && x == (tictactoe.get(0).charAt(0))){

            return "x";
        } else if(o == (tictactoe.get(0).charAt(0)) && o == (tictactoe.get(1).charAt(0)) && o == (tictactoe.get(2).charAt(0))
                || o == (tictactoe.get(0).charAt(1)) && o == (tictactoe.get(1).charAt(1)) && o == (tictactoe.get(2).charAt(1))
                || o == (tictactoe.get(0).charAt(2)) && o == (tictactoe.get(1).charAt(2)) && o == (tictactoe.get(1).charAt(2))
                || o == (tictactoe.get(1).charAt(0)) && o == (tictactoe.get(1).charAt(1)) && o == (tictactoe.get(1).charAt(2))
                || o == (tictactoe.get(2).charAt(0)) && o == (tictactoe.get(2).charAt(1)) && o == (tictactoe.get(2).charAt(2))
                || o == (tictactoe.get(0).charAt(0)) && o == (tictactoe.get(1).charAt(1)) && o == (tictactoe.get(2).charAt(2))
                || o == (tictactoe.get(2).charAt(2)) && o == (tictactoe.get(1).charAt(1)) && o == (tictactoe.get(0).charAt(0))){

            return "o";
        }
        return "draw";
    }
}