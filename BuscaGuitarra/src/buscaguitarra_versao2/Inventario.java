package buscaguitarra_versao2;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventario {
	
	private LinkedList guitars;
	
	public Inventario() {
		guitars = new LinkedList();
	}
	
	public void addGuitar (String serialNumber, double preco, Fabricante fabricante, String modelo, Tipo tipo,
			Madeira parteTras, Madeira parteFrente) {
		Guitarra guitarra = new Guitarra (serialNumber, preco, fabricante, modelo, tipo, parteTras, parteFrente);
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
			// Ignorar serialNumber desde que seja único
			// Ignorar preco desde que seja único
			GuitarSpec guitarspec = guitarra.getSpec();
			if (searchSpec.getFabricante() != guitarspec.getFabricante() )
				continue;
			String modelo = searchSpec.getModelo();
			if ((modelo != null) && (!modelo.equals("")) && (!modelo.equals(guitarspec.getModelo() )))
				continue;
			if (searchSpec.getTipo() != guitarspec.getTipo() )
				continue;
			if (searchSpec.getParteTras() != guitarspec.getParteTras() )
				continue;
			if (searchSpec.getParteFrente() != guitarspec.getParteFrente() )
				continue;
			matchingGuitarras.add(guitarra);
		}
		return matchingGuitarras;
	}

}
