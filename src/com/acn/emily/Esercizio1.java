package com.acn.emily;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scrivere un programma Java per creare un nuovo elenco di array,

        aggiungere alcuni colori (stringa) e stampare la raccolta.

        */

 

        

        String[] colori = new String [7];

        

        colori[0] = "Rosa";

        colori[1] = "Bianco";

        colori[2] = "Giallo";

        colori[3] = "Viola";

       

        System.out.println("Colori presenti nella raccolta: ");

        

        for(String colore : colori) {

            System.out.println(colore);

        }

	}

}
