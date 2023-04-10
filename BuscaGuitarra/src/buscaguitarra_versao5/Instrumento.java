package buscaguitarra_versao5;

public class Instrumento {
	
	private String serialNumber;
	private double preco;
	private InstrumentoSpec spec;
	
	public Instrumento(String serialNumber, double preco, InstrumentoSpec spec) {
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

	public InstrumentoSpec getSpec() {
		return spec;
	}

	public void setSpec(InstrumentoSpec spec) {
		this.spec = spec;
	}
	

}
