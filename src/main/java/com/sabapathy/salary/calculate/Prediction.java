package com.sabapathy.salary.calculate;

public class Prediction {
    int year;
    int startingAmount;
    int incrementAmount;
    int deductionAmount;
    int salaryGrowth;

    public Prediction() {
    }

    public Prediction(int year, int startingAmount, int incrementAmount, int deductionAmount, int salaryGrowth) {
        this.year = year;
        this.startingAmount = startingAmount;
        this.incrementAmount = incrementAmount;
        this.deductionAmount = deductionAmount;
        this.salaryGrowth = salaryGrowth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStartingAmount() {
        return startingAmount;
    }

    public void setStartingAmount(int startingAmount) {
        this.startingAmount = startingAmount;
    }

    public int getIncrementAmount() {
        return incrementAmount;
    }

    public void setIncrementAmount(int incrementAmount) {
        this.incrementAmount = incrementAmount;
    }

    public int getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(int deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public int getSalaryGrowth() {
        return salaryGrowth;
    }

    public void setSalaryGrowth(int salaryGrowth) {
        this.salaryGrowth = salaryGrowth;
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "year=" + year +
                ", startingAmount=" + startingAmount +
                ", incrementAmount=" + incrementAmount +
                ", deductionAmount=" + deductionAmount +
                ", salaryGrowth=" + salaryGrowth +
                '}';
    }
}
