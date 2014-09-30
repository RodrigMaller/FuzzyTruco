package com.FuzzyTruco;

import java.util.HashMap;



public class Baralho {
	
	HashMap<String, Carta> baralho;

	public Baralho() {
		super();
		this.baralho = new HashMap<String, Carta>();
		
		Carta carta = new Carta("4o");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("4e");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("4c");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("4p");
		baralho.put(carta.getCarta(), carta);
		
		carta = new Carta("5o");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("5e");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("5c");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("5p");
		baralho.put(carta.getCarta(), carta);
		
		carta = new Carta("6o");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("6e");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("6c");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("6p");
		baralho.put(carta.getCarta(), carta);
		
		carta = new Carta("7o");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("7e");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("7c");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("7p");
		baralho.put(carta.getCarta(), carta);
	
		carta = new Carta("qo");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("qe");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("qc");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("qp");
		baralho.put(carta.getCarta(), carta);
		
		carta = new Carta("jo");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("je");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("jc");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("jp");
		baralho.put(carta.getCarta(), carta);
	
		carta = new Carta("ko");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("ke");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("kc");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("kp");
		baralho.put(carta.getCarta(), carta);
	
		carta = new Carta("ao");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("ae");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("ac");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("ap");
		baralho.put(carta.getCarta(), carta);
	
		carta = new Carta("2o");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("2e");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("2c");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("2p");
		baralho.put(carta.getCarta(), carta);
	
		carta = new Carta("3o");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("3e");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("3c");
		baralho.put(carta.getCarta(), carta);
		carta = new Carta("3p");
		baralho.put(carta.getCarta(), carta);
	}

}
