package Patrones;

import java.util.ArrayList;


import Dominio.Tarea;

public class Strategy_porfecha implements IStrategy{

	@Override
	public void Ordenar(ArrayList<Tarea> tarea) {
		// TODO Auto-generated method stub
		for(int i=0;i<tarea.size()-1;i++) {
			for(int j=0;j<tarea.size()-1-i;j++) {
				String FechaActual=tarea.get(j).getFechaTarea();
				String FechaSig=tarea.get(j+1).getFechaTarea();
				
				String FechasinGuion="";
				for(int k = 0; k < FechaActual.length(); k++) {
					if(FechaActual.charAt(k) != '-') {
						FechasinGuion=FechasinGuion + FechaActual.charAt(k);
					}
					
				}
				String Fecha2SinGuion="";
				for(int k = 0; k < FechaSig.length(); k++) {
					if(FechaSig.charAt(k) != '-') {
						Fecha2SinGuion=Fecha2SinGuion +FechaSig.charAt(k);
						
					}
					int numeroFecha1 = Integer.parseInt(FechasinGuion);
	                int numeroFecha2 = Integer.parseInt(Fecha2SinGuion);
	                
	                if (numeroFecha1 > numeroFecha2) {
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

}
