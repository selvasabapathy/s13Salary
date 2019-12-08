package com.sabapathy.salary.validators;

import com.sabapathy.salary.IncomePredictor;
import com.sabapathy.salary.validate.InputValidator;

public class DeductionValidator extends InputValidator
{
    @Override
    protected int getMinimum() {
        return IncomePredictor.MINIMUM_DEDUCTION_AMOUNT;
    }

    @Override
    protected int[] getValues() {
        return new int[0];
    }
}
