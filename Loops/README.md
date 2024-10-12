## Loops in Java

In Java, loops are used to execute a block of code repeatedly, either for a specific number of times or while a condition is true. Java provides several types of loops:

### 1. **For Loop**
The `for` loop is generally used when the number of iterations is known beforehand. It has three parts: initialization, condition, and increment/decrement.

```java
for (initialization; condition; increment/decrement) {
    // code to be executed
}
```

**Example:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### 2. **While Loop**
The `while` loop executes a block of code as long as a specified condition is `true`.

```java
while (condition) {
    // code to be executed
}
```

**Example:**

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### 3. **Do-While Loop**
The `do-while` loop is similar to the `while` loop, but it guarantees that the code inside the loop is executed at least once, even if the condition is `false`.

```java
do {
    // code to be executed
} while (condition);
```

**Example:**

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

### 4. **Enhanced For Loop (For-Each Loop)**
This is a simplified version of the `for` loop used for iterating over arrays or collections.

```java
for (type variable : array/collection) {
    // code to be executed
}
```

**Example:**

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}
```

### Control Statements in Loops:
- **`break`:** Terminates the loop entirely.
- **`continue`:** Skips the current iteration and moves to the next.

**Example of `break` and `continue`:**

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break; // exits the loop when i equals 3
    }
    if (i == 1) {
        continue; // skips the current iteration when i equals 1
    }
    System.out.println(i);
}
```

