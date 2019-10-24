package main;

public enum Operation {
	
	// Double bien plus précis qu'un float
	PLUS('+') {
		public double eval(double operand_a, double operand_b)
		{
			return operand_a + operand_b;
		}
	},
	MOINS('-')
	{
		
		public double eval(double operand_a, double operand_b)
		{
			return operand_a - operand_b;
		}
	},
	MULT('*') {
		public double eval(double operand_a, double operand_b)
		{
			return operand_a * operand_b;
		}
	},
	DIV('/') {
		public double eval(double operand_a, double operand_b) throws ArithmeticException
		{
			if (operand_b == 0)
			{
				throw new ArithmeticException("Division par 0 impossible !") ;
			} else
			return operand_a / operand_b;
		}
	},
	MOD('%') {
		public double eval(double operand_a, double operand_b)
		{
			if (operand_b == 0)
			{
				throw new ArithmeticException("Division par 0 impossible !") ;
			}
			return operand_a % operand_b;
		}
	};
	
	private char symbole ;
	
	Operation(char symbole)
	{
		this.symbole = symbole;
	}
	
	public abstract double eval(double operande_1, double operande_2);
	
	public char getOperation()
	{
		return symbole;
	}

}
