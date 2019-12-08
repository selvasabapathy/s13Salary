package com.sabapathy.salary.calculate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Calculate {
    Map<Integer, Integer> changesInYear = new HashMap() {{
        put(3, 4);
        put(6, 2);
        put(12, 1);
    }};

    static List<Calc> incCalculate(int years, int startAmount, int incMonths, int incPercentage) {
        List<Calc> calcs = new ArrayList<>();

        int runningSalary = startAmount;
        for (int i=1; i<=years; i++) {
            int frequency = changesInYear.get(incMonths);
            int frequencyIncrease = 0;
            int yearlyIncrease = 0;
            for (int j=1; j<=frequency; j++) {
                frequencyIncrease = runningSalary * incPercentage / 100;
                runningSalary += frequencyIncrease;
                yearlyIncrease += frequencyIncrease;
            }
            calcs.add(new Calc(i, startAmount, frequency, incPercentage, yearlyIncrease));
            startAmount += yearlyIncrease;
        }
        return calcs;
    }

    static List<Calc> dedCalculate(int years, List<Increment> increments, int changeMonths, int changeAmount) {
        List<Calc> calcs = new ArrayList<>();

        for (int i=1; i<=years; i++) {
            int startAmount = increments.get(i-1).getStartingAmount();
            int frequency = changesInYear.get(changeMonths);
            int frequencyPercentage = 0;
            int yearlyDeduction = 0;
            for (int j=1; j<=frequency; j++) {
                frequencyPercentage += (changeAmount * 100 / startAmount);
                yearlyDeduction += changeAmount;
            }
            calcs.add(new Calc(i, startAmount, frequency, frequencyPercentage, yearlyDeduction));
        }
        return calcs;
    }
}
