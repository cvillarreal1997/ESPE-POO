/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.Project_SPCS.GUI.menu.MainDesktop;
import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.Validations;
import java.io.File;
import java.util.Vector;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class SearchElementInInventoryResultScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchElementInInventoryResultScreen
     */
    private String IDNumber;
    public SearchElementInInventoryResultScreen(String IDNumber) {
        initComponents();
        this.IDNumber = IDNumber;
    }
    public SearchElementInInventoryResultScreen() {
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

        lblTittle = new javax.swing.JLabel();
        lblNewIDNumber = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductResult = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        btnSearchAgain = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTittle.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTittle.setText("Resultados de Búsqueda");

        lblNewIDNumber.setText("Número nuevo de ID:");

        txtIDNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDNumberKeyTyped(evt);
            }
        });

        tblProductResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número de Cédula", "Nombre", "Edad", "Dirección", "Tabla 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductResult);

        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnSearchAgain.setText("Buscar");
        btnSearchAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAgainActionPerformed(evt);
            }
        });

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(lblTittle))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNewIDNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnReturn)
                        .addGap(77, 77, 77)
                        .addComponent(btnSearchAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewIDNumber)
                    .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnSearchAgain)
                    .addComponent(btnClose))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
        SearchElementInInventoryMainScreen mainScreen = new SearchElementInInventoryMainScreen();
        MainDesktop.Desktop.add(mainScreen);
        mainScreen.show();
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSearchAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAgainActionPerformed
        Vector headings = new Vector();
        headings.add("Código");
        headings.add("Nombre");
        headings.add("Grupo");
        headings.add("Bodega");
        headings.add("Cantidad");
        DefaultTableModel mdlTable;
        mdlTable = new DefaultTableModel(headings, 0);
        String auxInputString = FileManager.searchInFile(new File("Inventory.csv"),txtIDNumber.getText());
        if (auxInputString.equals("0")) {
            showMessageDialog(null, "El producto no existe");
        } else {
            tblProductResult.setModel(tableModel.stringTableModel(auxInputString, headings));
        }
    }//GEN-LAST:event_btnSearchAgainActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        dispose();
        SearchElementInInventoryMainScreen mainScreen = new SearchElementInInventoryMainScreen();
        MainDesktop.Desktop.add(mainScreen);
        mainScreen.show();
        mainScreen.toFront();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Vector headings = new Vector();
        headings.add("Código");
        headings.add("Nombre");
        headings.add("Grupo");
        headings.add("Bodega");
        headings.add("Cantidad");
        DefaultTableModel mdlTable;
        mdlTable = new DefaultTableModel(headings, 0);
        String auxInputString = FileManager.searchInFile(new File("Inventory.csv"), IDNumber);
        if (auxInputString.equals("0")) {
            showMessageDialog(null, "El producto no existe");
        } else {
            tblProductResult.setModel(tableModel.stringTableModel(auxInputString, headings));
        }
    }//GEN-LAST:event_formComponentShown

    private void txtIDNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDNumberKeyTyped
        Validations.verificationJustNumbers(txtIDNumber);
    }//GEN-LAST:event_txtIDNumberKeyTyped

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
            java.util.logging.Logger.getLogger(SearchElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchElementInInventoryResultScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearchAgain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNewIDNumber;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblProductResult;
    private javax.swing.JTextField txtIDNumber;
    // End of variables declaration//GEN-END:variables
}
