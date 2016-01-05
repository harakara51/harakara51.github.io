package examples;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Notepad2 extends JFrame {
    private JButton closeButton;

    public Notepad2() {
        super("Notepad");
        addComponents();
        setSize(300, 400);
        setVisible(true);
    }

    private void addComponents() {
        
        
       
        closeButton = new JButton("Close");
        closeButton.setSize(30, 30);
        this.add(closeButton);
    }

    public static void main(String[] arg) {
        new Notepad2();
    }
}
