package buscaguitarra_versao4;

public class BandolimSpec extends InstrumentoSpec{
	
	private Estilo estilo;
	
	public BandolimSpec(Fabricante fabricante, String modelo, Tipo tipo, Estilo estilo, Madeira parteTras, Madeira parteFrente) {
		super(fabricante, modelo, tipo, parteTras, parteFrente);
		this.estilo = estilo;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	
	public boolean matches (InstrumentoSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof BandolimSpec))
			return false;
		BandolimSpec spec = (BandolimSpec)otherSpec;
		if (!estilo.equals(spec.estilo))
			return false;
		return true;
	}

}
