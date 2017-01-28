package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */

    public class Tagaajamine  extends Application {
        @Override
        public void start (Stage primaryStage) throws Exception{

            Pane pane = new Pane();
            Scene scene = new Scene(pane, 500, 500);
            Stage stage= new Stage();
            stage.setScene(scene);
            stage.show();

            Random random = new Random();

            Circle circle1  = new Circle(50);
            circle1.setCenterX(random.nextInt(400+30));
            circle1.setCenterY(random.nextInt(400+30));
            circle1.setFill(Paint.valueOf("#0000FF"));


            circle1.setOnMouseEntered(event->{
                circle1.setCenterX(random.nextInt(400+30));
                circle1.setCenterY(random.nextInt(400+30));

            });


            pane.getChildren().addAll(circle1);

        }
    }


