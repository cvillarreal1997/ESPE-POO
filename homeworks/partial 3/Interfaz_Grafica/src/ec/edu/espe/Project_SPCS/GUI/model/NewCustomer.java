/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.STPCSProject.model.Customer;
import ec.edu.espe.STPCSProject.util.Validations;
import ec.edu.espe.STPCSProject.model.Address;
import ec.edu.espe.STPCSProject.model.AgeDate;
import ec.edu.espe.STPCSProject.model.Date1;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class NewCustomer extends javax.swing.JInternalFrame {
    private Customer person;
    private char validar;
    private String auxStringInput = null;
    private String auxStringForFile = null;
    private boolean IDVerificationForSaving = false;
    private final Validations validation = new Validations();
    private Address homeAddress = new Address("Calle 1", "Calle 2", "San Augustin", "Estados Unidos");
    private Date1 ageDate = new Date1(0,0,0);
    private Date1 birthDate= new Date1(0,0,0);;
    private AgeDate date = new AgeDate();
    private int mouseClickCount = 0;
    /**
     * Creates new form NewCustomer
     */
    public NewCustomer() {
        initComponents();
        initcmb();
        cbxCountry.setSelectedIndex(-1);
    }
    public void initcmb()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        String fileName = "cmbCountry.txt";
        File file = new File(fileName);
        try (Scanner in = new Scanner(file))
        {
            while(in.hasNextLine())
            {
                String line;
                line = in.nextLine();
                model.addElement(line);
                cbxCountry.setModel(model);
            }
        }
        catch (FileNotFoundException exc)
        {
            System.out.println("El archivo no fue encontrado");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblIDNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblMainStreet = new javax.swing.JLabel();
        lblSecondStreet = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMainStreet = new javax.swing.JTextField();
        txtSecondStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        cbxCountry = new javax.swing.JComboBox<>();
        jcalBirthDate = new com.toedter.calendar.JCalendar();
        lblBirthDate = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Nuevo Cliente");

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        lblTitle.setText("Ingrese los datos del cliente");

        lblIDNumber.setText("Número de RUC o Cédula:");

        lblName.setText("Calle Secundaria: ");

        lblLastName.setText("Nombres: ");

        lblMainStreet.setText("Apellidos: ");

        lblSecondStreet.setText("Calle Principal: ");

        lblCountry.setText("Pais: ");

        txtIDNumber.setText("9999999999");
        txtIDNumber.setToolTipText("Ingrese aquí su número de cédula. Presione ENTER para verificar");
        txtIDNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDNumberMouseClicked(evt);
            }
        });
        txtIDNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDNumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDNumberKeyTyped(evt);
            }
        });

        txtLastName.setText("Doe");
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        txtName.setText("Jon");
        txtName.setToolTipText("");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtMainStreet.setText("Calle 1");

        txtSecondStreet.setText("Calle 2");

        txtCity.setText("San Bernandino");
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCityKeyTyped(evt);
            }
        });

        lblCity.setText("Ciudad: ");

        cbxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCountryActionPerformed(evt);
            }
        });

        jcalBirthDate.setMaxSelectableDate(new java.util.Date(1577858469000L));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcalBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jcalBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCountryActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        person = new Customer();
        if (validation.checkOpenFile(new File("Customer.csv"))==false) {
            IDVerificationForSaving = validation.IDVerification(txtIDNumber);
            if (IDVerificationForSaving == true) {
                person.setIdentifyCard(txtIDNumber.getText());
                if (txtName.getBackground() == Color.red || txtLastName.getBackground() == Color.red) {
                    showMessageDialog(null, "Revise los parametros erroneos");
                } else {
                    person.setName(txtName.getText() + " " + txtLastName.getText());
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
                        if (validation.birthDateValidation(birthDate) == false) {
                            showMessageDialog(null, "La fecha de nacimiento no puede ser mayor o igual a la actual ");
                        } else {
                            person.setBirthDate(birthDate);
                            ageDate = date.ageCalc(birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
                            person.setAgeDate(ageDate);
                            auxStringForFile = toString();
                            showMessageDialog(null, auxStringForFile);
                            person.newCostumer(auxStringForFile);
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
        NewCustomer.this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtIDNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDNumberKeyTyped
        if (txtIDNumber.getText().length() < 10) {
            validation.verificationJustNumbers(txtIDNumber);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDNumberKeyTyped

    private void txtIDNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDNumberKeyPressed
       person = new Customer();
       if(evt.getKeyCode() == 10)
       {
           validation.IDVerification(txtIDNumber);
       }
    }//GEN-LAST:event_txtIDNumberKeyPressed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        validar = evt.getKeyChar();
        validation.verificationJustLetters(validar,txtName);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        validar = evt.getKeyChar();
        validation.verificationJustLetters(validar,txtLastName);
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyTyped
       validar = evt.getKeyChar();
        validation.verificationJustLetters(validar,txtCity);
    }//GEN-LAST:event_txtCityKeyTyped

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
    
    public void cleanCells()
    {
        txtIDNumber.setText("");
        txtLastName.setText("");
        txtName.setText("");
        txtCity.setText("");
        txtMainStreet.setText("");
        txtSecondStreet.setText("");
        cbxCountry.setSelectedIndex(-1);
        mouseClickCount = 0;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxCountry;
    private com.toedter.calendar.JCalendar jcalBirthDate;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblIDNumber;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMainStreet;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSecondStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMainStreet;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSecondStreet;
    // End of variables declaration//GEN-END:variables
}
