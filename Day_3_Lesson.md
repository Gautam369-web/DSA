# Day 3: Java Operators

## What are Operators?

Operators are special symbols that perform operations on variables and values. They are the building blocks of expressions in Java.

Think of operators as the "verbs" in programming sentences - they tell the computer what to do with the data (the "nouns").

## Categories of Java Operators

Java operators can be grouped into several categories:

1. **Arithmetic Operators** (+, -, *, /, %)
2. **Assignment Operators** (=, +=, -=, *=, /=, %=)
3. **Comparison/Relational Operators** (==, !=, >, <, >=, <=)
4. **Logical Operators** (&&, ||, !)
5. **Bitwise Operators** (&, |, ^, ~, <<, >>, >>>)
6. **Unary Operators** (+, -, ++, --, !)
7. **Ternary/Conditional Operator** (? :)
8. **Instanceof Operator** (instanceof)

## 1. Arithmetic Operators

Perform basic mathematical operations:

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `5 / 3` | `1` (integer division!) |
| `%` | Modulus (remainder) | `5 % 3` | `2` |

**Important Notes:**
- Integer division truncates the decimal part: `7 / 2 = 3`, not `3.5`
- To get floating-point division, at least one operand must be floating-point: `7.0 / 2 = 3.5`
- Modulus operator `%` gives the remainder after division: `10 % 3 = 1`

## 2. Assignment Operators

Assign values to variables. The basic assignment operator is `=`.

| Operator | Example | Equivalent To | Meaning |
|----------|---------|---------------|---------|
| `=` | `x = 5` | - | Assign 5 to x |
| `+=` | `x += 3` | `x = x + 3` | Add and assign |
| `-=` | `x -= 3` | `x = x - 3` | Subtract and assign |
| `*=` | `x *= 3` | `x = x * 3` | Multiply and assign |
| `/=` | `x /= 3` | `x = x / 3` | Divide and assign |
| `%=` | `x %= 3` | `x = x % 3` | Modulus and assign |

These are especially useful in loops and accumulators.

## 3. Comparison/Relational Operators

Compare two values and return a boolean result (true or false):

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `==` | Equal to | `5 == 3` | `false` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `5 > 3` | `true` |
| `<` | Less than | `5 < 3` | `false` |
| `>=` | Greater than or equal to | `5 >= 3` | `true` |
| `<=` | Less than or equal to | `5 <= 3` | `false` |

**Important:** Use `==` for comparing primitive values. For objects (like Strings), use `.equals()` method.

## 4. Logical Operators

Used to combine multiple boolean expressions:

| Operator | Meaning | Example (with a=true, b=false) | Result |
|----------|---------|--------------------------------|--------|
| `&&` | Logical AND | `a && b` | `false` |
| `||` | Logical OR | `a || b` | `true` |
| `!` | Logical NOT | `!a` | `false` |

**Short-circuit evaluation:**
- `&&`: If first operand is false, second is not evaluated
- `||`: If first operand is true, second is not evaluated

This can prevent errors: `if (denominator != 0 && numerator/denominator > 0.5)`

## 5. Bitwise Operators

Work on the binary representation of integers:

| Operator | Meaning | Example | Explanation |
|----------|---------|---------|-------------|
| `&` | Bitwise AND | `5 & 3` | `101 & 011 = 001` (1) |
| `|` | Bitwise OR | `5 | 3` | `101 | 011 = 111` (7) |
| `^` | Bitwise XOR | `5 ^ 3` | `101 ^ 011 = 110` (6) |
| `~` | Bitwise COMPLEMENT | `~5` | `~00000101 = 11111010` (-6) |
| `<<` | Left Shift | `5 << 2` | `00000101 << 2 = 00010100` (20) |
| `>>` | Right Shift (signed) | `5 >> 2` | `00000101 >> 2 = 00000001` (1) |
| `>>>` | Right Shift (unsigned) | `-5 >>> 2` | Shifts in zeros instead of sign bit |

