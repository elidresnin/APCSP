// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.ItemSelectable;
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
import java.awt.Rectangle;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener{

	private Timer timer;					// The timer is used to move objects at a consistent time interval.

	private Background background1;			// The background object will display a picture in the background.
	private Background background2;			// There has to be two background objects for scrolling.

	private Sprite sprite;	// create a Sprite object
	private Item item1, item2, item3, item4, item5; 	// This declares an 
	//Item object. You can make a Item display
	private Item dough, sauce, pesto, mush, pine, pep, cheese, olives, bacon, pepper, broc;
	private ArrayList<Item> pestoPine, olivePepper, mushBroc, brocBacon, mushPep, bothSauce;
	private ArrayList<Item> items;
	private ArrayList<Item> itemChecker;
	private boolean isDead;
	private boolean doughCollected, sauceCollected, pestoCollected, mushCollected, pineCollected, pepCollected, cheeseCollected, olivesCollected,
	baconCollected,pepperCollected, brocCollected;
	private int randomOrder;
	private int[] random;
	private int greenOrderTimer;
	private Item order1, order2, order3, order4, order5, order6, doughSign;
	private Item green1, green2, green3, green4, green5, green6, greenDough;
	private Item doughCheck, check1, check2, check3, check4;
	private boolean drawCheck1, drawCheck2, drawCheck3, drawCheck4;
	private boolean startMessage;
	private boolean orderComplete;
	private int ordersCount;
	private Item logo;
	private Item ordersCompletedSign;

	public GraphicsPanel(){
		background1 = new Background();	// You can set the background variable equal to an instance of any of  
		background2 = new Background(-background1.getImage().getIconWidth());								

		isDead = false;
		startMessage = true;
		greenOrderTimer = 0;
		orderComplete = false;
		ordersCount = 0;

		items = new ArrayList<>();
		items.add(item1 = new Item(1800, 650, "images/objects/dough.png", 1));
		items.add(item2 = new Item(2200, 650, "images/objects/red sauce.png", 1));
		items.add(item3 = new Item(2600, 650, "images/objects/green sauce.png", 1));
		items.add(item4 = new Item(3000, 650, "images/objects/mushroom.png", 1));
		items.add(item5 = new Item(3400, 650, "images/objects/pine.png", 1));


		random = new int[13];

		doughCollected = false;
		sauceCollected = false;
		pestoCollected = false;
		mushCollected = false;
		pineCollected = false;
		pepCollected = false;
		cheeseCollected = false;
		olivesCollected = false;
		baconCollected = false;
		pepperCollected = false;
		brocCollected = false;

		pestoPine = new ArrayList<>();
		olivePepper = new ArrayList<>();
		mushBroc = new ArrayList<>();
		brocBacon = new ArrayList<>();
		mushPep = new ArrayList<>();
		bothSauce = new ArrayList<>();

		itemChecker = new ArrayList<>();
		itemChecker.add(dough);
		itemChecker.add(sauce);
		itemChecker.add(pesto);
		itemChecker.add(mush);
		itemChecker.add(pine);
		itemChecker.add(pep);
		itemChecker.add(cheese);
		itemChecker.add(olives);
		itemChecker.add(bacon);
		itemChecker.add(pepper);
		itemChecker.add(broc);

		order1 = new Item(1220, 35, "images/objects/1.png", 10);
		order2 = new Item(1220, 35, "images/objects/2.png", 10);
		order3 = new Item(1220, 35, "images/objects/3.png", 10);
		order4 = new Item(1220, 35, "images/objects/4.png", 10);
		order5 = new Item(1220, 35, "images/objects/5.png", 10);
		order6 = new Item(1220, 35, "images/objects/6.png", 10);

		doughSign = new Item(1220, 4, "images/objects/dough sign 2.png", 10);

		green1 = new Item(1225, 35, "images/objects/green1.png", 10);
		green2 = new Item(1225, 35, "images/objects/green2.png", 10);
		green3 = new Item(1225, 35, "images/objects/green3.png", 10);
		green4 = new Item(1225, 35, "images/objects/green4.png", 10);
		green5 = new Item(1225, 35, "images/objects/green5.png", 10);
		green6 = new Item(1225, 35, "images/objects/green6.png", 10);

		greenDough = new Item(1225, 4, "images/objects/green dough.png", 10);

		doughCheck = new Item(1480, 20, "images/objects/check.png", 1);
		check1 = new Item(1270, 150, "images/objects/check.png", 1);
		check2 = new Item(1380, 150, "images/objects/check.png", 1);
		check3 = new Item(1480, 150, "images/objects/check.png", 1);
		check4 = new Item(1590, 150, "images/objects/check.png", 1);

		logo = new Item(1000,300,"images/objects/logo.png",6);
		ordersCompletedSign = new Item(250, 10, "images/objects/ordersCompleted.png", 10);

		drawCheck1 = false;
		drawCheck2 = false;
		drawCheck3 = false;
		drawCheck4 = false;


		// The Item constructor has 4 parameters - the x coordinate, y coordinate
		// the path for the image, and the scale. The scale is used to make the
		// image smaller, so the bigger the scale, the smaller the image will be.


		sprite = new Sprite(180, 570);			
		// The Sprite constuctor has two parameter - - the x coordinate and y coordinate

		setPreferredSize(new Dimension(background1.getImage().getIconWidth(),
				background2.getImage().getIconHeight()));  
		// This line of code sets the dimension of the panel equal to the dimensions
		// of the background image.

		timer = new Timer(5, new ClockListener(this));   // This object will call the ClockListener's
		// action performed method every 5 milliseconds once the 
		// timer is started. You can change how frequently this
		// method is called by changing the first parameter.
		timer.start();
		this.setFocusable(true);					     // for keylistener
		this.addKeyListener(this);

		randomOrder = (int)(Math.random()*6);
		switch(randomOrder) {
		case 1: //pesto, pineapple, olives, bacon
			System.out.println(randomOrder);
			break;
		case 2: //sauce, cheese, olives, peppers
			System.out.println(randomOrder);
			break;
		case 3: //sauce, mushrooms, broccoli, pepperoni
			System.out.println(randomOrder);
			break;
		case 4: //broccoli, cheese, bacon, pineapple
			System.out.println(randomOrder);
			break;
		case 5: //pesto, mushrooms, cheese, pepperoni
			System.out.println(randomOrder);
			break;
		default: //sauce, pesto, peppers, olives
			randomOrder = 6;
			System.out.println(randomOrder);
			break;	
		}
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

		item1.draw(g2, this);
		item2.draw(g2, this);
		item3.draw(g2, this);
		item4.draw(g2, this);
		item5.draw(g2, this);

		sprite.draw(g2, this);

		ordersCompletedSign.draw(g2,  this);
		g2.setColor(Color.BLACK);
		g2.setFont(new Font("Impact", 1, 50));
		g2.drawString(("" + ordersCount), 520, 115);

		switch(randomOrder) {
		case 1: //pesto, pineapple, olives, bacon
			order1.draw(g2, this);
			break;
		case 2: //sauce, cheese, olives, peppers
			order2.draw(g2, this);
			break;
		case 3: //sauce, mushrooms, broccoli, pepperoni
			order3.draw(g2, this);
			break;
		case 4: //broccoli, cheese, bacon, pineapple
			order4.draw(g2, this);
			break;
		case 5: //pesto, mushrooms, cheese, pepperoni
			order5.draw(g2, this);
			break;
		default: //sauce, pesto, peppers, olives
			order6.draw(g2, this);
			break;	
		}

		doughSign.draw(g2, this);

		if(doughCollected)
			doughCheck.draw(g2, this);

		if(drawCheck1)
			check1.draw(g2,  this);
		if(drawCheck2)
			check2.draw(g2,  this);
		if(drawCheck3)
			check3.draw(g2,  this);
		if(drawCheck4)
			check4.draw(g2,  this);

		if(drawCheck1 && drawCheck2 && drawCheck3 && drawCheck4 && doughCollected) {
			switch(randomOrder) {
			case 1: //pesto, pineapple, olives, bacon
				green1.draw(g2, this);
				break;
			case 2: //sauce, cheese, olives, peppers
				green2.draw(g2, this);
				break;
			case 3: //sauce, mushrooms, broccoli, pepperoni
				green3.draw(g2, this);
				break;
			case 4: //broccoli, cheese, bacon, pineapple
				green4.draw(g2, this);
				break;
			case 5: //pesto, mushrooms, cheese, pepperoni
				green5.draw(g2, this);
				break;
			default: //sauce, pesto, peppers, olives
				green6.draw(g2, this);
				break;	
			}
			greenDough.draw(g2, this);

		}

		if(isDead == true) {
			g2.setColor(new Color(173, 26, 26));
			g2.fillRect(565, 234, 790, 190);
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Courier Bold Italic", 1, 120));
			g2.drawString("GAME OVER", 590, 350);
			g2.setColor(new Color(250, 162, 162));
			g2.setFont(new Font("Courier Bold Italic", 1, 50));
			g2.drawString("PRESS 'R' TO RESTART", 680, 408);


		}

		if(startMessage) {
			g2.setColor(new Color(27, 44, 112));
			g2.fillRect(0, 0, background1.getWidth(), background1.getHeight());

			g2.setColor(new Color(90, 118, 163));
			g2.setFont(new Font("Sans Serif", 1, 70));
			g2.drawString("Welcome to Pizza Panic!", 600, 100);
			g2.setFont(new Font("Sans Serif", 1, 50));
			g2.drawString("Rules:", 300, 200);
			g2.setFont(new Font("Sans Serif", 1, 30));
			g2.drawString("Follow the order card and make sure to pick the right ingredients for the perfect pizza", 300, 250);
			g2.drawString("You better watch out for the obstacles", 300, 300);
			g2.drawString("One wrong ingredient and it is GAME OVER!", 300, 350);
			g2.drawString("Finish and earn a point!", 300, 400);
			g2.drawString("Are you up for the challenge? ", 300, 500);
			g2.drawString("Press on the space key to start ", 300, 550);
			logo.draw(g2, this);


		}
	}


	// method:clock
	// description: This method is called by the clocklistener every 5 milliseconds.  You should update the coordinates
	//				of one of your characters in this method so that it moves as time changes.  After you update the
	//				coordinates you should repaint the panel. 
	public void clock(){
		// You can move any of your objects by calling their move methods.
		sprite.move(this);

		if(isDead == false) {
			background1.move();
			background2.move();


			item1.x_coordinate--;
			item2.x_coordinate--;
			item3.x_coordinate--;
			item4.x_coordinate--;
			item5.x_coordinate--;

			for(int i = 0; i < items.size(); i++) {
				if(items.get(i).x_coordinate == 1750) {
					random[i] = (int)(Math.random()*13);
					items.get(i).y_coordinate = 650;
				}


				switch(random[i]) {
				case 1:
					items.get(i).setImage("images/objects/dough.png");
					break;
				case 2:
					items.get(i).setImage("images/objects/red sauce.png");
					break;
				case 3:
					items.get(i).setImage("images/objects/green sauce.png");
					break;
				case 4:
					items.get(i).setImage("images/objects/mushroom.png");
					break;
				case 5:
					items.get(i).setImage("images/objects/pine.png");
					break;
				case 6:
					items.get(i).setImage("images/objects/pep.png");
					break;
				case 7:
					items.get(i).setImage("images/objects/cheese.png");
					break;
				case 8:
					items.get(i).setImage("images/objects/olives.png");
					break;
				case 9:
					items.get(i).setImage("images/objects/bacon.png");
					break;
				case 10:
					items.get(i).setImage("images/objects/pepper.png");
					break;
				case 11:
					items.get(i).setImage("images/objects/broc.png");
					break;
				case 12:
					items.get(i).setImage("images/objects/knife.png");
					break;
				default:
					items.get(i).setImage("images/objects/poison.png");
					break;
				}
			}

			if(item1.x_coordinate < -150)
				item1.x_coordinate = 1800;
			if(item2.x_coordinate < -150)
				item2.x_coordinate = 1800;
			if(item3.x_coordinate < -150)
				item3.x_coordinate = 1800;
			if(item4.x_coordinate < -150)
				item4.x_coordinate = 1800;
			if(item5.x_coordinate < -150)
				item5.x_coordinate = 1800;


		}
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i).getImageString() == ("images/objects/dough.png") && sprite.collision(items.get(i)) && !doughCollected) {
				doughCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 1)
					pestoPine.add(dough);
				else if(randomOrder == 2)
					olivePepper.add(dough);
				else if(randomOrder == 3)
					mushBroc.add(dough);
				else if(randomOrder == 4)
					brocBacon.add(dough);
				else if(randomOrder == 5)
					mushPep.add(dough);
				else
					bothSauce.add(dough);
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/dough.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}

			if((randomOrder == 2 || randomOrder == 3 || randomOrder == 6) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/red sauce.png") && !sauceCollected) { 
				sauceCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 2)
					olivePepper.add(sauce);
				else if(randomOrder == 3)
					mushBroc.add(sauce);
				else
					bothSauce.add(sauce);
				drawCheck1 = true;
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/red sauce.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 1 || randomOrder == 5 || randomOrder == 6) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/green sauce.png") && !pestoCollected) {  
				pestoCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 1) {
					pestoPine.add(pesto);
					drawCheck1 = true;
				}
				else if(randomOrder == 5) {
					mushPep.add(pesto);
					drawCheck1 = true;
				}
				else {
					bothSauce.add(pesto);
					drawCheck2 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/green sauce.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 3 || randomOrder == 5) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/mushroom.png") &&!mushCollected) {  
				mushCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 3)
					mushBroc.add(mush);
				else
					mushPep.add(mush);
				drawCheck2 = true;
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/mushroom.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 1 || randomOrder == 4) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/pine.png") && !pineCollected) {  
				pineCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 1) {
					pestoPine.add(pine);
					drawCheck2 = true;
				}
				else {
					brocBacon.add(pine);
					drawCheck4 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/pine.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 3 || randomOrder == 5) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/pep.png") && !pepCollected) {  
				pepCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 3)
					mushBroc.add(pep);
				else
					mushPep.add(pep);
				drawCheck4 = true;
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/pep.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 2 || randomOrder == 4 || randomOrder == 5) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/cheese.png") && !cheeseCollected) {  
				cheeseCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 2) {
					olivePepper.add(cheese);
					drawCheck2 = true;
				}
				else if(randomOrder == 4) {
					brocBacon.add(cheese);
					drawCheck2 = true;
				}
				else {
					mushPep.add(cheese);
					drawCheck3 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/cheese.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 1 || randomOrder == 2 || randomOrder == 6) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/olives.png") && !olivesCollected) {  
				olivesCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 1) {
					pestoPine.add(olives);
					drawCheck3 = true;
				}
				else if(randomOrder == 2) {
					olivePepper.add(olives);
					drawCheck3 = true;
				}
				else {
					bothSauce.add(olives);
					drawCheck4 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/olives.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 1 || randomOrder == 4) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/bacon.png") && !baconCollected) {  
				baconCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 1) {
					pestoPine.add(bacon);
					drawCheck4 = true;
				}
				else {
					brocBacon.add(bacon);
					drawCheck3 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/bacon.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 2 || randomOrder == 6) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/pepper.png") && !pepperCollected) {  
				pepperCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 2) {
					olivePepper.add(pepper);
					drawCheck4 = true;
				}
				else {
					bothSauce.add(pepper);
					drawCheck3 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/pepper.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if((randomOrder == 3 || randomOrder == 4) && sprite.collision(items.get(i)) && 
					items.get(i).getImageString() == ("images/objects/broc.png") && !brocCollected) {  
				brocCollected = true;
				items.get(i).y_coordinate = 900;
				if(randomOrder == 3) {
					mushBroc.add(broc);
					drawCheck3 = true;
				}
				else {
					brocBacon.add(broc);
					drawCheck1 = true;
				}
			}
			else if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/broc.png")) {  
				sprite.die();
				isDead = true;
				items.get(i).y_coordinate = 900;
			}
			if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/knife.png")) {  
				sprite.die();
				isDead = true;
			}
			if (sprite.collision(items.get(i)) && items.get(i).getImageString() == ("images/objects/poison.png")) {  
				sprite.die();
				isDead = true;
			}

			checkCompletedOrder();

			if(orderComplete)
				greenOrderTimer++;

			
		}



		// You can also check to see if two objects intersect like this. In this case if the sprite collides with the
		// item, the item will get smaller. 
		//if(sprite.collision(item2) && sprite.getY() < item2.getY() || sprite.collision(item4) && sprite.getY() < item4.getY()) {
		//	System.out.println("stop");
		//	sprite.die();
		//	isDead = true;
		//}
		this.repaint();
	}


	public void checkCompletedOrder() {
		if(pestoPine.contains(dough) && pestoPine.contains(pesto) && pestoPine.contains(pine) && pestoPine.contains(olives) && 
				pestoPine.contains(bacon) && pestoPine.size() >= 5) {
			System.out.println("order complete");
			orderComplete = true;
			completedOrder();
		}
		else if(olivePepper.contains(dough) && olivePepper.contains(sauce) && olivePepper.contains(cheese) && olivePepper.contains(olives) &&
				olivePepper.contains(pepper) && olivePepper.size() >= 5) {
			System.out.println("order complete");
			orderComplete = true;
			completedOrder();
		}
		else if(mushBroc.contains(sauce) && mushBroc.contains(mush) && mushBroc.contains(broc) && mushBroc.contains(pep) && mushBroc.size() >= 5) {
			System.out.println("order complete");
			orderComplete = true;
			completedOrder();
		}
		else if(brocBacon.contains(broc) && brocBacon.contains(cheese) && brocBacon.contains(bacon) && brocBacon.contains(pine) && brocBacon.size() >= 5) {
			System.out.println("order complete");
			orderComplete = true;
			completedOrder();
		}
		else if(mushPep.contains(pesto) && mushPep.contains(cheese) && mushPep.contains(mush) && mushPep.contains(pep) && mushPep.size() >= 5) {
			System.out.println("order complete");
			orderComplete = true;
			completedOrder();
		}
		else if(bothSauce.contains(sauce) && bothSauce.contains(pesto) && bothSauce.contains(olives) && bothSauce.contains(pepper) && bothSauce.size() >= 5) {
			System.out.println("order complete");
			orderComplete = true;
			completedOrder();
		}

	}
	public void completedOrder() {

		if(greenOrderTimer >= 200) {
			ordersCount++;
			
			pestoPine.clear();
			olivePepper.clear();
			mushBroc.clear();
			brocBacon.clear();
			mushPep.clear();
			bothSauce.clear();

			randomOrder = (int)(Math.random()*6);
			switch(randomOrder) {
			case 1: //pesto, pineapple, olives, bacon
				System.out.println(randomOrder);
				break;
			case 2: //sauce, cheese, olives, peppers
				System.out.println(randomOrder);
				break;
			case 3: //sauce, mushrooms, broccoli, pepperoni
				System.out.println(randomOrder);
				break;
			case 4: //broccoli, cheese, bacon, pineapple
				System.out.println(randomOrder);
				break;
			case 5: //pesto, mushrooms, cheese, pepperoni
				System.out.println(randomOrder);
				break;
			default: //sauce, pesto, peppers, olives
				randomOrder = 6;
				System.out.println(randomOrder);
				break;	
			}

			doughCollected = false;
			sauceCollected = false;
			pestoCollected = false;
			mushCollected = false;
			pineCollected = false;
			pepCollected = false;
			cheeseCollected = false;
			olivesCollected = false;
			baconCollected = false;
			pepperCollected = false;
			brocCollected = false;

			drawCheck1 = false;
			drawCheck2 = false;
			drawCheck3 = false;
			drawCheck4 = false;

			greenOrderTimer = 0;
		}
	}


	public void reset() {
		startMessage = true;
		isDead = false;
		greenOrderTimer = 0;
		orderComplete = false;
		ordersCount = 0;
		drawCheck1 = false;
		drawCheck2 = false;
		drawCheck3 = false;
		drawCheck4 = false;

		item1.x_coordinate = 1800;
		item1.y_coordinate = 650;
		item2.x_coordinate = 2200;
		item2.y_coordinate = 650; 
		item3.x_coordinate = 2600;
		item3.y_coordinate = 650;
		item4.x_coordinate = 3000;
		item4.y_coordinate = 650;
		item5.x_coordinate = 3400;
		item5.y_coordinate = 650;

		doughCollected = false;
		sauceCollected = false;
		pestoCollected = false;
		mushCollected = false;
		pineCollected = false;
		pepCollected = false;
		cheeseCollected = false;
		olivesCollected = false;
		baconCollected = false;
		pepperCollected = false;
		brocCollected = false;

		pestoPine.clear();
		olivePepper.clear();
		mushBroc.clear();
		brocBacon.clear();
		mushPep.clear();
		bothSauce.clear();
	}
	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyPressed(KeyEvent e) {

		//		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		//			sprite.walkRight();
		//		else if(e.getKeyCode() == KeyEvent.VK_LEFT)
		//			sprite.walkLeft();
		//				 if(e.getKeyCode() == KeyEvent.VK_UP)
		//					sprite.moveUp();
		//				else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		//					sprite.moveDown();
		//					sprite.y_coordinate--;
		//				}

		//		if(e.getKeyCode() == KeyEvent.VK_SPACE && isDead == false)
		//			sprite.run();
		if(e.getKeyCode() == KeyEvent.VK_UP && isDead == false)
			sprite.jump();
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			startMessage = false;
			this.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_R) {
			reset();
		}
		//		else if(e.getKeyCode() == KeyEvent.VK_D) {
		//			playSound("src/sounds/bump.WAV");
		//			sprite.die();	
		//	}
	}

	// This function will play the sound "fileName".
	//	public static void playSound(String fileName) {
	//		try {
	//			File url = new File(fileName);
	//			Clip clip = AudioSystem.getClip();
	//
	//			AudioInputStream ais = AudioSystem.getAudioInputStream(url);
	//			//clip.open(ais);
	//			//clip.start();
	//		}
	//		catch (Exception ex) {
	//			ex.printStackTrace();
	//		}
	//	}

	// method: keyTyped()
	// description: This method is called when a key is pressed and released. It basically combines the keyPressed and
	//              keyReleased functions.  You can determine which key is typed using the KeyEvent object.  
	//				For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if the left key was typed.
	//				You probably don't want to do much in this method, but instead want to implement the keyPresses and keyReleased methods.
	// parameters: KeyEvent e
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D )
			isDead = true;

		this.repaint();
	}

	// method: keyReleased()
	// description: This method is called when a key is released. You can determine which key is released using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyReleased(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT)
			sprite.idle();
		else if(e.getKeyCode() ==  KeyEvent.VK_UP || e.getKeyCode() ==  KeyEvent.VK_DOWN)
			sprite.stop_Vertical();
		//		else if(e.getKeyCode() ==  KeyEvent.VK_SPACE)
		//			sprite.slowDown();

	}
}
