package com.sabapathy.salary.calculate;

import java.util.List;

@FunctionalInterface
public interface PredictionCalculate {
    static int computeGrowth(int salary, int increment, int deduction) {
        return (increment - deduction) * 100 / salary;
    }
    List<Prediction> predict(List<Increment> increments, List<Deduction> deductions);
}
