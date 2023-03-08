package proyConversor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Clase principal de implementacion del desafio 1 de Oracle-Alura para el modulo
//de JAVA en orientacion Back-End del grupo 4. Febrero 2023

//Modificado a partir de codigo de 

public class Conversor {
	public static void main(String[] args) {
		
		//Crea un JOptionPane con constructor mas grande, primero un array de dos conversores
		String [] options = {"Tipo de cambio", "Temperatura"};
        String opcion = JOptionPane.showInputDialog(null, "Seleccione la conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]).toString();
	
        //de la opcion elegida como String se elige con un switch y se crea una instancia de las 
        //clases correspondientes
        switch(opcion) {
        case "Tipo de cambio" -> new convierteTipoCambio();
        case "Temperatura" -> new convierteTemperatura();
        default -> System.out.println("Error en la elección de menu inicial");
        
        //Entonces de aca se salta directo a los metodos de convierteTipoCambio y convierteTemperatura
        
        }
	}
	
	
}



