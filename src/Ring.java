import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
/*
public class Ring extends Application {
    @Override
    public void start (Stage primaryStage ) throws Exception {



        VBox vbox = new VBox();
        Pane ringikast= new Pane();
        vbox.setSpacing(5);
        Scene scene= new Scene(vbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


        TextField text1= new TextField();
        text1.setPromptText("Ringi kordinaat x= ");

        TextField text2= new TextField();
        text2.setPromptText("Ringi kordinaat y= ");



        Button btn= new Button();

        vbox.getChildren().addAll(text1,text2, btn);
        btn.setText("Salvesta");


        btn.setOnAction(event -> {

            String xKordinaat = text1.getText();
            int x = Integer.parseInt(xKordinaat);
            String yKordinaat = text2.getText();
            int y = Integer.parseInt(yKordinaat);
            System.out.println(x);
            System.out.println(y);

            Circle circle = new Circle(45);
            circle.setCenterX(x);
            circle.setCenterY(y);
            circle.setFill(Paint.valueOf("#FF0000"));

            ringikast.getChildren().add(circle);
            vbox.getChildren().add(ringikast);
        });




    }

}


*/