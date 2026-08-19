# Day 4: Control Flow - Conditional Statements

## What is Control Flow?

Control flow statements determine the order in which instructions are executed in a program. Instead of always executing statements sequentially, control flow allows your program to make decisions, repeat actions, and choose different paths based on conditions.

Today we'll focus on **conditional statements** - the decision-making constructs that allow your program to execute different code blocks based on whether certain conditions are true or false.

## Why Conditional Statements?

Real-world programs need to make decisions:
- Is the user's password correct?
- Is the temperature above freezing?
- Does the user qualify for a discount?
- Is a number even or odd?
- Should we continue processing or stop?

## 1. The if Statement

The most basic conditional statement. It executes a block of code only if a specified condition is true.

### Syntax:
```java
if (condition) {
    // code to execute if condition is true
}
```

### Example:
```java
int temperature = 25;
if (temperature > 30) {
    System.out.println("It's hot outside!");
}
```

### Flow Diagram:
```
Start
  ↓
Evaluate condition
  ↙Yes      ↘No
Execute     Skip
if-block    if-block
  ↓             ↓
Continue   Continue
```

### Important Notes:
- The condition must evaluate to a boolean (`true` or `false`)
- Curly braces `{}` are required for multiple statements, but recommended even for single statements for clarity
- Indentation improves readability (though not required by Java)

## 2. The if-else Statement

Allows you to specify two alternative paths: one for when the condition is true, and another for when it's false.

### Syntax:
```java
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}
```

### Example:
```java
int score = 75;
if (score >= 60) {
    System.out.println("You passed!");
} else {
    System.out.println("You failed. Try again.");
}
```

### Flow Diagram:
```
Start
  ↓
Evaluate condition
  ↙Yes      ↘No
Execute     Execute
if-block    else-block
  ↓             ↓
Continue   Continue
```

## 3. The if-else-if Ladder (else if)

Used when you have multiple mutually exclusive conditions to check.

### Syntax:
```java
if (condition1) {
    // code for condition1
} else if (condition2) {
    // code for condition2
} else if (condition3) {
    // code for condition3
} else {
    // code if none of the above conditions are true
}
```

### Example:
```java
int score = 85;
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
```

### Important Points:
- Conditions are evaluated from top to bottom
- Only the first matching condition's block executes
- Once a match is found, the rest are skipped
- The final `else` is optional but good practice for handling unexpected cases

## 4. Nested if Statements

You can place if statements inside other if statements to check multiple related conditions.

### Syntax:
```java
if (condition1) {
    if (condition2) {
        // code if both condition1 and condition2 are true
    } else {
        // code if condition1 is true but condition2 is false
    }
} else {
    // code if condition1 is false
}
```

### Example:
```java
int age = 25;
boolean hasLicense = true;

if (age >= 16) {
    if (hasLicense) {
        System.out.println("You can drive!");
    } else {
        System.out.println("You need to get a license first.");
    }
} else {
    System.out.println("You're too young to drive.");
}
```

### Alternative with Logical AND:
The same logic can often be expressed more clearly with `&&`:
```java
if (age >= 16 && hasLicense) {
    System.out.println("You can drive!");
} else if (age >= 16) {
    System.out.println("You need to get a license first.");
} else {
    System.out.println("You're too young to drive.");
}
```

## 5. The switch Statement

An alternative to long if-else-if chains when you're checking a variable against multiple constant values.

### Syntax:
```java
switch (expression) {
    case value1:
        // code to execute if expression === value1
        break; // optional but usually needed
    case value2:
        // code to execute if expression === value2
        break;
    // ... more cases
    default:
        // code to execute if expression doesn't match any case
        break;
}
```

### Important Rules:
1. The expression must be of type: byte, short, int, char, String (Java 7+), or enum
2. Case values must be constants or literals (no variables)
3. No two case constants with the same value in a switch statement
4. The `break` statement prevents "fall-through" to the next case
5. The `default` case is optional but recommended

### Example:
```java
int dayOfWeek = 3; // Wednesday
String dayName;

switch (dayOfWeek) {
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

System.out.println("Day " + dayOfWeek + " is " + dayName);
```

