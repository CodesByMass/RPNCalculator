package main;

@SuppressWarnings("serial")
public class MinIntervalException extends Exception {
	
	public MinIntervalException(int min, int max)
	{
		super(" Le nombre entré est plus petit que la borne inférieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
