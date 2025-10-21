import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import javafx.scene.paint.Color;
public class Week09LabProblem4 extends Application 
{	
	public void start( Stage stage ) 
	{
		Group root = new Group( );
		Scene scene = new Scene( root, 400, 300 );
		
		int minSize = 10;
                int startSize = 300;
		
		Rectangle rect = new Rectangle(50, 50, startSize, startSize);

		for(int i = startSize; i > minSize; i-=20)
                {
                        for(int j = 0; j < 50; j+=5)
                        {
                                rect = new Rectangle(50, 50, i, i);
				rect.setRotate(i);
				rect.setFill(Color.rgb(232, 44, 64));
                		rect.setStroke(Color.rgb(0, 0, 0));
                		rect.setStrokeWidth(1);
                		root.getChildren().add(rect);
                        }
                }
		
		stage.setTitle( "Week09LabProblem4" );
		stage.setScene( scene );
		stage.show();
	}
}
