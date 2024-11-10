
public class Setup extends JFrame implements Runnable{
     JPanel panel;
     JFrame window;
     public Setup(Starter start, JFrame window){
         window.setSize(600,500);
         window.setLocationRelativeTo(null);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setResizable(false);
         panel = new Display(start);
         this.window = window;
     }
     public void run(){
         window.getContentPane().add(panel);
         window.setBackground(Color.BLACK);
         window.setVisible(true);
     }
}




    import java.awt.BorderLayout;
    import java.awt.FlowLayout;
    import java.awt.Frame;
    import java.awt.GridLayout;
    import java.awt.Insets;
    import java.awt.Panel;
    import java.awt.event.WindowAdapter;
    import java.awt.event.WindowEvent;
    
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.