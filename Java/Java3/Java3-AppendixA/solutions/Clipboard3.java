package solutions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Clipboard3 extends JFrame {
    private JButton copyButton;
    private JButton cutButton;
    private JButton pasteButton;
    private JTextArea clipTextArea;

    public Clipboard3() {
        super("Clipboard3");
        addComponents();
        addEventHandlers();
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

    private void addEventHandlers() {
        class CopyListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                clipTextArea.copy();
            }
        }

        class CutListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                clipTextArea.cut();
            }
        }

        class PasteListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                clipTextArea.paste();
            }
        }

        copyButton.addActionListener(new CopyListener());
        cutButton.addActionListener(new CutListener());
        pasteButton.addActionListener(new PasteListener());
    }

    public static void main(String[] arg) {
        new Clipboard3();
    }
}
