package buscaguitarra_versao5;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class InstrumentoSpec {
	
	private Map propriedades;
	
	public InstrumentoSpec(Map propriedades) {
		if (propriedades == null) {
			this.propriedades = new HashMap();
		}
		else {
			this.propriedades = new HashMap(propriedades);
		}
	}
	
	public Object getPropriedade(String propriedadeNome) {
		return propriedades.get(propriedadeNome);
	}
	
	public Map getPropriedades() {
		return propriedades;
	}

		
	public boolean matches (InstrumentoSpec otherSpec) {
		for(Iterator i = otherSpec.getPropriedades().keySet().iterator(); i.hasNext();) {
			String propriedadeNome = (String)i.next();
			if (!propriedades.get(propriedadeNome).equals(otherSpec.getPropriedade(propriedadeNome))) {
				return false;
			}
		}
		return true;
	}

}
