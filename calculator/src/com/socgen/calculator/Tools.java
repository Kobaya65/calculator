package com.socgen.calculator;

/**
 * this class is an utilitary class.
 * 
 * It retrieves each element we need to calculate.
 * 
 * @author Cyril, Lea, Philippe, Steven, Vikram, Thierry
 *
 */
public class Tools {

    private Tools() {

    }

    /**
     * This method returns the operator type.
     * 
     * @param str
     * @return
     */
    public static char operator(String str) {
	char operator = ' ';

	char[] inputs = str.toCharArray();

	for (int i = 0; i < inputs.length; i++) {
	    if (inputs[i] == '+' || inputs[i] == '-' || inputs[i] == '/' || inputs[i] == '*' || inputs[i] == '%') {
		operator = inputs[i];
		break;
	    }
	}
	return operator;
    }

    /**
     * This method returns the operator index.
     * 
     * @param str
     * @param c
     * @return
     */
    public static int operatorIndex(String str, char c) {
	int operatorIndex = str.indexOf(operator(str));
	return operatorIndex;

    }

    /**
     * This Method retrieve the first operand.
     * 
     * @param str
     * @param i
     * @return
     */
    public static double operandA(String str, int i) {
	String operandA = str.substring(0, i);
	double a = Double.valueOf(operandA).doubleValue();
	return a;
    }

    /**
     * This Method retrieves the second operand.
     * 
     * @param str
     * @param i
     * @return
     */
    public static double operandB(String str, int i) {
	String operandB = str.substring(i + 1, str.length());
	double b = Double.valueOf(operandB).doubleValue();
	return b;
    }

}
