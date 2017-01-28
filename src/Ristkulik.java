package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */

public class Ristkulik extends Application {
    @Override
    public void start (Stage primaryStage ) throws Exception {


        VBox vbox = new VBox();
        Pane ristkulikKast= new Pane();
        vbox.setSpacing(5);
        Scene scene= new Scene(vbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        TextField text1= new TextField();
        text1.setPromptText("Ristkuliku alguskordinaat x= ");
        TextField text2= new TextField();
        text2.setPromptText("Ristkuliku lopukordinaat y= ");
        TextField text3= new TextField();
        text3.setPromptText("Ristkuliku korgus x= ");
        TextField text4= new TextField();
        text4.setPromptText("Ristkuliku laius y= ");


        Button btn= new Button();
        btn.setText("Salvesta");

        vbox.getChildren().addAll(text1,text2,text3,text4, btn);



        btn.setOnAction(event -> {

            String xKordinaat = text1.getText();
            int x = Integer.parseInt(xKordinaat);
            String yKordinaat = text2.getText();
            int y = Integer.parseInt(yKordinaat);
            String korgus = text3.getText();
            int k = Integer.parseInt(korgus);
            String pikkus = text4.getText();
            int p = Integer.parseInt(pikkus);
            System.out.println(x);
            System.out.println(y);
            System.out.println(k);
            System.out.println(p);

            Rectangle ristk = new Rectangle();
            ristk.setX(x);
            ristk.setY(y);
            ristk.setHeight(k);
            ristk.setWidth(p);
            ristk.setFill(Paint.valueOf("#FF0000"));

            ristkulikKast.getChildren().add(ristk);
            vbox.getChildren().add(ristkulikKast);
        });




    }

}

