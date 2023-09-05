package com.acn.emily;

import java.util.ArrayList;

public class Esercizio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scrivere un programma Java per svuotare un elenco di array		
		
ArrayList<String> elenco = new ArrayList<>();

        

        elenco.add("mela");

        elenco.add("fragola");

        elenco.add("arancia");

        

        System.out.println("Elenco pieno: " + elenco);

        

        //svuoto l'arrayList tramite il metodo clear

        

        elenco.clear();

        

        System.out.println("Elenco dopo la rimozione deglie elemnti: " + elenco);

	}

}
