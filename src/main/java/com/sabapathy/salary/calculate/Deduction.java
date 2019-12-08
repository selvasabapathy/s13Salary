package com.sabapathy.salary.calculate;

public class Deduction {
    int year;
    int startingAmount;
    int numOfDeductions;
    int deductionPercentage;
    int deductionAmount;

    public Deduction() {
    }

    public Deduction(int year, int startingAmount, int numOfDeductions, int deductionPercentage, int deductionAmount) {
        this.year = year;
        this.startingAmount = startingAmount;
        this.numOfDeductions = numOfDeductions;
        this.deductionPercentage = deductionPercentage;
        this.deductionAmount = deductionAmount;
    }

    public Deduction(Calc calc) {
        this(calc.getYear(), calc.getAmount(), calc.getNumOfChanges(), calc.getChangePercentage(), calc.getChangeAmount());
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

    public int getNumOfDeductions() {
        return numOfDeductions;
    }

    public void setNumOfDeductions(int numOfDeductions) {
        this.numOfDeductions = numOfDeductions;
    }

    public int getDeductionPercentage() {
        return deductionPercentage;
    }

    public void setDeductionPercentage(int deductionPercentage) {
        this.deductionPercentage = deductionPercentage;
    }

    public int getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(int deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    @Override
    public String toString() {
        return "Deduction{" +
                "year=" + year +
                ", startingAmount=" + startingAmount +
                ", numOfDeductions=" + numOfDeductions +
                ", deductionPercentage=" + deductionPercentage +
                ", deductionAmount=" + deductionAmount +
                '}';
    }
}
