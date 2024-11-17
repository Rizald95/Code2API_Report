Title: How to clear JTextField when mouse clicks the JTextField
Question: 
                
I need to make this program clear the text from the text field when the mouse clicks in that text field. I have tried a few things, but none of them have yet to work for me.

Here is the code in its entirety:

public class TimerClassPanel extends JFrame implements MouseListener{

    public TimerClassPanel(){
        setTitle("Timer Class");
        setSize(WIDTH, HEIGHT);

        timer = new Timer(DELAY, new TimerEventHandler());

        pane = getContentPane();
        pane.setLayout(null);

        int r = (int)(9.0 * Math.random()) + 1;
        String str2 = Integer.toString(r);

        label = new JLabel(str2, SwingConstants.CENTER);
        label.setSize(150,30);
        label.setLocation(0,0);

        textField = new JTextField();
        textField.setSize(150,30);
        textField.setLocation(150,0);

        startB = new JButton("Start");
        startbh = new StartButtonHandler();
        startB.addActionListener(startbh);
        startB.setSize(100,30);
        startB.setLocation(0,30);

        stopB = new JButton("Stop");
        stopbh = new StopButtonHandler();
        stopB.addActionListener(stopbh);
        stopB.setSize(100,30);
        stopB.setLocation(100,30);

        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        exitB.setSize(100,30);
        exitB.setLocation(200,30);      

        pane.add(label);

        pane.add(textField);
        pane.add(startB);
        pane.add(stopB);
        pane.add(exitB);

        timer.start();

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){
        System.out.println("You clicked the mouse");
    }

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mousePressed(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public static void main(String[] args){
        TimerClassPanel t = new TimerClassPanel();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE