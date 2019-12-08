package com.sabapathy.salary.validators;

import com.sabapathy.salary.IncomePredictor;
import com.sabapathy.salary.validate.InputValidator;

public class SalaryValidator extends InputValidator
{
    @Override
    protected int getMinimum() {
        return IncomePredictor.MINIMUM_SALARY;
    }

    @Override
    protected int[] getValues() {
        return new int[0];
    }
}
