/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.Project_SPCS.GUI.menu.MainDesktop;
import ec.edu.espe.STPCSProject.util.FileManager;
import java.io.File;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class SearchWork extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchCustomerResultScreen
     */
    public SearchWork() {
        initComponents();
        cleanText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblNewIDNumber = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        lblInitialValue = new javax.swing.JLabel();
        lblPayedValue = new javax.swing.JLabel();
        lblComents = new javax.swing.JLabel();
        lblFinishDate = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblIdentityCard = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblInitialDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMainStreet = new javax.swing.JLabel();
        lblSecondStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblOutIdentifyCard = new javax.swing.JLabel();
        lblOutID = new javax.swing.JLabel();
        lblOutInitDate = new javax.swing.JLabel();
        lblOutFinalyDate = new javax.swing.JLabel();
        lblOutValue = new javax.swing.JLabel();
        lblOutPlayedValue = new javax.swing.JLabel();
        lblOutFirstStreet = new javax.swing.JLabel();
        lblOutSecondStreet = new javax.swing.JLabel();
        lblOutCity = new javax.swing.JLabel();
        lblOutContry = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaComents = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTittle.setText("Resultados de Búsqueda");

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblNewIDNumber.setText("Número de IDWork para buscar:");

        txtIDNumber.setText("1719314179");
        txtIDNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDNumberFocusGained(evt);
            }
        });
        txtIDNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNumberActionPerformed(evt);
            }
        });

        lblInitialValue.setText("VALOR TOTAL DE LA OBRA:");

        lblPayedValue.setText("VALOR PAGADO:");

        lblComents.setText("COMENTARIOS:");

        lblFinishDate.setText("FECHA DE FINALIZACIÓN:");

        lblAddress.setText("DIRECCIÓN:");

        lblIdentityCard.setText("CÉDULA:");
        lblIdentityCard.setToolTipText("");

        lblID.setText("ID:");

        lblInitialDate.setText("FECHA DE INICIO:");

        jLabel1.setText("INFORMACION:");

        lblMainStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainStreet.setText("CALLE PRINCIPAL:");

        lblSecondStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSecondStreet.setText("CALLE SECUNDARIA:");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCity.setText("CIUDAD:");

        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountry.setText("PAÍS:");

        lblOutIdentifyCard.setText("1719314179");

        lblOutID.setText("0000001");

        lblOutInitDate.setText("03/05/2018");

        lblOutFinalyDate.setText("03/05/2019");

        lblOutValue.setText("23234");

        lblOutPlayedValue.setText("23234");

        lblOutFirstStreet.setText("atahualpa");

        lblOutSecondStreet.setText("atahualpa");

        lblOutCity.setText("Quito");

        lblOutContry.setText("Ecuador");

        jTextAreaComents.setColumns(20);
        jTextAreaComents.setRows(5);
        jTextAreaComents.setText("llkddskdskmdsklomokcne fkvinfvren");
        jTextAreaComents.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaComents.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaComents);

        jLabel2.setText("Status:");

        lblStatus.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdentityCard)
                                    .addComponent(lblID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOutID)
                                    .addComponent(lblOutIdentifyCard))
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblStatus))
                                    .addComponent(lblAddress)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPayedValue)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblOutPlayedValue))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblInitialDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblOutInitDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFinishDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblOutFinalyDate)))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblMainStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblSecondStreet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOutFirstStreet)
                                    .addComponent(lblOutSecondStreet)
                                    .addComponent(lblOutCity)
                                    .addComponent(lblOutContry)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInitialValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOutValue))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lblTittle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNewIDNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnSearch)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblComents)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTittle)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewIDNumber)
                            .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdentityCard)
                            .addComponent(lblOutIdentifyCard)
                            .addComponent(jLabel2)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(lblOutID)
                            .addComponent(lblAddress))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInitialDate)
                                    .addComponent(lblOutInitDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFinishDate)
                                    .addComponent(lblOutFinalyDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInitialValue)
                                    .addComponent(lblOutValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPayedValue)
                                    .addComponent(lblOutPlayedValue)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMainStreet)
                                    .addComponent(lblOutFirstStreet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSecondStreet)
                                    .addComponent(lblOutSecondStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCity)
                                    .addComponent(lblOutCity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCountry)
                                    .addComponent(lblOutContry))))
                        .addGap(12, 12, 12)
                        .addComponent(lblComents)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
        String[] dataOutput = null;
        String aux = FileManager.searchInFile(new File("Works.csv"), txtIDNumber.getText());
        if(!aux.equals("0")){
            dataOutput = FileManager.dataSplit(aux);
            addText(dataOutput); 
        }else{
            showMessageDialog(null,"El trabajo no se ha encontrado\nPor favor!! Ingrese el ID bien..." );
            cleanText();
        } 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void addText(String[] dataOutput){
            
            lblOutIdentifyCard.setText(dataOutput[0]);
            lblOutID.setText(dataOutput[10]);
            if(dataOutput[11].equals("true"))
                lblStatus.setText("Activo");
            else
                lblStatus.setText("Inactivo");
            lblOutInitDate.setText(dataOutput[1]);
            lblOutFinalyDate.setText(dataOutput[2]);
            lblOutFirstStreet.setText(dataOutput[3]);
            lblOutSecondStreet.setText(dataOutput[4]);
            lblOutCity.setText(dataOutput[5]);
            lblOutContry.setText(dataOutput[6]);
            lblOutValue.setText(dataOutput[7]);
            lblOutPlayedValue.setText(dataOutput[8]);
            jTextAreaComents.setText(dataOutput[9]);
    }
    
    private void cleanText(){
        lblOutIdentifyCard.setText("");
            lblOutID.setText("");
            lblStatus.setText("");
            lblOutInitDate.setText("");
            lblOutFinalyDate.setText("");
            lblOutFirstStreet.setText("");
            lblOutSecondStreet.setText("");
            lblOutCity.setText("");
            lblOutContry.setText("");
            lblOutValue.setText("");
            lblOutPlayedValue.setText("");
            jTextAreaComents.setText("");
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtIDNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDNumberFocusGained
        txtIDNumber.setText("");
    }//GEN-LAST:event_txtIDNumberFocusGained

    private void txtIDNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNumberActionPerformed

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
            java.util.logging.Logger.getLogger(SearchWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaComents;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblComents;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblFinishDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIdentityCard;
    private javax.swing.JLabel lblInitialDate;
    private javax.swing.JLabel lblInitialValue;
    private javax.swing.JLabel lblMainStreet;
    private javax.swing.JLabel lblNewIDNumber;
    private javax.swing.JLabel lblOutCity;
    private javax.swing.JLabel lblOutContry;
    private javax.swing.JLabel lblOutFinalyDate;
    private javax.swing.JLabel lblOutFirstStreet;
    private javax.swing.JLabel lblOutID;
    private javax.swing.JLabel lblOutIdentifyCard;
    private javax.swing.JLabel lblOutInitDate;
    private javax.swing.JLabel lblOutPlayedValue;
    private javax.swing.JLabel lblOutSecondStreet;
    private javax.swing.JLabel lblOutValue;
    private javax.swing.JLabel lblPayedValue;
    private javax.swing.JLabel lblSecondStreet;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTextField txtIDNumber;
    // End of variables declaration//GEN-END:variables
}
