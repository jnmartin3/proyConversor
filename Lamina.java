package proyConversor;
import java.awt.BorderLayout;

import javax.swing.*;

public class Lamina extends JFrame {
	
	public Lamina() {
		
//		setLayout(new BorderLayout());
		
		JPanel lamina = new JPanel();
		
		JComboBox<String> combo1 = new JComboBox<String>();
		
		combo1.addItem("Peso a Dolar EEUU");
		combo1.addItem("Peso a Euro");
		
		lamina.add(combo1);
		
		add(lamina);
		
		
		
	}
}
