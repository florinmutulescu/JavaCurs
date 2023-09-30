package curs8;
/*
 * Avem o clasa Qualification care mosteneste clasa Teacher
 * In cadrul acestei clase avem un constructor care seteaza 
 * caracteristicile din Teacher 
 * Avem o metoda care se numeste verify si care verifica urmatoarele:
 * Daca experienceYears sunt mai mari ca 3 si daca course este egal cu "Java"
 * si daca schedule este egal cu "Afternoon"
 * Daca toate conditiile sunt indeplinite printeaza mesajul de qualification de mai sus
 * daca nu printeaza mesajul de necalificare de mai sus
 * 
 */

public class Tema2 {

	public static void main(String[] args) {
		Qualification obj = new Qualification("Java", 3, "Afternoon");

		obj.verify();
		Qualification obj1 = new Qualification("Python", 3, "Afternoon");
		obj1.verify();
	}

}
