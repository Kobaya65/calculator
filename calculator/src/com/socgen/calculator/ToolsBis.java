package com.socgen.calculator;

/**
 * this class is an utilitary class.
 * 
 * It retrieves each element we need to calculate.
 * 
 * @author Cyril, Lea, Philippe, Steven, Vikram, Thierry
 *
 * 
 */
public class ToolsBis {

    private ToolsBis() {

    }

    /**
     * This method returns the operator.
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
     * @return
     */
    public static int operatorIndex(String str) {
	int operatorIndex = str.indexOf(operator(str));
	return operatorIndex;
    }

    /**
     * This Method retrieve the operands.
     * 
     * @modified by Philippe 20181025 19:13 ==> only one method to find both
     *           operands. It has now 3 parameters :
     * @param str      string containing the whole operation
     * @param startIdx start index of operand in the string
     * @param endIdx   end index of operand in the string
     */
    public static double operand(String str, int startIdx, int endIdx) {
	String operand = str.substring(startIdx, endIdx);
	double a = Double.valueOf(operand).doubleValue();
	return a;
    }
}
