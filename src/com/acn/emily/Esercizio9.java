package com.acn.emily;

public class Esercizio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scrivere un programma Java per copiare un elenco di array in un altro.

        

        // Dichiarazione e inizializzazione dell'array

        int[] array = {23, 55, 3, 98, 7};

 

        // Creazione di un nuovo array

        int[] arrayDestinazione = new int[array.length];

 

        // Copia degli elementi dall'array all'array destinazione

        for (int i = 0; i < array.length; i++) {

            arrayDestinazione[i] = array[i];

            System.out.println(array[i]);

            System.out.println(arrayDestinazione[i]);

        }

        

	}

}
