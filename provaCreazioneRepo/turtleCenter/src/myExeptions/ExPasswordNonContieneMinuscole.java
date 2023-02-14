package myExeptions;

public class ExPasswordNonContieneMinuscole extends Exception{
	
	public ExPasswordNonContieneMinuscole() {
		super ("la password deve contenere almeno una lettera minuscola");
	}
}
