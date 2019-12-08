package com.sabapathy.salary.reader;

import com.sabapathy.salary.validate.InputValidator;
import com.sabapathy.salary.validate.InputValidatorType;
import com.sabapathy.salary.validators.PredictionValidator;

public class PredictionReader extends InputReader {
    private static final String PROMPT_MESSAGE = "Enter prediction years: ";
    private static final String VALIDATION_FAILURE_MESSAGE = "Prediction years must be 5, 10, 20, 30, or 50...";

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
        return new PredictionValidator();
    }
}
