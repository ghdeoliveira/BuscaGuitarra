package buscaguitarra_versao3;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventario {
	
	private LinkedList guitars;
	
	public Inventario() {
		guitars = new LinkedList();
	}
	
	public void addGuitar (String serialNumber, double preco, GuitarSpec spec) {
		Guitarra guitarra = new Guitarra (serialNumber, preco, spec);
		guitars.add(guitarra);
	}
	
	public Guitarra getGuitarra(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitarra guitarra = (Guitarra)i.next();
			if (guitarra.getSerialNumber().equals(serialNumber)) {
				return guitarra;
			}
		}
		return null;
	}
	
	public LinkedList search(GuitarSpec searchSpec) {
		LinkedList matchingGuitarras = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitarra guitarra = (Guitarra)i.next();
			if (guitarra.getSpec().matches(searchSpec))
				matchingGuitarras.add(guitarra);
		}
		return matchingGuitarras;
	}

}
