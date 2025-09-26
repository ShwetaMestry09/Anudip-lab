/*
 * Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
 * [Hint: Use array and loop and try to access the element beyond the last index]
 */

package anu_programs;
public class ArrayAccess {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // array with 5 elements

        try {
            // Intentionally going beyond the array length
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}

/*Output: 
Element at index 0: 1
Element at index 1: 2
Element at index 2: 3
Element at index 3: 4
Element at index 4: 5
Error: Array index out of bounds.
 */
 