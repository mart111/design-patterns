package org.example.patterns.strategy;


// Strategy pattern used to change the implementation of something at runtime
public class AppStrategy {

    public static void main(String[] args) {
        Operation addOp = new AddOperation();
        Operation subOp = new SubtractOperation();
        Calculator calculator = new Calculator(addOp);
        int sum = calculator.doCalculation(1, 2);
        System.out.println("Add Operation:  " + sum);

        // change operation type dynamically
        calculator.setOperation(subOp);
        int sub = calculator.doCalculation(10, 20);
        System.out.println("Subtract Operation:  " + sub);
    }
}
