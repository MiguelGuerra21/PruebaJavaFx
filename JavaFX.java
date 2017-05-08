import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.image.*;

public class JavaFX extends Application{

    public static void main(String[] args){
        launch(args);
    }

    public void start( Stage primaryStage ){
        Group root = new Group();
        Scene scene = new Scene( root, 300, 300 );
        primaryStage.setTitle("JavaFx");
        primaryStage.setScene( scene );
        Button boton = new Button("Saludar");
        Image imagen = new Image("gatoGordo.jpg");
        ImageView iv2 = new ImageView();
        iv2.setImage(imagen);
        boton.setDefaultButton(true);
        boton.setPrefSize(100, 50);
        boton.setLayoutX(10);
        boton.setLayoutY(10);
        boton.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    System.out.println("Hola");
                }
            });
        root.getChildren().add(boton);
        root.getChildren().add(iv2);
        primaryStage.show();
    }
}
