import javax.swing.JFrame;
import javax.swing.JPanel;
import javazoom.jl.player.*;


public class GraphicsMain extends JFrame{

	private static MyAudioPlayer thePlayer;

	public static void main(String[] args) {


		thePlayer = new MyAudioPlayer(".//sounds//music.mp3", true);
		thePlayer.start();

		GraphicsMain window = new GraphicsMain();
		JPanel p = new JPanel();
		p.add(new GraphicsPanel());  
		window.setTitle("LM Video Game Design");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(p);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

}