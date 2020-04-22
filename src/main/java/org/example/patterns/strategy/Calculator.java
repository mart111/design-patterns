package org.example.patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private Operation operation;

    public int doCalculation(int a, int b) {
        return operation.doOperation(a, b);
    }
}
