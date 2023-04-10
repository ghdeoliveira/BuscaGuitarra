package buscaguitarra;

import java.util.*;

public class BuscaGuitarra {

	public static void main(String[] args) {
		// Set Up Rick's guitar inventory
		
		Inventario inventario = new Inventario();
		initializeInventario(inventario);
		
		Guitarra whatErinLikes = new Guitarra ("", 0, Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, 
				Madeira.ALDER, Madeira.ALDER);
		
		List matchingGuitarras = (List) inventario.search(whatErinLikes);
		if (!matchingGuitarras.isEmpty() ) {
			System.out.println("Erin, você pode gostar destas guitarras: ");
			for (Iterator i = matchingGuitarras.iterator(); i.hasNext(); ) {
				Guitarra guitarra = (Guitarra)i.next();
				System.out.println("Nós temos uma " + 
						guitarra.getFabricante() + " " + 
						guitarra.getModelo() + " " + 
						guitarra.getTipo() + " guitarra:\n " + 
						guitarra.getParteTras() + " parde de trás, \n " + 
						guitarra.getParteFrente() + " parte da frente.\n Você pode ter isso por apenas R$ " + 
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
