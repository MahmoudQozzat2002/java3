/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahmoud;

import static java.lang.Math.log;
import java.lang.reflect.InvocationTargetException;
import static java.rmi.server.LogStream.log;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 *
 * @author jit
 */
public class Mahmoud extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader l = new FXMLLoader(getClass().getResource("CommentDector.fxml"));
        Parent p = l.load();
        Scene s  = new Scene(p);
        primaryStage.setScene(s);
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
