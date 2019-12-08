package com.sabapathy.salary.validators;

import com.sabapathy.salary.IncomePredictor;
import com.sabapathy.salary.validate.InputValidator;

public class DeductionFrequencyValidator extends InputValidator
{
    @Override
    protected int getMinimum() {
        return 0;
    }

    @Override
    protected int[] getValues() {
        return IncomePredictor.DEDUCTION_FREQUENCY;
    }
}
