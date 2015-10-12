package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

import java.util.Date;

/**
 * The Semester class creates a semester with a Semester ID, a Start Date,
 * and an End Date.
 *
 */

public class Semester {
	
	private UUID SemesterID;
	private Date StartDate = new Date();
	private Date EndDate = new Date();

	public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
}
