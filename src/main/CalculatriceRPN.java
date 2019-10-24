package main;

public enum CalculatriceRPN {
	
		CALCULATRICE(new SaisieRPN());
			
			private SaisieRPN saisierpn;
			
			CalculatriceRPN( SaisieRPN saisie)
			{
				 saisierpn= saisie ;
			}
			public void traitement() throws MissingOperandException {
			
				saisierpn.userInteraction();
			}
			
			public static void main(String[] args) throws MissingOperandException {
				
				CalculatriceRPN.CALCULATRICE.traitement();
			}

		}


