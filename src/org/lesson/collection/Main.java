package org.lesson.collection;

public class Main {

	public static void main(String[] args) {
		
		//Declaring variables
		int[] elenco = {1, 2, 7, 3, 9};
        Ciclatore ciclatore = new Ciclatore(elenco);
        ciclatore.addElemento(7);
        
        
        
        //Main Logic
        while (ciclatore.hasAncoraElementi()) {
            int elemento = ciclatore.getElementoSuccessivo();
            System.out.println("Elemento: " + elemento);
            
            
        }
        
        
		
	}
	
}
