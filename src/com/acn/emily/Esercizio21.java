package com.acn.emily;

import java.util.ArrayList;

public class Esercizio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scrivere un programma Java per sostituire il secondo elemento di un

	    //ArrayList con l'elemento specificato

	        

	        ArrayList<Integer> lista = new ArrayList<>();

	        

	        lista.add(13);

	        lista.add(85);

	        lista.add(44);

	        lista.add(15);

	        lista.add(8);

	        

	        //stampo la lista prima

	        

	        System.out.println("Lista iniziale" + lista);

	        

	        //inizializzo un nuovo elemento da utilizzare per la sostituzione

	        

	        int nuovoElem = 16;

	        

	        //effettuo la sostituzione

	        

	        if (lista.size() >= 2) {  //verifico che l'array abbia almeno 2 elementi

	            lista.set(1, nuovoElem);  //sostituisco il sec. elemento che si trova alla posiz. 1

	        }

	        

	        //stampo l'array dopo le modifiche

	        

	        System.out.println("Array aggiornato: " + lista);

	}

}
