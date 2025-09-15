/*Write a program to check whether a number is a Strong number or not. 
 * Strong number is a special number whose sum of factorial of digits is equal to the original number.
 * For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 *  [Hint: conditional operator,method,use parameterized method to take input] */


package anu_programs;

import java.util.Scanner;

public class Strong_Number {

    // Method to calculate factorial of a digit
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if number is strong
    static boolean isStrongNumber(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Conditional operator to return true or false
        return (sum == original) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is NOT a Strong Number.");
        }

        sc.close();
    }
}

/*Output: 
 * Enter a number: 145
145 is a Strong Number.
   */
