// Graphics Panel
// Written by: Mr. Sw0ope
// Date: February 10th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

public GraphicsPanel(){
	setPreferredSize(new Dimension(1000, 1000));
}


public void paintComponent(Graphics g){
	Graphics2D g2 = (Graphics2D) g;
	 
		int n=0;
		double h=Math.random();
		int h1=(int) (h*1000);
		
		

	while(h1 != n) {
		File testFile = new File("");
		Scanner sc = null;
		try {
			sc = new Scanner(new File(/*testFile.getAbsolutePath()+*/"/Users/s018305/Desktop/fonts.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<String> list = new ArrayList<String>();
		while (sc.hasNext()) {
			list.add(sc.next());
		}
		
		
		String font = list.get((int)(Math.random()*160));
		
			double x=Math.random();
			int x1 = (int)( x*255);
			double y=Math.random();
			int y1 = (int) (y*255);
			double z=Math.random();
			int z1 = (int) (z*255);
			double p=Math.random();
			int p1 = (int) (p*1000);
			double o=Math.random();
			int o1 = (int) (o*1000);
			double m=Math.random();
			int m1 = (int)( m*1000);
			double q=Math.random();
			int q1 = (int) (q*1000);
			double b=Math.random();
			int b1 = (int) (b*1000);
			double c=Math.random();
			int c1 = (int) (c*1000);
			
			g2.setFont(new Font(font, b1, c1));
			g2.setColor(new Color (x1, y1, z1));
			n++;
			
			g2.drawString("Eli", m1, q1);
			System.out.println(n);
			System.out.println(g2.getColor());
			System.out.println(font);
		
			

			}
	
		
		}
}

	
