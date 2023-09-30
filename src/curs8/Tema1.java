package curs8;

public class Tema1 {
	/*
	 * Scriem un program care verifica daca un profesor se califica sa predaea la o
	 * scoala Daca se califica ,atunci printeaza "You qualify to teach at this
	 * school" Daca nu se califica,atunci printeaza "You do not qualify!" Avem o
	 * clasa Teacher care are urmatoarele caracteristici: Course ExperienceYears
	 * Schedule
	 */

	public static void main(String[] args) {
		Teacher1 obj = new Teacher1("fac", 0, "afternoon");
		obj.getCourse();
		obj.getExperienceYears();
		obj.getSchedule();
		obj.validareTeacher1();

	}
}