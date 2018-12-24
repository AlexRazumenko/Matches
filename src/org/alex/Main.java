package org.alex;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;          //squares number
        int matches;    //matches number

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number from 1 to 10");
                n = scanner.nextInt();

                if ((n > 0) && (n < 11)) break;
                else
                    System.out.println("Wrong number! Must be from 1 to 10!");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wrong data! Please try again.");
            }
        }

            int a = (int) Math.floor(Math.sqrt(n)); //side of "big" square filled with 1x1 squares
            int aSquare = (int) Math.pow(a, 2);     //square of "big" square
            matches = 2 * n + 2 * a;
            if ((n - aSquare) == 0) matches +=0;
            else if ((n - aSquare) <= a) matches += 1;
            else matches += 2;

        System.out.println("Number of matches: " + matches);

    }
}
