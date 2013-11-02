package rpgsvg;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;



	public class BackImage extends JPanel {
		 
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		Image i;
		 
		//Creating Constructor
		public BackImage(Image i) {
		this.i = i;
		
		}
		 
		//Overriding the paintComponent method
		protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method
		 
		}
		}
	
	
