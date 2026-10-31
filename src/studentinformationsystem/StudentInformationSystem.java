/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

import java.util.Scanner;

/**
 *
 * @author myrxh
 */
public class StudentInformationSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter student name: ");
        String studentName = input.nextLine();
        
        System.out.print(" Enter student ID: ");
        String studentID = input.nextLine();
        
        System.out.println("Programme: Bachelor of Computer Science (Software Engineering)");
        
        System.out.print(" Enter mark 1: ");
        int mark1 = input.nextInt();
 
        System.out.print(" Enter mark 2: ");
        int mark2 = input.nextInt();
        double totalMark = mark1 + mark2;
        
        System.out.println("\nStudent Information");
        System.out.println();
        System.out.println("Student Name: " + studentName) ;
        System.out.println("Student ID:" + studentID);
        System.out.println("Programme: Bachelor of Computer Science (Software Engineering)");
        System.out.println("Total mark = " + totalMark);
      
        if (totalMark >= 90) {
            System.out.println("Excellent");
        } else if (totalMark >= 70) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        
            input.close();
    }
    
}
