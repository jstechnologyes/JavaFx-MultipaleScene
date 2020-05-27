
package multiplescene;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleScene extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        VBox vbox= new VBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        
        Button btn1=new Button("Click me");
        Label lbl1=new Label("This is scene 1");
        
        vbox.getChildren().addAll(lbl1,btn1);
        
        
        //This is for secne 1
        
        VBox vbox1= new VBox();
        vbox1.setMinHeight(300);
        vbox1.setMinWidth(500);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(20);
        
        Button btn2=new Button("Click me");
        Label lbl2=new Label("This is Second scene");
        vbox1.getChildren().addAll(lbl2,btn2);
         
        
        
        
        
        
        Scene scene=new Scene(vbox);
        Scene scene1=new Scene(vbox1);
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
                primaryStage.show();
            }
        });
        
        //This is for button 2
          btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
    }
    
}
