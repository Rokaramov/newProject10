import javax.swing.ImageIcon;
import java.io.IOException;
import java.awt.Image;
import javax.swing.JLabel;
import javax.imageio.ImageIO;

public class Logo  {
	
   protected static JLabel image = new JLabel();
	
  public Logo() throws IOException {
	   Image imaga = ImageIO.read(Logo.class.getResourceAsStream("/logo.jpg")); 
	   
	   ImageIcon imIc = new ImageIcon(imaga);
	   
	   image.setIcon(imIc);	   
	   subversion.main_panel.add(image);
	   subversion.main_panel.repaint();
	   image.setBounds(286,10,100,30);
		
    }      
}