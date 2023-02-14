package myExeptions;

public class ExPasswordContieneSpazio extends Exception{
	public ExPasswordContieneSpazio() {
		super("la password non può contenere spazi vuoti!");
	}
}
