package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // get input for string to shift and number of shifts to complete
        System.out.println("Enter string to shift: ");
        Scanner scanner = new Scanner(System.in);
        String toShift = scanner.nextLine();
        System.out.println("Enter number to shift: ");
        int shiftVal = scanner.nextInt();
        System.out.println("Original string: " + toShift);
        System.out.printf("Shifting by %d...%n", shiftVal);
        System.out.println("Shifted string: " + doCaesarShift(toShift, shiftVal));

    }

    public static String doCaesarShift(String str, int shiftVal){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = alphabet.toCharArray();
        final int ABC_LENGTH = 26;
        String shifted = "";

        for(char c : str.toCharArray()){
            int oldIndex = alphabet.indexOf(c);
            int newIndex = (oldIndex + shiftVal)%ABC_LENGTH;
            shifted += alphabetArray[newIndex];
        }

        return shifted;
    }
}
