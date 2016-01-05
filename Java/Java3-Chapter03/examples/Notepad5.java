package examples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad5 extends JFrame {
    private JButton closeButton;
    private JTextArea notesTextArea;

    public Notepad5() {
        super("Notepad");
        addComponents();
        addEventHandlers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addComponents() {
        notesTextArea = new JTextArea(8, 10);
        
        notesTextArea.setLineWrap(true);
        notesTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(notesTextArea);
        closeButton = new JButton("Close");

        // contentPane.add(notesTextArea, BorderLayout.CENTER);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(closeButton, BorderLayout.SOUTH);
    }

    private void addEventHandlers() {
        class CloseListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }
        ActionListener closeListener = new CloseListener();
        closeButton.addActionListener(closeListener);
    }

    public static void main(String[] arg) {
        new Notepad5();
    }
}