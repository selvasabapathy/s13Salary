package com.sabapathy.salary.reader;

import com.sabapathy.salary.validate.InputValidatorType;
import com.sabapathy.salary.validators.DeductionFrequencyValidator;
import com.sabapathy.salary.validate.InputValidator;

public class DeductionFrequencyReader extends InputReader {
    private static final String PROMPT_MESSAGE = "Enter deduction frequency: ";
    private static final String VALIDATION_FAILURE_MESSAGE = "Deduction frequency must be 3 (quarterly), 6 (half-yearly), or 12 (yearly)...";

    @Override
    protected String getPromptMessage() {
        return PROMPT_MESSAGE;
    }

    @Override
    protected String getValidationFailureMessage() {
        return VALIDATION_FAILURE_MESSAGE;
    }

    @Override
    protected InputValidatorType getValidatorType() { return InputValidatorType.MULTI_VALUE; }

    @Override
    protected InputValidator getValidator() {
        return new DeductionFrequencyValidator();
    }
}
