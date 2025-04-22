package src.main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Sudoku {
    int SIZE;
    int[][] board;
    int SUBGRID_SIZE;
    private String filename = "sudoku.txt";

    /**
     * Our sudoku board constructor.
     * @author Kaitlyn Self
     */
    public Sudoku() {
        this.SIZE = 9;
        this.SUBGRID_SIZE = 3;
        this.board = new int[SIZE][SIZE];
    }

    /**
     * This method loads the txt file "sudoku.txt" into a given Sudoku board.
     * @return A Sudoku board filled with the values from sudoku.txt
     */
    public Sudoku loadBoard(Sudoku board) {
        // check for valid input
        if (board == null) return null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // read each line
            for (int i = 0; i < SIZE; i++) {
                String line = reader.readLine();
                String[] cells = line.split(" ");
                // split each line into cells, assign to board
                for (int j = 0; j < SIZE; j++) {
                    board.board[i][j] = Integer.parseInt(cells[j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            board = null;
        }
        return board;
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
        return false;
    }

    /**
     * This method checks if placing a number in a given position is "safe" and abides by the
     * rules of Sudoku.
     * @return true if number is not present in the same row, column, or subgrid
     */
    public boolean isSafe(int number, int row, int column)
    {
        // check for duplicate of number in row
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number) return false;
        }
        // check for duplicate of number in column
        for (int i = 0; i < SIZE; i++) {
            if (board[i][column] == number) return false;
        }
        // check for duplicate of number in subgrid
        int subgridRow = row / SUBGRID_SIZE;
        int subgridColumn = column / SUBGRID_SIZE;
        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                if (board[subgridRow + i][subgridColumn + j] == number) return false;
            }
        }
        return true;
    }

    /**
     * This method prints the given Sudoku board in a readable format.
     */
    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            if (i % SUBGRID_SIZE == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < SIZE; j++) {
                if (j % SUBGRID_SIZE == 0 && j != 0) {
                    System.out.print("| ");
                }
                int val = board[i][j];
                System.out.print((val == 0 ? "." : val) + " ");
            }
            System.out.println();
        }
    }

}