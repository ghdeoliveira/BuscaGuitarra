package buscaguitarra_versao2;

public enum Fabricante {
	
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	public String toString() {
		switch(this) {
		case FENDER: return "Fender";
		case MARTIN: return "Martin";
		case GIBSON: return "Gibson";
		case COLLINGS: return "Collings";
		case OLSON: return "Olson";
		case RYAN: return "Ryan";
		case PRS: return "PRS";
		case ANY: return "Any";
		default: return "Any";
		}
	}

}
