package com.socgen.calculator;

public class TestSplitRegex {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	testSplitRegex();
    }

    private static void testSplitRegex() {
	String str = "128.89+34.23896546";
	String[] ope = str.split("[\\+,-,\\*,/,%]");

	System.out.println(ope[0] + " , " + ope[1]);
    }
}
