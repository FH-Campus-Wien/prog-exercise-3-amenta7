package at.ac.fhcampuswien;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int first_day) {
        int counter = 0;

        for (int day = 1; day <= days; day++) {

            if (counter == 0) {
                for (int i = 0; i < first_day - 1; i++) {
                    System.out.print("   ");
                    counter++;
                }
            }

            if (day <= 9) {
                System.out.print(" " + day + " ");
            } else {
                System.out.print(day + " ");
            }
            counter++;

            if (counter % 7 == 0 && day != days) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static long [] lcg(long seed) {
        long m = 1L << 31;
        long a = 1103515245;
        long c = 12345;
        long [] numbers = new long[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (a * seed + c) % m;
            seed = numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return numbers;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Guess number " + i + ": ");
            int guessedNumber = scanner.nextInt();

            if (guessedNumber == numberToGuess) {
                System.out.println("You won wisenheimer!");
                break;
            } else if (i < 10 && guessedNumber < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            } else if (i < 10 && guessedNumber > numberToGuess){
                System.out.println("The number AI picked is lower than your guess.");
            }

            if (i == 10 && guessedNumber != numberToGuess) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
        }
    }

    public static  int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(min) + max;
        return numberToGuess;
    }

    public static boolean swapArrays(int[] Array1, int[] Array2) {
        int temp = 0;

        if (Array1.length == Array2.length) {
            for (int i = 0; i < Array1.length ; i++) {
                temp = Array1[i];
                Array1[i] = Array2[i];
                Array2[i] = temp;
            }
            return true;
        } else {
            return false;
        }
    }

    public static String camelCase(String string) {
    char[] CharArray = string.toCharArray();
    return string;
    }

    public static int checkDigit(int[] numbers) {
        int digit = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * (i + 2);
        }
       int remainder = sum % 11;
        digit = 11 - remainder;

        if (digit == 10) {
            digit = 0;
        } else if (digit == 11) {
            digit = 5;
        }
        return digit;
    }

    public static void main(String[] args) {
        oneMonthCalendar(31, 5);
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}