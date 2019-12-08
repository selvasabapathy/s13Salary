package com.sabapathy.salary.calculate;

import java.util.List;

@FunctionalInterface
public interface DeductionCalculate extends Calculate {
    List<Deduction> calc(int years, List<Increment> increments, int changeMonths, int changeAmount);
}
