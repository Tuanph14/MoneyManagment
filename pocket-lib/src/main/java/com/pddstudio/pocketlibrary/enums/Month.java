package com.pddstudio.pocketlibrary.enums;

public enum Month {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");

    private final String monthName;

    Month(String monthName) {
        this.monthName = monthName;
    }

    public String getMonthName() {
        return monthName;
    }
}
