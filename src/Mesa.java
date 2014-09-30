

public class Mesa {

	Baralho baralho;

	Carta  suaCt1;
	Carta  suaCt2;
	Carta  suaCt3;
	Carta  opCt1;
	Carta  opCt2;
	Carta  opCt3;
	Carta  tombo;
	double resultado_parcial;
	int rodada;

	//Metodos Padroes
	public Mesa() {
		super();
		this.baralho           = new Baralho();
		this.resultado_parcial = 0.5;
		this.rodada            = 0;
	}

	public Carta getSuaCt1() {
		return suaCt1;
	}

	public boolean setSuaCt1(String key) {
		Carta ct = baralho.pickCarta(key);
		this.suaCt1 = ct;
		return true;

	}

	public Carta getSuaCt2() {
		return suaCt2;
	}

	public boolean setSuaCt2(String key) {
		Carta ct = baralho.pickCarta(key);
		this.suaCt2 = ct;
		return true;
	}

	public Carta getSuaCt3() {
		return suaCt3;
	}

	public boolean setSuaCt3(String key) {
		Carta ct = baralho.pickCarta(key);
		this.suaCt3 = ct;
		return true;
	}

	public Carta getOpCt1() {
		return opCt1;
	}

	public boolean setOpCt1(String key) {
		Carta ct = baralho.pickCarta(key);
		this.opCt1 = ct;
		return true;
	}

	public Carta getOpCt2() {
		return opCt2;
	}

	public boolean setOpCt2(String key) {
		Carta ct = baralho.pickCarta(key);
		this.opCt2 = ct;
		return true;
	}

	public Carta getOpCt3() {
		return opCt3;
	}

	public boolean setOpCt3(String key) {
		Carta ct = baralho.pickCarta(key);
		this.opCt3 = ct;
		return true;
	}

	public Carta getTombo() {
		return tombo;
	}

	public boolean setTombo(String key) {
		Carta ct = baralho.pickCarta(key);
		this.tombo = ct;
		return true;
	}

	public void ordenaMao(){
		Carta swp;
		int change=1;
		while(change!=0){
			change = 0;
			if(suaCt1.idcarta < suaCt3.idcarta){
				change++;
				swp    = suaCt1;
				suaCt1 = suaCt3;
				suaCt3 = swp;
			}
			if(suaCt1.idcarta < suaCt2.idcarta){
				change++;
				swp    = suaCt1;
				suaCt1 = suaCt2;
				suaCt2 = swp;
			}
			if(suaCt2.idcarta < suaCt3.idcarta){
				change++;
				swp    = suaCt2;		
				suaCt2 = suaCt3;
				suaCt3 = swp;
			}
		}

	}





}