### Fall-through Behavior (when you forget break):
```java
int number = 2;
switch (number) {
    case 1:
        System.out.print("One ");
        // No break - continues to next case!
    case 2:
        System.out.print("Two ");
        // No break - continues to next case!
    case 3:
        System.out.print("Three ");
        break;
    default:
        System.out.print("Other");
}
// Output: "One Two Three "
```

Sometimes fall-through is useful intentionally:
```java
switch (grade) {
    case 'A':
    case 'B':
    case 'C':
        System.out.println("Pass");
        break;
    case 'D':
    case 'F':
        System.out.println("Fail");
        break;
    default:
        System.out.println("Invalid grade");
}
```

### Switch with Strings (Java 7+):
```java
String month = "March";
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
```

## Comparing if-else vs switch

### Use if-else when:
- Checking ranges of values (e.g., score >= 90)
- Conditions involve complex expressions
- You need to check different variables in each condition
- Working with floating-point numbers

### Use switch when:
- Checking a single variable against multiple constant values
- You have many discrete values to check (more efficient than long if-else chains)
- Working with menu-driven programs
- The values are integers, characters, or strings

## Common Pitfalls and Best Practices

### 1. Forgetting break in switch
Always remember to include `break` statements unless you intentionally want fall-through.

### 2. Semicolon after if condition
```java
if (temperature > 30);  // Semicolon here makes this an empty statement!
{
    System.out.println("It's hot");  // This always executes
}
```
Correct:
```java
if (temperature > 30) {
    System.out.println("It's hot");
}
```

### 3. Assignment vs Comparison
```java
if (x = 5) {  // This assigns 5 to x, then checks if 5 is true (non-zero)!
    // ...
}
```
Correct:
```java
if (x == 5) {  // This compares x to 5
    // ...
}
```

### 4. Floating-point equality checks
Avoid using `==` with floating-point numbers due to precision issues:
```java
double d = 0.1 + 0.2;
if (d == 0.3) {  // Might be false!
    // ...
}
```
Better:
```java
if (Math.abs(d - 0.3) < 0.00001) {  // Close enough
    // ...
}
```

### 5. Complex conditions - break them down
Instead of:
```java
if (age >= 18 && age <= 65 && isCitizen && !hasCriminalRecord && income > 30000) {
    // ...
}
```
Consider:
```java
boolean isAdult = age >= 18 && age <= 65;
boolean isEligibleCitizen = isCitizen && !hasCriminalRecord;
boolean meetsIncomeReq = income > 30000;

if (isAdult && isEligibleCitizen && meetsIncomeReq) {
    // ...
}
```

## Practice Exercises for Today

### Exercise 1: Basic if Statements
1. Create a program that checks if a number is positive, negative, or zero
2. Create a program that determines if a person is eligible to vote (age >= 18)
3. Create a program that checks if a number is even or odd

### Exercise 2: if-else Statements
1. Create a grading program (A-F based on score)
2. Create a program that calculates shipping cost based on order amount
3. Create a program that determines if a year is a leap year

### Exercise 3: if-else-if Ladder
1. Create a program that converts numeric scores to letter grades
2. Create a program that determines BMI category (underweight, normal, overweight, obese)
3. Create a program that suggests activities based on temperature ranges

### Exercise 4: Nested if Statements
1. Create a program that checks if someone can drive (age >= 16 AND has license)
2. Create a program that validates user login (username AND password correct)
3. Create a program that determines ticket price based on age and student status

### Exercise 5: switch Statements
1. Create a program that converts month numbers to names
2. Create a simple calculator using switch for operation selection
3. Create a program that determines the number of days in a month (ignore leap years for now)
4. Create a menu-driven program for a simple text editor (open, save, copy, paste, exit)

### Exercise 6: Combined Practice
1. Create a password strength checker that evaluates multiple criteria
2. Create a movie ticket pricing system based on age, time of day, and membership status
3. Create a traffic light simulator that takes a color input and outputs the appropriate action

## Hands-on Coding Session

Let's create several programs to demonstrate these concepts: