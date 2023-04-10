package buscaguitarra_versao5;

public enum TipoSax {
	
	SOPRANINO, SOPRANO, ALTO, TENOR, BARITONO, BAIXO;
	
	public String toString() {
		switch(this) {
		case SOPRANINO: return "sopranino";
		case SOPRANO: return "soprano";
		case ALTO: return "alto";
		case TENOR: return "tenor";
		case BARITONO: return "baritono";
		case BAIXO: return "baixo";
		default: return "baixo";
		}
	}
}
