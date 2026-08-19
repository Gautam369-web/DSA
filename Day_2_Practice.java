public class Day_2_Practice {
    public static void main(String[] args) {
        System.out.println("=== Personal Information Manager ===\n");

        // Personal Information Variables
        String name = "Alex Johnson"; // String (reference type, but useful to show)
        char grade = 'A';
        int age = 25;
        double heightInMeters = 1.75;
        double weightInKg = 70.5;
        long populationOfCity = 8500000L;
        boolean isStudent = true;
        boolean isEmployed = false;

        // Display basic information
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + heightInMeters + " m");
        System.out.println("Weight: " + weightInKg + " kg");
        System.out.println("City Population: " + populationOfCity);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Is Employed: " + isEmployed);

        System.out.println("\n--- Calculations ---");

        // Age in months
        int ageInMonths = age * 12;
        System.out.println("Age in months: " + ageInMonths);

        // BMI calculation (weight / (height * height))
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.printf("BMI: %.2f%n", bmi); // Formatted to 2 decimal places

        // Type casting examples
        System.out.println("\n--- Type Casting Examples ---");

        // Double to int (truncation)
        double preciseWeight = 70.567;
        int roundedWeight = (int) preciseWeight;
        System.out.println("Precise weight: " + preciseWeight);
        System.out.println("Truncated to int: " + roundedWeight);

        // Int to byte (may lose data)
        int largeNumber = 300;
        byte smallNumber = (byte) largeNumber;
        System.out.println("Original int: " + largeNumber);
        System.out.println("Cast to byte: " + smallNumber + " (data lost due to overflow)");

        // Widening conversion (safe)
        int smallInt = 100;
        double convertedDouble = smallInt;
        System.out.println("Int " + smallInt + " converted to double: " + convertedDouble);

        System.out.println("\n--- Boolean Logic ---");

        // Logical operations
        boolean canVote = age >= 18;
        boolean isAdult = age >= 18 && !isStudent;
        boolean canDrink = age >= 21 && isEmployed;
        boolean status = isStudent || isEmployed;

        System.out.println("Can vote (age >= 18): " + canVote);
        System.out.println("Is adult (age >= 18 and not student): " + isAdult);
        System.out.println("Can drink (age >= 21 and employed): " + canDrink);
        System.out.println("Status (student OR employed): " + status);

        System.out.println("\n--- Character Operations ---");

        // Character to ASCII and back
        char letter = 'A';
        int asciiValue = letter;
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + asciiValue);

        // Simple character shifting (like basic encryption)
        char shifted = (char) (letter + 3);
        System.out.println("Letter shifted by 3: " + shifted);

        // Arithmetic with characters
        char digitChar = '5';
        int digitValue = digitChar - '0'; // Convert char digit to int
        System.out.println("Character digit: " + digitChar);
        System.out.println("Integer value: " + digitValue);

        System.out.println("\n--- Common Pitfalls Demo ---");

        // Integer division pitfall
        int integerDivision = 5 / 2;
        double correctDivision = 5.0 / 2;
        System.out.println("Integer division 5/2: " + integerDivision);
        System.out.println("Correct division 5.0/2: " + correctDivision);

        // Floating-point precision
        double precisionIssue = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + precisionIssue);
        System.out.println("(Should be 0.3, but floating-point precision causes this)");

        System.out.println("\n=== End of Program ===");
    }
}