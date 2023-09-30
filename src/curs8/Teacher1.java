package curs8;

import java.util.Scanner;

public class Teacher1 extends Teacher {

	public Teacher1(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
	}

	Scanner scan = new Scanner(System.in);

	public String getCourse() {
		System.out.println("Va rog introduceti cursul:");
		course = scan.next();
		return course;
	}

	public int getExperienceYears() {
		System.out.println("Va rog introduceti experienta:");
		experienceYears = scan.nextInt();
		return experienceYears;
	}

	public String getSchedule() {
		System.out.println("Va rog introduceti orarul:");
		schedule = scan.next();
		return schedule;
	}

	public void validareTeacher1() {
		if (course.equals("facultate1") && experienceYears >= 2 && schedule.equals("morning")) {

			System.out.println("You qualify to teach at this shool !");

		} else {
			System.out.println("You do not qualify!");

		}
	}

}
