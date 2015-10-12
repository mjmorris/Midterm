package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

/**
 * The Section class creates a section with a Course ID, a Semester ID, a Section ID,
 * and a Room ID.
 *
 */

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}

}
