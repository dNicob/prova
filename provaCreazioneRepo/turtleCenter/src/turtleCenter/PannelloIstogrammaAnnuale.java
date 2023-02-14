package turtleCenter;

import java.awt.Dimension;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class PannelloIstogrammaAnnuale extends JPanel{

    public PannelloIstogrammaAnnuale(String titolo, int valori2018, int valori2019, int valori2020, int valori2021, int valori2022, int valori2023) {
        
    	//this.setLayout(null);
    	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Aggiungi i dati al dataset
    	dataset.addValue(valori2018, "Serie 1", "2018");
        dataset.addValue(valori2019, "Serie 1", "2019");
        dataset.addValue(valori2020, "Serie 1", "2020");
        dataset.addValue(valori2021, "Serie 1", "2021");
        dataset.addValue(valori2022, "Serie 1", "2022");
        dataset.addValue(valori2023, "Serie 1", "2023");
        
        /* 
        dataset.addValue(valoriMaggio, "Serie 1", "Maggio");
        dataset.addValue(valoriGiugno, "Serie 1", "Giugno");
        dataset.addValue(valoriLuglio, "Serie 1", "Luglio");
        dataset.addValue(valoriAgosto, "Serie 1", "Agosto");
        dataset.addValue(valoriSettembre, "Serie 1", "Settembre");
        dataset.addValue(valoriOttobre, "Serie 1", "Ottobre");
        dataset.addValue(valoriNovembre, "Serie 1", "Novembre");
        dataset.addValue(valoriDicembre, "Serie 1", "Dicembre");
        */
        
        
        //Crea un istogramma
        JFreeChart chart = ChartFactory.createBarChart3D(titolo, "Anno", "Valore", dataset, PlotOrientation.VERTICAL, false, false, false);
        
      
        ChartPanel chartPanel = new ChartPanel(chart);
        this.add(chartPanel);
    }
    
    
    
   
}
