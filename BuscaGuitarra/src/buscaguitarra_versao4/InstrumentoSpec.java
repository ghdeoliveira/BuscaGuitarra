package buscaguitarra_versao4;

public class InstrumentoSpec {
	
	private Fabricante fabricante;
	private String modelo;
	private Tipo tipo;
	private Madeira parteTras;
	private Madeira parteFrente;
	
	public InstrumentoSpec(Fabricante fabricante, String modelo, Tipo tipo, Madeira parteTras, Madeira parteFrente) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.parteTras = parteTras;
		this.parteFrente = parteFrente;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Madeira getParteTras() {
		return parteTras;
	}

	public void setParteTras(Madeira parteTras) {
		this.parteTras = parteTras;
	}

	public Madeira getParteFrente() {
		return parteFrente;
	}

	public void setParteFrente(Madeira parteFrente) {
		this.parteFrente = parteFrente;
	}
	
	public boolean matches (InstrumentoSpec otherSpec) {
		if (fabricante != otherSpec.fabricante)
			return false;
		if ((modelo != null) && (!modelo.equals("")) && (!modelo.equals(otherSpec.modelo)))
			return false;
		if (tipo != otherSpec.tipo)
			return false;
		if (parteTras != otherSpec.parteTras )
			return false;
		if (parteFrente != otherSpec.parteFrente )
			return false;
		return true;
	}

}
