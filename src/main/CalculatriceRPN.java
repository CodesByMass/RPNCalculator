package main;

public enum CalculatriceRPN {
	
		CALCULATRICE(new SaisieRPN());
			
			private SaisieRPN inputRPN ;
			
			CalculatriceRPN( SaisieRPN input)
			{
				 inputRPN = input ;
			}
			public void launch() throws MissingOperandException {
			
				inputRPN.userInteraction();
			}
			
			public static void main(String[] args) throws MissingOperandException  {
				
				CalculatriceRPN.CALCULATRICE.launch();
			}

		}


