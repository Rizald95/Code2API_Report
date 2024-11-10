package com.stackoverflow.api;

public class Human14168238 {

  public static void createDialog(String pTextToShow) {
    Stage dialog = new Stage();
    dialog.initStyle(StageStyle.UTILITY);
    Scene scene = new Scene(new Group(new Text(25, 25, pTextToShow)));
    dialog.setScene(scene);
    dialog.show();
  }
}
