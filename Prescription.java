package pms_project;

import java.util.Date ; 
import java.io.*; 
public abstract class Prescription implements Serializable{

protected String id ; 
protected String name ; 
protected int patientAge ; 
protected double patientWeight ; 
protected Date expireDate ; 
protected double does ; 

public Prescription(String id, String name, int pAge, double pWeight, Date ex, double dose) {
this.id = id;
this.name = name; 
patientAge = pAge;
patientWeight = pWeight;
expireDate = ex;
does = dose;
}


public Prescription(Prescription p  ){
id = p.id;
name = p.name;
patientAge = p.patientAge;
patientWeight = p.patientWeight;
expireDate = p.expireDate;
does = p.does;
}


public boolean isExpired()
{
return false;
}

public abstract double dailyDosage();


public String toString() {
return "Prescription id: " + id +  " ,Name is: " + name + " ,patientAge is: " + patientAge + 
         " ,patientWeight is: " + patientWeight +" ,expire Date is: " + expireDate +" ,does is: " + does ;
}


}
