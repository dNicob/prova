package myExeptions;

public class ExPasswordNonContieneMaiuscole  extends Exception{
	
	public ExPasswordNonContieneMaiuscole() {
		super ("la password deve contenere almeno una lettera maiuscola");
	}
}
