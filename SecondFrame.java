
package pms_project;

import java.util.Date;
import javax.swing.JOptionPane;

public class SecondFrame extends javax.swing.JFrame {

   static Pharmacy  currentPharmacy ; 
   
   public SecondFrame() {
      initComponents();
   
      jLabel1.setText("Name : " + currentPharmacy.getName() );
      jLabel2.setText("Location : " + currentPharmacy.getLocation());
      jLabel3.setText("ZipCode : " + currentPharmacy.getZipcode());
      jLabel4.setText("Number of Supplement  : " + currentPharmacy.getNumOfSupplement());
      jLabel5.setText("Number of Mdeicine  : " + currentPharmacy.getNumOfMedicine());
   
   
   
   }

   
   @SuppressWarnings("unchecked")
   private void initComponents() {
   
      buttonGroup1 = new javax.swing.ButtonGroup();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jLabel6 = new javax.swing.JLabel();
      jTextField1 = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      jTextField2 = new javax.swing.JTextField();
      jLabel8 = new javax.swing.JLabel();
      jTextField3 = new javax.swing.JTextField();
      jLabel9 = new javax.swing.JLabel();
      jTextField4 = new javax.swing.JTextField();
      jLabel10 = new javax.swing.JLabel();
      jTextField5 = new javax.swing.JTextField();
      jLabel11 = new javax.swing.JLabel();
      jTextField6 = new javax.swing.JTextField();
      jTextField7 = new javax.swing.JTextField();
      jLabel12 = new javax.swing.JLabel();
      jTextField8 = new javax.swing.JTextField();
      jLabel13 = new javax.swing.JLabel();
      jLabel14 = new javax.swing.JLabel();
      jRadioButton1 = new javax.swing.JRadioButton();
      jRadioButton2 = new javax.swing.JRadioButton();
      jButton4 = new javax.swing.JButton();
      jLabel16 = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      jLabel15 = new javax.swing.JLabel();
      jTextField9 = new javax.swing.JTextField();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
   
      jLabel1.setText("Name : ");
   
      jLabel2.setText("Location : ");
   
      jLabel3.setText("zipcode : ");
   
      jLabel4.setText("number of supplement : ");
   
      jLabel5.setText("number of Medicine : ");
   
      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("add a new Prescription"));
   
      jLabel6.setText("Prescription id : ");
   
      jLabel7.setText("Prescription Name : ");
   
      jLabel8.setText("patient age : ");
   
      jLabel9.setText("patient whight : ");
   
      jLabel10.setText("Prescription Dose : ");
   
      jLabel11.setText("Expire Date : ");
   
