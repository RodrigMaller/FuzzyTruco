

public class Carta {
	String carta;
	int idcarta;
	Boolean picked;
	Boolean played;
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
		}else if(carta.charAt(0) == '2'){
			this.idcarta = 12;
		}else if(carta.charAt(0) == '3'){
			this.idcarta = 13;
		}else{
			String str = carta.substring(0,1);
			this.idcarta = Integer.parseInt(str);
		}
		this.picked = false;
		this.played = false;
		this.manilha = 0;
	}
	
	public Boolean isPlayed() {
		return played;
	}

	public void setPlayed(Boolean played) {
		this.played = played;
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
	

	public void setIdcarta(int idcarta) {
		this.idcarta = idcarta;
	}
	
	
}
