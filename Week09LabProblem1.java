import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Week09LabProblem1 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        Scene scene = new Scene( root, 400, 300 ); 

        Circle circle = new Circle(100,100,20,Color.RED);
	Circle circle2 = new Circle(300,100,20,Color.RED);
	Circle circ = new Circle(100,100,30,Color.BLACK);
        Circle circ2 = new Circle(300,100,30,Color.BLACK);
	Rectangle r = new Rectangle(75,200,250,20);
	r.setFill(Color.RED);
	Rectangle r2 = new Rectangle(75,40,60,10);
	r2.setRotate(45);
	Rectangle r3 = new Rectangle(265,40,60,10);
	r3.setRotate(315);

	root.getChildren().add(r);
	root.getChildren().add(r2);
	root.getChildren().add(r3);
	root.getChildren().add(circ);
	root.getChildren().add(circ2);
	root.getChildren().add(circle);
        root.getChildren().add(circle2);
        stage.setTitle( "Week09LabProblem1" );
        stage.setScene( scene );
        stage.show();
    }
}
