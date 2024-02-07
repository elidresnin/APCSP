// GraphicsMain.java
// Written by: Mr. Swope
// Modified by: Adam Schneid
// Date: February 10th, 2015
// Modification Date: May 6th, 2022
// This is the main class for a simple java program that uses graphics.  You do not need to edit this class.
// Edited the title of the JPanel to "Hangman"

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsMain extends JFrame{
			
		public static void main(String[] args) 
		{	
			GraphicsMain window = new GraphicsMain();
	        JPanel p = new JPanel();
	        p.add(new GraphicsPanel());  //  add a class that extends JPanel
	        window.setTitle("Hangman");
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        window.setContentPane(p);
	        
	        window.pack();
	        window.setLocationRelativeTo(null);
	        window.setVisible(true);
		}

}
