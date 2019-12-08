package com.sabapathy.salary.reader;

import com.sabapathy.salary.validate.InputValidatorType;
import com.sabapathy.salary.validators.IncrementValidator;
import com.sabapathy.salary.validate.InputValidator;

public class IncrementReader extends InputReader {
    private static final String PROMPT_MESSAGE = "Enter increment percentage (0% to 100%): ";
    private static final String VALIDATION_FAILURE_MESSAGE = "Increment percentage must be 0% or above...";

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
