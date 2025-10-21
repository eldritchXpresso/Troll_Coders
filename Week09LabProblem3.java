import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Week09LabProblem3 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        stage.setTitle( "Week09LabProblem3");
	Scene scene = new Scene( root, 400, 300);
	for(int i = 0; i < Triangles; i++) {
		root.getChildren().add(randomTriangle());
	}
	stage.setScene(scene);
	stage.show();
    }
 
        private static final double Scene_Width = 400;
	private static final double Scene_Length = 300;
	private static final double Triangles = 25;
	private final Random random = new Random();


	private Polygon randomTriangle() {
		double x1 = random.nextDouble() * Scene_Width;
		double y1 = random.nextDouble() * Scene_Length;
		double x2 = random.nextDouble() * Scene_Width;
		double y2 = random.nextDouble() * Scene_Length;
		double x3 = random.nextDouble() * Scene_Width;
		double y3 = random.nextDouble() * Scene_Length;
	

	 Polygon Triangle = new Polygon(
		x1,y1,
		x2,y2,
		x3,y3
		);

	Color FillColor = Color.rgb(
		random.nextInt(256),
		random.nextInt(256),
		random.nextInt(256)
		);

	Triangle.setFill(FillColor);

	Color StrokeColor = Color.rgb(
			random.nextInt(256),
			random.nextInt(256),
			random.nextInt(256)
			);
	Triangle.setStroke(StrokeColor);
	double strokeWidth = random.nextDouble() * 9.0 + 1.0;

	Triangle.setStrokeWidth(strokeWidth);
	double opacity = random.nextDouble() * .9 + .1;

	Triangle.setOpacity(opacity);
	 return Triangle;
	}
    }

