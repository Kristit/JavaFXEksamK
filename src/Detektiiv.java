import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;


/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
/*
public class Detektiiv extends Application{
    @Override
    public void start (Stage primaryStage) throws Exception{

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        Random random = new Random();

        Circle circle1  = new Circle(100);
        circle1.setCenterX(random.nextInt(400+30));
        circle1.setCenterY(random.nextInt(400+30));
        circle1.setFill(Color.TRANSPARENT);


        Circle circle2  = new Circle(100);
        circle2.setCenterX(random.nextInt(400+30));
        circle2.setCenterY(random.nextInt(400+30));
        circle2.setFill(Color.TRANSPARENT);


        Circle circle3  = new Circle(100);
        circle3.setCenterX(random.nextInt(400+30));
        circle3.setCenterY(random.nextInt(300+30));
        circle3.setFill(Color.TRANSPARENT);

        circle1.setOnMouseEntered(event -> {
            circle1.setFill(Color.BLUE);
        });

        circle2.setOnMouseEntered(event->{
            circle2.setFill(Color.RED);
        });

        circle3.setOnMouseEntered(event->{
            circle3.setFill(Color.YELLOW);
        });

        pane.getChildren().addAll(circle1, circle2, circle3);
    }
}
*/