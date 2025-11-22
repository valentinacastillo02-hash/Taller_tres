package Patrones;

import java.util.ArrayList;


import Dominio.Tarea;
public class StrategyPorcomplejidad implements IStrategy {

	@Override
	public void Ordenar(ArrayList<Tarea> tarea) {
		for(int i=0;i<tarea.size()-1;i++) {
			for(int j=0;j<tarea.size()-1-i;j++) {
				int ComplejidadActual=tarea.get(j).getValorComplejidad();
				int  ComplejidadSig=tarea.get(j+1).getValorComplejidad();
				
				if(ComplejidadActual<ComplejidadSig) {
					Tarea tareaActual = tarea.get(j);
                    Tarea tareaSiguiente = tarea.get(j + 1);
                    
                    tarea.remove(j);          
                    tarea.remove(j); 
                    
                    tarea.add(j, tareaSiguiente); 
                    tarea.add(j + 1, tareaActual); 
				
					}
					
				}
				
	
		}
	}
}

	