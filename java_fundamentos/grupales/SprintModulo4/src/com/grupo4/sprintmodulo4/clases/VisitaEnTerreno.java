package com.grupo4.sprintmodulo4.clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaEnTerreno {

	/*
	 * Visita en terreno - Identificador de la visita en terreno: obligatorio, número interno manejado por la compañía.
	 *  - RUT cliente: obligatorio
		- Día:fecha del accidente, independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA - Hora: debe ser una hora
	 * válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59) -
	 * Lugar: obligatorio, mínimo 10 caracteres, máximo 50 - Comentarios: máximo 100 caracteres
	 * 
	 */
	private int id;
	private int rut;
	private LocalDate dia;
	private LocalTime hora;
	private String lugar;
	private String comentarios;

	public VisitaEnTerreno() {
	}

	public VisitaEnTerreno(int id, int rut, LocalDate dia, LocalTime hora, String lugar, String comentarios) {
		this.id = id;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaEnTerreno [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", comentarios=" + comentarios + "]";
	}

}
