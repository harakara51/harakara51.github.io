import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BJtester extends JApplet implements ActionListener
{

	
	private int status;
	private Deckbuilder deck1= new Deckbuilder();
	JButton b;  
	JTextField tf; 
	
	
	public void init()      
	{
		
//		JTextArea area = new JTextArea("Hello World");
//        this.add(area);
//		setSize(600, 600);
//		tf=new JTextField();  
//		tf.setBounds(30,40,150,20);  
//		  
//		b=new JButton("Click");  
//		b.setBounds(80,150,70,40);  
//		  
//		add(b);add(tf);  
//		b.addActionListener(this);  
//		setBackground(Color.red);  
//		

	}
	
	
	public void paint(Graphics g)
	{
		
		//Image card1 = Toolkit.getDefaultToolkit().getImage(deck1.getDeck().get(0).getPath());
		g.drawRect(15, 15, 75, 100);
		
	//	g.finalize();
	}
	
	
	
	
	
	
	
	public static void main (String[] args)
	{
		
		
		
		App canvas = new App ();
		
//		for (CardsGUI card :deck1.getDeck())
//		{
//			System.out.println(card);
//		}
			
			
	}











	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand() == "Start")
		{
			status = 3;
			System.out.println("test");
			//repaint();
		}
		
	}
	
	

}
