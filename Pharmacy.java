package pms_project;

import javax.swing.JOptionPane;

import java.io.*; 
import java.util.Date;

public class Pharmacy implements Serializable{

   private String name ; 
   private String location ; 
   private String zipcode ; 
   private int numOfSupplement ; 
   private int numOfMedicine ; 

   Prescription[]  list ; 

   public Pharmacy(String name, String location, String zip) {
      this.name = name;
      this.location = location;
      zipcode = zip;
   
      numOfSupplement = 0 ; 
      numOfMedicine = 0 ; 
      list = new Prescription[100] ; 
   
   }

   public boolean addPrescription(Prescription p ){
      int position = numOfMedicine + numOfSupplement ; 
   
      if(  position >= list.length ){
      
         JOptionPane.showMessageDialog(null, " sorry we can't add , array is full ");
         return false; }
   
      else if( p instanceof SupplementPrescription ){
         
            if( numOfSupplement == 50 ){
            
               JOptionPane.showMessageDialog(null, " sorry , we cant add SupplementPrescription it's full ");
               return false;  }
               
            else{
               list[position] = new SupplementPrescription( (SupplementPrescription) p ) ;  // because it's super we need to do downCasting
               numOfSupplement++; 
               return true; }}
         
         else
            if( p instanceof MedicinePrescription ){
               list[position] = new MedicinePrescription( (MedicinePrescription) p ) ; // because it's super we need to do downCasting
               numOfMedicine++; 
               return true; }
   
      return false;   }

   public String toString()
   {
      String str = "Pharmacy with all information:  \n" + 
         "Name: " + name +"  ,location: " + location +"  ,ZipCode: " + zipcode + "\n" +  
         "number Of Supplement fill: " + numOfSupplement + 
         " ,number Of Medicine fill:  " + numOfMedicine ; 
   
      str = str + "Prescription : \n " ; 
   
      for( int i = 0 ; i<  numOfMedicine + numOfSupplement ; i++ )
         str = str+ list[i].toString() + "\n" ; 
   
      return str; }

   public String disposeExpired()
   { int count = numOfMedicine + numOfSupplement ; 
      Date currentDate = new Date(); 
      String str = " For all Expired Prescription : \n " ; 
      int num=0;
      int i=0;
      while (i< count){
         if( list[i].expireDate.before(currentDate))
         {
            str = str + list[i].toString() + "\n" ; 
           
            if( list[i] instanceof SupplementPrescription ) numOfSupplement--; 
            if( list[i] instanceof MedicinePrescription )  numOfMedicine-- ; 
         
            list[i] = list[count -1 ]   ;
            list[count - 1 ] = null ;  
            num++;
            count--;}
         else 
            i++; }
      if (num==0)
         str ="No Expired Prescription.";
   
      return str; }

   public double dispensePrescription(String id ){
      int count = numOfMedicine + numOfSupplement ; 
      double dos = 0 ; 
      int num = 0 ; 
      for( int i = 0 ;i < count ; i ++)
         if( list[i].id .equals( id)  )
         {
            dos = list[i].dailyDosage() ;
            if( list[i] instanceof SupplementPrescription )
               num =  ((SupplementPrescription) ( list[i])).refill(); 
          
            if( list[i] instanceof MedicinePrescription ) 
            {
               list[i] = list[count -1 ]   ;
               list[count - 1 ] = null ; 
               numOfMedicine-- ; }
          
            if(list[i] instanceof SupplementPrescription && num == 0 )  // remove 
{
               list[i] = list[count -1 ]   ; // with replace
               list[count - 1 ] = null ;  
               numOfSupplement-- ; }
          
          
            return dos; }
   
    
      JOptionPane.showMessageDialog(null , "this id is not found");
      return 0; }


   public String getName() {
      return name;}

   public String getLocation() {
      return location;}

   public String getZipcode() {
      return zipcode;}

   public int getNumOfSupplement() {
      return numOfSupplement;}

   public int getNumOfMedicine() {
      return numOfMedicine;}

   public Prescription[] getList() {
      return list;}


}
