package buscaguitarra_versao5;

public enum Fabricante {
	
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY, YAMAHA, MICHAEL, EAGLE;
	
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
		case YAMAHA: return "Yamaha";
		case MICHAEL: return "Michael";
		case EAGLE: return "Eagle";
		default: return "Any";
		}
	}

}
