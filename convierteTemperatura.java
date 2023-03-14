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
	
	//Clase que pide ingreso de dato con JOptionPane, valida el ingreso, calcula y muestra en pantalla.
		// Validacion por conversion del String a double y captura de excepciones
		// las validaciones probadas son: no ser negativo, no contener caracteres, poseer punto y no coma.
		private double ingresoValidoTemp(String tempIn, String tempOut) {
						
			String ingreso = JOptionPane.showInputDialog(null, "Ingrese temperatura a convertir: ", "Conversión de " + tempIn + " a " + tempOut, JOptionPane.DEFAULT_OPTION);
			double numero;
			
			try {	//probamos si la conversión del numero ingresado a double se hace correctamente
				// pudiendo no ser asi si dispone de caracteres alfanumericos o separadores decimales
				//que no sean puntos
			
				numero = Double.parseDouble(ingreso);			
			
				return numero;				
				
			//Capturamos la excepción, mostramos por pantalla y consola, pero seguimos. 
			} catch(NumberFormatException e) {
			System.out.println("El dato ingresado no puede ser procesado, reintente.");
			JOptionPane.showMessageDialog(null, "El dato ingresado no puede ser procesado, reintente.");
			return 999999.999999;	//devuelve este dato para indicarme que hubo un error en la conversion
			//e.printStackTrace();
			} 
			
		}

	private void convCelAFar() {
		
		String tempIn = "Celsius";
		String tempOut = "Farenheit";
		System.out.println("Conversión de " + tempIn + " a " + tempOut);		
		double numero = ingresoValidoTemp(tempIn, tempOut);		
		if(numero != 999999.999999) {
			JOptionPane.showMessageDialog(null, numero + " °" + tempIn + " equivale a " + String.format("%.3f",((numero * 9/5) + 32)) + 
					" °" + tempOut, "Conversión °" + tempIn + " a °" + tempOut, JOptionPane.DEFAULT_OPTION);
		}
	}

	private void convCelAKel() {
		
		String tempIn = "Celsius";
		String tempOut = "Kelvin";
		System.out.println("Conversión de " + tempIn + " a " + tempOut);		
		double numero = ingresoValidoTemp(tempIn, tempOut);		
		if(numero != 999999.999999) {
			JOptionPane.showMessageDialog(null, numero + " °" + tempIn + " equivale a " + String.format("%.3f",
					(numero + 273.15)) + " °" + tempOut, "Conversión °" + tempIn + " a °" + tempOut, 
					JOptionPane.DEFAULT_OPTION);
		}
		
	}
	
	private void convFarACel() {
		
		String tempIn = "Farenheit";
		String tempOut = "Celsius";
		System.out.println("Conversión de " + tempIn + " a " + tempOut);		
		double numero = ingresoValidoTemp(tempIn, tempOut);		
		if(numero != 999999.999999) {
			JOptionPane.showMessageDialog(null, numero + " °" + tempIn + " equivale a " + String.format("%.3f",((numero-32) *5/9)) + 
					" °" + tempOut, "Conversión °" + tempIn + " a °" + tempOut, JOptionPane.DEFAULT_OPTION);
		}
		
	}

	private void convKelACel() {
		
		String tempIn = "Kelvin";
		String tempOut = "Celsius";
		System.out.println("Conversión de " + tempIn + " a " + tempOut);		
		double numero = ingresoValidoTemp(tempIn, tempOut);		
		if(numero != 999999.999999) {
			JOptionPane.showMessageDialog(null, numero + " °" + tempIn + " equivale a " + String.format("%.3f",(numero - 273.15)) + 
					" °" + tempOut, "Conversión °" + tempIn + " a °" + tempOut, JOptionPane.DEFAULT_OPTION);
		}
		
	}
	
	private void convFarAKel() {
		
		String tempIn = "Farenheit";
		String tempOut = "Kelvin";
		System.out.println("Conversión de " + tempIn + " a " + tempOut);		
		double numero = ingresoValidoTemp(tempIn, tempOut);		
		if(numero != 999999.999999) {
			JOptionPane.showMessageDialog(null, numero + " °" + tempIn + " equivale a " + String.format("%.3f",(((numero-32) *5/9) + 273.15)) + 
					" °" + tempOut, "Conversión °" + tempIn + " a °" + tempOut, JOptionPane.DEFAULT_OPTION);
		}
		
	}


	private void convKelAFar() {
		
		String tempIn = "Kelvin";
		String tempOut = "Farenheit";
		System.out.println("Conversión de " + tempIn + " a " + tempOut);		
		double numero = ingresoValidoTemp(tempIn, tempOut);		
		if(numero != 999999.999999) {
			JOptionPane.showMessageDialog(null, numero + " °" + tempIn + " equivale a " + String.format("%.3f",((numero - 273.15) * 9/5 + 32)) + 
					" °" + tempOut, "Conversión °" + tempIn + " a °" + tempOut, JOptionPane.DEFAULT_OPTION);
		}
		
	}

}
