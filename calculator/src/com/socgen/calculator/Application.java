package com.socgen.calculator;

public class Application {

    public static void main(String[] args) {
	String str = args[0];
	char operator = Tools.operator(str);
	int operatorIndex = Tools.operatorIndex(str, operator);

	double a = Tools.operandA(str, operatorIndex);
	double b = Tools.operandB(str, operatorIndex);

	Tools.operatorIndex(str, Tools.operator(str));

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
