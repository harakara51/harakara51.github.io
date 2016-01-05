
import java.applet.Applet;
	import java.awt.BorderLayout;
	import java.awt.Button;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.FlowLayout;
	import java.awt.Graphics;
	import java.awt.Image;
	import java.awt.Toolkit;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Random;

	import javax.swing.JApplet;
	import javax.swing.JOptionPane;


public class paint extends Applet
{

	

	
		private int random;
		private static ArrayList<CardsGUI> playerHand = new ArrayList<CardsGUI>();
		private static ArrayList<CardsGUI> bankerHand = new ArrayList<CardsGUI>();
		public static ArrayList<CardsGUI> Deck = new ArrayList<CardsGUI>();
		//
		private int clicked;
		private int status;
		private int playerScore;
		private int playerScore2;
		private int aiScore;
		private int aiScore2;

		public void init()
		{

			System.out.println("test");
			setBackground(Color.green);
			setSize(600, 600);
			Button startButton = new Button("Start");
		
		
				startButton.setLocation(200, 150);
				startButton.setSize(300,250);
	
				startButton.setVisible(true);
				startButton.setSize(100, 100);
				add(startButton);
				repaint();

		

		

		}
		
		

		public void paint(Graphics g)
		{
	 System.out.println("teste");
		



							
	
		}

		public void setDeck()

		{

			String[] suit =
			{ "Hearts", "Diamonds", "Spades", "Clubs" };
			int[] number =
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

			for (int i = 0; i < suit.length - 1; i++)
			{
				for (int k = 0; k < number.length; k++)
				{
					int Value;

					int Number = number[k];
					String Suit = suit[i];
					String Name = suit[i] + " " + String.valueOf(Number);
					String Path = "Images/" + Name + ".png";
					if (k < 10)
					{
						Value = number[k];
					} else
						Value = 10;

					CardsGUI Card = new CardsGUI(Number, Suit, Name, Path, Value);
					Deck.add(Card);
				}
			}
		}

	

}
