package com.sabapathy.salary.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sabapathy.salary.validate.InputValidator;
import com.sabapathy.salary.validate.InputValidatorType;

public abstract class InputReader {
    protected abstract  String getPromptMessage();

    protected abstract String getValidationFailureMessage();

    protected abstract InputValidatorType getValidatorType();

    protected abstract InputValidator getValidator();

    private String read(String errorMessage, String promptMessage) throws IOException
    {
        if (null != errorMessage) {
            System.out.println(errorMessage);
        }
        System.out.print(promptMessage);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.readLine();
    }

    public int read() {
        String inputValue = null;

        boolean isValid = true;
        do {
            try {
                inputValue = read(isValid ? "" : getValidationFailureMessage(), getPromptMessage());
            } catch (IOException e) { inputValue = null; }
            isValid = InputValidatorType.SINGLE_VALUE == getValidatorType()
                        ? getValidator().validate(inputValue) : getValidator().anyMatch(inputValue);
        } while (!isValid);

        return Integer.parseInt(inputValue);
    }
}
