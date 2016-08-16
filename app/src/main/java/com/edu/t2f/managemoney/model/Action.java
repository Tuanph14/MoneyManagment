package com.edu.t2f.managemoney.model;

public enum Action {
    INPUT_0("0"),
    INPUT_1("1"),
    INPUT_2("2"),
    INPUT_3("3"),
    INPUT_4("4"),
    INPUT_5("5"),
    INPUT_6("6"),
    INPUT_7("7"),
    INPUT_8("8"),
    INPUT_9("9"),
    INPUT_DEL("x"),
    INPUT_DOT(".");

    private final String actionString;

    Action(String action) {
        this.actionString = action;
    }

    public String getActionString() {
        return actionString;
    }

}
