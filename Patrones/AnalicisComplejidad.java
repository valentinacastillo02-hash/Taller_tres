package Patrones;

import Dominio.Bug;
import Dominio.Documetacion;
import Dominio.Feature;

public class AnalicisComplejidad implements PatronVisitorTarea { 
	
	    int documentosEncontrados = 0;
	    @Override
	    public void visitarDocumentacion(Documetacion documentacion) {
	    	// TODO Auto-generated method stub
	    	documentosEncontrados++;
	    	System.out.println("  [CALIDAD] Documentacion mejora calidad: " + documentacion.getDescripcionTarea());
	    }	
 
	    public int getDocumentosEncontrados() { return documentosEncontrados; }
	

	


	    @Override
	    public void visitarBug(Bug bug) {
	    	// TODO Auto-generated method stub
	
	    }

	    @Override
	    public void visitarFeature(Feature feature) {
	    	// TODO Auto-generated method stub
	
	    }


}
