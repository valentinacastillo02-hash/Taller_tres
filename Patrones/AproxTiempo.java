//Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.
package Patrones;

import Dominio.Bug;
import Dominio.Documetacion;
import Dominio.Feature;

public class AproxTiempo implements PatronVisitorTarea{
	    private int horasEstimadas = 0;
	    
	    @Override
	    public void visitarBug(Bug bug) {
	        // Bug: estimación según complejidad
	        if (bug.getComplejidadTarea().equals("Alta")) horasEstimadas += 8;
	        else if (bug.getComplejidadTarea().equals("Media")) horasEstimadas += 4;
	        else horasEstimadas += 2;
	    }
	    
	    @Override
	    public void visitarFeature(Feature feature) {
	        // Feature: impacta más en tiempo
	        if (feature.getComplejidadTarea().equals("Alta")) horasEstimadas += 16;
	        else if (feature.getComplejidadTarea().equals("Media")) horasEstimadas += 8;
	        else horasEstimadas += 4;
	        System.out.println("  [ESTIMACION] Feature: " + feature.getDescripcionTarea() + " requiere tiempo adicional");
	    }
	    
	    @Override
	    public void visitarDocumentacion(Documetacion doc) {
	        // Documentación: tiempo menor
	        horasEstimadas += 2;
	    }
	    
	    public int getHorasEstimadas() { 
	    	return horasEstimadas; }

		

		
		

}
