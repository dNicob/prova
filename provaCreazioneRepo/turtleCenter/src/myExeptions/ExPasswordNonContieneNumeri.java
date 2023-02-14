package myExeptions;

public class ExPasswordNonContieneNumeri extends Exception{
	public ExPasswordNonContieneNumeri() {
		super("la password deve contenere almeno un numero!");
	}
}
