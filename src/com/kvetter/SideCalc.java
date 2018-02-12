package com.kvetter;

public class SideCalc {

    public String calcSides(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "This is not a triangle";
        } else if (a == b && b == c) {
            return "This is an equilateral triangle";
        } else if (a == b || b == c || a == c) {
            return "This is an isoscele triangle";
        } else {
            return "This is a scalene triangle";
        }
    }
}
