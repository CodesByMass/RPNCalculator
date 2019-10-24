package main;

@SuppressWarnings("serial")
public class MaxIntervalException extends Exception {

	public MaxIntervalException(int min, int max)
	{
		super(" Le nombre entré est plus grand que la borne supérieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
