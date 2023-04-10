package buscaguitarra_versao3;

public class GuitarSpec {
	
	private Fabricante fabricante;
	private String modelo;
	private Tipo tipo;
	private Madeira parteTras;
	private Madeira parteFrente;
	private int numCordas;
	
	public GuitarSpec(Fabricante fabricante, String modelo, Tipo tipo, Madeira parteTras, Madeira parteFrente, int numCordas) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.parteTras = parteTras;
		this.parteFrente = parteFrente;
		this.numCordas = numCordas;
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
	
	public int getNumCordas() {
		return numCordas;
	}

	public void setNumCordas(int numCordas) {
		this.numCordas = numCordas;
	}
	
	public boolean matches (GuitarSpec otherSpec) {
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
