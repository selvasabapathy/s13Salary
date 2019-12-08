package com.sabapathy.salary.reader;

import com.sabapathy.salary.validate.InputValidatorType;
import com.sabapathy.salary.validators.IncrementValidator;
import com.sabapathy.salary.validate.InputValidator;

public class DeductionReader extends InputReader {
    private static final String PROMPT_MESSAGE = "Enter deduction amount (in $): ";
    private static final String VALIDATION_FAILURE_MESSAGE = "Deduction amount must be $0 or above...";

    @Override
    protected String getPromptMessage() {
        return PROMPT_MESSAGE;
    }

    @Override
    protected String getValidationFailureMessage() {
        return VALIDATION_FAILURE_MESSAGE;
    }

    @Override
    protected InputValidatorType getValidatorType() { return InputValidatorType.SINGLE_VALUE; }

    @Override
    protected InputValidator getValidator() {
        return new IncrementValidator();
    }
}
