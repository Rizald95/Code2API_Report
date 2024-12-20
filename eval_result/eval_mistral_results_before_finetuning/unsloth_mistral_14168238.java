Title: How to create a JavaFX dialog?
Question: 
                
I need to create a dialog in JavaFX. I know that I can make the Stage behave like a dialog by modifying modal, owner and resizable properties. 

But how do I hide the "minimize" and "maximize" buttons from the Stage window? Typical dialogs only have the "close" button.
    
Answer: 
Under Windows 7, initializing to StageStyle.UTILITY before you show the window will create a window with only a close button and no minimize or maximize button:

Stage dialog = new Stage();
dialog.initStyle(StageStyle.UTILITY);
Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
dialog.setScene(scene);
dialog.show();


If you would like a complete set of basic JavaFX dialogs I would recommend the JavaFX UI sandbox dialogs.  

The JavaFX UI Sandbox was not created by me and is not hosted on my site (source is hosted by Oracle).  I requested Oracle to document the sandbox dialog API.  If you like, you may vote for or comment on the request.  

Makery's blog has some minimal 3rd party documentation of the sandbox dialogs, including basic usage examples as well as a backport of the dialog portion to JavaFX 2.2.

Update

The JavaFX UI Sandbox has been superseded by the ControlsFX project.

Update

Java 8u40 will include JavaFX dialogs built into the core platform APIs.  You can try an early access release of Java8u40.  The relevant class is javafx.scene.control.Dialog and it's related subclasses such as javafx.scene.control.Alert (the Alert class is for showing standard dialogs which are similar to Swing's JOptionPane class - so you don't need to use JOptionPane to get out of the box standard dialog functionality).  

Makery wrote a new blog tutorial for dialog functionality provided in Java 8u40.

Related Questions


How to create and show common dialog (Error, Warning, Confirmation) in JavaFX 2.2?

How to create a JavaFX dialog with a custom title bar?

How to create a JavaFX dialog with a custom content pane?

How to create a JavaFX dialog with a custom close button?

How to create a JavaFX dialog with a custom close button and a custom title bar?

How to create a JavaFX dialog with a custom close button and a custom title bar and a custom content pane?

How to create a JavaFX dialog with a custom close button, a custom title bar, a custom content pane, and a custom resize behavior?

How to create a JavaFX dialog with a custom close button, a custom title bar, a