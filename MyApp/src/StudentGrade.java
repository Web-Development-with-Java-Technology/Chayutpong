import java.util.Scanner;

public class StudentGrade {
  public static void main(String[] args) {
    System.out.println("-----------------------------------");
    System.out.println("Nakhon Pathom Vocational College");
    System.out.println("Name : Chayutpong Pikulhom");
    System.out.println("Nickname : Boom");
    System.out.println("Student ID : 653090100003");
    System.out.println("-----------------------------------");
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter your GPA : ");
    int gpa = scn.nextInt();
    scn.close();
    System.out.println("Result GPA : " + gpa);
    if (gpa>=80) {System.out.println("Grade : A");} 
    else if(gpa>=70) {System.out.println("Grade : B");} 
    else if(gpa>=60) {System.out.println("Grade : C");} 
    else if(gpa>=50) {System.out.println("Grade : D");} 
    else { System.out.println("Grade : F");}
    System.out.println("-----------------------------------");
  }
}