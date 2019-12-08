package com.sabapathy.salary;

import com.sabapathy.salary.calculate.*;
import com.sabapathy.salary.reader.DeductionFrequencyReader;
import com.sabapathy.salary.reader.DeductionReader;
import com.sabapathy.salary.reader.IncrementFrequencyReader;
import com.sabapathy.salary.reader.IncrementReader;
import com.sabapathy.salary.reader.PredictionReader;
import com.sabapathy.salary.reader.SalaryReader;
import com.sabapathy.salary.write.TableWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncomePredictor {

    // Starting salary >= $1
    public static final int MINIMUM_SALARY = 1;

    // Increment >= 0%, Increment Frequency: 3, 6, or 12 months
    public static final int MINIMUM_INCREMENT_PERCENTAGE = 0;
    public static final int[] INCREMENT_FREQUENCY = new int[] {3, 6, 12};

    // Deduction >= $0, Decrement Frequency: 3, 6, or 12 months
    public static final int MINIMUM_DEDUCTION_AMOUNT = 0;
    public static final int[] DEDUCTION_FREQUENCY = new int[] {3, 6, 12};

    // Prediction: 5, 10, 20, 30, or 50 years
    public static final int[] PREDICTION_YEARS = new int[] {5, 10, 20, 30, 50};

    public void run()
    {
        int salary = new SalaryReader().read();
        int incrementPercentage = new IncrementReader().read();
        int incrementFrequency = new IncrementFrequencyReader().read();
        int deductionAmount = new DeductionReader().read();
        int deductionFrequency = new DeductionFrequencyReader().read();
        int predictionYears = new PredictionReader().read();

        IncrementCalculate incrementCalculate = (years, startSalary, changeMonths, changePercentage) -> {
          List<Calc> calcs = Calculate.incCalculate(years, startSalary, changeMonths, changePercentage);
          List<Increment> increments = calcs.stream().map(calc -> new Increment(calc)).collect(Collectors.toList());
          return  increments;
        };
        List<Increment> increments = incrementCalculate.calc(predictionYears,salary,incrementFrequency,incrementPercentage);

        //        increments.forEach(increment -> System.out.println(increment));

        DeductionCalculate deductionCalculate = (years, incs, changeMonths, changeAmount) -> {
            List<Calc> calcs = Calculate.dedCalculate(years, incs,changeMonths, changeAmount);
            List<Deduction> deductions = calcs.stream().map(calc -> new Deduction(calc)).collect(Collectors.toList());
            return deductions;
        };
        List<Deduction> deductions = deductionCalculate.calc(predictionYears, increments, deductionFrequency, deductionAmount);

        //        deductions.forEach(deduction -> System.out.println(deduction));

        PredictionCalculate predictionCalculate = (incs, deds) -> {
            List<Prediction> predictions = new ArrayList<>();
            int incLastYear = 0;
            for (int i=1; i<=incs.size(); i++) {
                int sal = incs.get(i-1).getStartingAmount();
                int inc = incs.get(i-1).getIncrementAmount();
                int ded = deds.get(i-1).getDeductionAmount();
                predictions.add(new Prediction(i, sal, inc, ded, PredictionCalculate.computeGrowth(sal, incLastYear+inc, ded)));
                incLastYear = inc;
            }
            return predictions;
        };
        List<Prediction> predictions = predictionCalculate.predict(increments, deductions);

        //        predictions.forEach(prediction -> System.out.println(prediction));

        System.out.format("\n\n");

        TableWriter tableWriter = new TableWriter();
        tableWriter.incrementReport(increments);
        tableWriter.deductionReport(deductions);
        tableWriter.predictionReport(predictions);
    }

    public static void main( String[] args ) {
        new IncomePredictor().run();
    }
}
