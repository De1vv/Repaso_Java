/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studenttester;

public class StudentTester{ 
    String name; 
     int age;
     String college_career; 

     public  StudentTester(String _name, int _age, String _college_career){
        name = _name; 
        age = _age; 
        college_career = _college_career; 
       }
       public void show_Stuents(){
        System.out.println("El nombre del estudiante es: " + name) ;
        System.out.println("La edad del estudiante es: " + age);
        System.out.println("La carrera del estudainte es: " + college_career);
       }  
      
   }
