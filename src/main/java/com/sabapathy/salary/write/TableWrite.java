package com.sabapathy.salary.write;

import com.sabapathy.salary.calculate.Deduction;
import com.sabapathy.salary.calculate.Increment;
import com.sabapathy.salary.calculate.Prediction;

import java.util.List;

@FunctionalInterface
public interface TableWrite {
    static Row constructFrom(Increment inc) {
        return new Row(inc.getYear(), inc.getStartingAmount(), inc.getNumOfIncrements(), inc.getIncrementPercentage(), inc.getIncrementAmount());
    }

    static Row constructFrom(Deduction ded) {
        return new Row(ded.getYear(), ded.getStartingAmount(), ded.getNumOfDeductions(), ded.getDeductionPercentage(), ded.getDeductionAmount());
    }

    static Row constructFrom(Prediction pred) {
        return new Row(pred.getYear(), pred.getStartingAmount(), pred.getIncrementAmount(), pred.getDeductionAmount(), pred.getSalaryGrowth());
    }

    void write(String reportName, List<String> columnNames, List<Row> rows);
}
