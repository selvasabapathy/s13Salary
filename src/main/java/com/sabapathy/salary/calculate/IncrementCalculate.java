package com.sabapathy.salary.calculate;

import java.util.List;

@FunctionalInterface
public interface IncrementCalculate extends Calculate {
    List<Increment> calc(int years, int startSalary, int changeMonths, int changePercentage);
}
