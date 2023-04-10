package buscaguitarra_versao4;

import java.util.*;
//import java.util.Iterator;
//import java.util.LinkedList;

public class BuscaGuitarra {

	public static void main(String[] args) {
				
		Inventario inventario = new Inventario();
		initializeInventario(inventario);
		
		GuitarSpec guitarraErinLikes = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, Madeira.ALDER, Madeira.ALDER, 10);
		BandolimSpec bandolimErinLikes = new BandolimSpec (Fabricante.FENDER, "Stratocastor", Tipo.ACUSTICO, Estilo.BANDOLA, Madeira.ALDER, Madeira.ALDER);
		
		// Procura Guitarras
		List matchingGuitarras = (List) inventario.search(guitarraErinLikes);
		if (!matchingGuitarras.isEmpty() ) {
			System.out.println("Erin, você pode gostar destas guitarras: ");
			System.out.println(" ");
			for (Iterator i = matchingGuitarras.iterator(); i.hasNext(); ) {
				Instrumento instrumento = (Instrumento)i.next();
				InstrumentoSpec spec = instrumento.getSpec();
				
				System.out.println("Nós temos uma guitarra " + 
						spec.getFabricante() + " " + 
						spec.getModelo() + " " + 
						spec.getTipo() + ":\n " + 
						((GuitarSpec)spec).getNumCordas() + " cordas. \n " +
						spec.getParteTras() + " na parte de trás, \n " + 
						spec.getParteFrente() + " na parte da frente.\n Você pode ter isso por apenas R$ " +
						instrumento.getPreco() + "!\n ====================================================");
				System.out.println(" ");
			}
		}
		else {
			System.out.println("Desculpe, Erin, não temos nada para você!");
		}
		
		
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println(" ");
		
		// Procura Bandolins
				List matchingBandolins = (List) inventario.search(bandolimErinLikes);
				if (!matchingBandolins.isEmpty() ) {
					System.out.println("Erin, você pode gostar destes bandolins: ");
					System.out.println(" ");
					for (Iterator i = matchingBandolins.iterator(); i.hasNext(); ) {
						Instrumento bandolim = (Instrumento)i.next();
						InstrumentoSpec spec1 = bandolim.getSpec();
						
						System.out.println("Nós temos um(a) " +
								((BandolimSpec)spec1).getEstilo() + " " +
								spec1.getFabricante() + " " + 
								spec1.getModelo() + " " + 
								spec1.getTipo() + ":\n " + 
								spec1.getParteTras() + " na parte de trás, \n " + 
								spec1.getParteFrente() + " na parte da frente.\n Você pode ter isso por apenas R$ " +
								bandolim.getPreco() + "!\n ====================================================");
						System.out.println(" ");
					}
				}
				else {
					System.out.println("Desculpe, Erin, não temos nada para você!");
				}
	
	}
		
	private static void initializeInventario(Inventario inventario) {
		// Adiciona guitarra ao inventário
		GuitarSpec guitarra1 = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, Madeira.ALDER, Madeira.ALDER, 10);
		GuitarSpec guitarra2 = new GuitarSpec (Fabricante.FENDER, "Stratocastor", Tipo.ELETRICO, Madeira.ALDER, Madeira.ALDER, 10);
		inventario.addInstrumento("G95693", 1499.95, guitarra1);
		inventario.addInstrumento("G08634", 1277.25, guitarra2);

		// Adiciona bandolim ao inventário
		BandolimSpec bandolim1 = new BandolimSpec (Fabricante.FENDER, "Stratocastor", Tipo.ACUSTICO, Estilo.BANDOLA, Madeira.ALDER, Madeira.ALDER);
		BandolimSpec bandolim2 = new BandolimSpec (Fabricante.FENDER, "Stratocastor", Tipo.ACUSTICO, Estilo.BANDOLIM, Madeira.ALDER, Madeira.ALDER);
		inventario.addInstrumento("B15088", 1012.17, bandolim1);
		inventario.addInstrumento("B01547", 870.33, bandolim2);
	}


}
