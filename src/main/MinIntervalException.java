package main;

@SuppressWarnings("serial")
public class MinIntervalException extends Exception {
	
	public MinIntervalException(int min, int max)
	{
		super(" Le nombre entr� est plus petit que la borne inf�rieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
