

import java.util.HashMap;



public class Baralho {
	
	HashMap<String, Carta> cartas;

	public Baralho() {
		super();
		this.cartas = new HashMap<String, Carta>();
		
		Carta carta = new Carta("4o");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("4e");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("4c");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("4p");
		cartas.put(carta.getCarta(), carta);
		
		carta = new Carta("5o");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("5e");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("5c");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("5p");
		cartas.put(carta.getCarta(), carta);
		
		carta = new Carta("6o");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("6e");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("6c");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("6p");
		cartas.put(carta.getCarta(), carta);
		
		carta = new Carta("7o");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("7e");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("7c");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("7p");
		cartas.put(carta.getCarta(), carta);
	
		carta = new Carta("qo");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("qe");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("qc");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("qp");
		cartas.put(carta.getCarta(), carta);
		
		carta = new Carta("jo");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("je");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("jc");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("jp");
		cartas.put(carta.getCarta(), carta);
	
		carta = new Carta("ko");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("ke");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("kc");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("kp");
		cartas.put(carta.getCarta(), carta);
	
		carta = new Carta("ao");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("ae");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("ac");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("ap");
		cartas.put(carta.getCarta(), carta);
	
		carta = new Carta("2o");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("2e");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("2c");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("2p");
		cartas.put(carta.getCarta(), carta);
	
		carta = new Carta("3o");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("3e");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("3c");
		cartas.put(carta.getCarta(), carta);
		carta = new Carta("3p");
		cartas.put(carta.getCarta(), carta);
	}

	public Carta pickCarta(String key){
		Carta ct = this.cartas.get(key);
		if (ct == null){
			return null;
		}else{
			ct.setPicked(true);
			return ct;			
		}		
	}
	
	public void corrigiManilhas(String key){
		Carta ct = this.cartas.get(key);
		if(ct.getIdcarta()==13){
			//7 ouro
			Carta manilha = this.cartas.get("4o");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("4e");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("4c");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("4p");
			manilha.setManilha(17);
			manilha.setIdcarta(17);
		
		}else if(ct.getIdcarta()==7){
			//7 ouro
			Carta manilha = this.cartas.get("qo");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("qe");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("qc");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("qp");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}else if(ct.getIdcarta()==8){
			//7 ouros
			Carta manilha = this.cartas.get("jo");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("je");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("jc");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("jp");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}else if(ct.getIdcarta()==9){
			//7 ouros
			Carta manilha = this.cartas.get("ko");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("ke");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("kc");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("kp");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}else if(ct.getIdcarta()==10){
			//7 ouros
			Carta manilha = this.cartas.get("ao");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("ae");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("ac");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("ap");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}else if(ct.getIdcarta()==11){
			//7 ouros
			Carta manilha = this.cartas.get("2o");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("2e");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("2c");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("2p");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}else if(ct.getIdcarta()==12){
			//7 ouros
			Carta manilha = this.cartas.get("3o");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get("3e");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get("3c");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get("3p");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}else {
			//7 ouros
			int id = ct.getIdcarta() + 1;
			Carta manilha = this.cartas.get(id+"o");
			manilha.setManilha(14);
			manilha.setIdcarta(14);
			//espadilha
			manilha = this.cartas.get(id+"e");
			manilha.setManilha(15);
			manilha.setIdcarta(15);
			//copas
			manilha = this.cartas.get(id+"c");
			manilha.setManilha(16);
			manilha.setIdcarta(16);
			//zap
			manilha = this.cartas.get(id+"p");
			manilha.setManilha(17);
			manilha.setIdcarta(17);			
		
		}
		
	}
}
