package src.main.java;

import java.util.*;

public class Main {
    /**
     * This is our main executable method for Sudoku backtracking.
     * @param args
     */
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku = sudoku.loadBoard(sudoku);
        sudoku.printBoard();

        System.out.println(sudoku.isSafe(3, 0, 2));
        System.out.println(sudoku.isSafe(1, 0, 2));
    }
}