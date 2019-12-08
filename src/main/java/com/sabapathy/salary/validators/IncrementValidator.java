package com.sabapathy.salary.validators;

import com.sabapathy.salary.IncomePredictor;
import com.sabapathy.salary.validate.InputValidator;

public class IncrementValidator extends InputValidator
{
    @Override
    protected int getMinimum() {
        return IncomePredictor.MINIMUM_INCREMENT_PERCENTAGE;
    }

    @Override
    protected int[] getValues() {
        return new int[0];
    }
}
