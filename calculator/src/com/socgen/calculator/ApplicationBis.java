package com.socgen.calculator;
/*
 * @modified by Philippe 20181025 19:13
 * only one operand method rather than operandA and operandB 
 * 
 */

public class ApplicationBis {

    public static void main(String[] args) {
	// store argument in a string
	String str = args[0];
	// store operator in a char
	char operator = ToolsBis.operator(str);
	// retrieve index of the operator
	int operatorIndex = ToolsBis.operatorIndex(str);

	// retrieve and store first operand
	double a = ToolsBis.operand(str, 0, operatorIndex);
	// retrieve and store second operand
	double b = ToolsBis.operand(str, operatorIndex + 1, str.length());

	// we need an ifelse statement to choose between each enum
	if (operator == '+') {
	    System.out.println(str + " = " + Operator.ADD.operation(a, b));
	} else if (operator == '-') {
	    System.out.println(str + " = " + Operator.SUBSTRACT.operation(a, b));
	} else if (operator == '*') {
	    System.out.println(str + " = " + Operator.MULTIPLY.operation(a, b));
	} else if (operator == '/') {
	    System.out.println(str + " = " + Operator.DIVIDE.operation(a, b));
	} else {
	    System.out.println(str + " = " + Operator.MODULO.operation(a, b));
	}
    }
}
