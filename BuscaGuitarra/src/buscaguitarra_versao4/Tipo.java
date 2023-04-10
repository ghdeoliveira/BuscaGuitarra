package buscaguitarra_versao4;

public enum Tipo {
	
	ACUSTICO, ELETRICO;
	
	public String toString() {
		switch(this) {
		case ACUSTICO: return "acústica(o)";
		case ELETRICO: return "elétrica(o)";
		default: return "acústica";
		}
	}

}
