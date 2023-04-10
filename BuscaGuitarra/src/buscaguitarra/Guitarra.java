package buscaguitarra;

public class Guitarra {
	
	private String serialNumber;
	private double preco;
	private Fabricante fabricante;
	private String modelo;
	private Tipo tipo;
	private Madeira parteTras;
	private Madeira parteFrente;
	
	public Guitarra(String serialNumber, double preco, Fabricante fabricante, String modelo, Tipo tipo,
			Madeira parteTras, Madeira parteFrente) {
		
		this.serialNumber = serialNumber;
		this.preco = preco;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.parteTras = parteTras;
		this.parteFrente = parteFrente;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
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
