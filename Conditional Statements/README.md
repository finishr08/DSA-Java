## If Statement

The `if` statement allows you to execute a block of code if a specified condition is `true`.

```java
if (condition) {
    // Code to execute if the condition is true
}
```

### Example
```java
int x = 10;
if (x > 5) {
    System.out.println("x is greater than 5");
}
```

## If-Else Statement

The `if-else` statement provides an alternative block of code to execute if the condition is `false`.

```java
if (condition) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```

### Example
```java
int x = 4;
if (x > 5) {
    System.out.println("x is greater than 5");
} else {
    System.out.println("x is less than or equal to 5");
}
```

## Nested If-Else Statement

You can nest multiple `if-else` statements inside one another to check multiple conditions.

```java
if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition2 is true
} else {
    // Code to execute if both conditions are false
}
```

### Example
```java
int x = 7;
if (x > 10) {
    System.out.println("x is greater than 10");
} else if (x > 5) {
    System.out.println("x is greater than 5 but less than or equal to 10");
} else {
    System.out.println("x is less than or equal to 5");
}
```

## Switch Statement

The `switch` statement allows you to select one of many code blocks to execute.

```java
switch (expression) {
    case value1:
        // Code to execute if expression equals value1
        break;
    case value2:
        // Code to execute if expression equals value2
        break;
    default:
        // Code to execute if expression doesn't match any case
}
```

### Example
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

## Ternary Operator

The ternary operator is a shorthand for `if-else` statements.

```java
variable = (condition) ? expression1 : expression2;
```

### Example
```java
int x = 10;
String result = (x > 5) ? "x is greater than 5" : "x is less than or equal to 5";
System.out.println(result);
```

## Examples

### Example 1: Using `if-else`
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are not an adult.");
}
```

### Example 2: Using `switch`
```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Well done");
        break;
    case 'C':
        System.out.println("You passed");
        break;
    default:
        System.out.println("Invalid grade");
}
```