package com.grupo4.sprintmodulo4.clases;

public class Revision {
/*
	 * Revisión
	- Identificador de la revisión: obligatorio, número interno manejado por la compañía.
	- Identificador de la visita en terreno: obligatorio, número de la vista a la que se asóciala revisión.
 * */
	private final int idRevision;
	private int idVisita;
	private static int contador;

	
	private Revision() {
		this.idRevision = ++Revision.contador;
	}

	public Revision(int idVisita) {
		this();
		this.idVisita = idVisita;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + "]";
	}
	
	
	
	
}
