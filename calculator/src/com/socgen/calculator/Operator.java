package com.socgen.calculator;

/**
 * enum : each name of arithmetic operator. ( +, -, /, % and *)
 * 
 * @author Cyril, Lea, Philippe, Steven, Vikram, Thierry
 *
 */
public enum Operator {
    ADD() {
	@Override
	public double operation(double a, double b) {

	    return a + b;
	}
    },
    SUBSTRACT() {
	@Override
	public double operation(double a, double b) {

	    return a - b;
	}
    },
    MULTIPLY() {
	@Override
	public double operation(double a, double b) {

	    return a * b;
	}
    },
    DIVIDE() {
	@Override
	public double operation(double a, double b) {

	    return a / b;
	}
    },
    MODULO() {
	@Override
	public double operation(double a, double b) {

	    return a % b;
	}
    };

    /**
     * This abstract method will assign an operations to each arithmetic operator.
     * 
     * @param a = double a
     * @param b = double b
     * @return = return the operation
     */
    public abstract double operation(double a, double b);

}