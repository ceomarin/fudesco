package com.grupo4.sprintmodulo4.clases;

import java.time.*;

public class Accidente {
	
	/*
	- id
	- rutCliente
	- dia
	- hora
	- lugar
	- origen
	- consecuencias
	
	Identificador del accidente: obligatorio, número interno manejado por la compañía.
	- RUT Cliente: obligatorio
	- Día: fecha del accidente, independiente si lo declara como una fecha o un String,
	debe ser desplegado con el formato DD/MM/AAAA
	- Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
	23, minutos entre 0 y 59)
	- Lugar: obligatorio, mínimo 10 caracteres, máximo 50
	- Origen: máximo 100 caracteres
	- Consecuencias: máximo 100 caracteres
	*/
	private final int id;
	private int rutCliente;
	private LocalDate dia;
	private LocalTime hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	private static int contador;
	
	private Accidente() {
		this.id = ++Accidente.contador;
	}
	
	
	public Accidente( int rutCliente, LocalDate dia, LocalTime hora, String lugar, String origen,String consecuencias) {
		this();
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
		
	}
	public int getId() {
		return id;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [id=" + id + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora + ", lugar="
				+ lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}
	
	

}