**Note:** Bitwise operations are less common in everyday programming but useful in certain algorithms, embedded systems, and optimization.

## 6. Unary Operators

Operate on a single operand:

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `+` | Unary plus | `+5` | `5` (no change) |
| `-` | Unary minus | `-5` | `-5` (negation) |
| `++` | Increment | `x++` or `++x` | Add 1 |
| `--` | Decrement | `x--` or `--x` | Subtract 1 |
| `!` | Logical complement | `!true` | `false` |

**Pre vs Post Increment/Decrement:**
- `++x` (pre-increment): Increment x, then use the new value
- `x++` (post-increment): Use the current value, then increment x
- Same applies to `--`

Example:
```java
int x = 5;
int y = x++; // y = 5, x = 6
int z = ++x; // z = 7, x = 7
```

## 7. Ternary/Conditional Operator

A shorthand for simple if-else statements:
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

Example:
```java
int score = 85;
String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
// grade will be "B"
```

This is equivalent to:
```java
String grade;
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else {
    grade = "C";
}
```

## Operator Precedence

When an expression contains multiple operators, Java follows precedence rules (like PEMDAS in math):

1. Postfix: `expr++`, `expr--`
2. Unary: `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Shift: `<<`, `>>`, `>>>`
6. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
7. Equality: `==`, `!=`
8. Bitwise AND: `&`
9. Bitwise XOR: `^`
10. Bitwise OR: `|`
11. Logical AND: `&&`
12. Logical OR: `||`
13. Ternary: `? :`
14. Assignment: `=`, `+=`, `-=`, `*=`, `/=`, `%=`

**Best Practice:** Use parentheses to make complex expressions clearer, even if not strictly necessary.

## Common Pitfalls and Gotchas

1. **Confusing `=` and `==`**:
   ```java
   if (x = 5) { ... }  // Assignment! Always true if x is non-zero
   if (x == 5) { ... } // Comparison
   ```

2. **Floating-point precision with comparison**:
   ```java
   double d = 0.1 + 0.2;
   if (d == 0.3) { // This might be false!
       // ...
   }
   // Better approach:
   if (Math.abs(d - 0.3) < 0.00001) { /* close enough */ }
   ```

3. **Side effects in expressions**:
   ```java
   int x = 5;
   int y = x++ + ++x; // What is y? Behavior can be confusing!
   ```

4. **Integer overflow**:
   ```java
   int max = Integer.MAX_VALUE;
   System.out.println(max + 1); // Prints Integer.MIN_VALUE (due to overflow)
   ```

## Practice Exercises for Today

### Exercise 1: Arithmetic Operations Calculator
Create a program that:
1. Takes two numbers (hardcoded for now)
2. Performs all arithmetic operations (+, -, *, /, %)
3. Displays results with clear labels

### Exercise 2: Assignment Operator Practice
Demonstrate all compound assignment operators with examples.

### Exercise 3: Comparison and Logic
Create a program that:
1. Determines if a person is eligible to vote (age >= 18)
2. Checks if a number is within a specific range (e.g., 1-100)
3. Evaluates complex boolean expressions

### Exercise 4: Bitwise Operations
Experiment with bitwise operators:
1. Show how left shift multiplies by powers of 2
2. Show how right shift divides by powers of 2 (for positive numbers)
3. Demonstrate bit masking techniques

### Exercise 5: Ternary Operator Practice
Convert if-else statements to ternary operators:
1. Determine if a number is positive, negative, or zero
2. Find the maximum of two numbers
3. Convert numeric grade to letter grade

### Exercise 6: Precedence and Parentheses
Write expressions that demonstrate operator precedence:
1. Mixed arithmetic and logical operations
2. Complex boolean expressions
3. Show how parentheses change evaluation order

## Hands-on Coding Session

Let's create a comprehensive operator demonstration program: