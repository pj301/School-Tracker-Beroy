/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsInternalPage;

import adminMain.adminDashBoard;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Admin
 */
public class form extends javax.swing.JInternalFrame {

    /**
     * Creates new form form
     */
    public form() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
  Color logcolor=new Color(51,51,255);
    Color navcolor=new Color(255,66,66);
    Color headcolor=new Color(255,66,66);
    Color bodycolor=new Color(102,102,102);
    Color closecolor=new Color(0,153,255);
    Color mincolor=new Color(197,67,67);
    Color backcolor= new Color(255,255,204);
    Color lightcolor=new Color(204,204,204);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        scc = new javax.swing.JLabel();
        personalData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        postal = new javax.swing.JTextField();
        purok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        scholarLogo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        brgy = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Bdate = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        province = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        backArrow = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(973, 1037));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scc.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        scc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scc.setText("ST.CECILIA'S COLLEGE-CEBU INC.");
        jPanel1.add(scc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 430, 30));

        personalData.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personalData.setText("I. Personal Data");
        jPanel1.add(personalData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Poblacion, Ward II, Minglanilla, Cebu, Philippines");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 310, -1));

        postal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(postal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 840, 180, 50));

        purok.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        purok.setName(""); // NOI18N
        jPanel1.add(purok, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 730, 710, 50));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SCHOLARSHIP APPLICATION FORM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 430, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Tell us about yourself");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, -1));

        scholarLogo.setBackground(new java.awt.Color(255, 255, 204));
        scholarLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/logo-w-resize-removebg-preview.png"))); // NOI18N
        scholarLogo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 90));

        jPanel1.add(scholarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 190, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/scclogo-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 210, 190));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Middle Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 90, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Ex: 10-03-2002");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 110, -1));

        MName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(MName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 200, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Last Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Full Name ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 30));

        LName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 250, 50));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("First Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 90, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Postal/Zip Code");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 910, 100, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Birthdate");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 90, 30));

        FName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Cell phone No.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 130, 30));

        number.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        number.setName(""); // NOI18N
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 710, 50));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Month-Day-Year");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 110, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Email");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 100, 30));

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        email.setName(""); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 710, 50));

        brgy.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        brgy.setName(""); // NOI18N
        jPanel1.add(brgy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 710, 50));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Ex: Scc@gmail.com");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 130, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Barangay/Street Name");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, 160, -1));

        Bdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(Bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 250, 50));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Gender");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 950, 120, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Purok / Sitio Name");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 800, 160, -1));

        gender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 940, 140, 50));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Write Male or Female");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1000, 150, -1));

        province.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 840, 250, 50));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("State/Province");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 910, 100, 20));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("Home Address");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 120, 30));

        city.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 840, 250, 50));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setText("City");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 910, 50, -1));

        backArrow.setBackground(new java.awt.Color(255, 255, 204));
        backArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backArrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backArrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backArrowMouseExited(evt);
            }
        });
        backArrow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/icons8-back-arrow-26.png"))); // NOI18N
        backArrow.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(backArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("RESET");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 960, 130, 50));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("SUBMIT");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 960, 120, 50));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 960, 100, 50));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseClicked
        this.toBack();
        adminDashBoard apd= new adminDashBoard();
        setVisible(false);
        new adminDashBoard().toFront();
        new adminDashBoard().setState(java.awt.Frame.NORMAL);
        apd.toFront();
    }//GEN-LAST:event_backArrowMouseClicked

    private void backArrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseEntered
        backArrow.setBackground(lightcolor);
    }//GEN-LAST:event_backArrowMouseEntered

    private void backArrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseExited
        backArrow.setBackground(backcolor);
    }//GEN-LAST:event_backArrowMouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        storeData.AddRowToJTable(new Object[]{
            FName.getText(),
            LName.getText(),
            MName.getText(),
            Bdate.getText(),
            number.getText(),
            email.getText(),
            brgy.getText(),
            purok.getText(),
            city.getText(),
            province.getText(),
            postal.getText(),
            gender.getText()
        });
        /*
        String fn= FName.getText();
        String ln= LName.getText();
        String mn= MName.getText();
        String bd= Bdate.getText();
        String nb= number.getText();
        String em= email.getText();
        String by= brgy.getText();
        String pk= purok.getText();
        String cy= city.getText();
        String prov= province.getText();
        String pl= postal.getText();
        String gr= gender.getText();

        storeInfos si=new storeInfos();
        si.setVisible(true);
        this.dispose();
        if(fn.equals("")||ln.equals("")||mn.equals("")||bd.equals("")
            ||nb.equals("")||em.equals("")||by.equals("")||pk.equals("")
            ||cy.equals("")||prov.equals("")||pl.equals("")||gr.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter all the data!");

        }else{
            String data[]={FName.getText(),LName.getText(),MName.getText(),
                Bdate.getText(),number.getText(),email.getText(),brgy.getText(),
                purok.getText(),city.getText(),province.getText(),postal.getText(),gender.getText()};
            DefaultTableModel tbl= (DefaultTableModel)jTable1.getModel();
            tbl.addRow(data);

            JOptionPane.showMessageDialog(this,"Add data successfully...!");
            FName.setText("");
            LName.setText("");
            MName.setText("");
            Bdate.setText("");
            number.setText("");
            email.setText("");
            brgy.setText("");
            purok.setText("");
            city.setText("");
            province.setText("");
            postal.setText("");
            gender.setText("");
        }*/
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        storeData.AddRowToJTable(new Object[]{
            FName.getText(),
            LName.getText(),
            MName.getText(),
            Bdate.getText(),
            number.getText(),
            email.getText(),
            brgy.getText(),
            purok.getText(),
            city.getText(),
            province.getText(),
            postal.getText(),
            gender.getText()
        });
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bdate;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField MName;
    private javax.swing.JPanel backArrow;
    private javax.swing.JTextField brgy;
    private javax.swing.JTextField city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField number;
    private javax.swing.JLabel personalData;
    private javax.swing.JTextField postal;
    private javax.swing.JTextField province;
    private javax.swing.JTextField purok;
    private javax.swing.JLabel scc;
    private javax.swing.JPanel scholarLogo;
    // End of variables declaration//GEN-END:variables

    
}
