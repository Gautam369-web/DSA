public class Day_5_Practice {
    public static void main(String[] args) {
        System.out.println("=== Day 5: Loop Practice ===\n");

        // ========== SECTION 1: for loop examples ==========
        System.out.println("--- 1. for loop examples ---");

        // Print numbers 1 to 5
        System.out.print("Numbers 1 to 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Print even numbers 1 to 10
        System.out.print("Even numbers 1 to 10: ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Multiplication table for 5
        System.out.println("Multiplication table for 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        System.out.println();

        // Calculate factorial of 5
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
        System.out.println();

        // ========== SECTION 2: while loop examples ==========
        System.out.println("--- 2. while loop examples ---");

        // Countdown from 5 to 1
        System.out.print("Countdown: ");
        int count = 5;
        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println("\n");

        // Sum of digits
        int number = 12345;
        int sum = 0;
        int temp = number; // Preserve original number
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits in " + number + ": " + sum);
        System.out.println();

        // Reverse a number
        int original = 12345;
        int reversed = 0;
        temp = original;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println("Reverse of " + original + ": " + reversed);
        System.out.println();

        // ========== SECTION 3: do-while loop examples ==========
        System.out.println("--- 3. do-while loop examples ---");

        // Menu simulation (simplified - no actual input)
        System.out.println("Menu simulation:");
        int choice = 0;
        do {
            System.out.println("Current choice: " + choice);
            System.out.println("Options: 1-Start, 2-Options, 3-Exit");
            choice++; // Simulate user input for demo
            if (choice > 3) {
                choice = 1; // Reset for continuous demo
            }
        } while (choice != 3);
        System.out.println("Exited menu.\n");

        // Input validation simulation
        System.out.println("Input validation simulation:");
        int age = -1; // Start with invalid value
        do {
            System.out.println("Entered age: " + age + " (invalid - must be positive)");
            age = 25; // Simulate user entering valid age
        } while (age <= 0);
        System.out.println("Valid age entered: " + age);
        System.out.println();

        // ========== SECTION 4: Nested loops ==========
        System.out.println("--- 4. Nested loops ---");

        // Multiplication table (1-3)
        System.out.println("Multiplication table (1-3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%d x %d = %-4d", i, j, i * j);
            }
            System.out.println(); // New line after each row
        }
        System.out.println();

        // Print a rectangle pattern
        System.out.println("Rectangle pattern (4x3):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Print a right triangle
        System.out.println("Right triangle pattern:");
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // ========== SECTION 5: Loop control (break and continue) ==========
        System.out.println("--- 5. Loop control (break and continue) ---");

        // Break example: search for a number
        System.out.println("Break example - searching for 7 in array:");
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int target = 7;
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break; // Exit loop immediately when found
            }
        }
        System.out.println("Number " + target + " found: " + found);
        System.out.println();

        // Continue example: skip even numbers
        System.out.println("Continue example - odd numbers 1 to 10:");
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ========== SECTION 6: Common algorithms ==========
        System.out.println("--- 6. Common algorithms ---");

        // Find maximum in array
        int[] values = {3, 7, 2, 9, 4, 12, 5};
        int max = values[0]; // Assume first element is max initially
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println("Maximum value in array: " + max);

        // Find minimum in array
        int min = values[0]; // Assume first element is min initially
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        System.out.println("Minimum value in array: " + min);
        System.out.println();

        // Bubble sort (simplified - just a few iterations)
        int[] sortArray = {5, 2, 8, 1, 9};
        System.out.print("Original array: ");
        for (int val : sortArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        // One pass of bubble sort
        for (int i = 0; i < sortArray.length - 1; i++) {
            if (sortArray[i] > sortArray[i + 1]) {
                // Swap
                int tempSort = sortArray[i];
                sortArray[i] = sortArray[i + 1];
                sortArray[i + 1] = tempSort;
            }
        }

        System.out.print("After one bubble sort pass: ");
        for (int val : sortArray) {
            System.out.print(val + " ");
        }
        System.out.println("\n");

        // ========== SECTION 7: Common Pitfalls Demo ==========
        System.out.println("--- 7. Common Pitfalls ---");

        // Off-by-one error demo (commented out to avoid actual error)
        // int[] arr = {1, 2, 3};
        // for (int i = 0; i <= arr.length; i++) { // Should be i < arr.length
        //     System.out.println(arr[i]); // ArrayIndexOutOfBoundsException
        // }
        System.out.println("Pitfall 1: Off-by-one errors");
        System.out.println("   Use i < array.length, not i <= array.length");
        System.out.println();

        // Infinite loop demo (commented out)
        // int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     // Forgot to increment i!
        // }
        System.out.println("Pitfall 2: Infinite loops");
        System.out.println("   Always update loop control variables");
        System.out.println();

        System.out.println("=== End of Loop Practice ===");
    }
}