package edu.pdx.cs410J.xingjian;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
        System.exit(1);
    }

    public void printDiamond(char letter) {
        //char[] letters={"A","B","C","D","E"};
        int n = letter - 65;
        for (int i = 0; i <= n; i++) {
            int temp = i + 65;
            for (int j = 0; j < 2 * n + 1; j++) {
                if (j == n - i) {
                    System.out.print((char) temp);
                } else if (j == n + i) {
                    System.out.print((char) temp);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int k = n - 1; k >= 0; k--) {
            int temp = k + 65;
            for (int j = 2 * n; j >= 0; j--) {
                if (j == n - k) {
                    System.out.print((char) temp);
                } else if (j == n + k) {
                    System.out.print((char) temp);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}