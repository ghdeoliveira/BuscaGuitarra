package buscaguitarra_versao5;

import java.util.Iterator;
import java.util.LinkedList;

public class Inventario {
	
	private LinkedList<Instrumento> inventario;
	
	public Inventario() {
		inventario = new LinkedList<Instrumento>();
	}
	
	public void addInstrumento (String serialNumber, double preco, InstrumentoSpec spec) {
		Instrumento instrumento = new Instrumento(serialNumber, preco, spec);
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
	
	public LinkedList<Instrumento> search(InstrumentoSpec searchSpec) {
		LinkedList<Instrumento> matchingInstrumentos = new LinkedList<Instrumento>();
		for (Iterator i = inventario.iterator(); i.hasNext();) {
			Instrumento instrumento = (Instrumento)i.next();
			if (instrumento.getSpec().matches(searchSpec)) 
				matchingInstrumentos.add(instrumento);
		}
		return matchingInstrumentos;
	}
	

}
