package com.sabapathy.salary.write;

import com.sabapathy.salary.calculate.Deduction;
import com.sabapathy.salary.calculate.Increment;
import com.sabapathy.salary.calculate.Prediction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TableWriter {
    private static final String incRptTitle = "a. Increment Report";
    private static final String incRptCol1 = "Year";
    private static final String incRptCol2 = "Starting Salary";
    private static final String incRptCol3 = "Number of Increments";
    private static final String incRptCol4 = "Increment %";
    private static final String incRptCol5 = "Increment Amount";
    List<String> incRptColHdrs = Arrays.asList(new String[]
            {
                  incRptCol1,
                  incRptCol2,
                  incRptCol3,
                  incRptCol4,
                  incRptCol5
            }
    );

    private static final String dedRptTitle = "b. Deduction Report";
    private static final String dedRptCol1 = "Year";
    private static final String dedRptCol2 = "Starting Salary";
    private static final String dedRptCol3 = "Number of deductions";
    private static final String dedRptCol4 = "Deduction %";
    private static final String dedRptCol5 = "Deduction Amount";
    List<String> dedRptColHdrs = Arrays.asList(new String[]
            {
                    dedRptCol1,
                    dedRptCol2,
                    dedRptCol3,
                    dedRptCol4,
                    dedRptCol5
            }
    );
    private static final String predRptTitle = "c. Prediction Report";
    private static final String predRptCol1 = "Year";
    private static final String predRptCol2 = "Starting Salary";
    private static final String predRptCol3 = "Increment Amount";
    private static final String predRptCol4 = "Deduction Amount";
    private static final String predRptCol5 = "Salary Growth";
    List<String> predRptColHdrs = Arrays.asList(new String[]
            {
                    predRptCol1,
                    predRptCol2,
                    predRptCol3,
                    predRptCol4,
                    predRptCol5
            }
    );

    TableWrite tableWrite = (rName, rColNames, rRows) -> {
        System.out.println(rName);
        rColNames.forEach(name -> System.out.format("%25s", name));
        System.out.println();
        rRows.forEach(row -> {
            System.out.format("%25d", row.getCol1());
            System.out.format("%25d", row.getCol2());
            System.out.format("%25d", row.getCol3());
            System.out.format("%25d", row.getCol4());
            System.out.format("%25d\n", row.getCol5());
        });
        System.out.println();
    };

    public void incrementReport(List<Increment> increments) {
        List<Row> rows = increments.stream().map(inc -> TableWrite.constructFrom(inc)).collect(Collectors.toList());
        tableWrite.write(incRptTitle, incRptColHdrs, rows);
    }

    public void deductionReport(List<Deduction> deductions) {
        List<Row> rows = deductions.stream().map(ded -> TableWrite.constructFrom(ded)).collect(Collectors.toList());
        tableWrite.write(dedRptTitle, dedRptColHdrs, rows);
    }

    public void predictionReport(List<Prediction> predictions) {
        List<Row> rows = predictions.stream().map(pred -> TableWrite.constructFrom(pred)).collect(Collectors.toList());
        tableWrite.write(predRptTitle, predRptColHdrs, rows);
    }
}
