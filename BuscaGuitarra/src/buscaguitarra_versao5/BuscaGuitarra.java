package buscaguitarra_versao5;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class BuscaGuitarra {

	public static void main(String[] args) {
				
		Inventario inventario = new Inventario();
		initializeInventario(inventario);
		
		Map propriedades = new HashMap();
		// Cordas
		//propriedades.put("fabricante", Fabricante.GIBSON);
		//propriedades.put("parteTras", Madeira.MAPLE);		

		// Saxofones
		propriedades.put("fabricante", Fabricante.YAMAHA);
		//propriedades.put("tom", TipoSax.ALTO);
		// Problema em encontrar SAX com a propriedade TipoSax(enum), aponta como resultado NULL
		
		InstrumentoSpec clienteSpec = new InstrumentoSpec(propriedades);
		
		List matchingInstrumentos = (List) inventario.search(clienteSpec);
		if (!matchingInstrumentos.isEmpty() ) {
			System.out.println("Erin, você pode gostar destes instrumentos: ");
			System.out.println(" ");
			for (Iterator i = matchingInstrumentos.iterator(); i.hasNext(); ) {
				Instrumento instrumento = (Instrumento)i.next();
				InstrumentoSpec spec = instrumento.getSpec();
				
				System.out.println("Nós temos um(a) " + 
						spec.getPropriedade("InstrumentoTipo") + " com as seguintes propriedades: ");
				for (Iterator j = spec.getPropriedades().keySet().iterator(); j.hasNext();) {
					String propriedadeNome = (String)j.next();
					if (propriedadeNome.equals("InstrumentoTipo"))
						continue;
					System.out.println("    " + propriedadeNome + ": " + spec.getPropriedade(propriedadeNome));
				
				}
				System.out.println(" Você pode ter este(a) " + spec.getPropriedade("InstrumentoTipo") + 
						" por R$" + instrumento.getPreco() + "\n ---------------------------------------------------");
			}
		}
		else {
			System.out.println("Desculpe, não temos nada para você!");
		}
			
	}

	private static void initializeInventario(Inventario inventario) {
		
		Map propriedades = new HashMap();
		
		// Saxofones		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.SAX);
		propriedades.put("fabricante", Fabricante.YAMAHA);
		propriedades.put("modelo", "YAS-82Z");
		propriedades.put("tom", TipoSax.ALTO);
		inventario.addInstrumento("SX774", 41514.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.SAX);
		propriedades.put("fabricante", Fabricante.YAMAHA);
		propriedades.put("modelo", "YAS-26");
		propriedades.put("tom", TipoSax.ALTO);
		inventario.addInstrumento("SX884", 8490.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.SAX);
		propriedades.put("fabricante", Fabricante.EAGLE);
		propriedades.put("modelo", "SA 501");
		propriedades.put("tom", TipoSax.ALTO);
		inventario.addInstrumento("SX124", 5799.95, new InstrumentoSpec(propriedades));
		
		
		// Guitarras
		propriedades.put("InstrumentoTipo", InstrumentoTipo.GUITARRA);
		propriedades.put("fabricante", Fabricante.COLLINGS);
		propriedades.put("modelo", "CJ");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ACUSTICO);
		propriedades.put("numCordas", 6);
		propriedades.put("parteTras", Madeira.INDIAN_ROSEWOOD);
		propriedades.put("parteFrente", Madeira.SITKA);
		inventario.addInstrumento("11277", 3999.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.GUITARRA);
		propriedades.put("fabricante", Fabricante.MARTIN);
		propriedades.put("modelo", "D-18");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ACUSTICO);
		propriedades.put("numCordas", 6);
		propriedades.put("parteTras", Madeira.MAHOGANY);
		propriedades.put("parteFrente", Madeira.MAHOGANY);
		inventario.addInstrumento("122784", 5495.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.GUITARRA);
		propriedades.put("fabricante", Fabricante.FENDER);
		propriedades.put("modelo", "stratocastor");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ELETRICO);
		propriedades.put("numCordas", 6);
		propriedades.put("parteTras", Madeira.ALDER);
		propriedades.put("parteFrente", Madeira.ALDER);
		inventario.addInstrumento("V95693", 1499.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.GUITARRA);
		propriedades.put("fabricante", Fabricante.FENDER);
		propriedades.put("modelo", "stratocastor");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ELETRICO);
		propriedades.put("numCordas", 6);
		propriedades.put("parteTras", Madeira.ALDER);
		propriedades.put("parteFrente", Madeira.ALDER);
		inventario.addInstrumento("V9512", 1549.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.GUITARRA);
		propriedades.put("fabricante", Fabricante.GIBSON);
		propriedades.put("modelo", "SG'61 Reissue");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ELETRICO);
		propriedades.put("numCordas", 6);
		propriedades.put("parteTras", Madeira.MAHOGANY);
		propriedades.put("parteFrente", Madeira.MAHOGANY);
				inventario.addInstrumento("82765501", 1890.95, new InstrumentoSpec(propriedades));
		
		propriedades.put("InstrumentoTipo", InstrumentoTipo.GUITARRA);
		propriedades.put("fabricante", Fabricante.GIBSON);
		propriedades.put("modelo", "Les Paul");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ELETRICO);
		propriedades.put("numCordas", 6);
		propriedades.put("parteTras", Madeira.MAPLE);
		propriedades.put("parteFrente", Madeira.MAPLE);
		inventario.addInstrumento("70108276", 2295.95, new InstrumentoSpec(propriedades));
		
		// Bandolins
		propriedades.put("InstrumentoTipo", InstrumentoTipo.BANDOLIM);
		propriedades.put("fabricante", Fabricante.GIBSON);
		propriedades.put("modelo", "F5-G");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ACUSTICO);
		propriedades.remove("numCordas", 6);
		propriedades.put("parteTras", Madeira.MAPLE);
		propriedades.put("parteFrente", Madeira.MAPLE);
		propriedades.put("Estilo", Estilo.BANDOLETA);
		inventario.addInstrumento("9019920", 5495.99, new InstrumentoSpec(propriedades));
		
		// Banjos
		propriedades.put("InstrumentoTipo", InstrumentoTipo.BANJO);
		propriedades.put("fabricante", Fabricante.GIBSON);
		propriedades.put("modelo", "RB-3");
		propriedades.remove("tom", TipoSax.ALTO);
		propriedades.put("tipo", Tipo.ACUSTICO);
		propriedades.put("numCordas", 5);
		propriedades.put("parteTras", Madeira.MAPLE);
		propriedades.remove("parteFrente", Madeira.MAPLE);
		propriedades.remove("Estilo", Estilo.BANDOLETA);
		inventario.addInstrumento("8900231", 2945.95, new InstrumentoSpec(propriedades));
		
		
	}
	
}
