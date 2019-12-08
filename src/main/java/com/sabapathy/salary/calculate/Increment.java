package com.sabapathy.salary.calculate;

public class Increment {
    int year;
    int startingAmount;
    int numOfIncrements;
    int incrementPercentage;
    int incrementAmount;

    public Increment() {
    }

    public Increment(int year, int startingAmount, int numOfIncrements, int incrementPercentage, int incrementAmount) {
        this.year = year;
        this.startingAmount = startingAmount;
        this.numOfIncrements = numOfIncrements;
        this.incrementPercentage = incrementPercentage;
        this.incrementAmount = incrementAmount;
    }

    public Increment(Calc calc) {
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

    public int getNumOfIncrements() {
        return numOfIncrements;
    }

    public void setNumOfIncrements(int numOfIncrements) {
        this.numOfIncrements = numOfIncrements;
    }

    public int getIncrementPercentage() {
        return incrementPercentage;
    }

    public void setIncrementPercentage(int incrementPercentage) {
        this.incrementPercentage = incrementPercentage;
    }

    public int getIncrementAmount() {
        return incrementAmount;
    }

    public void setIncrementAmount(int incrementAmount) {
        this.incrementAmount = incrementAmount;
    }

    @Override
    public String toString() {
        return "Increment{" +
                "year=" + year +
                ", startingAmount=" + startingAmount +
                ", numOfIncrements=" + numOfIncrements +
                ", incrementPercentage=" + incrementPercentage +
                ", incrementAmount=" + incrementAmount +
                '}';
    }
}
