package com.mycompany.clinicmanagementsystemfinal;

import java.util.Scanner;


//Doctor
class Doctor extends CLINIC
{
    private int experience;
    private String specialist;
    public Doctor(String name,int id, int age, String gender,int experience,String specialist)
    {
        super(name,id,age,gender);
        this.experience=experience;
        this.specialist=specialist;
    }

    
    public void display()
    {
        System.out.println("\n\nDOCTORS INFORMATION...");
        System.out.println("Doctor name"+" "+name);
        System.out.println("Doctor Id"+" "+id);
        System.out.println("Doctor Age"+" "+age);
        System.out.println("Doctor Gender"+" "+gender);
        System.out.println("Experience="+" "+experience);
        System.out.println("Specilized in="+" "+specialist);
    }
}


class Visit extends Patient {
    private int visitAmount;
    private int numOfvisits;

    public Visit(String name, int id, int age, String gender,int visitAmount, int numOfvisits) {
        super(name, id, age, gender);
        this.visitAmount = visitAmount;
        this.numOfvisits = numOfvisits;
    }

    

    public void display() {
        System.out.println("\n\nDOCTORS INFORMATION...");
        System.out.println("Doctor name" + " " + name);
        System.out.println("Doctor Id" + " " + id);
        System.out.println("Doctor Age" + " " + age);
        System.out.println("Doctor Gender" + " " + gender);
        System.out.println("Patient VisitAmount" + " " + visitAmount);
        System.out.println("Patient NumOfvisits in" + " " + numOfvisits);
        System.out.println("Total ammount is=" + " " + visitAmount * numOfvisits);
    }
}

class Staff extends CLINIC
{
    protected String designation;
    public Staff(String name, int id,int age, String gender, String designation)
    {
        super(name,id,age,gender);
        this.designation=designation;
    }
    public void display()
    {
        System.out.println("\n\nStaff INFORMATION...\n");
        System.out.println("Staff name"+" "+name);
        System.out.println("Staff Id"+" "+id);
        System.out.println("Staff Age"+" "+age);
        System.out.println("Staff Gender"+" "+gender);
        System.out.println("Staff Designation"+" "+designation);
    }
}
class Patient<numVisits> extends CLINIC
{
    private String problem;
    public Patient(String name,int id, int age,String gender){
        super(name,id,age,gender);
       }

    public void display(){
        System.out.println("\n\nPATIENTS INFORMATION... ");
        System.out.println("Patient name"+" "+name);
        System.out.println("Patient Id"+" "+id);
        System.out.println("Patient Age"+" "+age);
        System.out.println("Patient Gender"+" "+gender);


}
}