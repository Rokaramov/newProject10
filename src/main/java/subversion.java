

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import static java.lang.Math.*;
public class subversion  {

    protected JFrame main_GUI;  
	protected static String[] items = {"Переместить логотип УГАТУ в правый верхний угол", 
            "Переместить логотип УГАТУ в середину", 
            "Переместить логотип УГАТУ в левый верхний угол","Отсортировать данные в проекте 10"};
    protected static JComboBox box = new JComboBox(items);
    protected static JPanel main_panel = new JPanel();
    protected static String arText;
    private double r;
    private double a;
    
	public subversion() {
    JFrame main_GUI = new JFrame();
		
	main_GUI.setTitle ("Главная страница");
	main_GUI.setBounds(200,50,800,620);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	main_panel.setLayout(null);
	main_panel.setBackground(Color.WHITE);
	main_GUI.add(main_panel);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(220,200,150,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	button_exit.setBackground(Color.GRAY);
	button_exit.setForeground(Color.WHITE);
	main_panel.add(button_exit);
	main_panel.setBackground(Color.WHITE);
	
	JLabel asu = new JLabel("Кафедра АСУ");
	asu.setBounds(286,40,100,30);
	main_panel.add(asu);
	
	JButton button_info = new JButton("Информация");
    button_info.setBounds(20,200,150,40);
    button_info.setForeground(Color.WHITE);
    button_info.setBackground(Color.GRAY);
    ActionListener actionListener2 = new ListenerButton2();
    button_info.addActionListener(actionListener2);
    main_panel.add(button_info);
	
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Меню");
    new Menu (menu, menuBar);
    main_GUI.setJMenuBar(menuBar);
    
    box.setBounds(20,150,350,40);
    box.addActionListener(new ListenerBox());
    box.setBackground(Color.GRAY);
    box.setForeground(Color.WHITE);
    box.setFocusable(false);
    main_panel.add(box);
    
    JLabel inputAPanel = new JLabel("R:");
    inputAPanel.setBounds(35,50,60,60);
    main_panel.add(inputAPanel);
    JLabel inputBPanel = new JLabel("a:");
    inputBPanel.setBounds(35,75,60,60);
    main_panel.add(inputBPanel);
    
    final JTextField aTextField = new JTextField("0");
    aTextField.setBounds(50,70,50,20);
    main_panel.add(aTextField);
    
    final JTextField bTextField = new JTextField("0");
    bTextField.setBounds(50,100,50,20);
    main_panel.add(bTextField);
    
    JLabel resultlabel = new JLabel("<html>Площадь кругового <br> сектора:</html>");
    resultlabel.setBounds(110,40,200,80);
    main_panel.add(resultlabel);
    
    JButton rasschet = new JButton("Рассчитать");
    rasschet.setBounds(110,100,120,25);
    rasschet.setBackground(Color.GRAY);
    rasschet.setForeground(Color.WHITE);  
    
    final JLabel generateLabel = new JLabel("");
    generateLabel.setBounds(150,250,40,40);
    main_panel.add(generateLabel);
    
    JButton generateButton = new JButton("Генерация числа");
    generateButton.setBounds(150, 300, 200, 40);
    generateButton.addActionListener(new ActionListener() {
    	
    	public void actionPerformed(ActionEvent e) {
    		new generate();
    		generateLabel.setText(String.valueOf(generate.i));
    	}
    	
    });
    main_panel.add(generateButton);
    
    final JLabel arLabel = new JLabel("");
    arLabel.setBounds(10,350,800,40);
    main_panel.add(arLabel);
    
    JButton arButton = new JButton("Генерация массива");
    arButton.setBounds(150, 400, 150, 40);
    arButton.addActionListener(new ActionListener() {
    	
    	public void actionPerformed(ActionEvent e) {
    		if(generate.i == 0) {
    			arLabel.setText("Сгенерируй число");
    		} else {
    		new Ar();
    		arText = "";
    		for (int i = 0; i < 14; i++) {
    			int c = i+1;
    			arText = arText + " " + c + " - " + Ar.x[i] + "; ";
    		}
    		} 		
    		arLabel.setText(arText);
    	}
    	
    });
    main_panel.add(arButton);
    
    final JLabel sorLabel = new JLabel("");
    sorLabel.setBounds(10,450,800,40);
    main_panel.add(sorLabel);
    
    JButton sorButton = new JButton("Генерация массива");
    sorButton.setBounds(150, 500, 150, 40);
    sorButton.addActionListener(new ActionListener() {
    	
    	public void actionPerformed(ActionEvent e) {
    		if(generate.i == 0) {
    			sorLabel.setText("Сгенерируй число");
    		} else {
    		new Sortirovka();
    		arText = "";
    		for (int i = 0; i < 14; i++) {
    			int c = i+1;
    			arText = arText + " " + c + " - " + Ar.x[i] + "; ";
    		}
    		} 		
    		sorLabel.setText(arText);
    	}
    	
    });
    main_panel.add(sorButton);
   
    final JLabel rezult = new JLabel();
    main_panel.add(rezult);

    rasschet.addActionListener(new ActionListener() {
    	  	
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
                r = Double.parseDouble(aTextField.getText());
                a = Double.parseDouble(bTextField.getText());
                if (a > 360) {
                	JOptionPane.showMessageDialog(null, "Диапазон возможных значений для угла: 0 - 360");
                }
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "Введите число");
                return;
            } 		   
			   rezult.setBounds(173,62,100,50);				  
			   double result;
			   result = (PI * getRadius() * getRadius() / 360) * getAngle() ;
		       DecimalFormat df = new DecimalFormat("###.#####");
			   rezult.setText(df.format(result));			
		}			
 });
 
    main_panel.add(rasschet);
	main_GUI.setVisible(true);	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	}
		
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();	
	}	
	
	public void setAngle(double a) {
		this.a = a;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public double getAngle() {
		return a;
	}
	
	public double getRadius() {
		return r;
	}
	
}