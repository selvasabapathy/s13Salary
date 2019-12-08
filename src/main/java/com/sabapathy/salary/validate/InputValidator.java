package com.sabapathy.salary.validate;

import java.util.stream.IntStream;

public abstract class InputValidator {

    private static final String ALL_DIGITS = "\\d+";

    protected abstract int getMinimum();

    public final boolean validate(String inputValue) {
        SingleValueValidate singleValueValidate = (inVal, minVal) -> {
            return null != inVal && inVal.matches(ALL_DIGITS) && Integer.parseInt(inVal) >= minVal;
        };
        return singleValueValidate.validate(inputValue, getMinimum());
    }

    protected abstract int[] getValues();

    public final boolean anyMatch(String inputValue) {
        MultiValuesValidate multiValuesValidate =
                (inVal, ranVal) -> null != inVal && inVal.matches(ALL_DIGITS) && IntStream.of(ranVal).anyMatch(x -> x == Integer.parseInt(inVal));
        return multiValuesValidate.validate(inputValue, getValues());
    }
}
