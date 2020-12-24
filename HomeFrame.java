
package pms_project;
import java.io.*; 
import javax.swing.JOptionPane;

public class HomeFrame extends javax.swing.JFrame {

   Pharmacy[]  phList ; 
    
   
   public HomeFrame() {
    
      initComponents();
   
      File f = new File("info.dat");
      if( !(f.exists() )){
         phList = new Pharmacy[20] ; 
         return ; 
      }
   
      try{
      
         FileInputStream fos = new FileInputStream (f);
         ObjectInputStream oos = new ObjectInputStream (fos);
      
         phList = ( Pharmacy[] ) oos.readObject() ; 
      
         oos.close();
      }// try
      catch(ClassNotFoundException   ex )
      {
         JOptionPane.showMessageDialog(this,"Error while reading from file ");
      
      }
      catch(IOException ex)
      {
         JOptionPane.showMessageDialog(this,"Error with file ");
      }
   
   
   //  add names of pharmacies  to jComboBox1
   
      for( int i = 0 ; i < phList.length ; i++ )
      {
         if( phList[i] != null ) {
            jComboBox1.addItem(phList[i].getName() );
            jButton1.setEnabled(true);
         
         }
      }
   }

   
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate
    private void initComponents() {
   
      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jComboBox1 = new javax.swing.JComboBox<>();
      jButton1 = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jTextField1 = new javax.swing.JTextField();
      jTextField2 = new javax.swing.JTextField();
      jTextField3 = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jButton2 = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();
   
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Pharmacy Manager");
      addWindowListener(
         new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
               formWindowClosing(evt);
            }
         });
   
      jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
      jLabel1.setText("Welcome");
   
      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("open a Pharmacy"));
   
      jButton1.setText("open Pharmacy");
      jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jButton1.setEnabled(false);
      jButton1.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
            }
         });
   
      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
         );
      jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
         );
   
      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("adding a Pharmacy"));
   
      jTextField1.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextField1ActionPerformed(evt);
            }
         });
   
      jLabel2.setText("Name : ");
   
      jLabel3.setText("Location : ");
   
      jLabel4.setText("ZipCode : ");
   
      jButton2.setText("add Pharmacy");
      jButton2.setToolTipText("press here to add new pharmacy");
      jButton2.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
            }
         });
   
      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
         );
      jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
   
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
         );
      layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 34, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
         );
   
      pack();
   }
   private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {   
   }
  
   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {      String name = jTextField1.getText() ; 
      String location = jTextField2.getText() ; 
      String zipCode = jTextField3.getText() ; 
     
      if( name.length() == 0 || location.length() == 0 || zipCode.length() == 0 )
      {
         JOptionPane.showMessageDialog(this, "you must fill all data ");
         return ; 
      }
     
      Pharmacy obj = new Pharmacy(name , location , zipCode ) ; 
     
      for( int i = 0 ; i < phList.length ; i++)
      {
         if( phList[i] == null )
         {
            phList[i] = obj ; 
            JOptionPane.showMessageDialog(this, "add new pharmacy is done ");
            jComboBox1.addItem(obj.getName() );
            jButton1.setEnabled(true);
            break;             
         }
      }
     
      jTextField1.setText("");
      jTextField2.setText("");
      jTextField3.setText("");
     
     
        
   }
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {        
      String name = jComboBox1.getSelectedItem().toString() ; 
      int index = jComboBox1.getSelectedIndex() ; 
        
      SecondFrame.currentPharmacy =  phList[index] ;     
      SecondFrame sFram = new SecondFrame(); 
      sFram.setTitle(name);
      sFram.setVisible(true);
     
   
   }
   private void formWindowClosing(java.awt.event.WindowEvent evt) {   
      int num =  JOptionPane.showConfirmDialog(this,  "Do you want to save the applied changes" ,"Alert!" , JOptionPane.YES_NO_OPTION) ; 
   
      if( num == JOptionPane.YES_OPTION)
      {
         try{
            File out = new File("info.dat");
            FileOutputStream fos = new FileOutputStream (out);
            ObjectOutputStream oos = new ObjectOutputStream (fos);
         
            oos.writeObject(phList);
         
            oos.close();
         
            JOptionPane.showMessageDialog(null , " save all date to file is done");  
         
         } catch(IOException ex )
         {
            JOptionPane.showMessageDialog(this,"Error with file ");
         
         }
      
      }  // end yes option 
      
      JOptionPane.showMessageDialog(null , "Thank you for using the pharmacy managment system ");  
        
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
         java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
           
        /* Create and display the form */
      java.awt.EventQueue.invokeLater(
         new Runnable() {
            public void run() {
               new HomeFrame().setVisible(true);
            }
         });
   }

    // Variables declaration 
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
    // End of variables declaration
}
