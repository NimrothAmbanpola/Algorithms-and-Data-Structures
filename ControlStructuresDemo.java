/*
 * ==========================================================================
 *   ALGORITHMIC CONTROL STRUCTURES — JAVA EXAMPLES
 *   ------------------------------------------------
 *   This file connects pseudocode notation with Java code.
 *   The goal is to UNDERSTAND how decisions and repetitions work in logic.
 *   
 *   In pseudocode we often see:
 *
 *     if <condition> then <statements> end if
 *     if <condition> then <statements> else <statements> end if
 *     for <control> do <statements> end for
 *     while <condition> do <statements> end while
 *
 *   or in older texts (like Bauer & Wössner):
 *
 *     if ... then ... fi
 *     for ... do ... od
 *
 *   In Java, the same logic is written using:
 *
 *     if (<condition>) { ... }
 *     if (<condition>) { ... } else { ... }
 *     for (<init>; <condition>; <update>) { ... }
 *     while (<condition>) { ... }
 *
 *   Below we implement and explain them one by one.
 * ==========================================================================
 */

public class ControlStructuresDemo {

    public static void main(String[] args) {

        // ===============================================================
        // 1️⃣ IF structure — "if <Bedingung> then <Anweisung> end if"
        // ---------------------------------------------------------------
        int number1 = 10; // variable declaration
        if (number1 > 0) {
            System.out.println("Example 1 → The number is positive.");
        }
        // THEORY:
        // "if" checks whether the condition is TRUE.
        // Only if number1 > 0, the code inside { } runs.
        // Pseudocode: if number1 > 0 then print("positive") end if

        // ===============================================================
        // 2️⃣ IF–ELSE structure — "if <Bedingung> then ... else ... end if"
        // ---------------------------------------------------------------
        int number2 = -3;
        if (number2 >= 0) {
            System.out.println("Example 2 → Non-negative number.");
        } else {
            System.out.println("Example 2 → Negative number.");
        }
        // THEORY:
        // 'else' executes when the condition is FALSE.
        // Two branches: one for true, one for false.

        // ===============================================================
        // 3️⃣ IF–ELSE IF–ELSE chain
        // ---------------------------------------------------------------
        int score = 75;
        if (score >= 90) {
            System.out.println("Example 3 → Grade A");
        } else if (score >= 75) {
            System.out.println("Example 3 → Grade B");
        } else if (score >= 50) {
            System.out.println("Example 3 → Grade C");
        } else {
            System.out.println("Example 3 → Fail");
        }
        // THEORY:
        // Multiple conditions are tested sequentially.
        // Only one branch (the first TRUE one) executes.

        // ===============================================================
        // 4️⃣ FOR loop — "for <control> do <Anweisungen> end for"
        // ---------------------------------------------------------------
        for (int i = 1; i <= 5; i++) {
            System.out.println("Example 4 → i = " + i);
        }
        // THEORY:
        // i = 1 → initialization
        // i <= 5 → condition
        // i++ → update each loop
        // Pseudocode: for i := 1 to 5 do print(i) end for

        // ===============================================================
        // 5️⃣ FOR loop with IF inside
        // ---------------------------------------------------------------
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Example 5 → Even: " + i);
            } else {
                System.out.println("Example 5 → Odd: " + i);
            }
        }
        // THEORY:
        // Nested structures: decisions (if) inside repetition (for).

        // ===============================================================
        // 6️⃣ WHILE loop — "while <Bedingung> do <Anweisungen> end while"
        // ---------------------------------------------------------------
        int j = 1;
        while (j <= 3) {
            System.out.println("Example 6 → j = " + j);
            j++; // update is inside the loop
        }
        // THEORY:
        // While repeats as long as condition is TRUE.
        // If j > 3, loop stops.
        // In pseudocode: while j ≤ 3 do print(j); j := j + 1 end while

        // ===============================================================
        // 7️⃣ DO–WHILE (like "repeat ... until")
        // ---------------------------------------------------------------
        int k = 1;
        do {
            System.out.println("Example 7 → k = " + k);
            k++;
        } while (k <= 3);
        // THEORY:
        // Executes at least once before checking the condition.

        // ===============================================================
        // 8️⃣ Example from textbook “if ... fi” (old notation)
        // ---------------------------------------------------------------
        int age = 18;
        // In pseudocode (old style): if age ≥ 18 then print("Adult") fi
        if (age >= 18) {
            System.out.println("Example 8 → Adult (old fi-style)");
        }
        // THEORY:
        // “fi” simply means “end if” in old algorithmic texts.

        // ===============================================================
        // 9️⃣ Example from textbook “for ... od” (old notation)
        // ---------------------------------------------------------------
        // In pseudocode: for i := 1 to 3 do print(i) od
        for (int i = 1; i <= 3; i++) {
            System.out.println("Example 9 → for-od style → i = " + i);
        }
        // THEORY:
        // “od” means “end do” or “end for” (closing keyword).

        // ===============================================================
        // 🔟 IF–ELSE using Java-style braces { }
        // ---------------------------------------------------------------
        int temperature = 28;
        if (temperature > 30) {
            System.out.println("Example 10 → Hot day!");
        } else {
            System.out.println("Example 10 → Not too hot today.");
        }
        // THEORY:
        // In Java-style notation we always use braces for clarity.

        // ===============================================================
        // 1️⃣1️⃣ Combining IF + FOR + BREAK
        // ---------------------------------------------------------------
        // Task: Stop when we find a specific number
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Example 11 → Found 5, stopping early!");
                break; // exit the loop
            }
            System.out.println("Example 11 → i = " + i);
        }
        // THEORY:
        // 'break' = early termination (used in search algorithms).

        // ===============================================================
        // 1️⃣2️⃣ Combining IF + FOR + CONTINUE
        // ---------------------------------------------------------------
        // Task: Skip number 5 but continue others
        for (int i = 1; i <= 7; i++) {
            if (i == 5)
                continue; // skip this iteration
            System.out.println("Example 12 → i = " + i);
        }
        // THEORY:
        // 'continue' skips the current iteration but doesn’t stop the loop.

        // ===============================================================
        // 1️⃣3️⃣ Nested loops (FOR inside FOR)
        // ---------------------------------------------------------------
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 2; y++) {
                System.out.println("Example 13 → x = " + x + ", y = " + y);
            }
        }
        // THEORY:
        // Loops can be nested to represent multi-level processes.

        // ===============================================================
        // 1️⃣4️⃣ While + If combination
        // ---------------------------------------------------------------
        int p = 1;
        while (p <= 5) {
            if (p == 3) {
                System.out.println("Example 14 → Reached midpoint!");
            }
            System.out.println("Example 14 → p = " + p);
            p++;
        }
        // THEORY:
        // Mix while (repetition) + if (decision).
    }
}
