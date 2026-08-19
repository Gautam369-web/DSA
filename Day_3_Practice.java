public class Day_3_Practice {
    public static void main(String[] args) {
        System.out.println("=== Java Operators Demonstration ===\n");

        // 1. Arithmetic Operators
        System.out.println("--- 1. Arithmetic Operators ---");
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer)
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("a / (double)b = " + ((double) a / b)); // Floating division
        System.out.println();

        // 2. Assignment Operators
        System.out.println("--- 2. Assignment Operators ---");
        int x = 5;
        System.out.println("Initial x = " + x);
        x += 3; // x = x + 3
        System.out.println("After x += 3: x = " + x);
        x -= 2; // x = x - 2
        System.out.println("After x -= 2: x = " + x);
        x *= 4; // x = x * 4
        System.out.println("After x *= 4: x = " + x);
        x /= 2; // x = x / 2
        System.out.println("After x /= 2: x = " + x);
        x %= 3; // x = x % 3
        System.out.println("After x %= 3: x = " + x);
        System.out.println();

        // 3. Comparison/Relational Operators
        System.out.println("--- 3. Comparison Operators ---");
        int num1 = 15;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println();

        // 4. Logical Operators
        System.out.println("--- 4. Logical Operators ---");
        boolean isWeekend = false;
        boolean isHoliday = true;
        System.out.println("isWeekend = " + isWeekend + ", isHoliday = " + isHoliday);
        System.out.println("isWeekend && isHoliday: " + (isWeekend && isHoliday)); // AND
        System.out.println("isWeekend || isHoliday: " + (isWeekend || isHoliday)); // OR
        System.out.println("!isWeekend: " + (!isWeekend)); // NOT
        System.out.println("!isHoliday: " + (!isHoliday));

        // Short-circuit demonstration
        System.out.println("\nShort-circuit evaluation:");
        int value = 5;
        boolean result1 = (value > 10) && (value++ < 20); // Second part not evaluated
        System.out.println("(value > 10) && (value++ < 20) = " + result1 + ", value after = " + value);
        value = 5; // Reset
        boolean result2 = (value < 10) || (value++ < 20); // Second part not evaluated
        System.out.println("(value < 10) || (value++ < 20) = " + result2 + ", value after = " + value);
        System.out.println();

        // 5. Bitwise Operators
        System.out.println("--- 5. Bitwise Operators ---");
        int bitA = 6; // Binary: 110
        int bitB = 3; // Binary: 011
        System.out.println("bitA = " + bitA + " (binary: " + Integer.toBinaryString(bitA) + ")");
        System.out.println("bitB = " + bitB + " (binary: " + Integer.toBinaryString(bitB) + ")");
        System.out.println("bitA & bitB = " + (bitA & bitB) + " (binary: " + Integer.toBinaryString(bitA & bitB) + ")");
        System.out.println("bitA | bitB = " + (bitA | bitB) + " (binary: " + Integer.toBinaryString(bitA | bitB) + ")");
        System.out.println("bitA ^ bitB = " + (bitA ^ bitB) + " (binary: " + Integer.toBinaryString(bitA ^ bitB) + ")");
        System.out.println("~bitA = " + (~bitA) + " (binary: " + Integer.toBinaryString(~bitA) + ")");
        System.out.println("bitA << 2 = " + (bitA << 2) + " (binary: " + Integer.toBinaryString(bitA << 2) + ")");
        System.out.println("bitA >> 1 = " + (bitA >> 1) + " (binary: " + Integer.toBinaryString(bitA >> 1) + ")");
        System.out.println();

        // 6. Unary Operators
        System.out.println("--- 6. Unary Operators ---");
        int unary = 5;
        System.out.println("Initial unary = " + unary);
        System.out.println("+unary = " + (+unary));
        System.out.println("-unary = " + (-unary));
        System.out.println("unary++ (post-increment): " + (unary++) + ", unary after = " + unary);
        unary = 5; // Reset
        System.out.println("++unary (pre-increment): " + (++unary) + ", unary after = " + unary);
        unary = 5; // Reset
        System.out.println("unary-- (post-decrement): " + (unary--) + ", unary after = " + unary);
        unary = 5; // Reset
        System.out.println("--unary (pre-decrement): " + (--unary) + ", unary after = " + unary);
        boolean flag = true;
        System.out.println("!flag = " + (!flag));
        System.out.println();

        // 7. Ternary/Conditional Operator
        System.out.println("--- 7. Ternary Operator ---");
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";
        System.out.println("Score: " + score);
        System.out.println("Grade using ternary: " + grade);

        // Alternative with if-else for comparison
        String gradeIfElse;
        if (score >= 90) {
            gradeIfElse = "A";
        } else if (score >= 80) {
            gradeIfElse = "B";
        } else if (score >= 70) {
            gradeIfElse = "C";
        } else {
            gradeIfElse = "D";
        }
        System.out.println("Grade using if-else: " + gradeIfElse);
        System.out.println();

        // 8. Operator Precedence Examples
        System.out.println("--- 8. Operator Precedence ---");
        int precedence1 = 10 + 5 * 2; // * before +
        System.out.println("10 + 5 * 2 = " + precedence1 + " (multiplication first)");
        int precedence2 = (10 + 5) * 2; // parentheses first
        System.out.println("(10 + 5) * 2 = " + precedence2 + " (parentheses first)");
        int precedence3 = 10 * 5 + 2; // * before +
        System.out.println("10 * 5 + 2 = " + precedence3);
        boolean precedence4 = 10 + 5 > 12 && 3 < 6; // Relational before logical
        System.out.println("10 + 5 > 12 && 3 < 6 = " + precedence4);
        System.out.println();

        // 9. Common Pitfalls
        System.out.println("--- 9. Common Pitfalls ---");
        // Integer division pitfall
        int intDiv = 5 / 2;
        double correctDiv = 5.0 / 2;
        System.out.println("Integer division 5/2 = " + intDiv);
        System.out.println("Floating division 5.0/2 = " + correctDiv);

        // Assignment vs equality pitfall (commented out to avoid infinite loop)
        // int x = 5;
        // if (x = 6) { // This is assignment, not comparison!
        //     System.out.println("This always executes if x is non-zero");
        // }
        System.out.println("Warning: if (x = 6) is assignment, not comparison!");

        // Floating-point precision
        double fp1 = 0.1;
        double fp2 = 0.2;
        double fpSum = fp1 + fp2;
        System.out.println("0.1 + 0.2 = " + fpSum);
        System.out.println("(Not exactly 0.3 due to floating-point precision)");

        System.out.println("\n=== End of Operators Demonstration ===");
    }
}