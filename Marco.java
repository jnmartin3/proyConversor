package proyConversor;
import javax.swing.*;

public class Marco extends JFrame {

	public Marco() {
		setBounds(500, 300, 400, 200);
		setTitle("Conversor ORACLE/ALURA");
		setVisible(true);
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
	
	
	
}
