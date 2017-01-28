

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */

/*
public class PixelChaser extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


        ArrayList<Rectangle> list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            Rectangle ristk = new Rectangle();
            ristk.setX(0);
            ristk.setY(0);
            ristk.setHeight(80);
            ristk.setWidth(50);
            ristk.setTranslateX(Math.random() * 400);//liigutab ringi allapoole
            ristk.setTranslateY(Math.random() * 400);

            pane.getChildren().addAll(ristk);

            ristk.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2) {
                    ristk.setVisible(false);

                } else {
                    ristk.setScaleX(0.5);
                    ristk.setScaleY(0.5);
                }

            });

        }

    }

*/