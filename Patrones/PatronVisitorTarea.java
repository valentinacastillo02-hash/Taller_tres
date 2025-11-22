//Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.




package Patrones;

import Dominio.Bug;
import Dominio.Documetacion;
import Dominio.Feature;

public interface PatronVisitorTarea {
	void visitarBug(Bug bug);
	void visitarFeature(Feature feature);
	void visitarDocumentacion(Documetacion documentacion);
	

}
