/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomiscontroles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import MisControles.MiControl;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Carlos
 */
public class UsandoMisControles extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MiControl mcontrol = new MiControl();
        Label text = new Label();
        
        BorderPane root = new BorderPane();
        root.setCenter(mcontrol);
        root.setBottom(text);
        mcontrol.setMaxHeight(100);
        mcontrol.setMaxWidth(100);
        mcontrol.setOnAction(e->{
            text.setText("Estoy pulsando mi control");
        });
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Usando Mi Control");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
