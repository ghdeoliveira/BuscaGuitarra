package buscaguitarra_versao5;

public enum InstrumentoTipo {
	
	GUITARRA, BANJO, DOBRO, VIOLINO, BAIXO, BANDOLIM, SAX;
	
	public String toString() {
		switch(this) {
		case GUITARRA: return "Guitarra";
		case BANJO: return "Banjo";
		case DOBRO: return "Dobro";
		case VIOLINO: return "Violino";
		case BAIXO: return "Baixo";
		case BANDOLIM: return "Bandolim";
		case SAX: return "Saxofone";
		default: return "Não especificado";
		}
	}

}
