// Graphics Panel
// Written by: Mr. Swope
//Modified by: Adam Schneid
// Date: February 10th, 2015
// Modification Date: May 6th, 2022
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
//This project runs hangman on a JPanel!
// Update these comments by writing when, who and how you modified this class.
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicsPanel extends JPanel implements KeyListener{
	ArrayList<Character> guessed = new ArrayList<Character>();
	private Rectangle r;
	private Rectangle s;
	private Timer t;
	private int i = 0;
	private int counter = 0;
	private int wrongs = 0;
	private boolean keyPressed = false;
	private char letter = ' ';
	private String toDisplay = "";
	private String status = "Enter your letter guess by pressing the key on the keyboard";
	private boolean won = false;
	private boolean gameOver = false;
	
	public static String getWord()  {
		  
		  
			
		try {
			File testFile = new File("");
			System.out.println(testFile.getAbsolutePath());
			
			Scanner sc = new Scanner(new File(testFile.getAbsolutePath()+"/src/assets/words.txt"));
		
			ArrayList<String> list = new ArrayList<String>();
			while (sc.hasNext()) {
				list.add(sc.next());
			}
			int randomNum = ThreadLocalRandom.current().nextInt(0, list.size());
			return list.get(randomNum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "poopy";
		}
	}
	private String word = getWord();
	// method: GraphicsPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  You do not need to edit this method.
	public GraphicsPanel(){
		if(toDisplay.equals(""))
			toDisplay = "_____";
		setPreferredSize(new Dimension(500, 500));
        this.setFocusable(true);			// for keylistener
		this.addKeyListener(this);
		r = new Rectangle(0 , 0, 376, 376);
		s = new Rectangle(100 , 100, 25, 25);
        t = new Timer(25, new ClockListener(this));   
        t.start();
        File testFile = new File("");
        
//    	'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
		for(int i =97; i<=122; i++) {
			guessed.add((char)i);
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	int p = 0;
	
	public void doHangman(char letter, String word){
		 
		status = "";
			
			
				boolean wasRight = false;
			
			
				

				
		      
				
				
					boolean justchecking = true;
				
					Scanner therealgary = new Scanner(System.in);
					
					status = "Enter your letter guess";
					this.repaint();
			
					char guess = ' ';
					
						
						guess = (letter+"").toLowerCase().charAt(0);// therealgary.next().toLowerCase().charAt(0);
						if (guess >= 'a' && guess <= 'z') {
						if (guessed.contains(guess)) {
							
								justchecking = false;
							

							
						} else {
							status = "You already guessed that letter! Try another one!";
							wasRight = true;
							this.repaint();
						}
						
						}else {
							status = "You must input a letter from 'a' to 'z', try again!";
							wasRight = true;
							this.repaint();
						}
					
					for(int i = 0; i<=guessed.size()-1; i++) {
						if(guess == guessed.get(i)) {
							guessed.remove(i);
						}
					}
				
					for (int i = 0; i + 1 <= 5; i++) {

						char check = word.charAt(i);
						if (check == guess) {
							int index = i;

							toDisplay = toDisplay.substring(0, index) + check + toDisplay.substring(index + 1);
						
							wasRight = true;
						}

					}
					if (wasRight == false ) {
						wrongs++;
					
					}
					wasRight = false;
					
					if (!toDisplay.contains("_")) {
						if(wrongs<10) {
						status = "Congrats! You won! The word was: " + word;
						won = true;
						}
					}
				
					letter = ' ';
					keyPressed = false;
				
				this.repaint();
			
	}
	
	public void clock(){
		counter++;
		if(counter%5000 == 0)
			i++;
		this.repaint();
	}
	
	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
	
		g2.setColor(Color.GRAY);
		g2.fillRect(0, 0, 500, 500);
		g2.setColor(Color.MAGENTA);
		g2.setFont(new Font("Comic Sans", 2, 40));
		g2.drawString("H", 450, 45);
		g2.drawString("A", 450, 90);
		g2.drawString("N", 450, 135);
		g2.drawString("G", 450, 180);
		g2.drawString("M", 450, 225);
		g2.drawString("A", 450, 270);
		g2.drawString("N", 450, 315);
		g2.setColor(Color.BLUE);
		try {
			g2.setColor(Color.GREEN);
			
			
			
		//	System.out.println(testFile.getAbsolutePath());
			if(won) {
				BufferedImage image = ImageIO.read(getClass().getResource("assets/win.png"));
				
				//BufferedImage image = ImageIO.read(new File(/*testFile.getAbsolutePath()+*/"/Users/s029817/Desktop/hangman/"));
				
				g2.drawImage(image, r.x, r.y, null);
				
			}
			if(wrongs<10) {
				if(!won) {
					BufferedImage image = ImageIO.read(getClass().getResource("assets/hangman"+wrongs+".png"));
			//BufferedImage image = ImageIO.read(new File(/*testFile.getAbsolutePath()+*/"/Users/s029817/Desktop/hangman/hangman"+wrongs+".png"));
			
			g2.drawImage(image, r.x, r.y, null);
				}
			}
			else {
				if(!won) {
				gameOver = true;
				status = "Wow, you really lost?";
				g2.setFont(new Font("Comic Sans", 2, 40));
				g2.drawString("Game over, you lose.", 30, 250);
				g2.drawString("The word was: "+word, 30, 290);
				}
			}
			
			} catch(FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		g2.setColor(Color.RED);
		g2.setFont(new Font("Arial", 1, 30));
		
		g2.drawString(toDisplay.charAt(0)+" "+toDisplay.charAt(1)+" "+toDisplay.charAt(2)+" "+toDisplay.charAt(3)+" "+toDisplay.charAt(4), 15, 420);
		String goodLetters = "Letter Bank: ";
		for(int i = 0; i<guessed.size(); i++) {
			if(i != 0)
			goodLetters = goodLetters+", "+guessed.get(i);
			if(i==0)
				goodLetters = goodLetters+""+guessed.get(i);
		}
		g2.setFont(new Font("Comic Sans", 2, 15));
		g2.drawString(status, 15, 455);
		g2.setFont(new Font("Comic Sans", 2, 13));
		
		g2.drawString(goodLetters, 15, 475);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		letter = e.getKeyChar();
		keyPressed = true;
		if(!gameOver && !won)
		doHangman(letter, word);
		this.repaint();
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		switch(e.getKeyCode()){
		
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
