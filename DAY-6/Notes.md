# ☕ Java Journey - Day 6


---

# 📚 Topics Covered

- Switch Statement
- Break Statement
- Default Statement
- For Loop
- Nested Loop
- Pattern Printing (Introduction)

---

# 1️⃣ Switch Statement

## Definition

A switch statement is a decision-making statement in Java that is used to execute one block of code from multiple options based on the value of a variable or expression.

### Syntax

```java
switch(expression){

    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    default:
        // Code
}
```

### Keywords

- **switch** → Checks the value of an expression.
- **case** → Executes code if the value matches.
- **break** → Exits the switch statement.
- **default** → Executes when no case matches.

### Key Points

- Used for multiple fixed choices.
- Cleaner than long if-else statements.
- `default` works like `else`.
- Without `break`, Java executes the next cases (Fall-through).

---

# 2️⃣ For Loop

## Definition

A for loop is an iteration statement used to execute a block of code repeatedly for a fixed number of times.

### Syntax

```java
for(initialization; condition; update){
    // Code
}
```

### Parts of For Loop

### Initialization

```java
int i = 1;
```

Starts the loop.

### Condition

```java
i <= 5
```

Checks whether the loop should continue.

### Update

```java
i++
```

Increases the value by 1 after every iteration.

Examples

```java
i++
```

Increase by 1

```java
i--
```

Decrease by 1

```java
i = i + 2
```

Increase by 2

---

# 3️⃣ Nested Loop

## Definition

A Nested Loop is a loop inside another loop.

### Rule

Outer Loop = Rows

Inner Loop = Columns

### Syntax

```java
for(int i=1; i<=rows; i++){

    for(int j=1; j<=columns; j++){

    }

}
```

---

# 4️⃣ Pattern Printing

## Pattern 1

```text
*
**
***
****
```

Logic

- Rows = 4
- Stars = Row Number

Inner Loop

```java
j <= i
```

---

## Pattern 2

```text
*****
****
***
**
*
```

Logic

- Outer Loop starts from 5 and decreases.
- Inner Loop remains:

```java
j <= i
```

---

# ⭐ Difference between print() and println()

## print()

Prints output on the same line.

Example

```java
System.out.print("*");
```

Output

```text
*****
```

---

## println()

Prints output and moves the cursor to the next line.

Example

```java
System.out.println("*");
```

Output

```text
*
*
*
*
*
```

---

# 💻 Programs Practiced

- SwitchExample.java
- ForLoopExample.java
- NestedLoopTest.java
- Pattern1.java
- Pattern2.java

---

# 🧠 Important Points

- Java is Case Sensitive.
- Public class name and file name must be exactly the same.
- `break` exits the switch statement.
- `default` executes when no case matches.
- `i++` increases by 1.
- `i--` decreases by 1.
- `i = i + 2` increases by 2.
- Outer Loop controls rows.
- Inner Loop controls columns.
- Pattern printing is based on rows and columns.

---

# 📌 Day 6 Summary

✅ Learned Switch Statement

✅ Learned For Loop

✅ Learned Nested Loop

✅ Started Pattern Printing

✅ Practiced multiple Java programs

---

## 💡 What I Learned Today

- Switch is used for multiple fixed choices.
- break stops the switch execution.
- For loop repeats code efficiently.
- Outer Loop = Rows.
- Inner Loop = Columns.
- Pattern printing is all about logic, not memorization.

## 🚀 Tomorrow's Goal

- More Pattern Printing
- Scanner + Loops
- Student Portal using Loops

## 🎯 Status

**Day 6 Completed Successfully ✅**