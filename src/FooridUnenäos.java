

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenäos extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {


        Pane pane= new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        Circle circle1 = new Circle(30);
        circle1.setCenterX(400);
        circle1.setCenterY(400);
        circle1.setFill(Paint.valueOf("#FF0000"));

        Circle circle2 = new Circle(50);
        circle2.setCenterX(70);
        circle2.setCenterY(250);
        circle2.setFill(Paint.valueOf("#FF0000"));

        Circle circle3 = new Circle(40);
        circle3.setCenterX(200);
        circle3.setCenterY(150);
        circle3.setFill(Paint.valueOf("#FF0000"));

        Circle circle4 = new Circle(20);
        circle4.setCenterX(300);
        circle4.setCenterY(350);
        circle4.setFill(Paint.valueOf("#FF0000"));

        Circle circle5 = new Circle();
        circle5.setRadius(40);
        circle5.setCenterX(440);
        circle5.setCenterY(320);
        circle5.setFill(Paint.valueOf("#FF0000"));

        circle1.setOnMouseEntered(event->{

            circle1.setFill(Paint.valueOf("#228B22"));
        });

        circle2.setOnMouseEntered(event->{

            circle2.setFill(Paint.valueOf("#228B22"));
        });

        circle3.setOnMouseEntered(event->{

            circle3.setFill(Paint.valueOf("#228B22"));
        });

        circle4.setOnMouseEntered(event->{

            circle4.setFill(Paint.valueOf("#228B22"));
        });

        circle5.setOnMouseEntered(event->{

            circle5.setFill(Paint.valueOf("#228B22"));
        });




        pane.getChildren().addAll(circle1,circle2,circle3,circle4,circle5);

    }
    }
