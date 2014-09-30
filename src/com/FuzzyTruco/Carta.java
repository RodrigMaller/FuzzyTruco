package com.FuzzyTruco;

public class Carta {
	String carta;
	int idcarta;
	Boolean picked;
	int manilha;
	
	public Carta(String carta) {
		super();
		this.carta = carta;
		if(carta.charAt(0) == 'q'){
			this.idcarta = 8;
		}else if(carta.charAt(0) == 'j'){
			this.idcarta = 9;
		}else if(carta.charAt(0) == 'k'){
			this.idcarta = 10;
		}else if(carta.charAt(0) == 'a'){
			this.idcarta = 11;
		}else{
			String str = carta.substring(0,0);
			this.idcarta = Integer.parseInt(str);
		}
		this.picked = false;
		this.manilha = 0;
	}
	
	public Carta(String carta, int manilha) {
		super();
		this.carta = carta;
		this.picked = false;
		this.manilha = manilha;
		this.idcarta = manilha;
	}

	public String getCarta() {
		return carta;
	}

	public Boolean isPicked() {
		return picked;
	}
	
	public void setPicked(Boolean picked) {
		this.picked = picked;
	}

	public int getManilha() {
		return manilha;
	}

	public void setManilha(int manilha) {
		this.manilha = manilha;
	}

	public int getIdcarta() {
		return idcarta;
	}
	
}
