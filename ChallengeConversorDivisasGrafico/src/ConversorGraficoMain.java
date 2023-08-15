import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGraficoMain extends JFrame {
       private JMenuBar menuBar;
       private JMenu menu;
       private JMenuItem option1;
       private JMenuItem option2;
       private JMenuItem option3;
       
       public ConversorGraficoMain() {
    	   setSize(600, 400);
    	   setTitle("Conversor de ivisas");
    	   setDefaultCloseOperation(EXIT_ON_CLOSE);
    	   
    	   JPanel panel = new JPanel();
    	   verMenu();
    	   panel.add(menuBar);
    	   add(panel);
      }
       
      public void verMenu() {
    	  menuBar = new JMenuBar();
    	  menu = new JMenu("Elija una opcion valida");
    	  option1 = new JMenuItem("1. COP a USD");
    	  option2 = new JMenuItem(" 2. COP a EUR ");
    	  option3 = new JMenuItem("3. salir");
    	  
    	  menu.add(option1);
    	  menu.add(option2);
    	  menu.add(option3);
    	  
    	  menuBar.add(menu);
    	  
    	  option3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saliendo del programa");
				System.exit(0);
				
			}
		});
    	  
      }
       
       
       
	  public static void main(String[] args) {
	    	ConversorGraficoMain ventana = new ConversorGraficoMain();
	    	ventana.setVisible(true);
	    	
			  
	  }
}
