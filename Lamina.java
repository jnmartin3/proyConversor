package proyConversor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Lamina extends JPanel {
	
	public Lamina() {
		
		setLayout(new BorderLayout());
		
		resultado = new JButton("La conversion elegida aparecera en este sitio");
		resultado.setEnabled(false);
		
		lamina = new JPanel();
		
		ingreso = new JTextArea(2,5);
		
		combo1 = new JComboBox<String>();
		
		combo1.addItem("AR$ a Dolar EEUU");
		combo1.addItem("AR$ a Euro");
		
		lamina.add(ingreso);
		
		lamina.add(combo1);
		
		add(resultado, BorderLayout.CENTER);
		
		add(lamina, BorderLayout.NORTH);
		
		Evento_tipo_cambio eventoTipo = new Evento_tipo_cambio();
		combo1.addActionListener(eventoTipo);
		
		
		
		
	}
	
	class Evento_tipo_cambio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(combo1.getSelectedIndex() == 0) {
				resultadoConversion = redondear(Double.parseDouble(ingreso.getText()) / 350);
				System.out.println("Conversion $AR a Dolares");
				resultado.setText("Conversion $AR a Dolares: " + resultadoConversion);

			} else if(combo1.getSelectedIndex() == 1) {
				resultadoConversion = redondear(Double.parseDouble(ingreso.getText()) / 400);
				System.out.println("Conversion $AR a Euros");
				resultado.setText("Conversion $AR a Euros: ");
			}
			
		}

		private double redondear(double d) {
			return Math.round(d*100.0)/100.0;
		}

		
	}
	double resultadoConversion = 0;
	JButton resultado;
	JTextArea ingreso;
	JPanel lamina, lamina2;
	JComboBox<String> combo1;
}
