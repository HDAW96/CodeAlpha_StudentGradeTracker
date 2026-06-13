import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

  public static void main(String[]args){
  Scanner scan = new Scanner(System.in);
  ArrayList<Integer> grades = new ArrayList<>();
  ArrayList<String> students = new ArrayList<>();

  String studentName;
  int studentGrade;
  double average;
  int highest = 0, lowest = 0, total = 0;
    studentGrade = 0;
    studentName = "";
    try{
  while(studentGrade !=-1 || studentName.trim().equals("-1")) {
    if(studentGrade <=100 && studentGrade >=0) {
      System.out.println("***************(-1 to exit)***************");
      System.out.println("Enter the student name: ");
      studentName = scan.next();
      System.out.println("Enter the student grade: ");
      studentGrade = scan.nextInt();
      students.add(studentName);
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
    System.out.println("Student Names and Grades:\n");
    for(int i = 0; i < students.size(); i++){

    }
  }


}
