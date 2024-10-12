import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        int num1 = scn.nextInt(); 
        int num2 = scn.nextInt(); 
        
        String operator = scn.next();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } 
        else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } 
        else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } 
        else if (operator.equals("/")) {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } 
        else {
            System.out.println("Invalid operator");
        }
        
        scn.close();
    }
}
