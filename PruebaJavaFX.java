import javafx.application.Application;
import javafx.stage.Stage;     
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class PruebaJavaFX extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage)
  {
    primaryStage.setTitle("Prueba JavaFX");
    
    Button boton = new Button("Saludo");
    
    Image fileImage = new Image("gatoGordo.jpg");
    ImageView imagen = new ImageView(fileImage);   
    
    boton.setOnAction(event -> {
      System.out.println("Hola");
      imagen.setImage(new Image("gatoGordo.jpg"));
    });
    
    /** 
      Forma antigua de conseguir el mismo resultado que en la línea 26    
    boton.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent event)
          {
          	System.out.println("Hola");
            imagen.setImage(new Image("1.jpg"));
        	}
        });
  	**/
    
    boton.setLayoutY(0);
    boton.setLayoutX(0);
  
    Group contenedor = new Group();
    Scene scene = new Scene(contenedor, 500, 375);
    
    contenedor.getChildren().add(imagen);    
    contenedor.getChildren().add(boton);

    primaryStage.setScene(scene); 
    primaryStage.show();
    
  }
  
}

