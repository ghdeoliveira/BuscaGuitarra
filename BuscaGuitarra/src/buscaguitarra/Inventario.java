package buscaguitarra;

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
	
	public LinkedList search(Guitarra searchGuitar) {
		LinkedList matchingGuitarras = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitarra guitarra = (Guitarra)i.next();
			// Ignorar serialNumber desde que seja único
			// Ignorar preco desde que seja único
			if (searchGuitar.getFabricante() != guitarra.getFabricante() )
				continue;
			String modelo = searchGuitar.getModelo();
			if ((modelo != null) && (!modelo.equals("")) && (!modelo.equals(guitarra.getModelo() )))
				continue;
			if (searchGuitar.getTipo() != guitarra.getTipo() )
				continue;
			if (searchGuitar.getParteTras() != guitarra.getParteTras() )
				continue;
			if (searchGuitar.getParteFrente() != guitarra.getParteFrente() )
				continue;
			matchingGuitarras.add(guitarra);
		}
		return matchingGuitarras;
	}

}
