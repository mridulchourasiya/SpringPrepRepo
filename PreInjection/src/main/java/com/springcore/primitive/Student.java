package com.springcore.primitive;

public class Student {
  private int id;
  private String name;
  private String subject;
  private ExamSheet examSheet;
  
  
  
  public Student(int id, String name, String subject, ExamSheet examSheet) {
	    this.id=id;
	    this.name = name;
	    this.subject= subject;
	    this.examSheet = examSheet;
	}
  
  // method 
  public void ExamSheet() {
	  System.out.println("Student Name: "+ name);
	  System.out.println("Student Id: "+ id);
	  examSheet.examSheeting();
	 
  }
	

}
