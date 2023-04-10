package buscaguitarra_versao2;

import java.util.*;

public class BuscaGuitarra {

	public static void main(String[] args) {
		// Set Up Rick's guitar inventory
		
		Inventario inventario = new Inventario();
		initializeInventario(inventario);
		
		GuitarSpec whatErinLikes = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, 
				Madeira.ALDER, Madeira.ALDER);
		
		List matchingGuitarras = (List) inventario.search(whatErinLikes);
		if (!matchingGuitarras.isEmpty() ) {
			System.out.println("Erin, você pode gostar destas guitarras: ");
			for (Iterator i = matchingGuitarras.iterator(); i.hasNext(); ) {
				Guitarra guitarra = (Guitarra)i.next();
				GuitarSpec spec = guitarra.getSpec();
				System.out.println("Nós temos uma " + 
						spec.getFabricante() + " " + 
						spec.getModelo() + " " + 
						spec.getTipo() + " guitarra:\n " + 
						spec.getParteTras() + " parde de trás, \n " + 
						spec.getParteFrente() + " parte da frente.\n Você pode ter isso por apenas R$ " + 
						guitarra.getPreco() + "!\n -----");
			}
		}
		else {
			System.out.println("Desculpe, Erin, não temos nada para você!");
		}
	}
		
	private static void initializeInventario(Inventario inventario) {
		// Adiciona guitarra ao inventário
		inventario.addGuitar("V95693", 1499.95, Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, Madeira.ALDER, Madeira.ALDER);
	}


}
