package com.cisc181.core;

import java.util.UUID;

/**
 * The Enrollment class creates an Enrollment with a Section ID, a Student ID,
 * an Enrollment ID, and a Grade.
 *
 */

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//No-Arg Constructor
	private Enrollment(){
	}
	
	//Constructor that creates Enrollment with arguments StudentID and SectionID
	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = EnrollmentID;
	}
	
	public void SetGrade(double Grade){
		this.Grade = Grade;
	}

}
