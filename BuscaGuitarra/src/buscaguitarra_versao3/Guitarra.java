package buscaguitarra_versao3;

public class Guitarra {
	
	private String serialNumber;
	private double preco;
	private GuitarSpec spec;
	
	public Guitarra(String serialNumber, double preco, GuitarSpec spec) {
		
		this.serialNumber = serialNumber;
		this.preco = preco;
		this.spec = spec;
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

	public GuitarSpec getSpec() {
		return spec;
	}

	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
	
		
}
