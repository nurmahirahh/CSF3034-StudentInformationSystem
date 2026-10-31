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
        
        System.out.println("\nStudent Information");
        System.out.println();
        System.out.println("Student Name: " + studentName) ;
        System.out.println("Student ID:" + studentID);
      
        input.close();
    }
    
}
