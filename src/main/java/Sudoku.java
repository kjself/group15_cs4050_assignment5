import java.util.*;

public class Sudoku {
    int SIZE;
    int board[][];
    int SUBGRID_SIZE[][];

    /**
     * Our sudoku board constructor.
     * @author Kaitlyn Self
     */
    public Sudoku() {
        this.SIZE = 9;
        this.board = new int[SIZE][SIZE];
        this.SUBGRID_SIZE = new int[SIZE/3][SIZE/3];
    }

    /**
     * This method loads the txt file "sudoku.txt" into a given Sudoku board.
     * @param newBoard The unfilled Sudoku board
     * @return A now-filled Sudoku board
     */
    public Sudoku loadBoard(Sudoku newBoard) {

    }

    /**
     * This method initiates the solving process, and prints the board if a solution is found.
     */
    public void solve() {

    }

    /**
     * This method uses backtracking to solve the Sudoku puzzle. It iterates through the board
     * and tries to place numbers (from 1 to 9) in the empty cells. If placing a number leads
     * to a solution, it returns true; otherwise, it backtracks.
     * @return true if solution is safe and legal
     */
    public boolean solveSudoku() {

    }

    /**
     * This method checks if placing a number in a given position is "safe" and abides by the
     * rules of Sudoku.
     * @return true if number is not present in the same row, column, or subgrid
     */
    public boolean isSafe(int number) {

    }

    /**
     * This method prints the given Sudoku board in a readable format.
     */
    public void printBoard() {

    }

}