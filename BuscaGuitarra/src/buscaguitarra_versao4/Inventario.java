package buscaguitarra_versao4;

//import java.awt.List;
//import java.util.Iterator;
import java.util.LinkedList;

public class Inventario {
	
	private LinkedList<Instrumento> inventario;
	
	public Inventario() {
		inventario = new LinkedList<Instrumento>();
	}
	
	public void addInstrumento (String serialNumber, double preco, InstrumentoSpec spec) {
		Instrumento instrumento = null;
		if (spec instanceof GuitarSpec) {
			instrumento = new Guitarra(serialNumber, preco, (GuitarSpec)spec);
		}
		else {
			instrumento = new Bandolim(serialNumber, preco, (BandolimSpec)spec);
		}
		inventario.add(instrumento);
	}
	
	public Instrumento getInstrumento(String serialNumber) {
		for (Instrumento instrumento : inventario) {
			if (instrumento.getSerialNumber().equals(serialNumber)) {
				return instrumento;
			}
		}
		return null;
	}
	
	public LinkedList<Guitarra> search(GuitarSpec searchSpec) {
		LinkedList<Guitarra> matchingGuitarras = new LinkedList<Guitarra>();
		for (Instrumento instrumento : inventario) {
			if (instrumento instanceof Guitarra) {
			Guitarra guitarra = (Guitarra)instrumento;
			if (guitarra.getSpec().matches(searchSpec)) {
				matchingGuitarras.add(guitarra);
		}
		}
		}
		return matchingGuitarras;
	}
	
	public LinkedList<Bandolim> search(BandolimSpec searchSpec) {
		LinkedList<Bandolim> matchingBandolins = new LinkedList<Bandolim>();
		for (Instrumento instrumento : inventario) {
			if (instrumento instanceof Bandolim) {
				Bandolim bandolim = (Bandolim)instrumento;
			if (bandolim.getSpec().matches(searchSpec)) {
				matchingBandolins.add(bandolim);
		}
		}
		}
		return matchingBandolins;
	}

}
