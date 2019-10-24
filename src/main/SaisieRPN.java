package main;

import java.util.Scanner;

public class SaisieRPN {
	
	MoteurRPN moteurRPN ;
	
	public SaisieRPN()
	{
		moteurRPN = new MoteurRPN();
	}
	
	public void userInteraction() throws MissingOperandException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Veuillez entrez un Opérande ou quittez l'application avec exit ") ;
		String input = sc.nextLine();
		double new_operand;
		while (!input.equals("exit"))
		{
			try 
			{
				switch(input)
				{
		
				case "+" :
				{
					moteurRPN.compute(Operation.PLUS);
					break;
				}
				case "-" :
				{
					moteurRPN.compute(Operation.MOINS);
					break;
				}
				case "*" :
				{
					moteurRPN.compute(Operation.MULT);
					break;
				}
				case "/" :
				{
					moteurRPN.compute(Operation.DIV);
					break;
				}
				case "%" :
				{
					moteurRPN.compute(Operation.MOD);
					break;
				}
				default:
				{
					new_operand = new Double(input);
					moteurRPN.addOperand(new_operand);
					break;
				}
				}
			}
			catch(MinIntervalException | MaxIntervalException e)
			{
				System.out.println(e.getMessage());
			}
			catch(NumberFormatException e)
			{
				System.out.println("saisie incorrecte (Entrez une operande ou quitter pour quitter le programme)");
			}
			
			finally {
				System.out.println(moteurRPN.getOperands());
				input = sc.nextLine();
			}
						
		}
		sc.close();
	}


}
