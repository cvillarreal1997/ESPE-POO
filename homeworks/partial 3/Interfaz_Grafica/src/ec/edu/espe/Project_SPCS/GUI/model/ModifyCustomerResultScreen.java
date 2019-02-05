/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.Project_SPCS.GUI.menu.MainDesktop;
import ec.edu.espe.STPCSProject.model.Address;
import ec.edu.espe.STPCSProject.model.AgeDate;
import ec.edu.espe.STPCSProject.model.Customer;
import ec.edu.espe.STPCSProject.model.Date1;
import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.Operation;
import ec.edu.espe.STPCSProject.util.Validations;
import java.awt.Color;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class ModifyCustomerResultScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModifyCustomerResultScreen
     */
    private Customer person;
    private char validar;
    private String auxStringInput = null;
    private String auxStringForFile = null;
    private boolean IDVerificationForSaving = false;
    private Address homeAddress = new Address("Calle 1", "Calle 2", "San Augustin", "Estados Unidos");
    private Date1 ageDate = new Date1(0,0,0);
    private Date1 birthDate= new Date1(0,0,0);;
    private AgeDate date = new AgeDate();
    private int mouseClickCount = 0;
    private String IDNumber;
    public ModifyCustomerResultScreen() {
        initComponents();
    }
    public ModifyCustomerResultScreen(String IDNumber) {
        initComponents();
        this.IDNumber = IDNumber;
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
        lblTittle = new javax.swing.JLabel();
        lblNewIDNumber = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        lblCustomerIDNumber = new javax.swing.JLabel();
        lblCustomerIDNumberResult = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtNameResultModify = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastNameResultModify = new javax.swing.JTextField();
        lblMainStreet = new javax.swing.JLabel();
        lblSecondStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        txtMainStreet = new javax.swing.JTextField();
        txtSecondStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        cbxCountry = new javax.swing.JComboBox<>();
        jcalBirthDate = new com.toedter.calendar.JCalendar();
        lblBirthDate = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTittle.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTittle.setText("Resultados de Búsqueda");

        lblNewIDNumber.setText("Número de cédula nuevo a buscar:");

        txtIDNumber.setText("9999999999");
        txtIDNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDNumberMouseClicked(evt);
            }
        });
        txtIDNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDNumberKeyTyped(evt);
            }
        });

        lblCustomerIDNumber.setText("Número de cédula o RUC:");

        lblCustomerIDNumberResult.setText("9999999999");

        lblName.setText("Nombres: ");

        txtNameResultModify.setText("Jon");
        txtNameResultModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameResultModifyKeyTyped(evt);
            }
        });

        lblLastName.setText("Apellidos: ");

        txtLastNameResultModify.setText("Doe");
        txtLastNameResultModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameResultModifyKeyTyped(evt);
            }
        });

        lblMainStreet.setText("Calle Principal: ");

        lblSecondStreet.setText("Calle Secundaria: ");

        lblCity.setText("Ciudad: ");

        lblCountry.setText("Pais: ");

        txtMainStreet.setText("Calle 1");

        txtSecondStreet.setText("Calle 2");

        txtCity.setText("San Bernandino");

        cbxCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuador", "Estados Unidos", "Etc." }));
        cbxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCountryActionPerformed(evt);
            }
        });

        jcalBirthDate.setMinSelectableDate(new java.util.Date(-2208967310000L));

        lblBirthDate.setText("Fecha de Nacimiento:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnExit.setText("Cerrar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTittle)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameResultModify, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLastName)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtLastNameResultModify, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCountry)
                                .addGap(18, 18, 18)
                                .addComponent(cbxCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSecondStreet)
                                .addGap(18, 18, 18)
                                .addComponent(txtSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMainStreet)
                                .addGap(18, 18, 18)
                                .addComponent(txtMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCity)
                                .addGap(18, 18, 18)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewIDNumber)
                            .addComponent(lblCustomerIDNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCustomerIDNumberResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcalBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewIDNumber)
                    .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerIDNumber)
                            .addComponent(lblCustomerIDNumberResult, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(txtNameResultModify, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName)
                            .addComponent(txtLastNameResultModify, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcalBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturn)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCountryActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        person = new Customer();
        txtIDNumber.setText(lblCustomerIDNumberResult.getText());
        if (Validations.checkOpenFile(new File("Customer.csv"))==false) {
            IDVerificationForSaving = Validations.IDVerification(txtIDNumber);
            if (IDVerificationForSaving == true) {
                person.setIdentifyCard(lblCustomerIDNumberResult.getText());
                if (txtNameResultModify.getBackground() == Color.red || txtLastNameResultModify.getBackground() == Color.red) {
                    showMessageDialog(null, "Revise los parametros erroneos");
                } else {
                    person.setName(txtNameResultModify.getText() + " " + txtLastNameResultModify.getText());
                    homeAddress.setMainStreet(txtMainStreet.getText());
                    homeAddress.setSecondStreet(txtSecondStreet.getText());
                    if (txtCity.getBackground() == Color.red) {
                        showMessageDialog(null, "Revise los parametros erroneos");
                    } else {
                        homeAddress.setCity(txtCity.getText());
                        homeAddress.setCountry(cbxCountry.getSelectedItem().toString());
                        person.setHomeAddress(homeAddress);
                        birthDate.setDay(jcalBirthDate.getDate().getDate());
                        birthDate.setMonth(jcalBirthDate.getDate().getMonth());
                        birthDate.setYear(jcalBirthDate.getDate().getYear() + 1900);
                        if (Validations.birthDateValidation(birthDate) == false) {
                            showMessageDialog(null, "La fecha de nacimiento no puede ser mayor o igual a la actual ");
                        } else {
                            person.setBirthDate(birthDate);
                            ageDate = date.ageCalc(birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
                            person.setAgeDate(ageDate);
                            auxStringForFile = toString();
                            //showMessageDialog(null, auxStringForFile);
                            FileManager.modifyFile(new File("Customer.csv"), lblCustomerIDNumberResult.getText(), auxStringForFile);
                            cleanCells();
                        }
                    }
                }
            } else {
                showMessageDialog(null, "Revise los parametros erroneos");
            }
        } else {
            showMessageDialog(null, "El archivo de datos se encuentra siendo usado por otra aplicación");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ModifyCustomerMainScreen mainScreen = new ModifyCustomerMainScreen();
        MainDesktop.Desktop.add(mainScreen);
        mainScreen.show();
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        ModifyCustomerMainScreen mainScreen = new ModifyCustomerMainScreen();
        MainDesktop.Desktop.add(mainScreen);
        mainScreen.show();
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       formFilling(null,lblCustomerIDNumberResult,IDNumber);
    }//GEN-LAST:event_formComponentShown

    private void txtIDNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDNumberKeyTyped
        if (txtIDNumber.getText().length() < 10) {
            Validations.verificationJustNumbers(txtIDNumber);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDNumberKeyTyped

    private void txtNameResultModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameResultModifyKeyTyped
        validar = evt.getKeyChar();
        Validations.verificationJustLetters(validar, txtNameResultModify);
    }//GEN-LAST:event_txtNameResultModifyKeyTyped

    private void txtLastNameResultModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameResultModifyKeyTyped
        validar = evt.getKeyChar();
        Validations.verificationJustLetters(validar, txtLastNameResultModify);
    }//GEN-LAST:event_txtLastNameResultModifyKeyTyped

    private void txtIDNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDNumberMouseClicked
         mouseClickCount = mouseClickCount + 1;
        if (mouseClickCount == 1) {
            txtIDNumber.setText("");
        } else {

        }
    }//GEN-LAST:event_txtIDNumberMouseClicked
    @Override
    public String toString()
    {
        auxStringInput = person.getIdentifyCard()+";"+person.getName()+";"+person.getBirthDate().getDay()+"/"+person.getBirthDate().getActualMonth()+"/"+person.getBirthDate().getYear()+";"
                            +person.getAgeDate().getDay()+"/"+person.getAgeDate().getMonth()+"/"+person.getAgeDate().getYear()+";"+person.getHomeAddress().getMainStreet()+"/"
                            +person.getHomeAddress().getSecondStreet()+"/"+person.getHomeAddress().getCity()+"/"+person.getHomeAddress().getCountry()+ " \r\n";
        return auxStringInput;
    }
    private void formFilling(JTextField txtField, JLabel lblField, String IDNumber) {
        if (IDNumber == null) {
            lblField.setText(txtField.getText());
        } else {
            lblField.setText(IDNumber);
        }
        List dataOut;
        List dataSplit;
        dataOut = Operation.dataSearchAndSplit(null, lblField,new File("Customer.csv"));
        if (dataOut == null) {
            JOptionPane.showMessageDialog(null, "Error número de cédula no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dataSplit = Arrays.asList(((String) dataOut.get(1)).split(" "));
            if (dataSplit.size() == 2) {
                txtNameResultModify.setText((String) dataSplit.get(0));
                txtLastNameResultModify.setText((String) dataSplit.get(1));
            } else if (dataSplit.size() == 3) {
                txtNameResultModify.setText(((String) dataSplit.get(0)) + " " + ((String) dataSplit.get(1)));
                txtLastNameResultModify.setText((String) dataSplit.get(2));
            } else if (dataSplit.size() == 4) {
                txtNameResultModify.setText(((String) dataSplit.get(0)) + " " + ((String) dataSplit.get(1)));
                txtLastNameResultModify.setText(((String) dataSplit.get(2)) + " " + ((String) dataSplit.get(3)));
            }
            dataSplit = null;
            dataSplit = Arrays.asList(((String) dataOut.get(2)).split("/"));
            Date date = new Date();
            date.setDate(Integer.parseInt((String) dataSplit.get(0)));
            date.setMonth((Integer.parseInt((String) dataSplit.get(1))) + 1);
            date.setYear((Integer.parseInt((String) dataSplit.get(2))) - 1900);
            jcalBirthDate.setDate(date);
            dataSplit = null;
            dataSplit = Arrays.asList(((String) dataOut.get(4)).split("/"));
            txtMainStreet.setText((String) dataSplit.get(0));
            txtSecondStreet.setText((String) dataSplit.get(1));
            txtCity.setText((String) dataSplit.get(2));
        }
    }
    private void cleanCells()
    {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifyCustomerResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyCustomerResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyCustomerResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyCustomerResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyCustomerResultScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cbxCountry;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar jcalBirthDate;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCustomerIDNumber;
    private javax.swing.JLabel lblCustomerIDNumberResult;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMainStreet;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewIDNumber;
    private javax.swing.JLabel lblSecondStreet;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtLastNameResultModify;
    private javax.swing.JTextField txtMainStreet;
    private javax.swing.JTextField txtNameResultModify;
    private javax.swing.JTextField txtSecondStreet;
    // End of variables declaration//GEN-END:variables
}
