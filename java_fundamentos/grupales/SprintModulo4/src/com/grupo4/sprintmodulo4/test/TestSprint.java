package com.grupo4.sprintmodulo4.test;

import java.time.LocalDate;
import java.time.LocalTime;

import com.grupo4.sprintmodulo4.clases.Accidente;

public class TestSprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accidente accidente1 = new Accidente(2222222,LocalDate.now(),LocalTime.now(),"Oficina 3","casa","murio");
		Accidente accidente2 = new Accidente(2222222,LocalDate.now(),LocalTime.now(),"Oficina 3","casa","murio");
		
		System.out.println(accidente1);
		System.out.println(accidente2);
//		System.out.println(accidente1);
	}

}
