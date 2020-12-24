package pms_project;
import java.util.Date ; 

public class MedicinePrescription extends Prescription
{
private boolean fixedDose ; 

public MedicinePrescription( String id, String name, int pAge, 
double pWeight, Date ex, double dose , boolean fd) {
super(id, name, pAge, pWeight, ex, dose);
fixedDose = fd;
}

public MedicinePrescription(MedicinePrescription p  ) {
super( p ) ; 
fixedDose = p.fixedDose;
}

public  double dailyDosage()
{
    if(fixedDose == true )
        return super.does ; 
    else
      return super.patientWeight * does ; 
    
}



}