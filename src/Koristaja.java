

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */


public class Koristaja extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception{

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        Label sonum= new Label("Sa pead paremini koristama!\n Veel on musti täppe!");
        sonum.setTranslateX(100);
        sonum.setTranslateY(250);
        sonum.setScaleX(2);
        sonum.setScaleY(2);
        sonum.setRotate(10);
        pane.getChildren().add(sonum);


        for (int i = 0; i < 200; i++) {
            Circle circle= new Circle(Math.random()*300);
            circle.setTranslateX(Math.random()*500);//liigutab ringi allapoole
            circle.setTranslateY(Math.random()*500);//liigutab ringi kuljele


           circle.setOnMouseEntered(event -> {
                circle.setVisible(false);
            });

        pane.getChildren().addAll(circle);
        }



    }
}

