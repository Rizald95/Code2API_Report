
Under Windows 7, initializing to StageStyle.UTILITY before you show the window will create a window with only a close button and no minimize or maximize button:

Stage dialog = new Stage();
dialog.initStyle(StageStyle.UTILITY);
Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
dialog.setScene(scene);
dialog.show();


