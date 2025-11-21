package Patrones;

import Dominio.Bug;
import Dominio.Documetacion;
import Dominio.Feature;

public interface PatronVisitorTarea {
	void visitarBug(Bug bug);
	void visitarFeature(Feature feature);
	void visitarDocumentacion(Documetacion documentacion);
	

}
