package main;

@SuppressWarnings("serial")
public class MaxIntervalException extends Exception {

	public MaxIntervalException(double min, double max)
	{
		super(" Le nombre est supérieur à la borne supérieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
