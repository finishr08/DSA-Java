package Operators;

public class logicOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // boolean c = a > b;
        // System.out.println(c);
        
        // boolean c = !(a > b);
        // System.out.println(c);

        boolean c = !(a > b) || !(a < b);
        System.out.println("Output: " + c);
    }
}
