
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenerBox implements ActionListener {
	
    
    public void actionPerformed(ActionEvent arg0) {
    
            String s = (String) subversion.box.getSelectedItem();	
    		
            switch (s) {
            case "����������� ������� ����� � ��������":
            	
                Logo.image.setBounds(146,10,100,30);
              
            break;
            case "����������� ������� ����� � ����� ������� ����":
            	
            	Logo.image.setBounds(8,10,100,30);
            	
                break;
            case "����������� ������� ����� � ������ ������� ����":     	
            
            	Logo.image.setBounds(286,10,100,30);
                
                break;
            default:
            	
            }	
        }   
    }
