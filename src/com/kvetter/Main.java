package com.kvetter;

public class Main {
    public static void main(String[] args) {
        SideCalc calc = new SideCalc();
        //In case command line doesn't work use these
        /*
        System.out.println(calc.calcSides(2,2,2));
        System.out.println(calc.calcSides(2,2,3));
        System.out.println(calc.calcSides(2,3,6));
        System.out.println(calc.calcSides(0,2,3));
        System.out.println(calc.calcSides(2,5,2));
        System.out.println(calc.calcSides(2,-1,4));
        System.out.println(calc.calcSides(2,5,2));
        System.out.println(calc.calcSides(50,100,75));
*/
        System.out.println(calc.calcSides(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
}
