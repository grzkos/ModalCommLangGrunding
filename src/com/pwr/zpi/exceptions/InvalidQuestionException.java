package com.pwr.zpi.exceptions;

/**
 * Created by Weronika on 25.04.2017.
 */
public class InvalidQuestionException extends Exception {

    public static final int NO_OBJECT = 1;
    public static final int NO_FIRST_TRAIT = 2;
    public static final int NO_SECOND_TRAIT = 3;
    public static final int NO_FIRST_VALUE = 4;
    public static final int NO_SECOND_VALUE = 5;

    private int mistake;

    public InvalidQuestionException(int i)
    {
        super();
        mistake = i;
    }

    public InvalidQuestionException(String message, int i)
    {
        super(message);
        mistake = i;
    }

    public int getMistake() {
        return mistake;
    }
}
