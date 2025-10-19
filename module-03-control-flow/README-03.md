# 📦 Module 03: Control Flow Statements

This module explores how Java programs make decisions and repeat actions.  
Control flow determines **which parts of your program execute and when** — allowing your code to think, decide, and loop intelligently rather than run linearly from top to bottom.

---

## 🎯 Learning Objectives

By the end of this module, you should be able to:

- Use `if`, `if-else`, and `switch` statements for conditional logic.
- Apply looping structures (`for`, `while`, `do-while`) to repeat actions.
- Understand and use **logical** and **comparison operators** to control program flow.
- Implement **jump statements** (`break`, `continue`, `return`) effectively.
- Write decision-based and iterative programs using nested conditions and loops.

---

## 🔑 Key Concepts Covered

### 1️⃣ Conditional Statements

Allow the program to make **decisions** based on specific conditions.

| Statement | Description | Example |
|------------|--------------|----------|
| `if` | Executes a block if a condition is true. | `if (x > 10) System.out.println("Large");` |
| `if-else` | Executes one block if true, another if false. | `if (a > b) {...} else {...}` |
| `if-else-if` Ladder | Checks multiple conditions in sequence. | `if (x>90)... else if(x>75)...` |
| `switch` | Selects one case from multiple options. | `switch(day) { case 1: ... }` |

---

### 2️⃣ Looping Statements

Used to **repeat** actions multiple times.

| Loop Type | Description | Example |
|------------|--------------|----------|
| `for` | When the number of iterations is known. | `for (int i=0; i<5; i++) {...}` |
| `while` | When iterations depend on a condition. | `while (x < 10) {...}` |
| `do-while` | Executes the block at least once. | `do {...} while (x < 5);` |
| `for-each` | Simplified loop for arrays/collections. | `for (int n : numbers) {...}` |

---

### 3️⃣ Jump Statements

Used to **alter** the normal flow of loops.

| Statement | Description | Example |
|------------|--------------|----------|
| `break` | Exits a loop or `switch` immediately. | `if (x == 5) break;` |
| `continue` | Skips the current iteration. | `if (x == 2) continue;` |
| `return` | Exits a method and optionally returns a value. | `return;` |

---

### 4️⃣ Comparison and Logical Operators

| Type | Operators | Purpose | Example |
|------|------------|----------|----------|
| Comparison | `==`, `!=`, `<`, `>`, `<=`, `>=` | Compare two values | `if (a >= b)` |
| Logical | `&&`, `||`, `!` | Combine or invert conditions | `if (a>5 && b<10)` |

---

### 5️⃣ Nested Control Flow

Combining multiple control structures (e.g., an `if` inside a `for` loop) enables complex decision-making.

```java
for (int i = 1; i <= 3; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " is even");
    } else {
        System.out.println(i + " is odd");
    }
}