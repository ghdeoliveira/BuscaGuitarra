package buscaguitarra_versao4;

public enum Estilo {
	
	BANDOLA, BANDOLETA,	BANDOLETA5ORDENS, BANDOLIM, BANDOLINETA, BANDOLONCELO;
	
	public String toString() {
		switch(this) {
		case BANDOLA: return "Bandola";
		case BANDOLETA: return "Bandoleta";
		case BANDOLETA5ORDENS: return "Bandoleta 5 Ordens";
		case BANDOLIM: return "Bandolim";
		case BANDOLINETA: return "Bandolineta";
		case BANDOLONCELO: return "Bandoloncelo";
		default: return "A";
		}
	}

}
