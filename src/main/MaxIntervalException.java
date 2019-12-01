package main;

@SuppressWarnings("serial")
public class MaxIntervalException extends Exception {

	public MaxIntervalException(int min, int max)
	{
		super(" Le nombre entr� est plus grand que la borne sup�rieure de l'intervalle ["+min+", "+max+"]") ;
	}

}
