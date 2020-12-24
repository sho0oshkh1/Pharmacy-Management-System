package pms_project;
import java.util.Date ; 

public class SupplementPrescription extends Prescription
{

   private int numOfRefills ; 

   public SupplementPrescription( String id, String name, int pAge, double pWeight,
        Date ex, double dose , int nr) {
      super(id, name, pAge, pWeight, ex, dose);
      this.numOfRefills = numOfRefills;
   }

   public SupplementPrescription(SupplementPrescription p) {
      super(p);
      numOfRefills = p.numOfRefills;
   }


   public  double dailyDosage()
   {
   
      if( super.patientAge >= 1 && super.patientAge <= 2 )   
         return  super.does / 2 ;
      else
         if( super.patientAge > 2  && super.patientAge <= 12 )  
            return super.does ; 
         else
            if( super.patientAge > 12 )
               return 2 * super.does ; 
   
    
      return 0 ; 
   }

   public int refill(){
      numOfRefills-- ; 
      return numOfRefills ; 
   }
}