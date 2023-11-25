
package com.mycompany.clinicmanagementsystemfinal;

import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class CLINICMANAGEMENTSYSTEMFINAL {
    public static void main(String[] args)
    {
        File dir = new File ("person");
        dir.mkdir(); //directory will be created
               
                 
                   try {
            // Create a directory
           
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("Directory created.");
            }

            // Create a file within the directory
            File file1 = new File("F:/sumaiya the V.I.P/sem 11/java lab/project/CLINICMANAGEMENTSYSTEMFINAL/person/patient.txt");
            try (Formatter formatter = new Formatter ("F:/sumaiya the V.I.P/sem 11/java lab/project/CLINICMANAGEMENTSYSTEMFINAL/person/patient.txt")) {
                formatter.format ("%s %s\r\n", "01" , "Patient_Sumaiya");
                formatter.format ("%s %s\r\n", "02" , "Patient_my_classmates");
                formatter.format ("%s %s\r\n", "03" , "Patient_Unknown");
            }
            if (!file1.exists()) {
                file1.createNewFile();
                System.out.println("File 1 created.");
            }

            // Create another file (file2)
             File file2 = new File ("F:/sumaiya the V.I.P/sem 11/java lab/project/CLINICMANAGEMENTSYSTEMFINAL/person/doctor.txt");  
            if (!file2.exists()) {
                file2.createNewFile();
                System.out.println("File 2 created.");
            }

            // Perform other file operations as needed

        } catch (IOException e) {
            // Handle any IOException that may occur
        }
    
                  
        CLINIC p = new Staff("John", 101, 30,"Male","porters");
        //CLINIC q = new Staff("Mike", "102", "35", "Female", "Patient care technicians");

        CLINIC q = new Staff("Mike", 102, 35, "Female", "porters");
        CLINIC r = new Staff("Steve", 103, 40, "Male","clinical assistants");

        CLINIC g = new Doctor("P", 101, 45, "Male", 5, "Cardiology");
        CLINIC h = new Doctor("Q", 102, 55, "Male",7, "ENT");
        CLINIC j = new Doctor("R", 103, 50, "Male", 4, "Gastroenterology");

        CLINIC d = new Patient("A", 1001, 35, "Male");
        CLINIC e = new Patient("B", 1002, 44, "Female");
        CLINIC f = new Patient("C", 1003, 56, "Male");


        CLINIC x = new Visit("Hanif", 10003, 56, "Male", 1000, 4);
        CLINIC y = new Visit("Robin", 10004, 46, "Male", 1000, 5);
        CLINIC z = new Visit("Raihan", 10005, 36, "Male", 1000, 7);

        Displayable[] displayables = { p, q, r, g, h, j, d, e, f,x,y,z };

        System.out.println("\n*******CLINIC MANAGEMENT SYSTEM*******");
        for (Displayable displayable : displayables) {
            displayable.display();
        }

        ArrayList<CLINIC> al = new ArrayList<CLINIC>();
        Collections.addAll(al, p, q, r, d, e, f, g, h, j,x,y,z);

        Collections.addAll(al, d, f);
        System.out.println("\nAFTER ADDING IN THE LIST...");
       // System.out.println("\n\t\tNew List: ");
        for(int i=0;i<al.size();i++){
               al.get(i).display();
            
          }     
   
         al.remove(2);
       System.out.println("\nAFTER REMOVING IN THE LIST...");

          for(int i=0;i<al.size();i++){       
               al.get(i).display();

        
        }
        
    }
}

