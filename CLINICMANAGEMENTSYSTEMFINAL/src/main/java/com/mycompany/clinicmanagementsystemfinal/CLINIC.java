
package com.mycompany.clinicmanagementsystemfinal;
import java.util.List;

abstract class CLINIC implements Displayable
{
    protected String name;
    protected int id;
    protected int age;
    protected String gender;
    protected static int visitCount;
    protected List<CLINIC> visits;

    public CLINIC(String name,int id,int age,String gender)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.gender=gender;
    }
    
    public static int getVisitCount() {
        return visitCount;
    }

    public void addVisit(CLINIC visit) {
        visits.add(visit);
        visitCount++;
    }

    // Get the patient's visit history
    public List<CLINIC> getVisits()
    {
        return visits;
    }
}
    

