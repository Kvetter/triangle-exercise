package com.kvetter;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

import static org.junit.Assert.*;

public class SideCalcTest {

    SideCalc calc;
    String equilateral;
    String isoscele;
    String scalene;
    String notValid;

    @org.junit.Before
    public void before() {
        calc = new SideCalc();
        equilateral = "This is an equilateral triangle";
        isoscele = "This is an isoscele triangle";
        scalene = "This is a scalene triangle";
        notValid = "This is not a triangle";
    }

    @org.junit.Test
    public void calcSides() throws Exception {
        assertEquals(equilateral, calc.calcSides(2,2,2));
        assertEquals(isoscele, calc.calcSides(2,3,2));
        assertEquals(scalene, calc.calcSides(5,3,6));
        assertEquals(notValid, calc.calcSides(1,2,3));
    }
}
