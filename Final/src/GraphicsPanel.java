	// Graphics Panel
// Written by: Mr. Swope
// Date: February 10th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.
import java.awt.Color;
import javax.swing.*;    
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicsPanel extends JPanel implements KeyListener{
	
	// method: GraphicsPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  You do not need to edit this method.
	Hand Player = new Hand();
	Hand Dealer = new Hand();
	 Boolean hit = false;
	 Boolean stick=false;
	
	public GraphicsPanel(){
		setPreferredSize(new Dimension(1024, 1024));
        this.setFocusable(true);			// for keylistener
		this.addKeyListener(this);
		
		Player.setCard1((int)(Math.random()*10+1));
		Player.setCard2((int)(Math.random()*10+1));
		Dealer.setCard1((int)(Math.random()*10+1));
		Dealer.setCard2((int)(Math.random()*10+1));
		
		System.out.println(Player.getCard1());
		System.out.println(Player.getCard2());
		System.out.println(Dealer.getCard1());
		System.out.println(Dealer.getCard2());
		
		System.out.println(Player.getTotal());
		System.out.println(Dealer.getTotal());
		
		

	}
	public void faceChanger(int card) {
		if (card == 11) {
			int x = (int)(Math.random()*4+1);
			if (x == 1) {
				
			
		}
		}
	}
	
	
	public void clock(){
		
		this.repaint();
	}
	
	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		
		
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color (53, 101, 77));		
		g2.fillRect(0, 0, 1024, 1024);
		
		g2.setColor(new Color (0, 0, 0));
		g2.drawString("ELI'S BLACKJACK", 512, 512);
		
		
		try {

			BufferedImage image = ImageIO.read(getClass().getResource("assets/black.png"));

			g2.drawImage(image, 380, 50, null);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {

			BufferedImage image1 = ImageIO.read(getClass().getResource("assets/black.png"));

			g2.drawImage(image1, 500, 50, null);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		g2.drawString((String.valueOf(Dealer.getTotal()) ), 375, 375);
	
		
			try {

				BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Player.getCard1() + ".png"));

				g2.drawImage(image, 500, 500, null);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {

				BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Dealer.getCard1() + ".png"));

				g2.drawImage(image, 500, 50, null);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {

				BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Player.getCard2() + ".png"));

				g2.drawImage(image, 250, 500, null);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g2.drawString((String.valueOf(Player.getTotal())), 500, 974);
			
			if (hit == true) {
				
				Player.setTotal(Player.getTotal() + Player.getCard3());
				try {

					BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Player.getCard3() + ".png"));

					g2.drawImage(image, 0, 500, null);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				hit = false;
				g2.drawString((String.valueOf(Player.getTotal())), 500, 974);
				}
			 if (stick == true) {
				try {

					BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Dealer.getCard2() + ".png"));

					g2.drawImage(image, 0, 50, null);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {

					BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Player.getCard3() + ".png"));

					g2.drawImage(image, 0, 500, null);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 if (Dealer.getTotal() < 17) {
				 Dealer.setCard3((int)(Math.random()*10+1));
				 try {

						BufferedImage image = ImageIO.read(getClass().getResource("assets/" + Dealer.getCard3() + ".png"));

						g2.drawImage(image, 0, 500, null);

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
			 if (Player.getTotal() >= Dealer.getTotal() && Player.getTotal() <= 21) {
				 g2.drawString("You Win", 500, 500);
			 }
			
			
	
		}
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			// move right
			case KeyEvent.VK_H:
				hit = true;
				Player.setCard3((int)(Math.random()*10+1));

				Player.setTotal(Player.getTotal() + Player.getCard3());
				System.out.println(Player.getTotal());
				break;
			
			case KeyEvent.VK_S:
				stick = true;
				
				break;
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
