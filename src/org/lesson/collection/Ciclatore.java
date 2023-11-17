package org.lesson.collection;

import java.util.Arrays;

public class Ciclatore {

	//Declaring variables
	
	private int[] elenco;
    private int index = 0;
    
    
    //Constructor
    public Ciclatore(int[] elenco) {
    	
    	setElenco(elenco);
    	
    }


    
    //Costructor with no params EXTRA
    public Ciclatore() {
        
    	setElenco(elenco);
        
    }
    
    
    
    
    
    //Elenco functions
	public int[] getElenco() {
		return elenco;
	}
	public void setElenco(int[] elenco) {
		this.elenco = elenco;
	}


	
	
	
	//Get next element
	public int getElementoSuccessivo() {
        
        if (hasAncoraElementi()) {
            
            int elementoCorrente = elenco[index];
            index++;
            return elementoCorrente;
        } else {
            
            return -1;
        }
    }
	
	
	//Check if has more elements
	public boolean hasAncoraElementi() {
        return index < elenco.length;
    }
	
	
	
	//Add new element EXTRA
	public void addElemento(int elemento) {
        
		int[] nuovoElenco = Arrays.copyOf(elenco, elenco.length + 1);

        
        nuovoElenco[elenco.length] = elemento;

        
        elenco = nuovoElenco;
    }
	
	
	
}
