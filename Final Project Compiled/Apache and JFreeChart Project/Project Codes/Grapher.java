//Using a combination of tutorial and sample codes of demo; implemented the Graphing Part of the project
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
//Utilizing jfreechart library to graph 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;


public class Grapher {
	Smoother plot = new Smoother();
	String titleA = "Salted Y Points";
	String titleO = "Smoothed Y Points";
	
	 public class Graph extends ApplicationFrame {	
		 	
	 Graph( String applicationTitle , String title, int x) throws IOException {
	 super(applicationTitle);
	JFreeChart lineChart = ChartFactory.createLineChart(title,"X axis","Y axis",createDataset(x),PlotOrientation.VERTICAL,true,true,false);
	   
	ChartPanel chartPanel = new ChartPanel(lineChart);
	chartPanel.setSize(new java.awt.Dimension(600,500));
	lineChart.getPlot().setBackgroundPaint(Color.white);
	setContentPane(chartPanel);
	}
	
	
	public DefaultCategoryDataset createDataset(int x) throws IOException {
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	ArrayList<Double> yValue = plot.csvImporter();
	for(int i = 0; i < yValue.size()-1; i++) {
		dataset.addValue(yValue.get(i), titleA,"" + i);
	}
	
	double[] smoothYPoints = plot.ySmoother(x);
	for(int i = 0; i < smoothYPoints.length-1; i++) {
		dataset.addValue(smoothYPoints[i], titleO,"" + i);
		if(i+x < smoothYPoints.length) {
			x--;
		}
	}	
	return dataset;
  }
	
}
	public void labeler(int x) throws IOException {
		Graph graph = new Graph("Salter and Smoother" , "Salted and Smoothed (Y = mx + b)", x);
		
		graph.setVisible( true);
		graph.pack( );
		RefineryUtilities.centerFrameOnScreen(graph);
	}	
}
	

