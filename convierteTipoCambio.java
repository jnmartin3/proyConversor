package proyConversor;

import javax.swing.JOptionPane;

public class convierteTipoCambio {

	public convierteTipoCambio() {
		System.out.println("Accediendo a opcion de tipo de cambio");
		
		//MENU DE CONVERSION DE TIPOS DE CAMBIO
		
		String [] options = {"Pesos a Dolar", "Pesos a Euros", "Pesos a Libras Esterlinas",
				"Pesos a Yen Japones", "Pesos a Won sul-coreano", "Dolar a Pesos", "Euros a Pesos",
				"Libras Esterlinas a Pesos", "Yen Japones a Pesos", "Won sul-coreano a Pesos" };
        String opcion = JOptionPane.showInputDialog(null, "Seleccione tipo de cambio", "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]).toString();
	
		switch(opcion) {
		case "Pesos a Dolar" -> convPesoADolar();
		case "Pesos a Euros" -> convPesoAEuro();
		case "Pesos a Libras Esterlinas" -> convPesoALibra();
		case "Pesos a Yen Japones" -> convPesoAYen();
		case "Pesos a Won sul-coreano" -> convPesoAWon();
		case "Dolar a Pesos" -> convDolAPeso();
		case "Euros a Pesos" -> convEurAPeso();
		case "Libras Esterlinas a Pesos" -> convLibraAPeso();
		case "Yen Japones a Pesos" -> convYenAPeso();
		case "Won sul-coreano a Pesos" -> convWonAPeso();
		
		default -> System.out.println("Error en menu de eleccion de tipo de conversion de moneda");
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
	
	

//FUNCIONES DE CONVERSION DE TIPOS DE CAMBIO	(Codigo muy repetido, deberia mejorar)	

	private Object convPesoADolar() {
		System.out.println("Conversión de Peso a Dolar");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos", "Conversión Peso a Dolar", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Pesos equivale a " + (numero * 0.005) + 
				" Dólar", "Conversión Peso a Dólar", JOptionPane.DEFAULT_OPTION);
		return null;
	}
		
	private Object convPesoAEuro() {
		System.out.println("Conversión de Peso a Euro");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos", "Conversión Peso a Euros", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Pesos equivale a " + (numero * 0.0047) + 
				" Euros", "Conversión Peso a Euros", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convPesoALibra() {
		System.out.println("Conversión de Peso a Libra Esterlina");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos", "Conversión Peso a Libras Esterlinas", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Pesos equivale a " + (numero * 0.0042) + 
				" Libras Esterlinas", "Conversión Peso a Libras Esterlinas", JOptionPane.DEFAULT_OPTION);
		return null;
	}

	private Object convPesoAYen() {
		System.out.println("Conversión de Peso a Yen Japonés");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos", "Conversión Peso a Yen Japonés", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Pesos equivale a " + (numero * 0.69) + 
				" Yen Japonés", "Conversión Peso a Yen Japonés", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convPesoAWon() {
		System.out.println("Conversión de Peso a Won sul-coreano");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos", "Conversión Peso a Won sul-coreano", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Pesos equivale a " + (numero * 6.6) + 
				" Won sul-coreano", "Conversión Peso a Won sul-coreano", JOptionPane.DEFAULT_OPTION);
		return null;
	}

	private Object convDolAPeso() {
		System.out.println("Conversión de Dólar a Peso");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Dólares", "Conversión Dólar a Peso", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Dólares equivale a " + (numero * 199.68) + 
				" Pesos", "Conversión Dólar a Peso", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	private Object convEurAPeso() {
		System.out.println("Conversión de Euro a Peso");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Euros", "Conversión Euro a Peso", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Euros equivale a " + (numero * 210.72) + 
				" Pesos", "Conversión Euro a Peso", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convLibraAPeso() {
		System.out.println("Conversión de Libra Esterlina a Peso");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Libras Esterlinas", "Conversión Libra Esterlina a Peso", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Libras Esterlinas equivale a " + (numero * 236.25) + 
				" Pesos", "Conversión Libras Esterlinas a Peso", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convYenAPeso() {
		System.out.println("Conversión de Yen Japonés a Peso");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Yen Japonés", "Conversión Yen Japonés a Peso", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Yen Japonés equivale a " + (numero * 1.46) + 
				" Pesos", "Conversión Yen Japonés a Peso", JOptionPane.DEFAULT_OPTION);
		return null;
	}
	
	private Object convWonAPeso() {
		System.out.println("Conversión de Won sul-coreano a Peso");
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de Won sul-coreano", "Conversión Won sul-coreano a Peso", JOptionPane.DEFAULT_OPTION));
		JOptionPane.showMessageDialog(null, numero + " Won sul-coreano equivale a " + (numero * 0.15) + 
				" Pesos", "Conversión Won sul-coreano a Peso", JOptionPane.DEFAULT_OPTION);
		return null;
	}

	
	

		

}
