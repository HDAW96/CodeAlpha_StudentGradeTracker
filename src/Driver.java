// Hadi Awad - CodeAlpha Task 1
// Student Grade Tracker - CodeAlpha

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
  int highest = 0, lowest = 0, total = 0;
    studentGrade = 0;
    studentName = "";
    try{
  while(true) {
    if(studentGrade <=100 && studentGrade >=0) {
      System.out.println("***************(-1 to exit)***************");
      System.out.println("Enter the student name: ");
      studentName = scan.nextLine();
      if(!studentName.trim().equals("-1")) {
        students.add(studentName);
      }
      else{
        break;
      }
      System.out.println("Enter the student grade: ");
      studentGrade = scan.nextInt();
      scan.nextLine();
      if(studentGrade != -1) {
        grades.add(studentGrade);
      }
      else{
        break;
      }
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
      System.out.println("Student " + i +": Name: "+students.get(i).toUpperCase() +" Grade: "+grades.get(i));
    }
    if(!grades.isEmpty()) {
      average = (double) total / grades.size();
      lowest = grades.get(0);
      highest = grades.get(0);
    }
    System.out.println("Student Names and Grades:\n");
    System.out.println("Average Grade: "+average);
    System.out.println("Highest Grade: "+highest);
    System.out.println("Lowest Grade: "+lowest);
    scan.close();
  }


}
