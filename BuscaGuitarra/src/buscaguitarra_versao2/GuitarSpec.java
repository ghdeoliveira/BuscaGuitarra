package buscaguitarra_versao2;

public class GuitarSpec {
	
	private Fabricante fabricante;
	private String modelo;
	private Tipo tipo;
	private Madeira parteTras;
	private Madeira parteFrente;
	
	public GuitarSpec(Fabricante fabricante, String modelo, Tipo tipo, Madeira parteTras, Madeira parteFrente) {
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
	
	
}
