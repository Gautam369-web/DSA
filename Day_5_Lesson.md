# Day 5: Control Flow - Loops

## What are Loops?

Loops are control flow statements that allow code to be executed repeatedly based on a given condition. They are essential for automating repetitive tasks, processing collections of data, and implementing algorithms that require iteration.

Think of loops as the programming equivalent of doing something over and over until a certain condition is met.

## Why Do We Need Loops?

- Process arrays or lists of data
- Repeat calculations until a condition is satisfied (e.g., finding a root)
- Generate sequences (like Fibonacci numbers)
- Create patterns (like printing triangles)
- Read user input until valid input is received
- Implement game loops or simulation steps

## Java provides three types of loops:

1. **for loop** - Best when you know how many times you want to iterate
2. **while loop** - Best when you want to continue until a condition becomes false (check condition first)
3. **do-while loop** - Best when you want to execute at least once, then continue based on condition (check condition after)

## 1. The for Loop

### Syntax:
```java
for (initialization; condition; update) {
    // code to be executed in each iteration
}
```

### Parts:
- **initialization**: Executed once at the beginning (usually declares and initializes loop variable)
- **condition**: Checked before each iteration; if true, loop continues; if false, loop terminates
- **update**: Executed after each iteration (usually increments/decrements loop variable)

### Example:
```java
// Print numbers from 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Flow Diagram:
```
Start
  ↓
Initialization
  ↓
Check condition
  ↙Yes      ↘No
Execute     Exit
loop body   loop
  ↓             ↓
Update        Continue
  ↓
Back to condition check
```

### Common Patterns:
- **Counting up**: `for (int i = 0; i < n; i++)`
- **Counting down**: `for (int i = n-1; i >= 0; i--)`
- **Stepping by more than 1**: `for (int i = 0; i < n; i += 2)` (even numbers)
- **Iterating through arrays**: `for (int i = 0; i < array.length; i++)`

### Example: Sum of first n numbers
```java
int n = 10;
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
System.out.println("Sum of first " + n + " numbers: " + sum);
```

### Nested for Loops:
You can place one for loop inside another to handle multi-dimensional data or complex patterns.

```java
// Print a 3x3 grid
for (int row = 0; row < 3; row++) {
    for (int col = 0; col < 3; col++) {
        System.out.print("[row=" + row + ",col=" + col + "] ");
    }
    System.out.println(); // New line after each row
}
```

## 2. The while Loop

### Syntax:
```java
while (condition) {
    // code to be executed as long as condition is true
}
```

### How it works:
1. Check the condition
2. If true, execute the loop body
3. After executing the body, check the condition again
4. Repeat until condition becomes false

**Important**: The condition is checked **before** each iteration. If the condition is false initially, the loop body never executes.

### Example:
```java
// Print numbers from 1 to 5 using while
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++; // Don't forget to update!
}
```

### Flow Diagram:
```
Start
  ↓
Check condition
  ↙Yes      ↘No
Execute     Exit
loop body   loop
  ↓
Back to condition check
```

### Common Uses:
- Reading input until a sentinel value
- Processing data until a condition is met
- When you don't know in advance how many iterations you'll need

### Example: Guessing Game (simplified)
```java
int secretNumber = 7;
int guess = 0; // Initialize to enter loop
while (guess != secretNumber) {
    // In a real game, we'd get input from user here
    guess++; // Just for demonstration - normally would be user input
    System.out.println("Guessing... tried " + guess);
}
System.out.println("Found it! The number was " + secretNumber);
```

### Example: Sum of digits
```java
int number = 12345;
int sum = 0;
while (number > 0) {
    int digit = number % 10; // Get last digit
    sum += digit;
    number /= 10; // Remove last digit
}
System.out.println("Sum of digits: " + sum);
```

## 3. The do-while Loop

### Syntax:
```java
do {
    // code to be executed
} while (condition);
```

### How it works:
1. Execute the loop body **once**
2. Check the condition
3. If true, repeat from step 1; if false, exit

**Key Difference**: The condition is checked **after** each iteration, guaranteeing that the loop body executes at least once.

### Example:
```java
// Print numbers from 1 to 5 using do-while
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Flow Diagram:
```
Start
  ↓
Execute loop body
  ↓
Check condition
  ↙Yes      ↘No
Back to   Exit
loop body loop
```

### Common Uses:
- Menu-driven programs (show menu at least once)
- Getting user input (you want to prompt at least once)
- Any scenario where you need to execute first, then decide whether to repeat

### Example: Menu-driven program
```java
Scanner scanner = new Scanner(System.in);
int choice;
do {
    System.out.println("Menu:");
    System.out.println("1. Option 1");
    System.out.println("2. Option 2");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");
    choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("You chose option 1");
            break;
        case 2:
            System.out.println("You chose option 2");
            break;
        case 3:
            System.out.println("Exiting...");
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
} while (choice != 3);
```

### Example: Ensuring valid input
```java
Scanner scanner = new Scanner(System.in);
int age;
do {
    System.out.print("Enter your age (must be positive): ");
    age = scanner.nextInt();
    if (age <= 0) {
        System.out.println("Age must be positive. Try again.");
    }
} while (age <= 0);
System.out.println("Thank you! You are " + age + " years old.");
```

## Loop Control Statements

Sometimes you need to alter the normal flow of a loop.

### 1. break Statement
Terminates the loop immediately and transfers control to the statement following the loop.

