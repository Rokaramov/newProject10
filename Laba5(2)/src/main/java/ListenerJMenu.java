

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ListenerJMenu implements ActionListener {

	
	    public void actionPerformed(ActionEvent arg0) {
		try {
			new Logo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	 }	
}
