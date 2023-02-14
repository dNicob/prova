package myExeptions;

public class ExPasswordDiConferma extends Exception{
	public ExPasswordDiConferma() {
		super("Le due password non corrispondono");
	}
}
