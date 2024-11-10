package com.chatgpt.api;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Chatgpt14168238 {
    public static void createDialog() {
        Stage dialog = new Stage();
        dialog.initStyle(StageStyle.UTILITY);
        Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
        dialog.setScene(scene);
        dialog.show();
    }
}