#### Usage:
- Exit a loop when a certain condition is met (early termination)
- Escape from nested loops (only breaks the innermost loop by default)

#### Example: Searching for an element
```java
int[] numbers = {2, 4, 6, 8, 10, 12, 14};
int target = 8;
boolean found = false;
for (int num : numbers) {
    if (num == target) {
        found = true;
        break; // Exit loop early when found
    }
}
System.out.println("Target " + target + " found: " + found);
```

### 2. continue Statement
Skips the current iteration and moves to the next iteration of the loop.

#### Usage:
- Skip certain values in a sequence
- Avoid processing invalid data

#### Example: Skip even numbers
```java
System.out.println("Odd numbers from 1 to 10:");
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println(i);
}
```

### 3. Labeled break and continue (Advanced)
For nested loops, you can specify which loop to break or continue using labels.

#### Syntax:
```java
outerLoop:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) {
            break outerLoop; // Breaks both loops
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

## Common Loop Patterns and Algorithms

### 1. Accumulator Pattern
```java
int sum = 0;
for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}
// sum now contains the total
```

### 2. Counter Pattern
```java
int count = 0;
for (int i = 0; i < array.length; i++) {
    if (array[i] > threshold) {
        count++;
    }
}
// count now holds how many elements exceed threshold
```

### 3. Flag Pattern
```java
boolean found = false;
for (int value : values) {
    if (value == target) {
        found = true;
        break;
    }
}
// found is true if target exists in values
```

### 4. One-way Trip Pattern (finding min/max)
```java
int min = Integer.MAX_VALUE;
for (int value : values) {
    if (value < min) {
        min = value;
    }
}
// min now holds the smallest value
```

## Common Pitfalls and Best Practices

### 1. Off-by-One Errors
Most common loop mistake: iterating one too many or one too few times.

#### Examples:
- `for (int i = 0; i <= n; i++)` when you want `i < n` (if array size is n)
- `for (int i = 1; i < n; i++)` when you want `i <= n`

**Tip**: Use `i < array.length` for zero-indexed arrays, not `i <= array.length`.

### 2. Infinite Loops
Forgetting to update the loop condition variable.

#### Bad:
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    // Forgot to increment i!
}
```

#### Good:
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++; // Remember to update!
}
```

### 3. Modifying Loop Variable Inside Body (Carefully)
Sometimes necessary, but can be confusing.

#### Example: Skipping multiple values
```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        i += 2; // Skip 4 and 5? Actually skips to 5, then loop increments to 6
        // Better approach: use continue or adjust logic
    }
    System.out.println(i);
}
```

**Better**: Use while loop when you need complex update logic, or restructure to avoid modifying loop variable in body.

### 4. Floating-Point Loop Conditions
Avoid using floating-point numbers in loop conditions due to precision issues.

#### Risky:
```java
for (double x = 0.0; x < 1.0; x += 0.1) {
    // May not execute exactly 10 times due to floating-point error
}
```

#### Better: Use integer counter and calculate
```java
for (int i = 0; i < 10; i++) {
    double x = i * 0.1;
    // ...
}
```

## Choosing the Right Loop

### Use for loop when:
- You know exactly how many times you want to iterate
- You're iterating through arrays or collections with indices
- You need a counter variable

### Use while loop when:
- You don't know how many iterations you'll need in advance
- You're waiting for a condition to become true/false
- You're reading input until a sentinel value
- The loop might not execute at all (condition checked first)

### Use do-while loop when:
- You need to execute the loop body at least once
- You're showing a menu and getting user input
- You need to get input and validate it before deciding whether to repeat
- The condition depends on something that happens inside the loop

## Practice Exercises for Today

### Exercise 1: Basic for Loops
1. Print numbers from 1 to 100
2. Print even numbers from 1 to 50
3. Print the multiplication table for a given number (e.g., 7)
4. Calculate the factorial of a number (n!)
5. Print patterns:
   - Right triangle of asterisks
   - Pyramid of asterisks
   - Number patterns

### Exercise 2: Basic while Loops
1. Calculate the sum of digits of a number
2. Reverse a number (e.g., 12345 -> 54321)
3. Check if a number is a palindrome
4. Implement the Euclidean algorithm for GCD
5. Simulate a coin flip until you get heads 3 times in a row

### Exercise 3: Basic do-while Loops
1. Create a menu-driven calculator (add, subtract, multiply, divide, exit)
2. Create a program that keeps asking for a password until it's correct
3. Create a program that simulates rolling dice until you get a specific combination
4. Create a program that validates user input (age between 1-120)

### Exercise 4: Nested Loops
1. Print a multiplication table (1-10) using nested for loops
2. Print patterns:
   - Rectangle of asterisks
   - Hollow rectangle
   - Chessboard pattern
3. Find all prime numbers up to 100
4. Create a 2D array and print it in matrix format

### Exercise 5: Loop Control (break and continue)
1. Search for a specific value in an array and break when found
2. Skip processing negative numbers in an array
3. Find the first occurrence of a character in a string
4. Implement a simple game loop that breaks when the player quits

### Exercise 6: Combined Practice
1. Create a program that finds all Armstrong numbers between 1 and 1000
2. Create a program that prints the Fibonacci sequence up to n terms
3. Create a program that simulates a simple banking system (deposit, withdraw, check balance, exit)
4. Create a program that plays a number guessing game (computer picks number, user guesses)

## Hands-on Coding Session

Let's create several programs to demonstrate these loop concepts: