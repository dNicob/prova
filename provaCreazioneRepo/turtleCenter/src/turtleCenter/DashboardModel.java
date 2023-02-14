package turtleCenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class DashboardModel {
	
	private Controller controller;
	
	public DashboardModel(Controller contr) {
		controller = contr;
		controller.dashboardView.addListenerForBottoneVisualizaNumeroTartarugheAccolte(new ActionListenerForTartarugheAccolte());
		controller.dashboardView.addListenerForBottoneVisualizaNumeroTartarugheRilasciate(new ActionListenerForTartarugheRilasciate());
		controller.dashboardView.addListenerForBottoneVisualizaNumeroTartarugheMorte(new ActionListenerForTartarugheMorte());
		controller.dashboardView.addListenerForBottoneCentri(new ActionListenerForBottoneCentri());
		controller.dashboardView.addListenrForBottoneDashBoard(new ActionListenerForBottoneDashBoard());
	}


	public PannelloIstogrammaAnnuale creaPannelloIstogramma(String titolo, int valori2018, int valori2019, int valori2020, int valori2021, int valori2022, int valori2023) {
		return new PannelloIstogrammaAnnuale(titolo, valori2018, valori2019, valori2020, valori2021, valori2022, valori2023);
	}
	
	
	class ActionListenerForTartarugheAccolte implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int valori2018 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheAccolte(2018);
				int valori2019 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheAccolte(2019);
				int valori2020 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheAccolte(2020);
				int valori2021 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheAccolte(2021);
				int valori2022 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheAccolte(2022);
				int valori2023 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheAccolte(2023);
				PannelloIstogrammaAnnuale pnl = creaPannelloIstogramma("Tartarughe Accolte", valori2018, valori2019, valori2020, valori2021, valori2022, valori2023);
				controller.dashboardView.getBoxPanelForGrafico().removeAll();
				controller.dashboardView.getBoxPanelForGrafico().add(pnl);
				controller.dashboardView.getBoxPanelForGrafico().updateUI();
				controller.dashboardView.getBoxPanelForGrafico().setVisible(true);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	
	
	
	class ActionListenerForTartarugheRilasciate implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int valori2018 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheRilasciate(2018);
				int valori2019 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheRilasciate(2019);
				int valori2020 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheRilasciate(2020);
				int valori2021 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheRilasciate(2021);
				int valori2022 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheRilasciate(2022);
				int valori2023 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheRilasciate(2023);
				PannelloIstogrammaAnnuale pnl = controller.dashboardModel.creaPannelloIstogramma("Tartarughe Rilasciate", valori2018, valori2019, valori2020, valori2021, valori2022, valori2023);
				controller.dashboardView.getBoxPanelForGrafico().removeAll();
				controller.dashboardView.getBoxPanelForGrafico().add(pnl);
				controller.dashboardView.getBoxPanelForGrafico().updateUI();
				controller.dashboardView.getBoxPanelForGrafico().setVisible(true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	
	
	class ActionListenerForTartarugheMorte implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int valori2018 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheMorte(2018);
				int valori2019 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheMorte(2019);
				int valori2020 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheMorte(2020);
				int valori2021 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheMorte(2021);
				int valori2022 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheMorte(2022);
				int valori2023 = EsecutoreFunzioniDBMS.eseguiFunzioneTartarugheMorte(2023);
				PannelloIstogrammaAnnuale pnl = controller.dashboardModel.creaPannelloIstogramma("Tartarughe Morte", valori2018, valori2019, valori2020, valori2021, valori2022, valori2023);
				controller.dashboardView.getBoxPanelForGrafico().removeAll();
				controller.dashboardView.getBoxPanelForGrafico().add(pnl);
				controller.dashboardView.getBoxPanelForGrafico().updateUI();
				controller.dashboardView.getBoxPanelForGrafico().setVisible(true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	
	
	class ActionListenerForBottoneCentri implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			controller.dashboardView.getBoxPanelForGrafico().setVisible(false);
			controller.dashboardView.getPannelloSuperioreDash().setVisible(false);
			controller.dashboardView.getPannelloSuperioreCentri().setVisible(true);
			controller.dashboardView.getPannelloCentri().setVisible(true);
			
			
		}
		
	}
	
	
	class ActionListenerForBottoneDashBoard implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			controller.dashboardView.getPannelloCentri().setVisible(false);
			controller.dashboardView.getPannelloSuperioreCentri().setVisible(false);
			controller.dashboardView.getPannelloSuperioreDash().setVisible(true);
			controller.dashboardView.getBoxPanelForGrafico().setVisible(true);
			
		}
		
	}
	

	
}
