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
		System.out.println(" Veuillez entrez un Opérande | exit pour quitter | restart pour vider la pile ") ;
		String input = sc.nextLine();
		double new_operand;
		if (input == "restart")
		{
			
		}
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
				case "restart" :
				{
					moteurRPN.get_stack().clear();
					System.out.println(" La pile est vidée ");
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
			//Si on écrit un caractère spécial par exemple
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
