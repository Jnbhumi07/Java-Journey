# ☕ Day 3 - Scanner (User Input)

## 📅 Date
(Write today's date)

---

# 📚 Topics Learned

- Scanner Class
- import java.util.Scanner;
- Scanner Object
- System.in
- next()
- nextLine()
- nextInt()
- nextDouble()
- Taking User Input

---

# 📝 Important Notes

## What is Scanner?

Scanner is a Java class used to take input from the user through the keyboard.

---

## Import Scanner

Before using Scanner, we need to import it.

Example:

import java.util.Scanner;

---

## Creating Scanner Object

Example:

Scanner sc = new Scanner(System.in);

Explanation:

- Scanner → Class Name
- sc → Object Name
- new → Creates a new object
- System.in → Takes input from the keyboard

---

## System.in

System.in represents the keyboard input.

---

## Scanner Methods

### next()

Reads only one word.

Example Input:

Bhumi Jain

Output:

Bhumi

---

### nextLine()

Reads the complete line.

Example Input:

Bhumi Jain

Output:

Bhumi Jain

---

### nextInt()

Reads an integer value.

Example:

int age = sc.nextInt();

---

### nextDouble()

Reads a decimal value.

Example:

double cgpa = sc.nextDouble();

---

## Printing User Input

Example:

System.out.println(name);

Displays the value stored in the variable.

---

## Program Flow

Keyboard
     ↓
System.in
     ↓
Scanner
     ↓
Variable
     ↓
Output

---

# 💻 Programs Practiced

- ScannerPractice.java
- User Input Program

---

# 🎯 Today's Learning

Today I learned how to take input from the user using the Scanner class and store different types of values like String, int, and double.

---

# ⭐ Revision Keywords

Scanner
System.in
next()
nextLine()
nextInt()
nextDouble()
User Input

---

# ❓ Interview Questions

1. What is Scanner?
2. Why do we import Scanner?
3. What is System.in?
4. Difference between next() and nextLine()?
5. Difference between nextInt() and nextDouble()?
6. Why do we create a Scanner object?
7. What happens if Scanner is not imported?

---

# 💡 Example

```java
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


# 🌱 My Mistakes Today

- I confused String with varchar.
- I forgot that Scanner must be imported.
- I learned that next() reads one word while nextLine() reads the complete line.

---

# 🚀 Tomorrow's Goal

- Operators
- Arithmetic Operators
- Relational Operators
- Logical Operators