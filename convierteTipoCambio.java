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
	
	

//FUNCIONES DE CONVERSION DE TIPOS DE CAMBIO
	
	//Clase que pide ingreso de dato con JOptionPane, valida el ingreso, calcula y muestra en pantalla.
	// Validacion por conversion del String a double y captura de excepciones
	// las validaciones probadas son: no ser negativo, no contener caracteres, poseer punto y no coma.
	private void ingresoValido(String monedaIn, String monedaOut, double conversion) {
		
		String ingreso;
		
		ingreso = JOptionPane.showInputDialog(null, "Ingrese cantidad a convertir: ", "Conversión de " + monedaIn + " a " + monedaOut, JOptionPane.DEFAULT_OPTION);

		try {	//probamos si la conversión del numero ingresado a double se hace correctamente
			// pudiendo no ser asi si dispone de caracteres alfanumericos o separadores decimales
			//que no sean puntos
		
			double numero = Double.parseDouble(ingreso);
			
			if(numero < 0) {
				JOptionPane.showMessageDialog(null, "El numero ingresado es negativo, no es posible, reintente");
			}			
		
			//En la muestra del dato uso Expresiones Regulares para indicarle que muestre solo dos decimales %.2f
			JOptionPane.showMessageDialog(null, numero + monedaIn + " equivale a "
					+ String.format("%.2f", numero * conversion) + monedaOut, "Conversión de " + monedaIn 
					+ " a " + monedaOut, JOptionPane.DEFAULT_OPTION);
			
			
		//Capturamos la excepción, mostramos por pantalla y consola, pero seguimos. 
		} catch(NumberFormatException e) {
		System.out.println("El dato ingresado no puede ser procesado, reintente.");
		JOptionPane.showMessageDialog(null, "El dato ingresado no puede ser procesado, reintente.");
		e.printStackTrace();
		} 
		
	}

	//Clases que indican, segun el cambio a realizar, las monedas de ingreso/egreso y tipo de cambio
	//Aqui deberia intervenir la conexion a API
	private Object convPesoADolar() {
	
		String monedaIn = " Peso ";		
		String monedaOut = " Dolar ";		
		double conversion = 0.005;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
		
	}
		
	private Object convPesoAEuro() {
		
		String monedaIn = " Peso ";		
		String monedaOut = " Euro ";		
		double conversion = 0.0047;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
	}
	
	private Object convPesoALibra() {
		
		String monedaIn = " Peso ";		
		String monedaOut = " Libra Esterlina ";		
		double conversion = 0.0042;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
		
	}

	private Object convPesoAYen() {
		
		String monedaIn = " Peso ";		
		String monedaOut = " Yen ";		
		double conversion = 0.69;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
		
	}
	
	private Object convPesoAWon() {
		
		String monedaIn = " Peso ";		
		String monedaOut = " Won ";		
		double conversion = 6.6;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
		
	}

	private Object convDolAPeso() {
		String monedaIn = " Dolar ";		
		String monedaOut = " Peso ";		
		double conversion = 199.68;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
	}
	private Object convEurAPeso() {
		String monedaIn = " Euro ";		
		String monedaOut = " Peso ";		
		double conversion = 210.72;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
	}
	
	private Object convLibraAPeso() {
		String monedaIn = " Libra Esterlina ";		
		String monedaOut = " Peso ";		
		double conversion = 236.25;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
	}
	
	private Object convYenAPeso() {
		String monedaIn = " Yen ";		
		String monedaOut = " Peso ";		
		double conversion = 1.46;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
	}
	
	private Object convWonAPeso() {
		String monedaIn = " Won ";		
		String monedaOut = " Peso ";		
		double conversion = 0.15;		
		System.out.println("Conversión de " + monedaIn + " a " + monedaOut);		
		ingresoValido(monedaIn, monedaOut, conversion);		
		return null;
	}

	
	

		

}
