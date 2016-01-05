package solutions;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Clipboard extends JFrame {
    private JButton copyButton;
    private JButton cutButton;
    private JButton pasteButton;
    private JTextArea clipTextArea;

    public Clipboard() {
        super("Clipboard");
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
        box.add(copyButton);
        box.add(cutButton);
        box.add(pasteButton);

        clipTextArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(clipTextArea);

        this.add(box, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] arg) {
        new Clipboard();
    }
}
