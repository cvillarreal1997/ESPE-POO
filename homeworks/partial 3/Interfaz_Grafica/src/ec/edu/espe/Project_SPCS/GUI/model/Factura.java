/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.STPCSProject.model.Bill;
import ec.edu.espe.STPCSProject.model.Date1;
import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.Validations;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dayanna Silva
 */

public class Factura extends javax.swing.JInternalFrame implements Printable {
   private Bill bill = new Bill();
   private String dataOutCustomer;
   private String dataOutWork;
   private String dataService;
   private Vector dataTableOut = new Vector();
   private int clicks;
   private boolean IDVerification = false;
   private DefaultTableModel mdlTable;
   private Vector vCabecera = new Vector();
    public Factura() {
        initComponents();
        Date1 date = new Date1(0,0,0);
        date = bill.getDate();
        //lblBillNumber.setText(""+(bill.actualNumber()+1));
        txtFecha.setText(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
        vCabecera.addElement("Código");
        vCabecera.addElement("Descripción");
        vCabecera.addElement("Tipo");
        vCabecera.addElement("Cantidad");
        vCabecera.addElement("Precio antes de IVA");
        mdlTable = new DefaultTableModel(vCabecera, 0);
        tblFactura.setModel(mdlTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnBuscarCliente = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotalValor = new javax.swing.JTextField();
        txtTotalCantidad = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblNameTitle = new javax.swing.JLabel();
        lblAdrressTitle = new javax.swing.JLabel();
        lblIDTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblWork = new javax.swing.JLabel();
        txtWorkID = new javax.swing.JTextField();
        btnSearchWork = new javax.swing.JButton();
        lblDescriptionTitle = new javax.swing.JLabel();
        lblTypeTitle = new javax.swing.JLabel();
        lblPVPAIVA = new javax.swing.JLabel();
        lblDescrip = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblPVP = new javax.swing.JLabel();
        txtServiceID = new javax.swing.JTextField();
        lblBillNumber = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Nueva Factura");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Fecha");

        txtFecha.setEnabled(false);

        jLabel2.setText("Cliente");

        jLabel3.setText("Producto");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.setToolTipText("Buscar un producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad");

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar24x24.png"))); // NOI18N
        btnAgregar.setToolTipText("Adiciona un producto a la factura");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar24x24.png"))); // NOI18N
        btnEliminar.setToolTipText("Elimina producto de la factura");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminarTodo24x24.png"))); // NOI18N
        btnBorrarTodo.setToolTipText("Elimina todos los productos de la factura");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptar24x24.png"))); // NOI18N
        btnGrabar.setToolTipText("Graba la factura");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("...");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 4"
            }
        ));
        tblFactura.setEnabled(false);
        jScrollPane1.setViewportView(tblFactura);

        jLabel5.setText("Totales");

        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setEnabled(false);

        txtTotalCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalCantidad.setEnabled(false);

        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        lblNameTitle.setText("Nombre:");

        lblAdrressTitle.setText("Direccion:");

        lblIDTitle.setText("Número de Cédula:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNameTitle)
                            .addGap(18, 18, 18)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblAdrressTitle)
                            .addGap(18, 18, 18)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIDTitle)
                        .addGap(18, 18, 18)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdrressTitle)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDTitle)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblWork.setText("Trabajo");

        txtWorkID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorkIDKeyTyped(evt);
            }
        });

        btnSearchWork.setText("Buscar");
        btnSearchWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchWorkActionPerformed(evt);
            }
        });

        lblDescriptionTitle.setText("Descripción:");

        lblTypeTitle.setText("Tipo:");

        lblPVPAIVA.setText("P.V.P antes de IVA:");

        txtServiceID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServiceIDKeyTyped(evt);
            }
        });

        lblBillNumber.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPVPAIVA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPVP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTypeTitle)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWork))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txtWorkID))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(244, 244, 244)
                                        .addComponent(lblBillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSearchWork)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnPrint)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDescriptionTitle)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWork)
                                .addGap(3, 3, 3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearchWork, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescriptionTitle)
                            .addComponent(lblDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTypeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPVPAIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBorrarTodo)
                    .addComponent(btnGrabar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // Cargamos los clientes
        
    }//GEN-LAST:event_formInternalFrameOpened
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        clicks = clicks + 1;
        if (clicks < 10) {
            Vector data = new Vector();
            data.addElement(txtServiceID.getText());
            data.addElement(lblDescrip.getText());
            data.addElement(lblType.getText());
            data.addElement(txtCantidad.getText());
            data.addElement(((Integer.parseInt(lblPVP.getText())) * (Integer.parseInt(txtCantidad.getText()))));
            dataTableOut.addElement(txtServiceID.getText()+";"+lblDescrip.getText()+";"+lblType.getText()+";"+txtCantidad.getText()+";"+((Integer.parseInt(lblPVP.getText())) * (Integer.parseInt(txtCantidad.getText()))));
            mdlTable.addRow(data);
            tblFactura.setModel(mdlTable);
        } else {
            showMessageDialog(null, "Demasiados servicios");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
       bill.setDataTable(dataTableOut);
       bill.setDataCustomer(dataOutCustomer);
       bill.setDataWork(dataOutWork);
       bill.newNumber();
       double i = 0;
       i = bill.finalBillValue();
       i = (double)((int)(i*100)/100); 
       txtTotalValor.setText(""+bill.finalBillValue());
       txtTotalCantidad.setText(""+bill.totalServices());
       //lblBillNumber.setText(""+bill.billNumber(bill.actualNumber()));
    }//GEN-LAST:event_btnGrabarActionPerformed
    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        
    }//GEN-LAST:event_btnBorrarTodoActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String auxOutput = FileManager.searchInFile(new File("Customer.csv"), jTextField1.getText());
        IDVerification = Validations.IDVerification(jTextField1);
        if (IDVerification == true) {
            if (auxOutput.equals("0")) {
                showMessageDialog(null, "El cliente no existe, registrelo por favor");
            } else {
                dataOutCustomer = auxOutput;
                List dataOut = Arrays.asList(auxOutput.split(";"));
                lblID.setText((String) dataOut.get(0));
                lblName.setText((String) dataOut.get(1));
                lblAddress.setText((String) dataOut.get(4));

            }
        } else {

        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        String auxOutput = FileManager.searchInFile(new File("Services.csv"), txtServiceID.getText());
        if(auxOutput.equals("0") || txtServiceID.getBackground() == Color.red)
        {
            showMessageDialog(null, "El servicio no existe, registrelo por favor, recuerde no usar letras, solo números");
            
        }
        else
        {
            dataService = auxOutput;
            List dataOut = Arrays.asList(auxOutput.split(";"));
            lblDescrip.setText((String) dataOut.get(1));
            lblType.setText((String) dataOut.get(2));
            lblPVP.setText((String) dataOut.get(4));
            
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try
       {
           PrinterJob imprticket = PrinterJob.getPrinterJob();
           imprticket.setPrintable(this);
           boolean impr = imprticket .printDialog();
            
           if(impr)
           {
               imprticket.print();
           }
       }
       catch(PrinterException pex)
       {
           System.out.println("Error\n" + pex);
       }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        Validations.verificationJustNumbers(jTextField1);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void txtWorkIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkIDKeyTyped
        Validations.verificationJustNumbers(txtWorkID);
    }//GEN-LAST:event_txtWorkIDKeyTyped

    private void btnSearchWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchWorkActionPerformed
        String auxOutput = FileManager.searchInFile(new File("Works.csv"), txtWorkID.getText());
        if(auxOutput.equals("0") || txtWorkID.getBackground() == Color.red)
        {
            showMessageDialog(null, "El trabajo no existe, registrelo por favor, recuerde no usar letras, solo números");
            
        }
        else
        {
            dataOutWork = auxOutput;
            showMessageDialog(null, "Trabajo encontrado");
        }
    }//GEN-LAST:event_btnSearchWorkActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        Validations.verificationJustNumbers(txtCantidad);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtServiceIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceIDKeyTyped
        Validations.verificationJustNumbers(txtServiceID);
    }//GEN-LAST:event_txtServiceIDKeyTyped
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearchWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAdrressTitle;
    private javax.swing.JLabel lblBillNumber;
    private javax.swing.JLabel lblDescrip;
    private javax.swing.JLabel lblDescriptionTitle;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDTitle;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameTitle;
    private javax.swing.JLabel lblPVP;
    private javax.swing.JLabel lblPVPAIVA;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblTypeTitle;
    private javax.swing.JLabel lblWork;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtServiceID;
    private javax.swing.JTextField txtTotalCantidad;
    private javax.swing.JTextField txtTotalValor;
    private javax.swing.JTextField txtWorkID;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int page) throws PrinterException {
        if(page > 0)//Esto porque solo es una página que se imprime
        {
            return NO_SUCH_PAGE;
        }
        Graphics2D bot = (Graphics2D) graf;
        bot.translate(pagfor.getImageableX() + 30, pagfor.getImageableY()+ 30);
        bot.scale(0.8, 1.0);//Tamaño normal, si quisieramos el doble seria 2.0, 2.0
        Factura.this.printAll(graf);//Imprime todo lo que hay en el JPanel factura
        return PAGE_EXISTS;
        
    }

    /**
     * @return the dataOutCustomer
     */
    public String getDataOutCustomer() {
        return dataOutCustomer;
    }

    /**
     * @return the dataOutWork
     */
    public String getDataOutWork() {
        return dataOutWork;
    }

    /**
     * @return the dataTableOut
     */
    
    
    
}
