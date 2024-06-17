/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studenttester;

public class Main {
    public static void main (String []args){ 
        StudentTester Alumno1 = new StudentTester("David Ivan Perez Quevedo", 20, "TICS");
        StudentTester Alumno2 = new StudentTester("Jacqueline Venteño Rangel", 20, "IGE");
        StudentTester Alumno3 = new StudentTester("Daniel Benitez Priego", 23, "TICS");
        StudentTester Alumno4 = new StudentTester("Jonathan Castillo", 28, "TICS");
        
        Alumno1.show_Stuents();
        Alumno2.show_Stuents();
        Alumno3.show_Stuents();
        Alumno4.show_Stuents();
    }
    
}