      jTextField7.setEnabled(false);
      jTextField7.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextField7ActionPerformed(evt);
            }
         });
   
      jLabel12.setText("chose the type of the priscription : ");
   
      jTextField8.setEnabled(false);
      jTextField8.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextField8ActionPerformed(evt);
            }
         });
   
      jLabel13.setText("number of refills : ");
   
      jLabel14.setText("fixed Dose : ");
   
      buttonGroup1.add(jRadioButton1);
      jRadioButton1.setText("Supplement");
      jRadioButton1.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jRadioButton1ActionPerformed(evt);
            }
         });
   
      buttonGroup1.add(jRadioButton2);
      jRadioButton2.setText("Medicin");
      jRadioButton2.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jRadioButton2ActionPerformed(evt);
            }
         });
   
      jButton4.setText("add prescription");
      jButton4.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton4ActionPerformed(evt);
            }
         });
   
   
      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addContainerGap()
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGap(33, 33, 33)
                             .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGap(33, 33, 33)
                             .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGap(33, 33, 33)
                             .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGap(18, 18, 18)
                             .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                             .addGroup(jPanel1Layout.createSequentialGroup()
                                 .addComponent(jRadioButton1)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(jRadioButton2))
                             .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addGap(18, 18, 18)
                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                     .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                 .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(129, 129, 129)
                     .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addContainerGap(76, Short.MAX_VALUE))
         );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
             .addGap(29, 29, 29)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel6)
                 .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel7)
                 .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel8)
                 .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel9)
                 .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(18, 18, 18)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel10)
                 .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel11)
                 .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(jLabel16))
             .addGap(18, 18, 18)
             .addComponent(jLabel12)
             .addGap(18, 18, 18)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jRadioButton1)
                 .addComponent(jRadioButton2))
             .addGap(18, 18, 18)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(jLabel13))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(jLabel14))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
             .addComponent(jButton4)
             .addGap(25, 25, 25))
         );
   
      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operations"));
   
      jLabel15.setText("Prescription id : ");
   
      jButton1.setText("dispense Prescription");
      jButton1.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
            }
         });
   
      jButton2.setText("Dispose Expired Prescription");
      jButton2.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
            }
         });
   
      jButton3.setText("View all Prescriptions");
      jButton3.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
            }
         });
   
      jTextArea1.setEditable(false);
      jTextArea1.setColumns(20);
      jTextArea1.setRows(5);
      jScrollPane1.setViewportView(jTextArea1);
   
      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
             .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(24, 24, 24)
                     .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                         .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jTextField9)))
                 .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(37, 37, 37)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addContainerGap(30, Short.MAX_VALUE))
         );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
             .addContainerGap()
             .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel15)
                 .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(18, 18, 18)
             .addComponent(jButton1)
             .addGap(18, 18, 18)
             .addComponent(jButton2)
             .addGap(18, 18, 18)
             .addComponent(jButton3)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(jScrollPane1)
             .addContainerGap())
         );
   
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                     .addGap(35, 35, 35)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGap(253, 253, 253)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                             .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(layout.createSequentialGroup()
                             .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGap(0, 0, Short.MAX_VALUE))))
                 .addGroup(layout.createSequentialGroup()
                     .addGap(23, 23, 23)
                     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
             .addContainerGap())
         );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addGap(25, 25, 25)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel1)
                 .addComponent(jLabel3))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel2)
                 .addComponent(jLabel4)
                 .addComponent(jLabel5))
             .addGap(31, 31, 31)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
             .addContainerGap())
         );
   
      pack();
   }
   private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {            
   }
   private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {    
   }

   private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {        
      if( jRadioButton1.isSelected() == true )
      {
         jTextField7.setEnabled(true);
         jTextField8.setEnabled(false);
      }
      
   }
   
   private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {        
      if( jRadioButton2.isSelected() == true )
      {
         jTextField7.setEnabled(false);
         jTextField8.setEnabled(true);
      }
   }    
   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {        
      Prescription  presc  = null ; 
      try{        
         String id = jTextField1.getText() ; 
         String name = jTextField2.getText() ; 
         int age = Integer.parseInt(jTextField3.getText() ) ; 
         double Weight = Double.parseDouble(jTextField4.getText()) ; 
         double dose = Double.parseDouble(jTextField5.getText()) ; 
         String date = jTextField6.getText() ; 
      
         if(id.length() == 0 || name.length() == 0 )
         {
            JOptionPane.showMessageDialog(this,"id or name is not correct ");
            return ;    
         }
      
      // date 
         Date expDate ; 
         if( date.length() == 10 && date.charAt(2) == '/' && date.charAt(5) == '/')
            expDate = new Date( date) ; 
         else
         {
            JOptionPane.showMessageDialog(this,"invlid date ");
            return ;    
         }
         boolean fixedDose ; 
         if( jRadioButton1.isSelected() == true )
         {
            int refill = Integer.parseInt(jTextField7.getText() ) ; 
            presc = new SupplementPrescription(  id , name , age ,  Weight , expDate , dose , refill ) ; 
         }
         else
            if( jRadioButton2.isSelected() == true ){
            
               String s = jTextField8.getText(); 
            
               if( s.equals("true"))
                  fixedDose = true; 
               else
                  if(s.equals("false"))
                     fixedDose =false;
                  else{
                     JOptionPane.showMessageDialog(this,"Error input of fixedDose");
                     return ; }
            
               presc = new MedicinePrescription(  id , name , age ,  Weight , expDate , dose , fixedDose ) ; 
            
            
            
            }
      }catch( NumberFormatException  ex ){
         JOptionPane.showMessageDialog(this, ex.toString() );
         return ; } 
   
      if(  currentPharmacy.addPrescription(presc) == true ) 
         JOptionPane.showMessageDialog(this, "add new prescription succesffull");
      jLabel4.setText("Number of Supplement  : " + currentPharmacy.getNumOfSupplement());
      jLabel5.setText("Number of Mdeicine  : " + currentPharmacy.getNumOfMedicine());
   
   
      jTextField1.setText("");
      jTextField2.setText("");
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField5.setText("");
      jTextField6.setText("");
      jTextField7.setText("");
      jTextField8.setText("");
   
   
   }
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {        
      String id = jTextField9.getText() ; 
      if( id.length() == 0 )
      {
         JOptionPane.showMessageDialog(this, "Enter correct id ");
         return ; 
      }
      double dos =  currentPharmacy.dispensePrescription(id) ; 
     
      if( dos != 0 ){
         jTextArea1.append("The does of the prescription is " + dos + "\n");
      
         jLabel4.setText("Number of Supplement  : " + currentPharmacy.getNumOfSupplement());
         jLabel5.setText("Number of Mdeicine  : " + currentPharmacy.getNumOfMedicine());
      }
     
     
   
      jTextField9.setText(""); 
   }
   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {        
      String str = currentPharmacy.disposeExpired() ; 
      jTextArea1.append( str + "\n");
     
      jLabel4.setText("Number of Supplement  : " + currentPharmacy.getNumOfSupplement());
      jLabel5.setText("Number of Mdeicine  : " + currentPharmacy.getNumOfMedicine());
   }
   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
      String str = currentPharmacy.toString() ; 
      jTextArea1.setText(str + "\n");
   
   }
   public static void main(String args[]) {
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
   
      /* Create and display the form */
      java.awt.EventQueue.invokeLater(
         new Runnable() {
            public void run() {
               new SecondFrame().setVisible(true);
            }
         });
   }

   // Variables declaration    
   private javax.swing.ButtonGroup buttonGroup1;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JRadioButton jRadioButton1;
   private javax.swing.JRadioButton jRadioButton2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField jTextField5;
   private javax.swing.JTextField jTextField6;
   private javax.swing.JTextField jTextField7;
   private javax.swing.JTextField jTextField8;
   private javax.swing.JTextField jTextField9;
   // End of variables declaration
}
