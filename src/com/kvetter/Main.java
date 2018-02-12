package com.kvetter;

public class Main {
    public static void main(String[] args) {
        SideCalc calc = new SideCalc();
        System.out.println(calc.calcSides(0,0,0));
        System.out.println(calc.calcSides(2,2,2));
        System.out.println(calc.calcSides(-1,1,3));
        System.out.println(calc.calcSides(6,2,9));
        System.out.println(calc.calcSides(2,5,2));

        System.out.println(calc.calcSides(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
}
