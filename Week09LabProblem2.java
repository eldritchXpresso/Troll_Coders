import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Week09LabProblem2 extends Application {
	public void start( Stage stage ) {
		Group root = new Group( );
		Scene scene = new Scene( root, 200, 200 );
		scene.setFill(Color.BLACK);

		// 2o!
		// we've gotta make a liine that 2piin2 a lot
		// probably wiith a loop
		// 2tart by drawiing one liine to te2t iif you
		// 	know how two draw a liine iin the fiir2t place

		// Line line = new Line( 100, 0, 100, 100 );
		// line.setStroke(Color.web("7FF410"));
		// line.setStrokeWidth(1);
		// root.getChildren( ).add( line );

		// 2tep one: draw a liine ii2 a 2ucce22
		// 2tep two: 2piin the liine
	
		for (double i = 0; i <= 100; i += 10) {
		
			// the red one
			// gonna 2et 2ome variiable2
			double startX = i, startY = 100, endX = 100,
		       		endY = ( 100 - i );

			// now DRAW
			Line line = new Line( startX, startY, endX, endY );
			line.setStroke(Color.RED);
			line.setStrokeWidth(1);
			root.getChildren( ).add( line );
		}

		for (double i = 0; i <= 100; i += 10) {
		
			// the yellow one
			// variiable2
			double startX = 100, startY = i, endX = ( 100 + i ),
		       		endY = 100;

			// DRAW
			Line line = new Line( startX, startY, endX, endY );
			line.setStroke(Color.YELLOW);
			line.setStrokeWidth(1);
			root.getChildren( ).add( line );
		}

		for (double i = 0; i <= 100; i += 10) {
		
			// the green one
			// variiable2
			double startX = ( 100 + i ), startY = 100, endX = 100,
		       		endY = ( 200 - i );

			// DRAW
			Line line = new Line( startX, startY, endX, endY );
			line.setStroke(Color.LIME);
			line.setStrokeWidth(1);
			root.getChildren( ).add( line );
		}

		for (double i = 0; i <= 100; i += 10) {
		
			// the blue one
			// variiable2
			double startX = i, startY = 100, endX = 100,
			       endY = ( 100 + i );

			// DRAW
			Line line = new Line( startX, startY, endX, endY );
			line.setStroke(Color.AQUA);
			line.setStrokeWidth(1);
			root.getChildren( ).add( line );
		}


		stage.setTitle( "Week09LabProblem2" );
		stage.setScene( scene );
		stage.show();
	}
}
