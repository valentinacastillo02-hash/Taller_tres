package Colaborador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList <String> listaUsername=new ArrayList<>(); 
		File file = new File("usuarios.txt");
		Scanner s = new Scanner(file);
		
		while(s.hasNextLine()) {
			String linea=s.nextLine();
			String[] Partes= linea.split("|");
			String Username= Partes[0];
			String Contraseña=Partes[1];
			String Rol= Partes[2];
			
		}
		s.close();
		ArrayList <String> listaproyectos=new ArrayList<>();
		File Archivo= new File("proyectos.txt");
		Scanner sn=new Scanner(Archivo);
		
		while(sn.hasNextLine()) {
			String line=sn.nextLine();
			String[] Parts= line.split("|");
			String ID=Parts[0];
			String Nombre=Parts[1];
			listaproyectos.add(Nombre);
			String Responsable= Parts[2];
		}
		sn.close();
		
		ArrayList <String> listatareas=new ArrayList<>();
		File Rom= new File("tareas.txt");
		Scanner sca=new Scanner (Rom);
		
		while(sca.hasNextLine()) {
			String lineas= sca.nextLine();
			String partes[] = lineas.split("|");
			String Tarea=partes[0];//Este es el ombre de la tarea?
			listatareas.add(Tarea);
			
			String id=partes[1];
			String descripcion=partes[2];
			String Estado=partes[3];
			String Responsable=partes[4];
			String Complejidad=partes[5];
			String Fecha=partes[6];
			

		}
		sca.close();
		
		
	}

	void IniciarSistema() {
		System.out.println("hola nerror ");
	}
		

	
}
	


