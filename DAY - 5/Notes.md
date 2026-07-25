# ☕ Day 5 - Decision Making Statements


---

# 📚 Topics Learned

- if Statement
- if-else Statement
- else-if Ladder
- Nested if

---

# 📝 Important Notes

## What is if?

The if statement is used to execute a block of code only when a condition is true.

Syntax:

if(condition){
    // Code
}

Example:

int age = 20;

if(age >= 18){
    System.out.println("Eligible to Vote");
}

---

## What is if-else?

The if-else statement is used when there are two possible outcomes.

If the condition is true, the if block executes.
If the condition is false, the else block executes.

Syntax:

if(condition){
    // True Block
}
else{
    // False Block
}

Example:

int age = 15;

if(age >= 18){
    System.out.println("Eligible");
}
else{
    System.out.println("Not Eligible");
}

---

## What is else-if?

The else-if ladder is used when there are multiple conditions.

Java checks conditions from top to bottom.

The first true condition gets executed.

Syntax:

if(condition1){

}
else if(condition2){

}
else{

}

Example:

int marks = 85;

if(marks >= 90){
    System.out.println("Grade A");
}
else if(marks >= 75){
    System.out.println("Grade B");
}
else{
    System.out.println("Need Improvement");
}

---

## What is Nested if?

A Nested if means an if statement inside another if statement.

Example:

int age = 20;
boolean hasAadhaar = true;

if(age >= 18){

    if(hasAadhaar){
        System.out.println("Admission Allowed");
    }
    else{
        System.out.println("Bring Aadhaar Card");
    }

}
else{
    System.out.println("Not Eligible");
}

---

# ⭐ Important Rules

- if executes only when the condition is true.
- else executes when the condition is false.
- else-if is used for multiple conditions.
- Java checks conditions from top to bottom.
- Once Java finds the first true condition, it executes that block and skips the remaining conditions.
- Nested if is used when one condition depends on another.

---

# 💻 Programs Practiced

- IfElsePractice.java
- GradeChecker.java
- NestedIfPractice.java

---

# 🎯 Today's Learning

Today I learned how Java makes decisions using if, if-else, else-if, and nested if statements. I also learned how Java evaluates conditions step by step.

---

# ⭐ Revision Keywords

if

else

else if

Nested if

Condition

true

false

Decision Making

---

# ❓ Interview Questions

1. What is an if statement?
2. What is the difference between if and if-else?
3. When should we use else-if?
4. What is a Nested if?
5. How does Java execute an else-if ladder?
6. Can an if statement exist without else?
7. Can there be multiple else blocks?
8. What happens after the first true condition in an else-if ladder?

---

# 🌱 My Mistakes Today

- Initially, I was confused about how if and else decide which block to execute.
- I learned that Java always checks the condition first.
- I also understood that Java stops checking after the first true condition in an else-if ladder.

---

# 🚀 Tomorrow's Goal

- Switch Statement
- for Loop
- while Loop
- do-while Loop