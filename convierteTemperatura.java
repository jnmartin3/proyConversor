package proyConversor;

import javax.swing.JOptionPane;

public class convierteTemperatura {
	
	public convierteTemperatura() {
		
		System.out.println("Accediendo a opción de temperatura");
		
		//MENU DE CONVERSION DE TEMPERATURAS
		
		String [] options = {"Celsius a Kelvin", "Celsius a Farenheit", "Kelvin a Celsius", "Kelvin a Farenheit", "Farenheit a Celsius", "Farenheit a Kelvin"};
	    String opcion = JOptionPane.showInputDialog(null, "Seleccione la conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]).toString();
	
	    switch(opcion) {
	    case "Celsius a Kelvin" -> convCelAKel();
	    case "Celsius a Farenheit" -> convCelAFar();
	    case "Kelvin a Celsius" -> convKelACel();
	    case "Kelvin a Farenheit" -> convKelAFar();
	    case "Farenheit a Celsius" -> convFarACel();
	    case "Farenheit a Kelvin" -> convFarAKel();
	    default -> System.out.println("Opción incorrecta en menu de conversión de temperatura");
	    }
	    

	    //VENTANA DE CONTINUACION O FINALIZACION
	    
	    int reinicia = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	    switch(reinicia) {
	    case 0 ->{
	    	//Vuelve a repetir el menu del inicio que esta en Conversor.java    #########   Mejorar!!   ####
	    	String [] ops = {"Tipo de cambio", "Temperatura"};
	        String op = JOptionPane.showInputDialog(null, "Seleccione la conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, ops, ops[0]).toString();
	        switch(op) {
	        case "Tipo de cambio" -> new convierteTipoCambio();
	        case "Temperatura" -> new convierteTemperatura();
	        default -> System.out.println("Error en la elección de menu inicial");
	        }
	    	}
	    default -> JOptionPane.showMessageDialog(null, "Programa finalizado, gracias!");
	    }
	    
	    
	}



//FUNCIONES DE CONVERSION DE TEMPERATURAS	(Codigo muy repetido, deberia mejorar)

	private Object convCelAFar() {
		System.out.println("Conversión Celsius a Farenheit");
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en °Celsius"));
		JOptionPane.showMessageDialog(null, numero + " °Celsius equivale a " + ((numero * 9/5) + 32) + 
				" °Farenheit", "Conversión °Celsius a °Farenheit", JOptionPane.DEFAULT_OPTION);
		return null;
	}

	private Object convCelAKel() {
		System.out.println("Conversión Celsius a Kelvin");
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en °Celsius"));
		JOptionPane.showMessageDialog(null, numero + " °Celsius equivale a " + (numero + 273.15) + 
				" Kelvin", "Conversión °Celsius a Kelvin", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convFarACel() {
		System.out.println("Conversión Farenheit a Celsius");
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en °Farenheit"));
		JOptionPane.showMessageDialog(null, numero + " °Farenheit equivale a " + ((numero-32) *5/9) + 
				" °Celsius", "Conversión °Farenheit a °Celsius", JOptionPane.DEFAULT_OPTION);
		return null;
	}

	private Object convKelACel() {
		System.out.println("Conversión Kelvin a Celsius");
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en Kelvin"));
		JOptionPane.showMessageDialog(null, numero + " Kelvin equivale a " + (numero - 273.15) + 
				" °Celsius", "Conversión Kelvin a °Celsius", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convFarAKel() {
		System.out.println("Conversión Farenheit a Kelvin");
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en °Farenheit"));
		JOptionPane.showMessageDialog(null, numero + " °Farenheit equivale a " + (((numero-32) *5/9) + 273.15) + 
				" Kelvin", "Conversión °Farenheit a Kelvin", JOptionPane.DEFAULT_OPTION);
		return null;
	}


	private Object convKelAFar() {
		System.out.println("Conversión Kelvin a Farenheit");
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en Kelvin"));
		JOptionPane.showMessageDialog(null, numero + " Kelvin equivale a " + ((numero - 273.15) * 9/5 + 32) + 
				" °Farenheit", "Conversión Kelvin a °Farenheit", JOptionPane.DEFAULT_OPTION);
		return null;
	}

}
