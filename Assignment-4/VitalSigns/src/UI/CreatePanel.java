/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Encounter;
import Model.EncounterHistory;
import Model.Patient;
import Model.PatientDirectory;
import Model.Person;
import Model.Vitals;
import Model.VitalsHistory;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author prasannanimbalkar
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    EncounterHistory encounterHistoryList;
    
    public CreatePanel(EncounterHistory encounterHistoryList) {
        initComponents();
        this.encounterHistoryList = encounterHistoryList;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMain = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        errPatient = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        errAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        errAddress = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        errArea = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        errCity = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        errTemp = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        errBP = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        errPulse = new javax.swing.JLabel();
        lblRR = new javax.swing.JLabel();
        txtRR = new javax.swing.JTextField();
        errRR = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        errWeight = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblMain.setFont(new java.awt.Font("Tamil MN", 1, 20)); // NOI18N
        lblMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain.setText("Enter Patient Details");
        lblMain.setToolTipText("");

        lblPatient.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblPatient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPatient.setText("Patient Name:");
        lblPatient.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPatient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientFocusLost(evt);
            }
        });
        txtPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientActionPerformed(evt);
            }
        });

        errPatient.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errPatient.setForeground(new java.awt.Color(255, 0, 0));
        errPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errPatient.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblAge.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age:");
        lblAge.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtAge.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        errAge.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errAge.setForeground(new java.awt.Color(255, 0, 0));
        errAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errAge.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblAddress.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAddress.setText("Address:");
        lblAddress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        errAddress.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errAddress.setForeground(new java.awt.Color(255, 0, 0));
        errAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errAddress.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblArea.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblArea.setText("Area:");
        lblArea.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaFocusLost(evt);
            }
        });
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });

        errArea.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errArea.setForeground(new java.awt.Color(255, 0, 0));
        errArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errArea.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblCity.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City:");
        lblCity.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtCity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        errCity.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errCity.setForeground(new java.awt.Color(255, 0, 0));
        errCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errCity.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblTemp.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblTemp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTemp.setText("Body Temp. :");
        lblTemp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtTemp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTempFocusLost(evt);
            }
        });
        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        errTemp.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errTemp.setForeground(new java.awt.Color(255, 0, 0));
        errTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errTemp.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblBP.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblBP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBP.setText("Blood Pressure:");
        lblBP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtBP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBPFocusLost(evt);
            }
        });
        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });

        errBP.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errBP.setForeground(new java.awt.Color(255, 0, 0));
        errBP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errBP.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblPulse.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPulse.setText("Pulse:");
        lblPulse.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtPulse.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPulse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPulseFocusLost(evt);
            }
        });
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        errPulse.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errPulse.setForeground(new java.awt.Color(255, 0, 0));
        errPulse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errPulse.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblRR.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblRR.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRR.setText("Respiratory Rate:");
        lblRR.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtRR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRRFocusLost(evt);
            }
        });
        txtRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRRActionPerformed(evt);
            }
        });

        errRR.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errRR.setForeground(new java.awt.Color(255, 0, 0));
        errRR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errRR.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblWeight.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWeight.setText("Weight (Kg):");
        lblWeight.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtWeight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtWeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWeightFocusLost(evt);
            }
        });
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        errWeight.setFont(new java.awt.Font("Microsoft Tai Le", 3, 10)); // NOI18N
        errWeight.setForeground(new java.awt.Color(255, 0, 0));
        errWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errWeight.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errArea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errAge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errBP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errRR, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRR, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtRR, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(395, 395, 395)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblMain)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatient))
                        .addGap(5, 5, 5)
                        .addComponent(errPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTemp))
                        .addGap(5, 5, 5)
                        .addComponent(errTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addGap(5, 5, 5)
                        .addComponent(errAge, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBP))
                        .addGap(5, 5, 5)
                        .addComponent(errBP, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addGap(5, 5, 5)
                        .addComponent(errAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPulse))
                        .addGap(5, 5, 5)
                        .addComponent(errPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblArea))
                        .addGap(5, 5, 5)
                        .addComponent(errArea, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRR))
                        .addGap(5, 5, 5)
                        .addComponent(errRR, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity))
                        .addGap(5, 5, 5)
                        .addComponent(errCity, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight))
                        .addGap(5, 5, 5)
                        .addComponent(errWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(btnSave)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientFocusLost
        // TODO add your handling code here:
        validateName(txtPatient,lblPatient, errPatient,"Input");
    }//GEN-LAST:event_txtPatientFocusLost

    private void txtPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientActionPerformed

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        // TODO add your handling code here:
        validateNumber(txtAge,lblAge, errAge,"Input");
    }//GEN-LAST:event_txtAgeFocusLost

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        // TODO add your handling code here:
        validateAddress(txtAddress,lblAddress, errAddress,"Input");
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        // TODO add your handling code here:
        validateName(txtCity,lblCity, errCity,"Input");
    }//GEN-LAST:event_txtCityFocusLost

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtTempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTempFocusLost
        // TODO add your handling code here:
        validateNumber(txtTemp,lblTemp, errTemp,"Input");
    }//GEN-LAST:event_txtTempFocusLost

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

    private void txtBPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBPFocusLost
        // TODO add your handling code here:
        validateNumber(txtBP,lblBP, errBP,"Input");
    }//GEN-LAST:event_txtBPFocusLost

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void txtPulseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPulseFocusLost
        // TODO add your handling code here:
        validateNumber(txtPulse,lblPulse, errPulse,"Input");
    }//GEN-LAST:event_txtPulseFocusLost

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void txtRRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRRFocusLost
        // TODO add your handling code here:
        validateNumber(txtRR,lblRR, errRR,"Input");
    }//GEN-LAST:event_txtRRFocusLost

    private void txtRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRRActionPerformed

    private void txtWeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeightFocusLost
        // TODO add your handling code here:
        validateNumber(txtWeight,lblWeight, errWeight,"Input");
    }//GEN-LAST:event_txtWeightFocusLost

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaFocusLost
        // TODO add your handling code here:
        validateName(txtArea,lblArea, errArea,"Input");
    }//GEN-LAST:event_txtAreaFocusLost

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         if (txtPatient.getText().length()==0 || txtAge.getText().length()==0 || txtAddress.getText().length()==0 || txtArea.getText().length()==0 || txtCity.getText().length()==0 || txtTemp.getText().length()==0 || txtBP.getText().length()==0 || txtPulse.getText().length()==0 || txtRR.getText().length()==0 || txtWeight.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            
        }else if(errPatient.getText().length()!=0 || errAge.getText().length()!=0 || errAddress.getText().length()!=0 || errArea.getText().length()!=0 || errCity.getText().length()!=0 || errTemp.getText().length()!=0 || errBP.getText().length()!=0 || errPulse.getText().length()!=0 || errRR.getText().length()!=0 || errWeight.getText().length()!=0){
            JOptionPane.showMessageDialog(this, "Enter valid data in all Fields");
        
        }else {
            String Name = txtPatient.getText();
            int Age = Integer.parseInt(txtAge.getText());
            String Address = txtAddress.getText();
            String Area = txtArea.getText();
            String City = txtCity.getText();
            
            int Temperature = Integer.parseInt(txtTemp.getText());
            int BP = Integer.parseInt(txtBP.getText());
            int Pulse = Integer.parseInt(txtPulse.getText());
            int RR = Integer.parseInt(txtRR.getText());
            int Weight = Integer.parseInt(txtWeight.getText());
            

            //Vitals vit = vitalsHistoryList.addVitals();
            //Patient per = patientDirectorylist.addPatient();
            Encounter enc = encounterHistoryList.addEncounter();
            
            if(Temperature <= 96 && Temperature>= 99){
                
            }
            
            Patient p = new Patient(Name, Age, Address, Area, City);
            enc.setVitalPatientInformation(p);
//            p.setName(Name);
//            p.setAge(Age);
//            p.setHouse(Address);
//            p.setCommunity(Area);
//            p.setCity(City);
            
            
            Vitals v = new Vitals(RR, Pulse, BP, Weight, Temperature);
            enc.setVitals(v);
            
            

            JOptionPane.showMessageDialog(this, "Person Information Saved.");

            txtPatient.setText("");
            txtAge.setText("");
            txtAddress.setText("");
            txtArea.setText("");
            txtCity.setText("");
            txtTemp.setText("");
            txtCity.setText("");
            txtBP.setText("");
            txtPulse.setText("");
            txtRR.setText("");
            txtWeight.setText("");
            
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    Border redline = BorderFactory.createLineBorder(Color.red);
    Border noline = BorderFactory.createLineBorder(Color.black);
    Border greenline = BorderFactory.createLineBorder(Color.green);
    
    public void validateName(JTextField field,JLabel label2, JLabel label,String name){

        if(field.getText().length()==0)
        {
            label.setText("");
            field.setBorder(noline);
            label2.setForeground(Color.black);
        }else if(!field.getText().matches(".*[^0-9].*")){
            label2.setForeground(Color.red);
            field.setBorder(redline);
            label.setText("Invalid " + name);}
        else if(!field.getText().matches("\\w+")){
            label2.setForeground(Color.red);
            field.setBorder(redline);
            label.setText("Invalid " + name);
        }else{
            label2.setForeground(Color.black);
            field.setBorder(greenline);
            label.setText("");
        }
   
    }
    
    public void validateAddress(JTextField field,JLabel label2, JLabel label,String name){

        if(field.getText().length()==0)
        {
            label.setText("");
            field.setBorder(noline);
            label2.setForeground(Color.black);
        }else if(field.getText().matches("[a-z][1-9]")){
            label2.setForeground(Color.red);
            field.setBorder(redline);
            label.setText("Invalid " + name);}
        else if(!field.getText().matches("\\w+")){
            label2.setForeground(Color.red);
            field.setBorder(redline);
            label.setText("Invalid " + name);
        }else{
            label2.setForeground(Color.black);
            field.setBorder(greenline);
            label.setText("");
        }
   
    }
    
    public void validateNumber(JTextField field,JLabel label2, JLabel label, String name){

        if(field.getText().length()==0)
        {
            label.setText("");
            field.setBorder(noline);
            label2.setForeground(Color.black);
        }else if(field.getText().matches(".*[^0-9].*")){
            label2.setForeground(Color.red);
            field.setBorder(redline);
            label.setText("Invalid " + name);
            
        }else{
            label2.setForeground(Color.black);
            field.setBorder(greenline);
            label.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel errAddress;
    private javax.swing.JLabel errAge;
    private javax.swing.JLabel errArea;
    private javax.swing.JLabel errBP;
    private javax.swing.JLabel errCity;
    private javax.swing.JLabel errPatient;
    private javax.swing.JLabel errPulse;
    private javax.swing.JLabel errRR;
    private javax.swing.JLabel errTemp;
    private javax.swing.JLabel errWeight;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblRR;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRR;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}