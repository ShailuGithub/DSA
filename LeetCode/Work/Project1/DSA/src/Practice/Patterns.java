/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author SOFTWARE
 */
public class Patterns {

    public static void main(String[] args) {
        pattern28(6);
    }

    
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcols = row > n ? 2 * n - row : row;
            int spaces = n - totalcols;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = n; row > 0; row--) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totcols = row > n ? 2 * n - row : row;
            for (int col = 0; col < totcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
