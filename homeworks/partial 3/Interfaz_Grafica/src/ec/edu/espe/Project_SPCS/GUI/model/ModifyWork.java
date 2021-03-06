/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.STPCSProject.util.FileManager;
import java.io.File;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Dayanna Silva
 */
public class ModifyWork extends javax.swing.JInternalFrame {

    String id = "";
    /**
     * Creates new form NewWork
     */
    public ModifyWork() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jIdentityCard = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jID = new javax.swing.JLabel();
        txtIdentityCard = new javax.swing.JTextField();
        jInitialDate = new javax.swing.JLabel();
        jInitialYear = new javax.swing.JLabel();
        jFinishDate = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        jMainStreet = new javax.swing.JLabel();
        jSecondStreet = new javax.swing.JLabel();
        jCity = new javax.swing.JLabel();
        jCountry = new javax.swing.JLabel();
        txtMainStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtSecondStreet = new javax.swing.JTextField();
        jInitialValue = new javax.swing.JLabel();
        txtInitialValue = new javax.swing.JTextField();
        jPayedValue = new javax.swing.JLabel();
        txtPayedValue = new javax.swing.JTextField();
        jComents = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaComents = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jdtInitial = new com.toedter.calendar.JDateChooser();
        jdtEnd = new com.toedter.calendar.JDateChooser();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setTitle("Nuevo Trabajo");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Trabajo");

        jIdentityCard.setText("CÉDULA:");
        jIdentityCard.setToolTipText("");

        jID.setText("ID a Buscar :");

        jInitialDate.setText("FECHA DE INICIO:");

        jInitialYear.setText("AÑO:");

        jFinishDate.setText("FECHA DE FINALIZACIÓN:");

        jAddress.setText("DIRECCIÓN:");

        jMainStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainStreet.setText("CALLE PRINCIPAL:");

        jSecondStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSecondStreet.setText("CALLE SECUNDARIA:");

        jCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCity.setText("CIUDAD:");

        jCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCountry.setText("PAÍS:");

        jInitialValue.setText("VALOR TOTAL DE LA OBRA:");

        txtInitialValue.setText("$");

        jPayedValue.setText("VALOR PAGADO:");

        txtPayedValue.setText("$");

        jComents.setText("COMENTARIOS:");

        jTextAreaComents.setColumns(20);
        jTextAreaComents.setRows(5);
        jScrollPane2.setViewportView(jTextAreaComents);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jIdentityCard)
                                    .addComponent(jID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID)
                                    .addComponent(txtIdentityCard, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCity, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jInitialDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jInitialYear))
                                    .addComponent(jFinishDate))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdtInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jMainStreet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jInitialValue)
                                    .addComponent(jPayedValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPayedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInitialValue, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComents)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnModify)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jID)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jIdentityCard)
                            .addComponent(txtIdentityCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jInitialDate)
                            .addComponent(jInitialYear)))
                    .addComponent(jdtInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFinishDate)
                    .addComponent(jdtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddress)
                    .addComponent(jMainStreet)
                    .addComponent(txtMainStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSecondStreet)
                    .addComponent(txtSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInitialValue)
                    .addComponent(txtInitialValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPayedValue)
                    .addComponent(txtPayedValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComents)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnModify)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String[] dataOutput = null;
        String aux = FileManager.searchInFile(new File("Works.csv"), txtID.getText().trim());
        id = txtID.getText().trim();
        if(!aux.equals("0")){
            dataOutput = FileManager.dataSplit(aux);
            addText(dataOutput); 
        }else{
            showMessageDialog(null,"El trabajo no se ha encontrado\nPor favor!! Ingrese el ID bien..." );
            cleanText();
        } 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        String input = txtIdentityCard.getText() +";" +jdtInitial.getCalendar().get(Calendar.DAY_OF_MONTH)
                +"/"+(jdtInitial.getCalendar().get(Calendar.MONTH)+1)
                +"/"+jdtInitial.getCalendar().get(Calendar.YEAR)+";"
                +jdtEnd.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+(jdtEnd.getCalendar().get(Calendar.MONTH)+1)
                +"/"+jdtEnd.getCalendar().get(Calendar.YEAR)+";" + txtMainStreet.getText().toUpperCase()
                + ";" + txtSecondStreet.getText().toUpperCase() + ";"+ txtCity.getText().toUpperCase()
                + ";" + txtCountry.getText().toUpperCase()
                + ";" + txtInitialValue.getText() + ";" + txtPayedValue.getText() 
                +";"+jTextAreaComents.getText().toUpperCase()+";"+txtID.getText()+";"+"true"+"\n";
        FileManager.modifyFile(new File("Works.csv"),id, input);
        cleanText();
        JOptionPane.showMessageDialog(this, "se ha agregado satisfactoriamente al archivo", "Agregado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void addText(String[] dataOutput){
            
            Calendar cal = Calendar.getInstance();
            txtIdentityCard.setText(dataOutput[0]);
            String[] dateInitial = dataOutput[1].split("/");
            cal.set(Integer.parseInt(dateInitial[2]), Integer.parseInt(dateInitial[1]), Integer.parseInt(dateInitial[0]));
            jdtInitial.setCalendar(cal);
            String[] dateInitial2 = dataOutput[2].split("/");
            cal.set(Integer.parseInt(dateInitial2[2]), Integer.parseInt(dateInitial2[1]), Integer.parseInt(dateInitial2[0]));
            jdtEnd.setCalendar(cal);
            txtMainStreet.setText(dataOutput[3]);
            txtSecondStreet.setText(dataOutput[4]);
            txtCity.setText(dataOutput[5]);
            txtCountry.setText(dataOutput[6]);
            txtInitialValue.setText(dataOutput[7]);
            txtPayedValue.setText(dataOutput[8]);
            jTextAreaComents.setText(dataOutput[9]);
    }
    private void cleanText(){
       txtIdentityCard.setText("");
       txtCity.setText("");
       txtCountry.setText("");
       txtID.setText("");
       txtInitialValue.setText("");
       txtMainStreet.setText("");
       txtPayedValue.setText("");
       txtSecondStreet.setText("");
       jTextAreaComents.setText("");
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jCity;
    private javax.swing.JLabel jComents;
    private javax.swing.JLabel jCountry;
    private javax.swing.JLabel jFinishDate;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jIdentityCard;
    private javax.swing.JLabel jInitialDate;
    private javax.swing.JLabel jInitialValue;
    private javax.swing.JLabel jInitialYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMainStreet;
    private javax.swing.JLabel jPayedValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jSecondStreet;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaComents;
    private com.toedter.calendar.JDateChooser jdtEnd;
    private com.toedter.calendar.JDateChooser jdtInitial;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdentityCard;
    private javax.swing.JTextField txtInitialValue;
    private javax.swing.JTextField txtMainStreet;
    private javax.swing.JTextField txtPayedValue;
    private javax.swing.JTextField txtSecondStreet;
    // End of variables declaration//GEN-END:variables
}
