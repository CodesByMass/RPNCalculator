package main;

public enum CalculatriceRPN {
	
		CALCULATRICE(new SaisieRPN());
			
			private SaisieRPN inputRPN ;
			
			CalculatriceRPN( SaisieRPN input)
			{
				 System.out.println(" Bienvenue sur la Reverse Polish Notation Calculatrice ");
				 inputRPN = input ;
			}
			public void launch() throws MissingOperandException {
			
				inputRPN.userInteraction();
			}
			
			public static void main(String[] args) throws MissingOperandException  {
				
				CalculatriceRPN.CALCULATRICE.launch();
			}

		}


