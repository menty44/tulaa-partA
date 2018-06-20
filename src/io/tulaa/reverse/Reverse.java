package io.tulaa.reverse;

/**
 * Created by admin on 6/20/18.
 */

import java.util.Scanner;

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class Reverse {

    public static void main(String[] args) {

        //Scanner for manual User Input
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name of the string to be reversed :");
        String str =sc.next();

        System.out.println("REVERSED STRING: " + reverseString(str));
    }

    /**
     * Reverse string with maintaining special character in place
     * <p>
     * Algorithm:
     * 1. create temporary array
     * 2. copy all character from original array excluding special character
     * 3. reverse the temporary array
     * 4. start copying temporary array into original if element is an alphabetic character
     *
     * @param input
     * @return
     */
    public static String reverseString(String input) {
        char[] inputArr = input.toCharArray();
        char[] tempArr = new char[input.length()];
        int i = 0;
        int j = 0;

        for (char ch : inputArr) {
            if (Character.isAlphabetic(ch)) {
                tempArr[i] = ch;
                i++;
            }
        }
        i--;

        while (j < i) {
            char temp = tempArr[i];
            tempArr[i] = tempArr[j];
            tempArr[j] = temp;
            j++;
            i--;
        }

        for (i = 0, j = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(inputArr[i])) {
                inputArr[i] = tempArr[j++];
            }
        }

        return new String(inputArr);
    }
}
