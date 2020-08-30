package com.kodilla.converterzad.domain;

public class MyCustomClass {

    private final String fieldOne;
    private final String fieldTwo;
    private final String fieldThree;
    private final String fieldFour;

    public MyCustomClass(String field1, String field2, String field3, String field4) {
        fieldOne = field1;
        fieldTwo = field2;
        fieldThree = field3;
        fieldFour = field4;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public String getFieldFourth() {
        return fieldFour;
    }

}
