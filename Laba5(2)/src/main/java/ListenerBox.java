
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenerBox implements ActionListener {
	
    
    public void actionPerformed(ActionEvent arg0) {
    
            String s = (String) subversion.box.getSelectedItem();	
    		
            switch (s) {
            case "Переместить логотип УГАТУ в середину":
            	
                Logo.image.setBounds(146,10,100,30);
              
            break;
            case "Переместить логотип УГАТУ в левый верхний угол":
            	
            	Logo.image.setBounds(8,10,100,30);
            	
                break;
            case "Переместить логотип УГАТУ в правый верхний угол":     	
            
            	Logo.image.setBounds(286,10,100,30);
                
                break;
            default:
            	
            }	
        }   
    }
