/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.menu;


import ec.edu.espe.Project_SPCS.GUI.model.FRemploye;
import ec.edu.espe.Project_SPCS.GUI.model.Factura;
import ec.edu.espe.Project_SPCS.GUI.model.ModifyCustomerMainScreen;
import ec.edu.espe.Project_SPCS.GUI.model.ModifyElementInInventoryMainScreen;
import ec.edu.espe.Project_SPCS.GUI.model.ModifyWork;
import ec.edu.espe.Project_SPCS.GUI.model.NewCustomer;
import ec.edu.espe.Project_SPCS.GUI.model.NewInventoryElement;

import ec.edu.espe.Project_SPCS.GUI.model.NewProvider1;
import ec.edu.espe.Project_SPCS.GUI.model.NewWork;
import ec.edu.espe.Project_SPCS.GUI.model.PrintCustomerFile;
import ec.edu.espe.Project_SPCS.GUI.model.PrintInventoryFile;
import ec.edu.espe.Project_SPCS.GUI.model.SearchCustomerMainScreen;
import ec.edu.espe.Project_SPCS.GUI.model.SearchElementInInventoryMainScreen;
import ec.edu.espe.Project_SPCS.GUI.model.SearchProvider;
import ec.edu.espe.Project_SPCS.GUI.model.SearchWork;
import ec.edu.espe.Project_SPCS.GUI.model.PrintCustomerFile;
import ec.edu.espe.Project_SPCS.GUI.model.Productos;
import ec.edu.espe.Project_SPCS.GUI.model.frmCambioClave;
import ec.edu.espe.Project_SPCS.GUI.util.OpenFiles;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class MainDesktop extends javax.swing.JFrame {

    /**
     * Creates new form MainDesktop
     */
    public MainDesktop() {
        initComponents();
        MainDesktop.this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Desktop = new javax.swing.JDesktopPane();
        jmbMenu = new javax.swing.JMenuBar();
        jmbArchivos = new javax.swing.JMenu();
        jmbExit = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmbHelp = new javax.swing.JMenuItem();
        mnuPassword = new javax.swing.JMenuItem();
        jmbCustomer = new javax.swing.JMenu();
        jmbNewCustomer = new javax.swing.JMenuItem();
        jmbSearchCustomer = new javax.swing.JMenuItem();
        jmbModifyCustomer = new javax.swing.JMenuItem();
        jbmProvider = new javax.swing.JMenu();
        jmbNewProvider = new javax.swing.JMenuItem();
        jmbModifyProvider = new javax.swing.JMenuItem();
        jmbSearchProvider = new javax.swing.JMenuItem();
        jmbEmployee = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmbWorks = new javax.swing.JMenu();
        jmbNewWork = new javax.swing.JMenuItem();
        jmbSearchWork = new javax.swing.JMenuItem();
        jmbModifyWork = new javax.swing.JMenuItem();
        jbmInventory = new javax.swing.JMenu();
        jmbNewElement = new javax.swing.JMenuItem();
        jmbSearchInInventory = new javax.swing.JMenuItem();
        jmbModify = new javax.swing.JMenuItem();
        jbmReports = new javax.swing.JMenu();
        jmbPrintInventory = new javax.swing.JMenuItem();
        jmbPrintWorksFile = new javax.swing.JMenuItem();
        jmbPrintEmployeeFile = new javax.swing.JMenuItem();
        jmbPrintProviderFile = new javax.swing.JMenuItem();
        jmbPrintFlieCustomer = new javax.swing.JMenuItem();
        jbmProduct = new javax.swing.JMenu();
        jbmAddProduct = new javax.swing.JMenuItem();
        jbmFactura = new javax.swing.JMenu();
        jbmNewFac = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jmbArchivos.setText("Archivos");

        jmbExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmbExit.setText("Cerrar");
        jmbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbExitActionPerformed(evt);
            }
        });
        jmbArchivos.add(jmbExit);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Archivos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmbArchivos.add(jMenuItem3);
        jmbArchivos.add(jSeparator1);

        jmbHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmbHelp.setText("Ayuda");
        jmbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbHelpActionPerformed(evt);
            }
        });
        jmbArchivos.add(jmbHelp);

        mnuPassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        mnuPassword.setText("Cambio de clave");
        mnuPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPasswordActionPerformed(evt);
            }
        });
        jmbArchivos.add(mnuPassword);

        jmbMenu.add(jmbArchivos);

        jmbCustomer.setText("Clientes");

        jmbNewCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmbNewCustomer.setText("Nuevo Cliente");
        jmbNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbNewCustomerActionPerformed(evt);
            }
        });
        jmbCustomer.add(jmbNewCustomer);

        jmbSearchCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmbSearchCustomer.setText("Buscar Cliente");
        jmbSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSearchCustomerActionPerformed(evt);
            }
        });
        jmbCustomer.add(jmbSearchCustomer);

        jmbModifyCustomer.setText("Modificar Cliente");
        jmbModifyCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbModifyCustomerActionPerformed(evt);
            }
        });
        jmbCustomer.add(jmbModifyCustomer);

        jmbMenu.add(jmbCustomer);

        jbmProvider.setText("Proveedor");

        jmbNewProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmbNewProvider.setText("Nuevo Provedor");
        jmbNewProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbNewProviderActionPerformed(evt);
            }
        });
        jbmProvider.add(jmbNewProvider);

        jmbModifyProvider.setText("Modificar Proveedor");
        jbmProvider.add(jmbModifyProvider);

        jmbSearchProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmbSearchProvider.setText("Buscar Provedor");
        jmbSearchProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSearchProviderActionPerformed(evt);
            }
        });
        jbmProvider.add(jmbSearchProvider);

        jmbMenu.add(jbmProvider);

        jmbEmployee.setText("Empleados");
        jmbEmployee.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jmbEmployeeMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jmbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbEmployeeActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Registro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmbEmployee.add(jMenuItem4);

        jmbMenu.add(jmbEmployee);

        jmbWorks.setText("Trabajos");

        jmbNewWork.setText("Nuevo Trabajo");
        jmbNewWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbNewWorkActionPerformed(evt);
            }
        });
        jmbWorks.add(jmbNewWork);

        jmbSearchWork.setText("Buscar Trabajo");
        jmbSearchWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSearchWorkActionPerformed(evt);
            }
        });
        jmbWorks.add(jmbSearchWork);

        jmbModifyWork.setText("Modificar Trabajo");
        jmbModifyWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbModifyWorkActionPerformed(evt);
            }
        });
        jmbWorks.add(jmbModifyWork);

        jmbMenu.add(jmbWorks);

        jbmInventory.setText("Inventario");

        jmbNewElement.setText("Nuevo Elemento");
        jmbNewElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbNewElementActionPerformed(evt);
            }
        });
        jbmInventory.add(jmbNewElement);

        jmbSearchInInventory.setText("Buscar Elemento");
        jmbSearchInInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSearchInInventoryActionPerformed(evt);
            }
        });
        jbmInventory.add(jmbSearchInInventory);

        jmbModify.setText("Modificar Elemento");
        jmbModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbModifyActionPerformed(evt);
            }
        });
        jbmInventory.add(jmbModify);

        jmbMenu.add(jbmInventory);

        jbmReports.setText("Reportes");

        jmbPrintInventory.setText("Mostrar Inventario");
        jmbPrintInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbPrintInventoryActionPerformed(evt);
            }
        });
        jbmReports.add(jmbPrintInventory);

        jmbPrintWorksFile.setText("Mostrar Trabajos");
        jbmReports.add(jmbPrintWorksFile);

        jmbPrintEmployeeFile.setText("Mostrar Empleados");
        jbmReports.add(jmbPrintEmployeeFile);

        jmbPrintProviderFile.setText("Mostrar Proveedores");
        jbmReports.add(jmbPrintProviderFile);

        jmbPrintFlieCustomer.setText("Mostrar Clientes");
        jmbPrintFlieCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbPrintFlieCustomerActionPerformed(evt);
            }
        });
        jbmReports.add(jmbPrintFlieCustomer);

        jmbMenu.add(jbmReports);

        jbmProduct.setText("Producto");

        jbmAddProduct.setText("Agregar");
        jbmAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmAddProductActionPerformed(evt);
            }
        });
        jbmProduct.add(jbmAddProduct);

        jmbMenu.add(jbmProduct);

        jbmFactura.setText("Factura");

        jbmNewFac.setText("Nueva");
        jbmNewFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmNewFacActionPerformed(evt);
            }
        });
        jbmFactura.add(jbmNewFac);

        jmbMenu.add(jbmFactura);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmbNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbNewCustomerActionPerformed
        NewCustomer newCustomer = new NewCustomer();
        Desktop.add(newCustomer);
        newCustomer.show();
    }//GEN-LAST:event_jmbNewCustomerActionPerformed

    private void jmbSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSearchCustomerActionPerformed
        SearchCustomerMainScreen searchCustomer = new SearchCustomerMainScreen();
        Desktop.add(searchCustomer);
        searchCustomer.show();
    }//GEN-LAST:event_jmbSearchCustomerActionPerformed

    private void jmbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbExitActionPerformed
        showMessageDialog(null,"Gracias por usar el programa");
        System.exit(0);
    }//GEN-LAST:event_jmbExitActionPerformed

    private void jmbNewProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbNewProviderActionPerformed
        // TODO add your handling code here:
        NewProvider1 newProvider = new NewProvider1();
        Desktop.add(newProvider);
        newProvider.show();
    }//GEN-LAST:event_jmbNewProviderActionPerformed

    private void jmbSearchProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSearchProviderActionPerformed
        // TODO add your handling code here:
        SearchProvider searchProvider = new SearchProvider();
        searchProvider.setVisible(true);
    }//GEN-LAST:event_jmbSearchProviderActionPerformed

    private void jmbModifyCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbModifyCustomerActionPerformed
        ModifyCustomerMainScreen mainScreen = new ModifyCustomerMainScreen();
        Desktop.add(mainScreen);
        mainScreen.show();
    }//GEN-LAST:event_jmbModifyCustomerActionPerformed

    private void jmbPrintFlieCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbPrintFlieCustomerActionPerformed
       PrintCustomerFile tabla = new PrintCustomerFile();
       Desktop.add(tabla);
       tabla.show();
    }//GEN-LAST:event_jmbPrintFlieCustomerActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        OpenFiles openFile = new OpenFiles();
        Desktop.add(openFile);
        openFile.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmbNewElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbNewElementActionPerformed
        NewInventoryElement newElement = new NewInventoryElement();
        Desktop.add(newElement);
        newElement.show();
    }//GEN-LAST:event_jmbNewElementActionPerformed

    private void jmbSearchInInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSearchInInventoryActionPerformed
        SearchElementInInventoryMainScreen mainScreen = new SearchElementInInventoryMainScreen();
        Desktop.add(mainScreen);
        mainScreen.show();
    }//GEN-LAST:event_jmbSearchInInventoryActionPerformed

    private void jmbModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbModifyActionPerformed
        ModifyElementInInventoryMainScreen mainScreen = new ModifyElementInInventoryMainScreen();
        Desktop.add(mainScreen);
        mainScreen.show();
    }//GEN-LAST:event_jmbModifyActionPerformed

    private void jmbPrintInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbPrintInventoryActionPerformed
        PrintInventoryFile printFile = new PrintInventoryFile();
        Desktop.add(printFile);
        printFile.show();
    }//GEN-LAST:event_jmbPrintInventoryActionPerformed

    private void jmbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbHelpActionPerformed
        showMessageDialog(null,"Ayuda!!!!!!!!!");
    }//GEN-LAST:event_jmbHelpActionPerformed

    private void jmbNewWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbNewWorkActionPerformed
        Desktop.add(new NewWork()).show();
    }//GEN-LAST:event_jmbNewWorkActionPerformed

    private void jmbSearchWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSearchWorkActionPerformed
        Desktop.add(new SearchWork()).show();
    }//GEN-LAST:event_jmbSearchWorkActionPerformed

    private void jmbModifyWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbModifyWorkActionPerformed
        Desktop.add(new ModifyWork()).show();
    }//GEN-LAST:event_jmbModifyWorkActionPerformed

    private void jbmAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmAddProductActionPerformed
        // TODO add your handling code here:
        Productos product = new Productos();
        Desktop.add(product);
        product.show(true);
        
    }//GEN-LAST:event_jbmAddProductActionPerformed

    private void jbmNewFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmNewFacActionPerformed
        // TODO add your handling code here:
        Desktop.add(new Factura()).show();
    }//GEN-LAST:event_jbmNewFacActionPerformed

    private void jmbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbEmployeeActionPerformed

    }//GEN-LAST:event_jmbEmployeeActionPerformed

    private void jmbEmployeeMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jmbEmployeeMenuKeyPressed
       
   
    }//GEN-LAST:event_jmbEmployeeMenuKeyPressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
           FRemploye employe = new FRemploye();
      employe.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPasswordActionPerformed
    frmCambioClave cambio = new frmCambioClave(this, rootPaneCheckingEnabled);
    cambio.setVisible(true);
        
    }//GEN-LAST:event_mnuPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(MainDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jbmAddProduct;
    private javax.swing.JMenu jbmFactura;
    private javax.swing.JMenu jbmInventory;
    private javax.swing.JMenuItem jbmNewFac;
    private javax.swing.JMenu jbmProduct;
    private javax.swing.JMenu jbmProvider;
    private javax.swing.JMenu jbmReports;
    private javax.swing.JMenu jmbArchivos;
    private javax.swing.JMenu jmbCustomer;
    private javax.swing.JMenu jmbEmployee;
    private javax.swing.JMenuItem jmbExit;
    private javax.swing.JMenuItem jmbHelp;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmbModify;
    private javax.swing.JMenuItem jmbModifyCustomer;
    private javax.swing.JMenuItem jmbModifyProvider;
    private javax.swing.JMenuItem jmbModifyWork;
    private javax.swing.JMenuItem jmbNewCustomer;
    private javax.swing.JMenuItem jmbNewElement;
    private javax.swing.JMenuItem jmbNewProvider;
    private javax.swing.JMenuItem jmbNewWork;
    private javax.swing.JMenuItem jmbPrintEmployeeFile;
    private javax.swing.JMenuItem jmbPrintFlieCustomer;
    private javax.swing.JMenuItem jmbPrintInventory;
    private javax.swing.JMenuItem jmbPrintProviderFile;
    private javax.swing.JMenuItem jmbPrintWorksFile;
    private javax.swing.JMenuItem jmbSearchCustomer;
    private javax.swing.JMenuItem jmbSearchInInventory;
    private javax.swing.JMenuItem jmbSearchProvider;
    private javax.swing.JMenuItem jmbSearchWork;
    private javax.swing.JMenu jmbWorks;
    private javax.swing.JMenuItem mnuPassword;
    // End of variables declaration//GEN-END:variables
}