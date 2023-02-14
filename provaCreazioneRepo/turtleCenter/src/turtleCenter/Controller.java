package turtleCenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class Controller {
	LoginView loginView;
	LoginModel loginModel;
	RegisterView registerView;
	RegisterModel registerModel;
	LoginGenerato loginGenerato;
	DashboardView dashboardView;
	DashboardModel dashboardModel;
	PannelloCentri pannelloCentri;
	InserisciCentroView inserisciCentroView;
	InserisciCentroModel inserisciCentroModel;
	
	public Controller() {
	
	
	loginView = new LoginView(this);
	loginModel = new LoginModel();
	registerModel = new RegisterModel();
	dashboardModel = new DashboardModel();
	inserisciCentroModel = new InserisciCentroModel();
	
		
	}
	
	public void dashboardView() {
		DashboardView dashboardView = new DashboardView(this);
	}
	
	public void registerView() {
		RegisterView registerView = new RegisterView(this);
	}
	
	public void inserisciCentroView() {
		InserisciCentroView inserisciCentroView = new InserisciCentroView(this);
	}
	
	public void pannelloCentri() {
		PannelloCentri pannelloCentri = new PannelloCentri(this);
	}
}
	
