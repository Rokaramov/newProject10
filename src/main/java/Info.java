

import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Info {
	protected static JPanel panell = new JPanel();
	public Info(String txt) {
		
        final JFrame j2 = new JFrame("");    
        j2.setTitle("Информация");     
        j2.setBounds(600,200,420,210);
        j2.setResizable(false); 
        
        panell.setBackground(Color.WHITE);
        panell.setLayout(null);
        JTextArea text = new JTextArea(txt);
        text.setEditable(false);
        JButton button = new JButton("Назад");
        text.setBounds(10,0,420,80);
        text.setEditable(false);
        button.setBounds(100,135,100,30);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
        button.addActionListener(new ListenerButton() {
        	public void actionPerformed(ActionEvent arg0) {
        		j2.dispose();
        	}       	
        });
        
        panell.add(text);
        j2.add(panell);
        panell.add(button);
        j2.setVisible(true);
        
 }
}

