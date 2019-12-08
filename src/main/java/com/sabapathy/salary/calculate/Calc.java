package com.sabapathy.salary.calculate;

public class Calc {
    private int year;
    private int amount;
    private int numOfChanges;
    private int changePercentage;
    private int changeAmount;

    public Calc() {
    }

    public Calc(int year, int startingAmount, int numOfChanges, int changePercentage, int changeAmount) {
        this.year = year;
        this.amount = startingAmount;
        this.numOfChanges = numOfChanges;
        this.changePercentage = changePercentage;
        this.changeAmount = changeAmount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNumOfChanges() {
        return numOfChanges;
    }

    public void setNumOfChanges(int numOfChanges) {
        this.numOfChanges = numOfChanges;
    }

    public int getChangePercentage() {
        return changePercentage;
    }

    public void setChangePercentage(int changePercentage) {
        this.changePercentage = changePercentage;
    }

    public int getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(int changeAmount) {
        this.changeAmount = changeAmount;
    }
}
