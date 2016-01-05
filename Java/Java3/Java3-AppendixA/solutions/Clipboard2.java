package solutions;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Clipboard2 extends JFrame {
    private JButton copyButton;
    private JButton cutButton;
    private JButton pasteButton;
    private JTextArea clipTextArea;

    public Clipboard2() {
        super("Clipboard2");
        addComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addComponents() {
        copyButton = new JButton("Copy");
        cutButton = new JButton("Cut");
        pasteButton = new JButton("Paste");
        Box box = new Box(BoxLayout.X_AXIS);
        box.add(Box.createHorizontalGlue());
        box.add(copyButton);
        box.add(Box.createHorizontalStrut(5));
        box.add(cutButton);
        box.add(Box.createHorizontalStrut(5));
        box.add(pasteButton);
        box.add(Box.createHorizontalGlue());

        clipTextArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(clipTextArea);

        this.add(box, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] arg) {
        new Clipboard2();
    }
}
