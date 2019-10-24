package main;

import java.util.EmptyStackException;
import java.util.Stack;

public class MoteurRPN {
	
	private Stack<Double> numbers_stack;
	public final double MAX_VALUE = 2000000;
	public final double MIN_VALUE = 0;
	
	// Création de la pile
	public MoteurRPN() {
		numbers_stack = new Stack<Double>();
	}
	
	//get de la pile
	public Stack<Double> get_stack ()
	{
		return numbers_stack ;
	}
	// Ajouter l'opérande à la pile
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
	
	// Lecture de la pile
	public String getOperands() {
		String operands = "La pile contient \n ";
		for (double operand : this.numbers_stack)
		{
			operands += operand + " " ;
		}
		return operands ;
	
	}
	
	// Calculer suite à la saisie d'un opérateur
	public void compute(Operation op) throws MissingOperandException, MinIntervalException, MaxIntervalException
	{
		double operandA = MIN_VALUE ;
		double operandB = MIN_VALUE  ;
			if (numbers_stack.size() >= 2){
				try {
					 operandA = numbers_stack.pop();
					 operandB = numbers_stack.pop();
					 System.out.println("l'operation effectuée est :("+operandB+""+op.getOperation()+""+operandA+") = "+op.eval(operandA,operandB));
					this.addOperand(op.eval(operandB, operandA));
				}catch (ArithmeticException | MinIntervalException | MaxIntervalException e)  {
					System.out.println("Exception: "+e.getMessage());
					if (operandA != Double.MIN_VALUE) this.addOperand(operandB);
					if (operandB != Double.MIN_VALUE) this.addOperand(operandA);
				}
				catch (EmptyStackException e) {
					System.out.println("Exception: "+e.getMessage());
				}
			} else throw new MissingOperandException() ;
		 
	}
	
	

}
