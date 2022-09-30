package com.company;

public class Main {

    public static void main(String[] args) {

        Pattern3(5);
    }

    static void Pattern1 (int n){
        for (int row = 0; row <= n - 1; row++) {
            for (int col = 0; col <= n - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Pattern2 (int n){
        for (int row = 0; row <= n - 1; row++) {
            for (int col = 0; col <= n - row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3 (int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalcolinrow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
