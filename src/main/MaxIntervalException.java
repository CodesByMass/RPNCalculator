package main;

@SuppressWarnings("serial")
public class MaxIntervalException extends Exception {

	public MaxIntervalException(double min, double max)
	{
		super(" Le nombre entr� est plus grand que la borne sup�rieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
