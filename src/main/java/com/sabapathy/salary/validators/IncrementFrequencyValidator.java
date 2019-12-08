package com.sabapathy.salary.validators;

import com.sabapathy.salary.IncomePredictor;
import com.sabapathy.salary.validate.InputValidator;

public class IncrementFrequencyValidator extends InputValidator
{
    @Override
    protected int getMinimum() {
        return 0;
    }

    @Override
    protected int[] getValues() {
        return IncomePredictor.INCREMENT_FREQUENCY;
    }
}
