//Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.
package Patrones;

import Dominio.Bug;
import Dominio.Documetacion;
import Dominio.Feature;

public class Analicis_Ctrit implements PatronVisitorTarea{
	private int BugEncontrado=0;
	public void visitarBug(Bug bug) {
		BugEncontrado++;
		System.out.println("EROOR, Bug encontrado: "+bug.getDescripcionTarea());
		
		
	}
	@Override
	public void visitarFeature(Feature feature) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitarDocumentacion(Documetacion documentacion) {
		// TODO Auto-generated method stub
		
	}
	public int getBugsEncontrados() { return BugEncontrado; }

}
