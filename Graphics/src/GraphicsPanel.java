// Graphics Panel
// Written by: Mr. Swope
// Date: February 10th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{

	// method: GraphicsPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  You do not need to edit this method.
	public GraphicsPanel(){
		setPreferredSize(new Dimension(1024, 1024 ));
	}
	
	
	public void backGreen(int x, int y, Graphics2D g2) {
		 	g2.setColor(new Color(56, 70, 59)); //darker green
	        g2.fillRect(x, y, 20, 20);
	        g2.setColor(new Color(61, 73, 63)); //lighter green
	        g2.fillRect(x + 20, y, 60, 20);
	}
	public void offBackGreen(int x, int y, Graphics2D g2) {
		 	g2.setColor(new Color(61, 73, 63)); //lighter green
	        g2.fillRect(x, y, 40, 20);
	        g2.setColor(new Color(56, 70, 59)); //darker green
	        g2.fillRect(x + 40, y, 20, 20);
	        g2.setColor(new Color(61, 73, 63)); //lighter green
	        g2.fillRect(x + 60, y, 20, 20);
	       
	}
	public void rowGreen(int x, int y, Graphics2D g2) {
	        g2.setColor(new Color(61, 73, 63)); //lighter green
	        g2.fillRect(x, y, 1024, 20);
	}
	
	public void line1(int y, Graphics2D g2) {
		backGreen(0, y, g2);
		backGreen(80, y, g2);
		backGreen(160, y, g2);
		backGreen(240, y, g2);
		backGreen(320, y, g2);
		backGreen(400, y, g2);
		backGreen(480, y, g2);
		backGreen(560, y, g2);
		backGreen(640, y, g2);
		backGreen(720, y, g2);
		backGreen(800, y, g2);
		backGreen(880, y, g2);
		backGreen(960, y, g2);
		
	}
	public void line2(int y, Graphics2D g2) {
		offBackGreen(0, y, g2);
		offBackGreen(80, y, g2);
		offBackGreen(160, y, g2);
		offBackGreen(240, y, g2);
		offBackGreen(320, y, g2);
		offBackGreen(400, y, g2);
		offBackGreen(480, y, g2);
		offBackGreen(560, y, g2);
		offBackGreen(640, y, g2);
		offBackGreen(720, y, g2);
		offBackGreen(800, y, g2);
		offBackGreen(880, y, g2);
		offBackGreen(960, y, g2);
	}
	

	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		//use g2 to call your methods
		
		line1(0, g2);
		
		rowGreen(0, 20, g2);
		
		line2(40, g2);
		
		rowGreen(0, 60, g2);
		
		line1(80, g2);
		
		rowGreen(0, 100, g2);
		
		line2(120, g2);
		
		rowGreen(0, 140, g2);
		
		line1(160, g2);
		
		rowGreen(0, 180, g2);
		
		line2(200, g2);
		
		rowGreen(0, 220, g2);
		
		//start of head
		
		line1(240, g2);
		
		g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(400, 240, 80, 20);
        
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(480, 240, 120, 20);
        
        rowGreen(0, 260, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(360, 260, 140, 20);
        
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(500, 260, 120, 20);
        
        line2(280, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(360, 280, 160, 20);
       
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(520, 280, 120, 20);
        
        rowGreen(0, 300, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(360, 300, 160, 20);
       
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(520, 300, 140, 20);
        
        line1(320, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(340, 320, 240, 20);
        
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(540, 320, 120, 20);
        
        rowGreen(0, 340, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(340, 340, 100, 20);
        
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(440, 340, 200, 20);
        
        line2(360, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(340, 360, 160, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(500, 360, 20, 20);
        
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(520, 360, 80, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(600, 360, 20, 20);
        
        g2.setColor(new Color(48, 30, 15)); //lighter green
        g2.fillRect(620, 360, 20, 20);
        
        rowGreen(0, 380, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(340, 380, 100, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(440, 380, 20, 20);
        
        g2.setColor(new Color(0, 0, 0)); //lighter green
        g2.fillRect(460, 380, 40, 20);
       
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(500, 380, 40, 20);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(540, 380, 40, 20);
        
        g2.setColor(new Color(0, 0, 0)); //lighter green
        g2.fillRect(580, 380, 40, 20);
       
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(620, 380, 20, 20);
        
        line1(400, g2);
       
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(340, 400, 100, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(440, 400, 100, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(540, 400, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(560, 400, 80, 20);
        
        rowGreen(0, 420, g2);
        
        g2.setColor(new Color(40, 27, 15)); //lighter green
        g2.fillRect(340, 420, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(360, 420, 100, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(460, 420, 20, 20);
        
        g2.setColor(new Color(0, 0, 0)); //lighter green
        g2.fillRect(480, 420, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(500, 420, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(520, 420, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(540, 420, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(560, 420, 20, 20);
        
        g2.setColor(new Color(0, 0, 0)); //lighter green
        g2.fillRect(580, 420, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(600, 420, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(620, 420, 20, 20);
        
        line2(440, g2);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(340, 440, 20, 20);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(360, 440, 40, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(400, 440, 40, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(440, 440, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(460, 440, 20, 20);
        
        g2.setColor(new Color(0, 0, 0)); //lighter green
        g2.fillRect(480, 440, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(500, 440, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(520, 440, 60, 20);
        
        g2.setColor(new Color(0, 0, 0)); //lighter green
        g2.fillRect(580, 440, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(600, 440, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(620, 440, 20, 20);
        
        rowGreen(0, 460, g2);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(340, 460, 20, 20);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(360, 460, 40, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(400, 460, 40, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(440, 460, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(460, 460, 60, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(520, 460, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(540, 460, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(560, 460, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(580, 460, 40, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(620, 460, 20, 20);
        
        line1(480, g2);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(360, 480, 100, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(460, 480, 60, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(520, 480, 20, 20);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(540, 480, 20, 20);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(560, 480, 20, 20);
        
        g2.setColor(new Color(79, 79, 79)); //lighter green
        g2.fillRect(580, 480, 40, 20);
        
        rowGreen(0, 500, g2);
        
        line2(520, g2);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(400, 500, 220, 40);
        
        rowGreen(0, 540, g2);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(420, 540, 180, 20);
        
        line1(560, g2);
        
        g2.setColor(new Color(245, 194, 153)); //lighter green
        g2.fillRect(440, 560, 140, 20);
        
        rowGreen(0, 580, g2);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(440, 580, 120, 20);
        
        line2(600, g2);
        
        g2.setColor(new Color(180, 176, 181)); //lighter green
        g2.fillRect(380, 600, 60, 20);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(440, 600, 120, 20);
        
        g2.setColor(new Color(180, 176, 181)); //lighter green
        g2.fillRect(560, 600, 40, 20);
        
        rowGreen(0, 620, g2);
        
        g2.setColor(new Color(131, 129, 133)); //lighter green
        g2.fillRect(360, 620, 80, 20);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(440, 620, 120, 20);
        
        g2.setColor(new Color(131, 129, 133)); //lighter green
        g2.fillRect(560, 620, 60, 20);
        
        line1(640, g2);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(440, 640, 120, 20);
        
        g2.setColor(new Color(131, 129, 133)); //lighter green
        g2.fillRect(340, 640, 120, 20);
        
        g2.setColor(new Color(131, 129, 133)); //lighter green
        g2.fillRect(540, 640, 120, 20);
        
        rowGreen(0, 660, g2);
        
        g2.setColor(new Color(131, 129, 133)); //lighter green
        g2.fillRect(320, 660, 180, 20);
        
        g2.setColor(new Color(224, 169, 126)); //lighter green
        g2.fillRect(500, 660, 20, 20);
        
        g2.setColor(new Color(131, 129, 133)); //lighter green
        g2.fillRect(520, 660, 160, 20);
        
        line2(680, g2);
        
        
        
        rowGreen(0, 700, g2);
        
        line1(720, g2);
        rowGreen(0, 740, g2);
        line2(760, g2);
        rowGreen(0, 780, g2);
        line1(800, g2);
        rowGreen(0, 820, g2);
        line2(840, g2);
        rowGreen(0, 860, g2);
        line1(880, g2);
        rowGreen(0, 900, g2);
        line2(920, g2);
        rowGreen(0, 940, g2);
        line1(960, g2);
        rowGreen(0, 980, g2);
        line2(1000, g2);
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
