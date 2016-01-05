package examples;


	import java.awt.*;
	import javax.swing.*;

	public class Paint extends JPanel
	{
		
		Shape [] test1  = new Shape [3];
		
		Rectangle R1 = new Rectangle(50,60,Color.GREEN,15,10);
		
		Rectangle R3 = new Rectangle(145,60,Color.GREEN,15,10);
		
		Rectangle R2 = new Rectangle(15,30);
		
		Text t1 = new Text(75, 15, Color.BLACK, "Jeff is such a BA");
		
		Circle C1 = new Circle(20,12,Color.PINK,6);
		
		Circle C2 = new Circle(115,175,Color.PINK,6);
		
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(new java.awt.Color(255, 0, 0));
			g.drawOval(C1.getGetX(), C1.getGetY(), 200, 200);
			
			g.setColor(new java.awt.Color(255, 0, 0));
			g.drawOval(C2.getGetX(), C2.getGetY(), 20, 20);
			
			g.setColor(new java.awt.Color(0, 255, 0));
			g.drawRect(R1.getGetX(), R1.getGetY(), 50, 50);
			
			g.setColor(new java.awt.Color(0, 255, 0));
			g.drawRect(R3.getGetX(), R3.getGetY(), 50, 50);
			
			g.setColor(new java.awt.Color(0, 0, 255));
			g.drawString(t1.getValue(), t1.getGetX(), t1.getGetY());
		}
		
		public static void main(String[] args) {
			
		//double x= Number.
			
			
			
			
			
			JFrame f = new JFrame();
			Paint panel = new Paint();
			f.add(panel, BorderLayout.CENTER);
			f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			f.setSize(300,300);
			f.setVisible(true);
		}
	}
	
	

