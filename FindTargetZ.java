/*
 * ===========================================================
 *  Program: Demonstration of "contains" algorithms
 *  Concept: Check whether a given integer c exists in an array S
 *  -----------------------------------------------------------
 *  This file shows FOUR different algorithmic versions of the
 *  same logical task, each demonstrating a different loop style
 *  and control flow concept.
 *
 *  THEORY:
 *  --------
 *  - Input:  an array S of integers, and an integer c (the value to search for)
 *  - Output: true  → if c is found inside S
 *            false → if c is not found
 *
 *  Abstraction Levels:
 *  -------------------
 *  1️⃣ Mathematical idea:  contains(S, c) = true  if  c ∈ S
 *  2️⃣ Algorithmic idea:   scan all elements and test equality
 *  3️⃣ Programming level:  translate idea into code (loops, ifs, variables)
 * ===========================================================
 */

/*
 * =======================================================
 * WHY WE WRITE: public static boolean contains4(int[] s, int c)
 * -------------------------------------------------------
 * In Java, "public static void main(String[] args)" is the ENTRY point
 * of the program — it does not return any value to the system (it just runs).
 * 
 * BUT here, we are writing a **method that performs a logical test**:
 * it must TELL us whether a number 'c' is present in the array 's' or not.
 * 
 * ➤ Therefore, we use the keyword **boolean** instead of **void**.
 * 
 * Explanation of each keyword:
 * -----------------------------
 * - public   → method can be used anywhere in the program
 * - static   → we can call it without creating an object (just like main)
 * - boolean  → the method RETURNS a true/false result
 * - contains4(int[] s, int c)
 *              → method name and parameters (array 's' and integer 'c')
 * 
 * In contrast:
 * -------------
 * The method "public static void main(String[] args)" uses **void**
 * because it does not need to RETURN any value — it is just where
 * the program starts executing.
 * 
 * So: 
 *  - use **void** when you want to perform an action (no return value)
 *  - use **boolean** when you want to return true/false as a result
 * =======================================================
*/

public class FindTargetZ {

    /*
     * =======================================================
     * VERSION 1 – Flag Variable with FOR LOOP (Basic Version)
     * -------------------------------------------------------
     * Theory:
     * --------
     * - This method uses a BOOLEAN variable `found` (similar to var b : bool)
     * to remember whether the target number c has been found so far.
     * - The loop checks every element of the array one by one.
     * - After the loop finishes, the value of `found` is returned.
     *
     * Loop concept:
     * --------------
     * The "for" loop is a definite loop – we know exactly how many times
     * it will run (equal to the number of elements n = s.length).
     * =======================================================
     */
    public static boolean contains1(int[] s, int c) {
        boolean found = false; // start by assuming 'c' is NOT in the array
        for (int i = 0; i < s.length; i++) { // loop through all indices (0 to n-1)
            if (s[i] == c) { // check equality with target c
                found = true; // if found, update flag to true
            }
        }
        return found; // after the loop, return the flag result
    }

    /*
     * =======================================================
     * VERSION 2 – Early Exit with FOR LOOP (Optimized)
     * -------------------------------------------------------
     * Theory:
     * --------
     * - Same logic as version 1, but we EXIT the loop immediately
     * when the target element is found.
     * - Saves time for large arrays because it avoids unnecessary
     * comparisons after the match is found.
     *
     * Loop concept:
     * --------------
     * "for" loop again (definite loop), but includes a "return" statement
     * inside the body to break out early when the condition is met.
     * =======================================================
     */
    public static boolean contains2(int[] s, int c) {
        for (int i = 0; i < s.length; i++) { // scan each element
            if (s[i] == c) { // if match is found
                return true; // exit immediately (early return)
            }
        }
        return false; // reached end of array → not found
    }

    /*
     * =======================================================
     * VERSION 3 – WHILE LOOP version
     * -------------------------------------------------------
     * Theory:
     * --------
     * - Uses a WHILE loop, which is an INDEFINITE loop.
     * - We continue looping as long as:
     * (1) we haven't reached the end of the array, and
     * (2) the current element is NOT equal to c.
     * - This combines loop control and condition checking.
     *
     * Loop concept:
     * --------------
     * While loops are used when the number of iterations is
     * not known in advance – here, the loop stops early if
     * the condition fails (i.e., c is found).
     * =======================================================
     */
    public static boolean contains3(int[] s, int c) {
        int i = 0; // start at first index
        while (i < s.length && s[i] != c) {
            i++; // keep moving to next element
        }
        // After the loop, either i == s.length (end reached) or s[i] == c
        if (i < s.length) {
            return true; // found before reaching the end
        } else {
            return false; // reached end without finding
        }
    }

    /*
     * =======================================================
     * VERSION 4 – For-each LOOP version (Simplest Readable)
     * -------------------------------------------------------
     * Theory:
     * --------
     * - Uses the enhanced for-loop ("for-each") which directly iterates
     * over elements instead of using an index variable.
     * - The logic remains identical to version 2 (early exit).
     *
     * Loop concept:
     * --------------
     * "for-each" loop hides the index variable.
     * It is useful when we only care about the elements themselves.
     * =======================================================
     */
    public static boolean contains4(int[] s, int c) {
        for (int x : s) { // x takes each element of array s
            if (x == c) {
                return true; // early return once c is found
            }
        }
        return false; // loop finished → c not found
    }

    /*
     * =======================================================
     * MAIN METHOD – Testing all 4 algorithms
     * -------------------------------------------------------
     * We use the same input data for comparison.
     * =======================================================
     */
    public static void main(String[] args) {
        int[] numbers = { 3, 8, 2, 5, 10 }; // Example array S
        int target = 5; // Target element c

        System.out.println("Version 1 (flag + for loop): " + contains1(numbers, target));
        System.out.println("Version 2 (early exit + for loop): " + contains2(numbers, target));
        System.out.println("Version 3 (while loop): " + contains3(numbers, target));
        System.out.println("Version 4 (for-each loop): " + contains4(numbers, target));

        // Try with an element that is NOT present
        target = 99;
        System.out.println("\nNow testing with target = 99 (not in array):");
        System.out.println("Version 1: " + contains1(numbers, target));
        System.out.println("Version 2: " + contains2(numbers, target));
        System.out.println("Version 3: " + contains3(numbers, target));
        System.out.println("Version 4: " + contains4(numbers, target));
    }
}
