package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
				
	@Test
	
	public void test() {
		Date dBirthDate1 = null;
		Date dHireDate1 = null;
		Date dBirthDate2 = null;
		Date dHireDate2 = null;
		Date dBirthDate3 = null;
		Date dHireDate3 = null;
		Date dBirthDate4 = null;
		try {
			dBirthDate1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1972-12-31");
			dHireDate1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2008-02-02");
			dBirthDate2 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1975-11-08");
			dHireDate2 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2010-03-21");
			dBirthDate3 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1990-10-18");
			dHireDate3 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2014-03-12");
			dBirthDate4 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("1880-10-10");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Staff s1 = new Staff("Patrick", "Mark", "Smith", dBirthDate1, 
				"1132 Eagle Lane", "610-425-3940", "psmith@udel.edu",
				"Monday 1-2PM", 10, 110000.00, dHireDate1, eTitle.PROFESSOR);
		Staff s2 = new Staff("Kyle", "Andrew", "Brown", dBirthDate2,
				"116 Sharp Lane", "302-085-3093", "kbrown@udel.edu",
				"Tuesday 2-4PM", 9, 90600.00, dHireDate2, eTitle.PROFESSOR);
		Staff s3 = new Staff("Andrew", "Joseph", "Wilson", dBirthDate1,
				"239 Harter Street", "179-999-3049", "awilson@udel.edu",
				"Wednesday 1-5PM", 10, 170000.00, dHireDate2, eTitle.ADMINISTRATOR);
		Staff s4 = new Staff("Jill", "Lucy", "Morris", dBirthDate2,
				"456 Sky Drive", "610-584-9304", "jmorris@udel.edu",
				"Thursday 1-3PM", 8, 105400.00, dHireDate1, eTitle.ADVISOR);
		Staff s5 = new Staff("Sarah", "Maria", "Campbell", dBirthDate3,
				"253 Rose Lane", "610-385-3095", "scampbell@udel.edu",
				"Friday 5-6PM", 9, 130000.00, dHireDate3, eTitle.PROFESSOR);
		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		StaffList.add(s1);
		StaffList.add(s2);
		StaffList.add(s3);
		StaffList.add(s4);
		StaffList.add(s5);
		double salarySum = s1.getSalary() + s2.getSalary() + s3.getSalary() + 
				s4.getSalary() + s5.getSalary();
		double salaryAverage = salarySum / 5;
		System.out.println(salaryAverage);
		//assertEquals(salaryAverage, 121200.00);
		
		Staff s6 = new Staff("Jill", "Mary", "Lane", dBirthDate4,
				"16 Sky Drive", "610-444-39507", "jlane@udel.edu",
				"Friday 1-3PM", 8, 105000.00, dHireDate3, eTitle.PROFESSOR);
	
	
	}
	

	

}
