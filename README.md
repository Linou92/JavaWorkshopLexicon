![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Java Exercises PART 1

---

## Project Setup

Before writing any code, complete the following steps.
All exercises should be completed within the same project.

1. Open IntelliJ IDEA and create a new **Maven** project.
2. Configure the project with the following coordinates:

   * **Group ID:** `se.lexicon`
   * **Artifact ID:** `java-fundamentals`
   * **Version:** `1.0-SNAPSHOT`

3. Verify that the standard Maven project structure has been generated:

    ```text
    java-fundamentals/
    ├── pom.xml
    └── src/
        └── main/
            └── java/
    ```

4. Create a `.gitignore` file and ensure that IntelliJ IDEA files and folders (such as `.idea/`) are not committed to GitHub.
5. Use Git regularly throughout the exercises:
   * Commit your changes after completing each exercise.
   * Write clear and meaningful commit messages.
   * Push your commits to GitHub regularly as you progress.

---

## Exercise 1 – Profile Card

### Question
Store your **name**, **age**, and **city** in variables. Then use those variables to print a formatted profile card. Do not hardcode the values directly inside `println` — they must come from variables.

**Expected output:**
```text
====================
     My Profile
====================
Name : Sofia
Age  : 22
City : Stockholm
====================
```

> **Think about it:** What data type is right for each piece of information? If you later want to change the city, how many lines of code need to change?

---

## Exercise 2 – Leap Year

### Question
Ask the user to enter a year. Print whether it is a leap year or not.

**Example interaction:**
```text
Enter a year: 2024
2024 is a leap year.
```

```text
Enter a year: 1900
1900 is NOT a leap year.
```

> **Think about it:** This has three conditions that depend on each other. What is the correct order to check them, and which logical operators (`&&`, `||`) do you need?

---

## Exercise 3 – Shopping Receipt

### Question
A customer buys **3 items**. Each item has a name, a quantity, and a price per unit. Store all values in variables, calculate the total cost for each item and the overall grand total, then print a formatted receipt.

**Expected output:**
```text
==============================
           Receipt
==============================
Apple        2 x 15.00 = 30.00 SEK
Milk         1 x 22.50 = 22.50 SEK
Bread        3 x 18.00 = 54.00 SEK
------------------------------
Grand Total:           106.50 SEK
==============================
```

> **Think about it:** What type should price be — `int` or `double`? What happens to your grand total if you use the wrong type? If you change one item's quantity, how many lines of code need to change?

---

## Exercise 4 – Average of Three Numbers

### Question
Ask the user to enter three integers. Calculate and print their average. Make sure the result shows the decimal part.

**Example interaction:**
```text
Enter first number:  23
Enter second number: 11
Enter third number:  77
Average: 37.0
```

> **Think about it:** If all three variables are `int`, what happens when you divide their sum by 3? How do you make sure the result is a decimal number?

---

## Exercise 5 – Greet the User

### Question
Ask the user to enter their first name and last name separately. Then print a personalised greeting that includes the full name.

**Example interaction:**
```text
Enter first name: Sofia
Enter last name:  Karlsson
Hello, Sofia Karlsson! Welcome aboard.
```

> **Think about it:** How do you join two separate `String` variables into one output line? What operator or method do you use?

---

## Exercise 6 – Arithmetic With User Input

### Question
Ask the user to enter two integers. Print the result of all four basic operations: addition, subtraction, multiplication, and division.

**Example interaction:**
```text
Enter first number:  20
Enter second number: 6
20 + 6 = 26
20 - 6 = 14
20 * 6 = 120
20 / 6 = 3
```

> **Think about it:** Why does `20 / 6` print `3` and not `3.33`? How would you change the code to get the decimal result?

---

## Exercise 7 – Convert Seconds

### Question
Ask the user to enter a number of seconds. Convert and print it as hours, minutes, and remaining seconds in `HH:MM:SS` format.

**Example interaction:**
```text
Enter seconds: 86399
23:59:59
```

> **Think about it:** Which operator gives you the whole hours from a total number of seconds? Which operator gives you the leftover seconds after removing the hours? Work it out step by step before writing any code.

---

## Exercise 8 – Guess the Number

### Question
Generate a random number between **1 and 500** using the `Random` class. Let the user keep guessing until they get it right. After each wrong guess, print whether it was too small or too big. When the user guesses correctly, print a congratulation message that includes how many guesses they made.

**Example interaction:**
```text
Enter your guess: 250
Too big!
Enter your guess: 125
Too small!
Enter your guess: 180
Correct! You got it in 3 guesses.
```

> **Think about it:** What kind of loop keeps running until an unknown condition is met — a `for` loop or a `while` loop? Where do you increment the guess counter?

---

## Exercise 9 – Temperature Converter

### Question
Ask the user to enter a temperature in Celsius. Convert it to both Fahrenheit and Kelvin and print all three values.

Formulas:
- `°F = °C × 9.0 / 5 + 32`
- `K  = °C + 273.15`

**Example interaction:**
```text
Enter temperature in Celsius: 100
Celsius:    100.0 °C
Fahrenheit: 212.0 °F
Kelvin:     373.15 K
```

> **Think about it:** What happens if you write `9 / 5` using two `int` literals? Try it and observe the result. Why does it go wrong, and how do you fix it?

---

## Exercise 10 – Swap Two Values Without a Temp Variable

### Question
You have two variables:

```java
int a = 15;
int b = 42;
```

Swap their values so that `a` ends up with `42` and `b` ends up with `15`. You are **not allowed to declare a third variable**.

**Expected output:**
```text
Before: a = 15, b = 42
After:  a = 42, b = 15
```

> **Think about it:** You can solve this using only addition and subtraction. What happens if you set `a = a + b`? What does `a` now contain, and how can you use that to recover the original values?

---

## Exercise 11 – FizzBuzz

### Question
Print every integer from **1 to 30**, one per line, applying these rules:

- Divisible by **3** → print `Fizz`
- Divisible by **5** → print `Buzz`
- Divisible by **both 3 and 5** → print `FizzBuzz`
- Otherwise → print the number

**Expected output (first 15 lines):**
```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

> **Think about it:** If you check divisibility by 3 first, what happens when the number is 15? Why must the combined check come before the individual ones?

---

## Exercise 12 – Grade Calculator

### Question
Ask the user to enter a score between 0 and 100. Print the matching letter grade. If the score is outside that range, print an error message.

| Score     | Grade |
|:----------|:------|
| 90 to 100 | A     |
| 80 to 89  | B     |
| 70 to 79  | C     |
| 60 to 69  | D     |
| 0 to 59   | F     |

**Example interaction:**
```text
Enter score: 85
Grade: B
```

> **Think about it:** If you order your `else if` branches from highest to lowest, how many comparisons do you actually need per branch? Can you reduce each branch to just one condition?

---

## Exercise 13 – Weekday or Weekend?

### Question
Ask the user to enter a day of the week (e.g. `Monday`). Use a `switch` statement with arrow syntax to print whether it is a **Weekday** or a **Weekend**. If the input does not match any known day, print `"Unknown day"`.

**Example interaction:**
```text
Enter day: Saturday
Weekend
```

```text
Enter day: Wednesday
Weekday
```

> **Think about it:** In modern switch syntax, a single case can match multiple values: `case "Saturday", "Sunday" ->`. How many cases do you actually need to cover all seven days?

---

## Optional Exercises (14–20)

## Exercise 14 – Multiplication Table

### Question
Ask the user for a number. Print its multiplication table from 1 to 10 using a `for` loop.

**Example interaction:**
```text
Enter a number: 7
7 x 1  = 7
7 x 2  = 14
7 x 3  = 21
7 x 4  = 28
7 x 5  = 35
7 x 6  = 42
7 x 7  = 49
7 x 8  = 56
7 x 9  = 63
7 x 10 = 70
```

> **Bonus:** Use a nested `for` loop to print the full 10 × 10 multiplication grid for all numbers from 1 to 10.

---

## Exercise 15 – Reverse a Number

### Question
Ask the user for a positive integer. Reverse its digits using **only arithmetic** — no converting to a `String`. Print the reversed number.

**Example interaction:**
```text
Enter a number: 12345
Reversed: 54321
```

Also test with `1000` — the result should be `1`, not `0001`.

> **Think about it:** Use a `while` loop. Each iteration: extract the last digit with `% 10`, attach it to your result by multiplying the result by 10 and adding that digit, then strip the last digit with `/ 10`. Stop when the number reaches 0.

---

## Exercise 16 – Running Total

### Question
The user enters integers one at a time. After each entry, print the current total and how many numbers have been entered so far. When the user enters `0`, stop and print a final summary including the average. Do **not** include `0` in the total or the count.

**Example interaction:**
```text
Enter a number (0 to stop): 10
Total: 10 | Count: 1
Enter a number (0 to stop): 30
Total: 40 | Count: 2
Enter a number (0 to stop): 20
Total: 60 | Count: 3
Enter a number (0 to stop): 0
--- Summary ---
Count:   3
Total:   60
Average: 20.0
```

> **Think about it:** `total` and `count` are both `int`. What happens when you divide them? What type must the average be, and how do you force an `int` division to produce a decimal result?

---

## Exercise 17 – Password Strength Checker

### Question
Ask the user to enter a password. Loop through every character and check three rules:

1. Length is at least **8** characters.
2. Contains at least one **uppercase letter** (`A`–`Z`).
3. Contains at least one **digit** (`0`–`9`).

Print how many rules are met and a rating.

| Rules met | Rating |
|:----------|:-------|
| 3         | Strong |
| 2         | Medium |
| 0 or 1    | Weak   |

**Example interaction:**
```text
Enter password: Hello7
Rules met: 2/3
Rating: Medium
```

> **Think about it:** You can compare a `char` directly without importing anything: `ch >= 'A' && ch <= 'Z'` checks for uppercase. Use `password.charAt(i)` to get each character inside the loop.

---

## Exercise 18 – Sum of Digits

### Question
Write a `static` method `sumOfDigits(int n)` that returns the sum of all digits in a positive integer. Call it from `main` and test it with at least three different values.

**Examples:**
```text
sumOfDigits(1234) → 10   (1+2+3+4)
sumOfDigits(9)    → 9
sumOfDigits(305)  → 8    (3+0+5)
```

> **Think about it:** Use `n % 10` to extract the last digit and `n / 10` to remove it. Repeat inside a `while` loop until `n` becomes 0. What should the loop condition be?

---

## Exercise 19 – Count the Vowels

### Question
Write a `static` method `countVowels(String s)` that returns the number of vowels (`a`, `e`, `i`, `o`, `u`, case-insensitive) in the string. Call it from `main` and test it.

**Examples:**
```text
countVowels("Hello World") → 3
countVowels("Java")        → 2
countVowels("rhythm")      → 0
```

> **Think about it:** Convert the whole string to lowercase once before the loop. Use `s.charAt(i)` to access each character. How do you compare a `char` to multiple values without a long chain of `||` conditions?

---

## Exercise 20 – Find All Prime Numbers

### Question
Write a `static` method `isPrime(int n)` that returns `true` if `n` is a prime number. Use it inside a loop in `main` to print all prime numbers from 2 to 50 on a single line.

**Expected output:**
```text
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
```

> **Think about it:** Your divisor loop inside `isPrime` only needs to go up to the square root of `n`. Why? If `n` has no divisor up to that point, what can you conclude? Also handle `n <= 1` as a special case that always returns `false`.

---






![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Java Exercises – Part 2

---

## Project Setup

Continue using the Maven project you created in Part 1. 

Use Git regularly throughout the exercises:
* Commit your changes after completing each exercise.
* Write clear and meaningful commit messages.
* Push your commits to GitHub regularly as you progress.

---

## Exercise 1 – Word Reverser

### Question
Ask the user to enter a word. Reverse it using `StringBuilder` and print the result.

**Example interaction:**
```text
Enter a word: Stockholm
Reversed: mlohkcotS
```

---

## Exercise 2 – Email Slicer

### Question
Ask the user to enter an email address. Use `indexOf()` and `substring()` to extract and print the username and the domain separately.

**Example interaction:**
```text
Enter email: mehrdad.javan@lexicon.se
Username: mehrdad.javan
Domain  : lexicon.se
```

---

## Exercise 3 – String Stats

### Question
Ask the user to enter a sentence. Loop through every character and count how many are vowels, consonants, digits, and spaces. Print the summary.

**Example interaction:**
```text
Enter a sentence: Java 101 is fun
Vowels    : 5
Consonants: 5
Digits    : 3
Spaces    : 3
```

---

## Exercise 4 – Initials Generator

### Question
Ask the user to enter their full name (first, optional middle, last — separated by spaces). Print the initials in dot notation, all uppercase.

**Example interaction:**
```text
Enter full name: mehrdad javan
Initials: M.J.
```

---

## Exercise 5 – Palindrome Checker

### Question
Ask the user to enter a word. Check whether it is a palindrome — the same forwards and backwards — ignoring case. Print the result.

**Example interaction:**
```text
Enter a word: Racecar
Racecar is a palindrome.
```

```text
Enter a word: Java
Java is NOT a palindrome.
```

---

## Exercise 6 – Word Counter

### Question
Ask the user to enter a sentence. Count how many words it contains and how many times a specific word appears in it. The search should be case-insensitive.

**Example interaction:**
```text
Enter a sentence  : To be or not to be that is the question
Enter word to find: be
Total words : 10
"be" appears: 2 times
```

---

## Exercise 7 – Circle Calculator

### Question
Ask the user to enter the radius of a circle. Calculate and print the area and the circumference. Round both results to two decimal places.

Formulas:
- Area: `π × r²`
- Circumference: `2 × π × r`

**Example interaction:**
```text
Enter radius: 7
Area         : 153.94
Circumference: 43.98
```

---

## Exercise 8 – Power Table

### Question
Ask the user to enter a base number. Print its powers from 1 to 10 using `Math.pow`.

**Example interaction:**
```text
Enter base: 3
3 ^ 1  =       3.0
3 ^ 2  =       9.0
3 ^ 3  =      27.0
3 ^ 4  =      81.0
3 ^ 5  =     243.0
3 ^ 6  =     729.0
3 ^ 7  =    2187.0
3 ^ 8  =    6561.0
3 ^ 9  =   19683.0
3 ^ 10 =   59049.0
```

---

## Exercise 9 – Right Triangle Checker

### Question
Ask the user to enter the lengths of three sides of a triangle. Check whether it is a right triangle using the Pythagorean theorem. Also print the length of the longest side.

**Example interaction:**
```text
Enter side a: 3
Enter side b: 4
Enter side c: 5
Longest side: 5.0
This IS a right triangle.
```

```text
Enter side a: 3
Enter side b: 4
Enter side c: 6
Longest side: 6.0
This is NOT a right triangle.
```

---

## Exercise 10 – Number Cruncher

### Question
Write three `static` methods: `findMax(int a, int b, int c)`, `findMin(int a, int b, int c)`, and `average(int a, int b, int c)`. Ask the user to enter three integers, then print the maximum, minimum, and average using those methods.

**Example interaction:**
```text
Enter first number : 42
Enter second number: 7
Enter third number : 19
Maximum : 42
Minimum : 7
Average : 22.67
```

---

## Exercise 11 – Dice Statistics

### Question
Ask the user how many times to roll two six-sided dice. Roll them that many times, print each individual roll, and at the end print how many times the result was a double (both dice show the same value).

**Example interaction:**
```text
How many rolls? 5
Roll 1: 3 + 3 = 6  DOUBLE!
Roll 2: 5 + 2 = 7
Roll 3: 1 + 4 = 5
Roll 4: 6 + 6 = 12 DOUBLE!
Roll 5: 2 + 3 = 5
Doubles rolled: 2 out of 5
```

---

## Exercise 12 – Password Generator

### Question
Ask the user for a desired password length. Generate a random password of exactly that length using characters from the set: lowercase letters (`a`–`z`), uppercase letters (`A`–`Z`), and digits (`0`–`9`). Use `Math.random()` and `StringBuilder` to build the result.

**Example interaction:**
```text
Enter password length: 10
Generated password: gR4kXp1QzA
```

---

## Exercise 13 – Receipt Builder

### Question
Ask the user to enter item names and their prices one at a time. When the user types `done`, stop taking input. Use `StringBuilder` to build and print a formatted receipt including the grand total.

**Example interaction:**
```text
Enter item name (or 'done'): Apple
Enter price: 15.00
Enter item name (or 'done'): Milk
Enter price: 22.50
Enter item name (or 'done'): Bread
Enter price: 18.00
Enter item name (or 'done'): done

==============================
           Receipt
==============================
Apple                   15.00
Milk                    22.50
Bread                   18.00
------------------------------
Grand Total:            55.50
==============================
```

---

## Optional Exercises (14–20)

---

## Exercise 14 – Today's Calendar

### Question
Print today's date using `LocalDate.now()`. Display the full day name, the day number, the full month name, and the year. Also print whether it is a weekday or a weekend.

**Expected output (example):**
```text
Today is: Wednesday, 11 June 2026
It is a Weekday.
```

---

## Exercise 15 – Age Calculator

### Question
Ask the user to enter their birth year, birth month (1–12), and birth day. Print their current age in full years and how many days remain until their next birthday.

**Example interaction:**
```text
Enter birth year : 2000
Enter birth month: 3
Enter birth day  : 15
Your age            : 26 years
Days until birthday : 277
```

---

## Exercise 16 – Event Countdown

### Question
Ask the user to enter an event name and its date in `yyyy-MM-dd` format. Use `LocalDate.parse()` to read the date. If the event is in the future, print how many days remain. If it has already passed, print how many days ago it was.

**Example interaction:**
```text
Enter event name: Midsommar
Enter event date (yyyy-MM-dd): 2026-06-20
Midsommar is in 9 days!
```

```text
Enter event name: New Year
Enter event date (yyyy-MM-dd): 2026-01-01
New Year was 161 days ago.
```

---

## Exercise 17 – Appointment Planner

### Question
Ask the user to enter three appointment names and their date-times in `yyyy-MM-dd HH:mm` format. Store them and print a formatted schedule, sorted by date, using the pattern `"eeee, dd MMMM yyyy 'at' HH:mm"`.

**Example interaction:**
```text
Enter appointment 1 name: Dentist
Enter appointment 1 date-time (yyyy-MM-dd HH:mm): 2026-06-15 09:00
Enter appointment 2 name: Team Meeting
Enter appointment 2 date-time (yyyy-MM-dd HH:mm): 2026-06-12 14:30
Enter appointment 3 name: Gym
Enter appointment 3 date-time (yyyy-MM-dd HH:mm): 2026-06-11 17:00

--- Your Schedule ---
1. Gym          – Thursday, 11 June 2026 at 17:00
2. Team Meeting – Friday, 12 June 2026 at 14:30
3. Dentist      – Monday, 15 June 2026 at 09:00
```

---

## Exercise 18 – Date Range Printer

### Question
Ask the user to enter a start date and an end date in `yyyy-MM-dd` format. Print every date from start to end (inclusive), one per line, formatted as `"dd/MM/yyyy (eeee)"`.

**Example interaction:**
```text
Enter start date (yyyy-MM-dd): 2026-06-08
Enter end date   (yyyy-MM-dd): 2026-06-12
08/06/2026 (Monday)
09/06/2026 (Tuesday)
10/06/2026 (Wednesday)
11/06/2026 (Thursday)
12/06/2026 (Friday)
```

---

## Exercise 19 – Unit Converter

### Question
Create a class `UnitConverter` with three pairs of **overloaded** `convert` methods:

1. `convert(double km)` → converts kilometres to miles
2. `convert(double kg, String unit)` where `unit = "lbs"` → converts kilograms to pounds
3. `convert(double celsius, boolean toFahrenheit)` → converts Celsius to Fahrenheit (if `true`) or Kelvin (if `false`)

Ask the user to choose a conversion, enter the value, and print the result rounded to two decimal places.

**Example interaction:**
```text
Choose conversion:
1. km → miles
2. kg → lbs
3. °C → °F / K
Enter choice: 1
Enter value in km: 100
100.0 km = 62.14 miles
```

---

## Exercise 20 – Profile Card Builder

### Question
Ask the user to enter their name, birth date (`yyyy-MM-dd`), city, and email. Calculate their age from the birth date. Use `StringBuilder` to build and print a formatted profile card.

**Example interaction:**
```text
Enter name      : Sofia Karlsson
Enter birth date: 1998-04-22
Enter city      : Stockholm
Enter email     : sofia@mail.com

╔══════════════════════════════╗
║         Profile Card         ║
╠══════════════════════════════╣
║ Name  : Sofia Karlsson       ║
║ Age   : 28                   ║
║ City  : Stockholm            ║
║ Email : sofia@mail.com       ║
╚══════════════════════════════╝
```

---
