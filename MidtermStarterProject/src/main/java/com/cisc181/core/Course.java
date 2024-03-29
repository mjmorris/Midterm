package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

/**
 * The Course class creates an account with a Course ID, a Course Name,
 * Grade Points, and a Major.
 * 
 * @author Mandy
 *
 */

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor Major){
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}

}
