

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
/*
public class Joon extends Application {
    @Override
    public void start (Stage primaryStage ) throws Exception {


        //Stage stage= new Stage();
        VBox vbox = new VBox();
        Pane joonekast = new Pane();
        vbox.setSpacing(5);
        Scene scene= new Scene(vbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


        TextField text1= new TextField();
        text1.setPromptText("Joone algus kordinaat x= ");

        TextField text2= new TextField();
        text2.setPromptText("Joone lopp kordinaat y= ");



        Button btn= new Button();

        vbox.getChildren().addAll(text1,text2, btn);
        btn.setText("Salvesta");


        btn.setOnAction(event -> {
                text1.setPromptText("Joone algus kordinaat x= ");
                String xKordinaat = text1.getText();
                int x = Integer.parseInt(xKordinaat);
                String yKordinaat = text2.getText();
                int y = Integer.parseInt(yKordinaat);
            System.out.println(x);
            System.out.println(y);

            Line line = new Line();
            line.setStartX(x);
            line.setStartY(x);
            line.setEndX(y);
            line.setEndY(y);
            joonekast.getChildren().add(line);
            vbox.getChildren().add(joonekast);
                });




    }

    }

*/

