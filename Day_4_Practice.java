public class Day_4_Practice {
    public static void main(String[] args) {
        System.out.println("=== Day 4: Control Flow Practice ===\n");

        // ========== SECTION 1: Simple if statement ==========
        System.out.println("--- 1. Simple if statement ---");
        int number = 10;
        System.out.println("Checking if " + number + " is positive:");
        if (number > 0) {
            System.out.println(number + " is positive!");
        }
        System.out.println();

        // ========== SECTION 2: if-else statement ==========
        System.out.println("--- 2. if-else statement ---");
        int num = 7;
        System.out.println("Checking if " + num + " is even or odd:");
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        System.out.println();

        // ========== SECTION 3: if-else-if ladder ==========
        System.out.println("--- 3. if-else-if ladder (Grading System) ---");
        int score = 85;
        System.out.println("Score: " + score);
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();

        // ========== SECTION 4: Nested if statements ==========
        System.out.println("--- 4. Nested if statements (Driving Eligibility) ---");
        int age = 16;
        boolean hasLicense = false;
        System.out.println("Age: " + age + ", Has License: " + hasLicense);
        if (age >= 16) {
            if (hasLicense) {
                System.out.println("You can drive!");
            } else {
                System.out.println("You need to get a license first.");
            }
        } else {
            System.out.println("You're too young to drive.");
        }
        System.out.println();

        // ========== SECTION 5: switch statement ==========
        System.out.println("--- 5. switch statement (Days of the Week) ---");
        int day = 3; // Wednesday
        System.out.println("Day number: " + day);
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);
        System.out.println();

        // ========== BONUS: switch with String (Java 7+) ==========
        System.out.println("--- BONUS: switch with String (Season Determination) ---");
        String month = "March";
        System.out.println("Month: " + month);
        String season;
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                season = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "Fall";
                break;
            default:
                season = "Unknown";
                break;
        }
        System.out.println(month + " is in " + season + ".");
        System.out.println();

        // ========== COMMON PITFALLS DEMO ==========
        System.out.println("--- Common Pitfalls ---");
        // Pitfall 1: Semicolon after if condition (commented out to avoid error)
        // int temp = 25;
        // if (temp > 30); // This semicolon makes the if statement empty!
        // {
        //     System.out.println("This always prints");
        // }
        System.out.println("Pitfall 1: Don't put a semicolon after if condition!");
        System.out.println("   if (temp > 30); { ... } // Wrong!");

        // Pitfall 2: Assignment vs Equality (commented out)
        // int x = 5;
        // if (x = 6) { // This assigns 6 to x, then checks if 6 is true (non-zero)!
        //     System.out.println("This always prints if x is non-zero");
        // }
        System.out.println("Pitfall 2: Use == for comparison, = for assignment!");
        System.out.println("   if (x == 6) // Correct comparison");
        System.out.println("   if (x = 6)  // Assignment - usually wrong in condition");

        System.out.println("\n=== End of Practice ===");
    }
}