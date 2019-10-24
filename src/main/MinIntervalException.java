package main;

@SuppressWarnings("serial")
public class MinIntervalException extends Exception {
	
	public MinIntervalException(double min, double max)
	{
		super(" Le nombre entré est plus petit que la borne inférieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
