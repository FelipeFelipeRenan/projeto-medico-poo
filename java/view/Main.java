package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    private static Stage stg;
    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SUSHI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        changeScene(fxml, null);
    }

    public void changeScene(String fxml, Object userData) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
        notifyALlListeners(fxml, userData);
    }

    private static ArrayList<OnChangeScreen> listeners = new ArrayList<>();

    public static void addChangeListeners(OnChangeScreen newListener){
        listeners.add( newListener);
    }

    private static void notifyALlListeners(String tela, Object user){
        for(OnChangeScreen l : listeners){
            l.onScreenChanged(tela, user);
        }

    }

    public static void main(String[] args) {
        launch();
    }
}