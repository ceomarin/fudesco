package com.fudesco.ejerciciogrupal8.principal;

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
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el tipo de usuario para completar los datos: ");
		tipo = entrada.next();
		String evaluacionTipo = tipo.toLowerCase();
		
		switch (evaluacionTipo) {
		case "cliente": {
			
			System.out.print("Ingrese direccion del Cliente: ");
			direccion = entrada.next();
			System.out.print("Igrese telefono del Cliente: ");
			telefono = entrada.next();
			System.out.print("Ingrese cantidad de empleados: ");
			cantidadEmpleados = entrada.nextInt();
			entrada.close();
			
			break;
		}
		case "profesional": {
			
			System.out.print("Ingrese direccion del Profesional: ");
			direccion = entrada.next();
			
			System.out.print("Ingrese años de experiencia Profesional: ");
			anioExperiencia = entrada.nextInt();
			//entrada.close();
			System.out.print("Ingrese departamento del Profesional: ");
			departamento = entrada.next();
			
			break;
		}
		case "administrativo": {
			
			System.out.print("Ingrese funcion del Administrativo: ");
			funcion = entrada.next();
			
			System.out.print("Ingrese nombre del Superior del Administrativo: ");
			nombreSuperior = entrada.next();
			
			break;
		}
		default:
			System.out.println("\ntipo no encontrado");
		}
		
		System.out.println("fin");
	
	}
	
	
	public static void registrarUsuario() {
		String nombre,fechaNacimiento,run,tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Ingrese datos básicos del usuario\n");
		
		System.out.print("Ingrese nombre del usuario: ");
		nombre = entrada.next();
		System.out.println("\nnombre usuario "+nombre+" registrado");
		
		System.out.print("Ingrese fecha de naciemiento del usuario: ");
		fechaNacimiento = entrada.next();
		System.out.println("\nnombre usuario "+fechaNacimiento+" registrado");
		
		System.out.print("Ingrese run del usuario: ");
		run = entrada.next();
		System.out.println("\nrun usuario "+run+" registrado");
	}

}