// Hadi Awad - CodeAlpha Task 1
//Student Grade Tracker-

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

  public static void main(String[]args){
  Scanner scan = new Scanner(System.in);
  ArrayList<Integer> grades = new ArrayList<>();
  ArrayList<String> students = new ArrayList<>();

  String studentName;
  int studentGrade;
  double average = 0;
  int highest = 0, lowest = 100, total = 0;
    studentGrade = 0;
    studentName = "";
    try{
  while(studentGrade !=-1 || studentName.trim().equals("-1")) {
    if(studentGrade <=100 && studentGrade >=0) {
      System.out.println("***************(-1 to exit)***************");
      System.out.println("Enter the student name: ");
      studentName = scan.nextLine();
      students.add(studentName);
      System.out.println("Enter the student grade: ");
      studentGrade = scan.nextInt();
      grades.add(studentGrade);
      System.out.println("Added:\nStudent Name: " + studentName + "\nGrade: " + studentGrade);
      total +=studentGrade;
      System.out.println("******************************************");
    }
    else {
      System.out.println("Invalid Input.");
      System.out.println("******************************************");
      studentGrade = 0;
      studentName = "";
    }
  }}catch(Exception ex){
      System.out.println("Error in inputs.");
    }
    for(int i = 0; i < students.size(); i++){
      if(grades.get(i)<lowest)
        lowest = grades.get(i);
      if(grades.get(i)>highest)
        highest = grades.get(i);
      System.out.println("Student " + i +": Name: "+students.get(i) +" Grade: "+grades.get(i));
    }
    if(!grades.isEmpty()) {
      average = (double) total / grades.size();
    }
    System.out.println("Student Names and Grades:\n");
    System.out.println("Average Grade: "+average);
    System.out.println("Highest Grade: "+highest);
    System.out.println("Lowest Grade: "+lowest);
  }


}
