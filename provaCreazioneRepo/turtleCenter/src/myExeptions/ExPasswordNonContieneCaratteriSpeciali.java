package myExeptions;

public class ExPasswordNonContieneCaratteriSpeciali extends Exception{
	
	public ExPasswordNonContieneCaratteriSpeciali() {
		super ("la password deve contenere almeno un carattere speciale");
	}
}
