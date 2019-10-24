package main;

import java.util.EmptyStackException;
import java.util.Stack;

public class MoteurRPN {
	
	private Stack<Double> numbers_stack;
	public final double MAX_VALUE = 2000000;
	public final double MIN_VALUE = 0;
	
	public MoteurRPN() {
		numbers_stack = new Stack<Double>();
	}
	
	public void addOperand(double operand) throws MinIntervalException, MaxIntervalException
	{
       if(operand < MIN_VALUE) {
    	   throw new MinIntervalException(MIN_VALUE, MAX_VALUE) ;
       }
       else if (operand > MAX_VALUE){
    	   throw new MaxIntervalException(MIN_VALUE, MAX_VALUE);
       }
       numbers_stack.push(operand);
       
	}
	
	public String getOperands() {
		String operands = "La pile contient \n ";
		for (double operand : this.numbers_stack)
		{
			operands += operand + " " ;
		}
		return operands ;
	
	}
	
	public void compute(Operation op) throws MissingOperandException, MinIntervalException, MaxIntervalException
	{
		double operandA = MIN_VALUE ;
		double operandB = MIN_VALUE  ;
			if (numbers_stack.size() >= 2){
				try {
					 operandA = numbers_stack.pop();
					 operandB = numbers_stack.pop();
					System.out.println("l'operation effectuée est :("+operandA+""+op.getOperation()+""+operandB+") = "+op.eval(operandA,operandB));
					this.addOperand(op.eval(operandA, operandB));
				}catch (ArithmeticException e) {
					System.out.println("Exception: "+e.getMessage());
					if (operandA != Double.MIN_VALUE) this.addOperand(operandA);
					if (operandB != Double.MIN_VALUE) this.addOperand(operandB);
				}
				catch (EmptyStackException e) {
					System.out.println("Exception: "+e.getMessage());
				}
			} else throw new MissingOperandException() ;
			
		 
	}
	
	

}
