import java.io.IOException;


public class GrapherTest {
    public static void main( String[ ] args ) throws IOException {
    	
    	
    	int pointsinExcel = 100;
        Grapher plotter = new Grapher();
        plotter.labeler(pointsinExcel);
    }
}