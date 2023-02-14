package myExeptions;

public class ExPasswordDimensioniErrate extends Exception{
	public ExPasswordDimensioniErrate() {
		super("La password deve avere un numero di caratteri compreso tra 8 e 15");
	}
}
