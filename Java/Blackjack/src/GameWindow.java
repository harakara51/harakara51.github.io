import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class GameWindow extends JFrame
{
	
	public GameWindow()
	{
		setTitle("Blackjack");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	ImageIcon icon = new ImageIcon("/Blackjack/src/Images/Clubs 11.png");
		setVisible(true);

	}
	
}

class MyCanvas extends JComponent {

	  public void paint(Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;

	    Image img1 = Toolkit.getDefaultToolkit().getImage("test.png");
	    g2.drawImage(img1, 100, 100, this);
	    g2.finalize();
	  }
	}