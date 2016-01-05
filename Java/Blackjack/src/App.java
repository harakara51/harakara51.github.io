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

public class App extends Applet implements ActionListener
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
	private boolean gameOver;
	
	

	public void init()      
	{

		
		setBackground(Color.green);
		setSize(600, 600);
		Button startButton = new Button("Start");
		Button button2 = new Button("STAND");
		Button button1 = new Button("HIT");

		if (status == 0)
		{
			startButton.setLocation(200, 150);
			startButton.setSize(300,250);
			startButton.addActionListener(this);
			startButton.setVisible(true);
			startButton.setSize(100, 100);
			add(startButton);
		}

	}
	
	void starGame ()
	{
		removeAll();
		setBackground(Color.green);
		resize(800, 600);
		
		Button button2 = new Button("STAND");
		Button button1 = new Button("HIT");
		
		//remove(startButton);
		
		//startButton.setVisible(false);
		button1.setLocation(20, 45);
		button1.addActionListener(this);
		button1.setVisible(true);
		button1.setSize(30, 75);

		// button2.setLocation(20, 45);
		button2.addActionListener(this);
		// button2.setVisible(true);
		// button2.setSize(30, 75);
		// button1.setBounds(200, 450, 50, 50);
		add(button1);
		add(button2);
		//repaint();
	}

	public void paint(Graphics g)
	{

	while (gameOver )
	{	
		if (status == 3)
		{

			setDeck();
			int x = 120;

			playerHand.add(drawCard());
			Image card1 = Toolkit.getDefaultToolkit().getImage(playerHand.get(0).getPath());
			g.drawImage(card1, 100, 400, 75, 125, this);
			g.finalize();

			Image card2 = Toolkit.getDefaultToolkit().getImage(playerHand.get(1).getPath());
			g.drawImage(card2, 120, 400, 75, 125, this);
			g.finalize();
			for (int i = 0; i < clicked; i++)
			{
 				Image img3 = Toolkit.getDefaultToolkit().getImage(playerHand.get(i + 2).getPath());
				x = x + 20;
				g.drawImage(img3, x, 400, 75, 125, this);
				g.finalize();
			}

			bankerHand.add(drawCard());
			// Collections.shuffle(bankerHand);
			Image card3 = Toolkit.getDefaultToolkit().getImage("Images/_Back.png");
			g.drawImage(card3, 100, 200, 75, 125, this);
			g.finalize();

			Image card4 = Toolkit.getDefaultToolkit().getImage(bankerHand.get(1).getPath());
			g.drawImage(card4, 120, 200, 75, 125, this);
			g.finalize();

			aiScore = bankerHand.get(0).getValue() + bankerHand.get(1).getValue();

			if (playerScore2 > 21)
			{
				JOptionPane.showMessageDialog(null, "Playe over 21, game over", "Game Status",
						JOptionPane.INFORMATION_MESSAGE);
				
				Dimension d = getSize();
				g.setColor(Color.green);
				g.fillRect(0, 0, d.width, d.height);
				reset();
				status =4;
				
			}

			if (status == 1)
			{
				Image card5 = Toolkit.getDefaultToolkit().getImage(bankerHand.get(0).getPath());
				g.drawImage(card5, 100, 200, 75, 125, this);
				g.finalize();

				Image card6 = Toolkit.getDefaultToolkit().getImage(bankerHand.get(1).getPath());
				g.drawImage(card6, 120, 200, 75, 125, this);
				g.finalize();
				aiScore = bankerHand.get(0).getValue() + bankerHand.get(1).getValue();

				if (aiScore < 17)
				{
					// System.out.println("inside first under 17 " +
					// bankerHand.get(2).getValue());
					aiScore = aiScore + bankerHand.get(2).getValue();
					// System.out.println(aiScore);
					Image card7 = Toolkit.getDefaultToolkit().getImage(bankerHand.get(2).getPath());
					g.drawImage(card7, 140, 200, 75, 125, this);
					g.finalize();

					if (aiScore < 17)
					{
						aiScore = aiScore + bankerHand.get(3).getValue();
						Image card8 = Toolkit.getDefaultToolkit().getImage(bankerHand.get(3).getPath());
						g.drawImage(card8, 160, 200, 75, 125, this);
						g.finalize();

						if (aiScore < 17)
						{
							aiScore = aiScore + bankerHand.get(4).getValue();
							Image card9 = Toolkit.getDefaultToolkit().getImage(bankerHand.get(4).getPath());
							g.drawImage(card9, 180, 200, 75, 125, this);
							g.finalize();
							// aiScore += bankerHand.get(4).getValue();
							// aiScore2= aiScore + bankerHand.get(2).getValue();
						}

						if (aiScore > 21)
						{
							JOptionPane.showMessageDialog(null, "Banker goes bust, player win", "Game Status",
									JOptionPane.INFORMATION_MESSAGE);
							System.out.println("Banker goes bust");

						} else if (aiScore > playerScore2)
							JOptionPane.showMessageDialog(null, "Banker win", "Game Status",
									JOptionPane.INFORMATION_MESSAGE);
						else if (aiScore < playerScore2)
						{
							JOptionPane.showMessageDialog(null, "Player win", "Game Status",
									JOptionPane.INFORMATION_MESSAGE);
						} else
						{
							System.out.println("It a draw!");
						}

					}

				}

				System.out.println(aiScore + "   " + playerScore2);

			}

		}
	}

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

	public CardsGUI drawCard()
	{
		// Collections.shuffle(Deck);
		Random rand = new Random();

		random = rand.nextInt((36 - 1) + 1);
		CardsGUI temp = Deck.get(random);

		return temp;
	}

	public void actionPerformed(ActionEvent e)
	{

		if (e.getActionCommand() == "STAND")
		{
			System.out.println("STAND");
			status = 1;

			for (int i = 0; i < (clicked + 2); i++)
			{
				playerScore = playerHand.get(i).getValue();
				playerScore2 = playerScore2 + playerHand.get(i).getValue();
				playerScore =playerScore2;
				if(playerHand.get(i).getValue()==1)
				{
					playerScore += 10;
				}

			}

			if (playerScore > 21)
			{
				JOptionPane.showMessageDialog(null, "game over", "Game Status", JOptionPane.INFORMATION_MESSAGE);
				System.out.println("game over");
				System.exit(0);
			}
			  repaint();
		}

		if (e.getActionCommand() == "HIT")
		{
			clicked++;
			for (int i = 0; i < (clicked + 2); i++)
			{
				playerScore = playerHand.get(i).getValue();
				playerScore2 = playerScore2 + playerHand.get(i).getValue();
				playerScore =playerScore2;
				if(playerHand.get(i).getValue()==1)
				{
					playerScore += 10;
				}

			}
			repaint();
		}
 
		if (e.getActionCommand().equals("Start"))
		{
			if (status ==4)
			{
				starGame();
				repaint();
			}
			status = 3;
			starGame();
			repaint();
		}

	}

	public void reset ()
	{
		removeAll();
		status =0;
		init();
		//repaint();
	}

}
