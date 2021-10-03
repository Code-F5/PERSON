/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JOptionPane;
import person.Person;

/**
 *
 * @author Dell
 */
public class viewPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewPersonJPanel
     */
    Person person;
    public viewPersonJPanel(Person person) {
        initComponents();
        
        this.person = person;
        displayPerson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namejLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        faxjLabel = new javax.swing.JLabel();
        certificatejLabel = new javax.swing.JLabel();
        telephonejLabel = new javax.swing.JLabel();
        dobjLabel1 = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        ssnjLabel = new javax.swing.JLabel();
        mrnjLabel = new javax.swing.JLabel();
        hpbnjLabel = new javax.swing.JLabel();
        bankjLabel = new javax.swing.JLabel();
        namejLabel12 = new javax.swing.JLabel();
        bankjTextField = new javax.swing.JTextField();
        mrnjTextField = new javax.swing.JTextField();
        hpbnjTextField4 = new javax.swing.JTextField();
        faxjTextField5 = new javax.swing.JTextField();
        ssnjTextField6 = new javax.swing.JTextField();
        telephonejTextField7 = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        certificatejTextField = new javax.swing.JTextField();
        vehiclejTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        devicejTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        linkedinjTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        dobjTextField = new javax.swing.JTextField();
        namejLabel3 = new javax.swing.JLabel();

        namejLabel1.setText("Address :");

        nameField.setText("First Name");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        faxjLabel.setText("Fax Number :");

        certificatejLabel.setText("Certificate/Licence Number :");

        telephonejLabel.setText("Telephone No : ");

        dobjLabel1.setText("DOB :");

        emailjLabel.setText("Email address :");

        ssnjLabel.setText("SSN :");

        mrnjLabel.setText("Medical Record Number :");

        hpbnjLabel.setText("Health Plan Beneficiary Number :");

        bankjLabel.setText("Bank Account Number :");

        namejLabel12.setText("Vehicle identifiers and serial numbers including license plates :");

        bankjTextField.setText("Bank Account Number");

        mrnjTextField.setText("Medical Record Number");
        mrnjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrnjTextFieldActionPerformed(evt);
            }
        });

        hpbnjTextField4.setText("Health Plan Beneficiary Number");
        hpbnjTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpbnjTextField4ActionPerformed(evt);
            }
        });

        faxjTextField5.setText("FAX");
        faxjTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faxjTextField5ActionPerformed(evt);
            }
        });

        ssnjTextField6.setText("Social Security Number");
        ssnjTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnjTextField6ActionPerformed(evt);
            }
        });

        telephonejTextField7.setText("Telephone Number");
        telephonejTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephonejTextField7ActionPerformed(evt);
            }
        });

        emailjTextField.setText("xyz@domain.com");
        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });

        certificatejTextField.setText("Certificate/Licence Number ");

        vehiclejTextField2.setText("Vehicle identifiers and serial numbers including license plates");
        vehiclejTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclejTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Device identifiers and serial numbers : ");

        devicejTextField3.setText("Device identifiers and serial numbers");
        devicejTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devicejTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setText("LinkedIn :");

        linkedinjTextField4.setText("example@linkedin.com");
        linkedinjTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedinjTextField4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Internet Protocol Address :");

        jTextField5.setText("00.00.00.000");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Biometric identifiers (i.e. retinal scan, fingerprints) : ");

        jLabel5.setText("Full face photos and comparable images :");

        addressjTextField.setText("jTextField1");
        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldActionPerformed(evt);
            }
        });

        dobjTextField.setText("mm/dd/yyyy");
        dobjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobjTextFieldActionPerformed(evt);
            }
        });

        namejLabel3.setText("Name :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bankjLabel)
                                .addGap(18, 18, 18)
                                .addComponent(bankjTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mrnjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mrnjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hpbnjLabel)
                            .addComponent(certificatejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(certificatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hpbnjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(namejLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vehiclejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(devicejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(linkedinjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(faxjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(faxjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telephonejLabel))
                                .addGap(70, 70, 70)
                                .addComponent(telephonejTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dobjLabel1)
                                .addGap(129, 129, 129)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dobjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailjLabel)
                                    .addComponent(ssnjLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssnjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(namejLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejLabel1)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephonejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephonejTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(faxjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faxjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssnjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssnjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mrnjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mrnjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hpbnjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hpbnjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(certificatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(certificatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiclejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(devicejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(linkedinjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dobjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobjTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dobjTextFieldActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void linkedinjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkedinjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkedinjTextField4ActionPerformed

    private void devicejTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devicejTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devicejTextField3ActionPerformed

    private void vehiclejTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclejTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiclejTextField2ActionPerformed

    private void ssnjTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnjTextField6ActionPerformed
        // TODO add your handling code here:
        // person.setSsn(ssnjTextField6.getText());
    }//GEN-LAST:event_ssnjTextField6ActionPerformed

    private void faxjTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faxjTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faxjTextField5ActionPerformed

    private void hpbnjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpbnjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpbnjTextField4ActionPerformed

    private void mrnjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrnjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrnjTextFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
        //  person.setName(nameField.getText());
    }//GEN-LAST:event_nameFieldActionPerformed

    private void addressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addressjTextFieldActionPerformed

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void telephonejTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephonejTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephonejTextField7ActionPerformed

    private void displayPerson() {
       nameField.setText(person.getName());
       dobjTextField.setText(person.getDob());
       addressjTextField.setText(person.getAddress());
       telephonejTextField7.setText(person.getTelephone());
       ssnjTextField6.setText(person.getSsn());
       mrnjTextField.setText(person.getMedicalrnumber());
       vehiclejTextField2.setText(person.getVehicle());
       devicejTextField3.setText(person.getDevice());
       linkedinjTextField4.setText(person.getLinkedin());
       emailjTextField.setText(person.getEmail());
       faxjTextField5.setText(person.getFax());
       bankjTextField.setText(person.getBankaccount());
       certificatejTextField.setText(person.getLicencenumber());
       jTextField5.setText(person.getIpaddress());
       
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JLabel bankjLabel;
    private javax.swing.JTextField bankjTextField;
    private javax.swing.JLabel certificatejLabel;
    private javax.swing.JTextField certificatejTextField;
    private javax.swing.JTextField devicejTextField3;
    private javax.swing.JLabel dobjLabel1;
    private javax.swing.JTextField dobjTextField;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel faxjLabel;
    private javax.swing.JTextField faxjTextField5;
    private javax.swing.JLabel hpbnjLabel;
    private javax.swing.JTextField hpbnjTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField linkedinjTextField4;
    private javax.swing.JLabel mrnjLabel;
    private javax.swing.JTextField mrnjTextField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JLabel namejLabel12;
    private javax.swing.JLabel namejLabel3;
    private javax.swing.JLabel ssnjLabel;
    private javax.swing.JTextField ssnjTextField6;
    private javax.swing.JLabel telephonejLabel;
    private javax.swing.JTextField telephonejTextField7;
    private javax.swing.JTextField vehiclejTextField2;
    // End of variables declaration//GEN-END:variables
}
