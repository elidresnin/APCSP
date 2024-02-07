// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;
import javax.swing.Timer;

import javazoom.jl.player.Player;

import java.awt.Rectangle;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener{

	private Timer timer;					// The timer is used to move objects at a consistent time interval.

	private Background background1;			// The background object will display a picture in the background.
	private Background background2;			// There has to be two background objects for scrolling.
	
	private Sprite sprite;					// create a Sprite object
	private Item item;						// This declares an Item object. You can make a Item display
	// pretty much any image that you would like by passing it
	// the path for the image.
	
	private boolean Key_UP = false;
	private boolean Key_DOWN = false;
	
	ArrayList<Item> cheese = new ArrayList<Item>();
	ArrayList<Item> drugs = new ArrayList<Item>();
	
	private int y = 0;
	private double x = 0;
	private int lives = 3;
	private int score = 0;
	private boolean start = false;
	
	Item heart1 = new Item(800, 500, "images/objects/heart.png", 10);
	Item heart2 = new Item(850, 500, "images/objects/heart.png", 10);
	Item heart3 = new Item(900, 500, "images/objects/heart.png", 10);
	Item title = new Item(10, 10, "images/objects/title.png", 7);


	public GraphicsPanel(){
		
		
		background1 = new Background();	// You can set the background variable equal to an instance of any of  
		background2 = new Background(-background1.getImage().getIconWidth());
 
		// The Item constructor has 4 parameters - the x coordinate, y coordinate
		// the path for the image, and the scale. The scale is used to make the
		// image smaller, so the bigger the scale, the smaller the image will be.


		sprite = new Sprite(500, 300);		
		sprite.walkLeft();
		sprite.idle();
		// The Sprite constuctor has two parameter - - the x coordinate and y coordinate

		setPreferredSize(new Dimension(background1.getImage().getIconWidth(),
				background2.getImage().getIconHeight()));  
		// This line of code sets the dimension of the panel equal to the dimensions
		// of the background image.

		timer = new Timer(5, new ClockListener(this));   // This object will call the ClockListener's
		// action performed method every 5 milliseconds once the 
		// timer is started. You can change how frequently this
		// method is called by changing the first parameter.
		this.setFocusable(true);					     // for keylistener
		this.addKeyListener(this);
		
	}

	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.  This method is called when the panel is
	//   			first rendered.  It can also be called by this.repaint(). You'll want to draw each of your objects.
	//				This is the only place that you can draw objects.
	// parameters: Graphics g - This object is used to draw your images onto the graphics panel.
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		background1.draw(this, g);
		background2.draw(this, g);

		for (int i = 0; i < cheese.size(); i++) {
			cheese.get(i).draw(g2, this);
		}
		for (int i = 0; i < drugs.size(); i++) {
			drugs.get(i).draw(g2, this);
		}
		sprite.draw(g2, this);

		g2.setColor(Color.RED);
		//Rectangle r = sprite.getBounds();
		//g2.draw(r);
		
		if (lives >= 1) {
			heart1.draw(g2, this);
		}
		if (lives >= 2) {
			heart2.draw(g2, this);
		}
		if (lives >= 3) {
			heart3.draw(g2, this);
		}
		
		Font font = new Font("Serif", Font.PLAIN, 20);
		
		g2.setColor(Color.lightGray);
		
		g2.setFont(font);

		g2.drawString("Score = " + score, 800, 475); 
		
		if (start == false) {
			title.draw(g2, this);
			g2.drawString("Press Space To Start", 750, 450);
		}
		
		
	}

	// method:clock
	// description: This method is called by the clocklistener every 5 milliseconds.  You should update the coordinates
	//				of one of your characters in this method so that it moves as time changes.  After you update the
	//				coordinates you should repaint the panel. 
	public void clock(){
		for (int z = 0; z <= (int)x; z++) {
		// You can move any of your objects by calling their move methods.
		sprite.move(this);
		if (y%100 == 0) {
		cheese.add(new Item(0, 200 + (int)(Math.random() * ((600 - 300) + 1)), "images/objects/stinky cheese.png", 10)); 
		}
		if (y%1000 == 0) {
		drugs.add(new Item(0, 200 + (int)(Math.random() * ((600 - 300) + 1)), "images/objects/drugs.png", 14)); 
		}
		
		for (int i = 0; i < cheese.size(); i++) {
			if (cheese.get(i).getX() >= 1000) {
				cheese.remove(i);
			}
			
			cheese.get(i).moveRight();
			cheese.get(i).move(this);
		}
		
		for (int i = 0; i < drugs.size(); i++) {
			if (drugs.get(i).getX() >= 1000) {
				drugs.remove(i);
			}
			
			drugs.get(i).moveRight();
			drugs.get(i).move(this);
		}

		background1.move();
		background2.move();

		// You can also check to see if two objects intersect like this. In this case if the sprite collides with the
		// item, the item will get smaller. 
		
		for (int i = 0; i < cheese.size(); i++) {
			if(sprite.collision(cheese.get(i))) {
				//System.out.println("stop");
				x = x + 0.1;
				score++;
				cheese.remove(i);
				//sprite.stop_Vertical();
			}

		}
		
		for (int i = 0; i < drugs.size(); i++) {
			if(sprite.collision(drugs.get(i))) {
				System.out.println("stop");
				lives--;
				drugs.remove(i);
				//sprite.stop_Vertical();
			}

		}
		
		if (sprite.y_coordinate <= 100 || sprite.y_coordinate >= 1000) {
			sprite.idle();
			sprite.y_coordinate = sprite.y_coordinate + 1;
		}
		if (y >= 10000) {
			y = 0;
		}
		y++;
		
		this.repaint();
		}
		
		if (lives <= 0) {
			timer.stop();
			start = false;
		}
	
	}

	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyPressed(KeyEvent e) {

	//	if(e.getKeyCode() == KeyEvent.VK_RIGHT)
	//		sprite.walkRight();
	//	else if(e.getKeyCode() == KeyEvent.VK_LEFT)
	//		sprite.walkLeft();
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			sprite.moveUp();
			Key_UP = true;
			Key_DOWN = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		sprite.moveDown();
		Key_DOWN = true;
		Key_UP = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			start = true;
			timer.start();
			lives = 3;
			score = 0;
			x = 0;
		}
		else if(e.getKeyCode() == KeyEvent.VK_J)
			sprite.jump();
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			playSound("src/sounds/bump.WAV");
			sprite.die();	
		}
		
	}

	// This function will play the sound "fileName".
	public static void playSound(String fileName) {
		try {
			File url = new File(fileName);
			Clip clip = AudioSystem.getClip();

			AudioInputStream ais = AudioSystem.getAudioInputStream(url);
			clip.open(ais);
			clip.start();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// method: keyTyped()
	// description: This method is called when a key is pressed and released. It basically combines the keyPressed and
	//              keyReleased functions.  You can determine which key is typed using the KeyEvent object.  
	//				For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if the left key was typed.
	//				You probably don't want to do much in this method, but instead want to implement the keyPresses and keyReleased methods.
	// parameters: KeyEvent e
	@Override
	public void keyTyped(KeyEvent e) {


	}

	// method: keyReleased()
	// description: This method is called when a key is released. You can determine which key is released using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyReleased(KeyEvent e) {

	//	if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT)
	//		sprite.idle();
		if(e.getKeyCode() ==  KeyEvent.VK_UP && Key_DOWN == false) {
			sprite.stop_Vertical();	
		}
		else if (e.getKeyCode() ==  KeyEvent.VK_DOWN && Key_UP == false) {
			sprite.stop_Vertical();
		}

	}

}
