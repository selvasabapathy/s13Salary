package com.sabapathy.salary.reader;

import com.sabapathy.salary.validate.InputValidator;
import com.sabapathy.salary.validate.InputValidatorType;
import com.sabapathy.salary.validators.SalaryValidator;

public class SalaryReader extends InputReader {
    private static final String PROMPT_MESSAGE = "Enter starting salary (in $): ";
    private static final String VALIDATION_FAILURE_MESSAGE = "Starting salary must be $1 or above...";

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
        return new SalaryValidator();
    }
}
