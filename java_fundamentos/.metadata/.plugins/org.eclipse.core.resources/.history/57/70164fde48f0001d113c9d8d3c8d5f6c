package com.fudesco.ejerciciogrupal8.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//datos basicos
		String nombre,fechaNacimiento,run,tipo;
		
		//datos perfil Cliente
		String direccion,telefono,empresa;
		int cantidadEmpleados;
		
		//datos perfil Profesional
		int anioExperiencia;
		String departamento;
		
		//datos perfil Administrativo
		String funcion,nombreSuperior;
		String evaluacionTipo;
	
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("Ingrese el tipo de usuario para completar los datos, las opciones son Cliente, Profesional, Administrativo: ");
			tipo = entrada.next();
			evaluacionTipo = tipo.toUpperCase();
			
		}while((!evaluacionTipo.equals("CLIENTE"))&& (!evaluacionTipo.equals("PROFESIONAL"))&&(!evaluacionTipo.equals("ADMINISTRATIVO")));
		
		
		ArrayList<String> usuarios = new ArrayList();
		usuarios.add("Usuario Tipo: " + evaluacionTipo);
		registrarUsuario(usuarios);
		

				
		switch (evaluacionTipo) {
		case "CLIENTE": {
			
			System.out.print("\nIngrese direccion del Cliente: ");
			direccion = entrada.next();
			usuarios.add("Direccion: " + direccion);

			System.out.print("\nIgrese telefono del Cliente: ");
			telefono = entrada.next();
			usuarios.add("Telefono: "+ telefono);
			System.out.print("\nIngrese cantidad de empleados: ");
			cantidadEmpleados = entrada.nextInt();
			usuarios.add("Cantidad de empleados: " + cantidadEmpleados );
			entrada.close();
			
			break;
		}
		case "PROFESIONAL": {
			
<<<<<<< HEAD
			System.out.println("Ingrese direccion del Profesional: ");
			direccion = entrada.next();
			direccion+= entrada.nextLine();
			
			System.out.println("Ingrese años de experiencia Profesional: ");
			anioExperiencia = Integer.parseInt(entrada.next());
			
			System.out.println("Ingrese departamento del Profesional: ");
=======
			System.out.print("\nIngrese años de experiencia Profesional: ");
			anioExperiencia = entrada.nextInt();
			usuarios.add("Años de experiencia: "+ anioExperiencia);
			System.out.print("\nIngrese departamento del Profesional: ");
>>>>>>> 52188642930749e2e9edb61a6e8a3e8890065898
			departamento = entrada.next();
			usuarios.add("Departamento: "+ departamento);
			
			break;
		}
		case "ADMINISTRATIVO": {
			
			System.out.print("\nIngrese funcion del Administrativo: ");
			funcion = entrada.next();
			usuarios.add("Funcion: "+ funcion);
			System.out.print("\nIngrese nombre del Superior del Administrativo: ");
			nombreSuperior = entrada.next();
			usuarios.add("Nombre del superior: "+ nombreSuperior);
			
			break;
		}
		default:
			System.out.println("\ntipo no encontrado");
		}
		
	
		System.out.println("");
		
		for(String usuario: usuarios) {
			System.out.println(usuario);
		}
	}
	
	
	public static void registrarUsuario(ArrayList<String> usuario) {
		String nombre,fechaNacimiento,run;
		
		Scanner entrada = new Scanner(System.in);
		
		//ArrayList<String> usuario = new ArrayList();

		System.out.print("\nIngrese datos básicos del usuario\n");
		
		System.out.print("\nIngrese nombre del usuario: ");
		nombre = entrada.next();
		usuario.add("Nombre: " + nombre);
		

		System.out.print("\nIngrese fecha de naciemiento del usuario: ");
		fechaNacimiento = entrada.next();
		usuario.add("Fecha Nacimiento: " + fechaNacimiento);
		

		System.out.print("\nIngrese run del usuario: ");
		run = entrada.next();
		usuario.add("Rut: " +run);
	}
	

}
