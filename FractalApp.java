	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Line;
	import javafx.scene.shape.Polygon;
	import javafx.stage.Stage;
	import java.util.List;
	public class FractalApp extends Application {
		@Override
		public void start(Stage stage) {
			List<String> args = getParameters().getRaw();
			Pane pane = new Pane();
			pane.setPrefSize(800, 600);
			Scene scene = new Scene(pane, 800, 600, Color.WHITE);
			stage.setScene(scene);
			stage.setTitle("CS1131 Fractal — " + cfg.type.toUpperCase());
			stage.show();
			drawFractal(pane, args);
		}
		/**
		 * * STUDENT TASK: Implement one fractal using recursion by adding Shape
		 * nodes to 'pane'.
		 * */

		private void drawFractal(Pane pane, double x1, double y1, double x5, double y5, int depth, List<String> args) {
			// TODO: IMPLEMENT ONE of: sierpinski, kochSnowflake, tree, etc

			if(depth == 0)
			{
				Line line = new Line(x1, y1, x5, y5);
				line.setStroke(Color.BLUE);
				pane.getChildren().add(line);
			}
			else
			{
				double dx = (x5 - x1)/3;
				double dy = (y5 - y1)/3;

				double x2 = x1 + dx;
				double y2 = y1 + dy;

				double x3 = x1 + 2 * dx;
				double y3 = y1 + 2 * dy;

				double px = x2 + (Math.cos(Math.PI / 3) * (x3 - x2) - Math.sin(Math.PI / 3) * (y3 - y2));

				double py = y2 + (Math.sin(Math.PI / 3) * (x3 - x2) + Math.cos(Math.PI / 3) *(y3 - y2));

				drawFractal(pane, x1, y1, x2, y2, depth - 1);
				drawFractal(pane, x2, y2, px, py, depth - 1);
				drawFractal(pane, px, py, x3, y3, depth - 1);
				drawFractal(pane, x3, y3, x5, y5, depth - 1);
			}



		}
	}
