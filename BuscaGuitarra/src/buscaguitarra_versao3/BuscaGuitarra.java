package buscaguitarra_versao3;

import java.util.*;

public class BuscaGuitarra {

	public static void main(String[] args) {
		// Set Up Rick's guitar inventory
		
		Inventario inventario = new Inventario();
		initializeInventario(inventario);
		
		GuitarSpec whatErinLikes = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, 
				Madeira.ALDER, Madeira.ALDER, 10);
		
		List matchingGuitarras = (List) inventario.search(whatErinLikes);
		if (!matchingGuitarras.isEmpty() ) {
			System.out.println("Erin, você pode gostar destas guitarras: ");
			System.out.println(" ");
			for (Iterator i = matchingGuitarras.iterator(); i.hasNext(); ) {
				Guitarra guitarra = (Guitarra)i.next();
				GuitarSpec spec = guitarra.getSpec();
				System.out.println("Nós temos uma " + 
						spec.getFabricante() + " " + 
						spec.getModelo() + " " + 
						spec.getTipo() + " guitarra:\n " + 
						spec.getParteTras() + " parde de trás, \n " + 
						spec.getParteFrente() + " parte da frente.\n " +
						spec.getNumCordas() + " cordas. \n Você pode ter isso por apenas R$ " +
						guitarra.getPreco() + "!\n -----");
			}
		}
		else {
			System.out.println("Desculpe, Erin, não temos nada para você!");
		}
	}
		
	private static void initializeInventario(Inventario inventario) {
		// Adiciona guitarra ao inventário
		GuitarSpec spec = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, Madeira.ALDER, Madeira.ALDER, 6);
		GuitarSpec spec1 = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, Madeira.ALDER, Madeira.ALDER, 10);
		inventario.addGuitar("V95693", 1499.95, spec);
		inventario.addGuitar("V08634", 1277.25, spec1);
	}


}
