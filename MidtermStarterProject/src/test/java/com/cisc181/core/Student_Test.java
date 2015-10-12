package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	//@BeforeClass
	
	Course c1 = new Course(UUID.randomUUID(), "Biology", 3, eMajor.NURSING);
	Course c2 = new Course(UUID.randomUUID(), "Chemistry", 4, eMajor.CHEM);
	Course c3 = new Course(UUID.randomUUID(), "Accounting", 3, eMajor.BUSINESS);
	ArrayList<Course> CourseList = new ArrayList<Course>();
	//CourseList.add(c1);
	//CourseList.add(c2);
	//CourseList.add(c3); 
	
	Date StartDate1 = null;
	Date EndDate1 = null;
	Date StartDate2 = null;
	Date EndDate2 = null;
	Date DOB1 = null;
	Date DOB2 = null;{
			
	try {
		StartDate1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2015-09-03");
		EndDate1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-18");
		StartDate2 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-08");
		EndDate2 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2015-05-21");
		DOB1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1995-05-22");
		DOB2 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1996-05-21");
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	Semester f1 = new Semester(UUID.randomUUID(), StartDate1, EndDate1);
	Semester s1 = new Semester(UUID.randomUUID(), StartDate2, EndDate2);
	
	ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	SemesterList.add(f1);
	SemesterList.add(s1);
	
	Section sec1 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 10);
	Section sec2 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 7);
	Section sec3 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 14);
	Section sec4 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 19);
	Section sec5 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 8);
	Section sec6 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 11);
	
	ArrayList<Section> SectionList = new ArrayList<Section>();
	SectionList.add(sec1);
	SectionList.add(sec2);
	SectionList.add(sec3);
	SectionList.add(sec4);
	SectionList.add(sec5);
	SectionList.add(sec6);
	
	Student stu1 = new Student("Mary", "Grace", "Smith", DOB1, eMajor.NURSING,
			"145 Bird Lane", "610-290-2930", "msmith@udel.edu");
	Student stu2 = new Student("Sarah", "Rose", "Park", DOB1, eMajor.CHEM,
			"165 Rose Lane", "610-990-9330", "spark@udel.edu");
	Student stu3 = new Student("James", "John", "Roy", DOB2, eMajor.BUSINESS,
			"545 Draw Lane", "302-290-2930", "jroy@udel.edu");
	Student stu4 = new Student("Eric", "James", "Smith", DOB1, eMajor.CHEM,
			"382 Fire Lane", "610-092-2949", "esmith@udel.edu");
	Student stu5 = new Student("Grace", "Mary", "Andrews", DOB2, eMajor.NURSING,
			"394 Bird Lane", "610-290-2930", "gAndrews@udel.edu");
	Student stu6 = new Student("Angela", "Jill", "Joy", DOB1, eMajor.NURSING,
			"302 Rose Lane", "610-294-5820", "ajoy@udel.edu");
	Student stu7 = new Student("James", "Eric", "Smith", DOB2, eMajor.CHEM,
			"283 Star Lane", "610-290-2290", "jsmith@udel.edu");
	Student stu8 = new Student("Eric", "Andrew", "Jones", DOB1, eMajor.BUSINESS,
			"829 Heart Lane", "302-290-2930", "ejones@udel.edu");
	Student stu9 = new Student("Joy", "Angela", "Segel", DOB1, eMajor.NURSING,
			"145 Rose Lane", "610-938-2930", "jsegel@udel.edu");
	Student stu10 = new Student("Jill", "Grace", "Rose", DOB1, eMajor.NURSING,
			"345 Fire Lane", "302-290-2930", "jrose@udel.edu");
	
	ArrayList<Student> StudentList = new ArrayList<Student>();
	StudentList.add(stu1);
	StudentList.add(stu2);
	StudentList.add(stu3);
	StudentList.add(stu4);
	StudentList.add(stu5);
	StudentList.add(stu6);
	StudentList.add(stu7);
	StudentList.add(stu8);
	StudentList.add(stu9);
	StudentList.add(stu10);
	}
	
	@Test
	public void test() {
		//Enrollment e1 = new Enrollment(stu1, sec1.SectionID);
		//Enrollment e2 = new Enrollment(stu2, sec2.SectionID);
		//Enrollment e3 = new Enrollment(stu3, sec1.SectionID);
		//Enrollment e4 = new Enrollment(stu4, sec2.SectionID);
		//Enrollment e5 = new Enrollment(stu5, sec3.SectionID);
		//Enrollment e6 = new Enrollment(stu6, sec3.SectionID);
		//Enrollment e7 = new Enrollment(stu7, sec1.SectionID);
		//Enrollment e8 = new Enrollment(stu8, sec2.SectionID);
		//Enrollment e9 = new Enrollment(stu9, sec3.SectionID);
		//Enrollment e10 = new Enrollment(stu10, sec4.SectionID);
		
		//Student stu1.Enrollment.setGrade(99);
		//Student stu2.Enrollment.setGrade(98);
		//Student stu3.Enrollment.setGrade(93);
		//Student stu4.Enrollment.setGrade(95);
		//Student stu5.Enrollment.setGrade(98);
		//Student stu6.Enrollment.setGrade(91);
		//Student stu7.Enrollment.setGrade(92);
		//Student stu8.Enrollment.setGrade(93);
		//Student stu9.Enrollment.setGrade(90);
		//Student stu10.Enrollment.setGrade(92);
		
		 //public void setMajor(String newMajor)
	     // {
	     //    major = newMajor;
	     // }
		 
		 // stu1.setMajor(eMajor CHEM);
		
	}

}
