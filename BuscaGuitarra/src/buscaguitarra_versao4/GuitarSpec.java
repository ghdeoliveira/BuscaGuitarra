package buscaguitarra_versao4;

public class GuitarSpec extends InstrumentoSpec{
	
	private int numCordas;
	
	public GuitarSpec(Fabricante fabricante, String modelo, Tipo tipo, Madeira parteTras, Madeira parteFrente, int numCordas) {
		super(fabricante, modelo, tipo, parteTras, parteFrente);
		this.numCordas = numCordas;
	}

	public int getNumCordas() {
		return numCordas;
	}

	public void setNumCordas(int numCordas) {
		this.numCordas = numCordas;
	}
	
	public boolean matches (InstrumentoSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec)otherSpec;
		if (numCordas != spec.numCordas)
			return false;
		return true;
	}

	
}
