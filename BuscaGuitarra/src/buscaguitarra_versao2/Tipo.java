package buscaguitarra_versao2;

public enum Tipo {
	
	ACUSTICO, ELETRICO;
	
	public String toString() {
		switch(this) {
		case ACUSTICO: return "acústico";
		case ELETRICO: return "elétrico";
		default: return "acústico";
		}
	}

}
