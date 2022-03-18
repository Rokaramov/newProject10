


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


class Menu {
	protected static JTextArea area = new JTextArea();
	public Menu( JMenu n, JMenuBar bar) {

    JMenuItem open = new JMenuItem("Отобразить логотип");
    JMenuItem exit = new JMenuItem("Выход");
    JMenuItem zagruz = new JMenuItem("Загрузить файл в проект10");
    n.add(open);
    n.addSeparator();
    n.add(zagruz);
    n.addSeparator();
    n.add(exit);
    exit.addActionListener(new ListenerButton());
    open.addActionListener(new ListenerJMenu());   
    zagruz.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			area.setBounds(10,90,240,45);
            area.setEditable(false);
            Info.panell.add(area);
    		try {
				new Read();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		Info.panell.repaint();
			
		}
    	      
    		});
    bar.add(n);
    n.setForeground(Color.WHITE);
    bar.setBackground(Color.GRAY);
    bar.setBorderPainted(false);
    bar.add(n);
    
	}
}
