package com.senac.pi.views;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import com.senac.pi.model.bo.CadastrarProduto;
import static com.senac.pi.model.bo.CadastrarProduto.searchRecordSize;
import com.senac.pi.controller.Jtable.JtableProduto;

public final class FrmCadastrarProd extends javax.swing.JInternalFrame {

    private CadastrarProduto produto;
    private final JtableProduto instanceJtable;
    private final FrmCadastrarPJ FrmFornecedor;

    public FrmCadastrarProd(FrmCadastrarPJ Frm) {
        this.FrmFornecedor = Frm;
        this.produto = new CadastrarProduto();
        initComponents();
        this.getTxtIdFornecedor().setText(Frm.getTxtID().getText());
        this.getTxtFornecedor().setText(Frm.getTxtRazaoS().getText());
        Integer totalDeRegistros = searchRecordSize(Frm.getTxtID().getText());
        this.lblTotalDeRegistros.setText(totalDeRegistros.toString());
        this.instanceJtable = new JtableProduto(this);
        this.instanceJtable.searchRecord(Frm.getTxtID().getText());
        this.setVisible(true);
//        instanceJtable.popularJtable();
    }

    public FrmCadastrarProd(JtableProduto instanceJtable, FrmCadastrarPJ FrmFornecedor) {
        this.FrmFornecedor = FrmFornecedor;
        this.produto = new CadastrarProduto();
        initComponents();
        this.instanceJtable = new JtableProduto(this);
        this.setVisible(true);
        instanceJtable.popularJtable();
    }

    //
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        txtIdFornecedor = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cboCategoria1 = new javax.swing.JComboBox();
        btnInsertProd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbFiltroCategoria = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTotalDeRegistros = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Produto");
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel9.setText("Marca");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel10.setText("Modelo");

        jLabel5.setText("Tipo");

        jLabel6.setText("Cor");

        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço");

        jLabel3.setText("Dessconto");

        txtGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarantiaActionPerformed(evt);
            }
        });

        jLabel11.setText("Garantia");

        jLabel4.setText("Quantidade disponivel em estoque");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        jLabel7.setText("Descricao");

        jLabel13.setText("Fabricado em:");

        jLabel14.setText("Valido até:");

        txtFornecedor.setEditable(false);
        txtFornecedor.setText("Nome do Fornecedor");

        txtIdFornecedor.setEditable(false);

        jButton3.setText("Imprimir");

        cboCategoria1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoria", "Beleza e Saúde ", "Comida e Bebida", "Lazer e Turismo", "Serviços" }));
        cboCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoria1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(242, 242, 242)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel2);

        btnInsertProd.setText("Salvar");
        btnInsertProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertProd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(530, 530, 530))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnInsertProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbFiltroCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoria", "Beleza e Saúde ", "Comida e Bebida", "Lazer e Turismo", "Serviços" }));
        cmbFiltroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroCategoriaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTotalDeRegistros.setText("Qtd.");

        jLabel8.setText("Registro(s)");

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProduto);

        jButton2.setText("Imprimir tudo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTotalDeRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltroCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTotalDeRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarantiaActionPerformed

    private void btnInsertProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertProdActionPerformed
        if (!this.getTxtNome().getText().isEmpty()) {
            getProduto().creat(
                    this.getTxtIdFornecedor().getText(),
                    this.getTxtNome().getText(),
                    this.getCboCategoria().getSelectedItem().toString(),
                    this.getTxtMarca().getText(),
                    this.getTxtModelo().getText(),
                    this.getTxtTipo().getText(),
                    this.getTxtCor().getText(),
                    parseDouble(this.getTxtPreco().getText()),
                    parseInt(this.getTxtDesc().getText()),
                    this.getTxtGarantia().getText());
            instanceJtable.updateJtable();
        }
    }//GEN-LAST:event_btnInsertProdActionPerformed

    private void cmbFiltroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroCategoriaActionPerformed
        instanceJtable.searchRecordFiltro(this.getCboCategoria().getSelectedItem().toString(), this.FrmFornecedor.getTxtID().getText());
    }//GEN-LAST:event_cmbFiltroCategoriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!this.txtBuscar.getText().trim().isEmpty()) {
            instanceJtable.searchRecord(this.getTxtBuscar().getText().trim(), this.FrmFornecedor.getTxtID().getText().trim());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cboCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoria1ActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        /*// Visibilidade dos botões.*/
        int linha_selecionada = jTableProduto.getSelectedRow();
        this.getTxtNome().setText(jTableProduto.getValueAt(linha_selecionada, 0).toString());
        this.getTxtMarca().setText(jTableProduto.getValueAt(linha_selecionada, 1).toString());
        this.getTxtModelo().setText(jTableProduto.getValueAt(linha_selecionada, 2).toString());
        this.getTxtPreco().setText(jTableProduto.getValueAt(linha_selecionada, 3).toString());
        this.getTxtDesc().setText(jTableProduto.getValueAt(linha_selecionada, 4).toString());
        this.getTxtDescricao().setText(jTableProduto.getValueAt(linha_selecionada, 5).toString());
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInsertProd;
    private javax.swing.JComboBox cboCategoria1;
    private javax.swing.JComboBox cmbFiltroCategoria;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JLabel lblTotalDeRegistros;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JSpinner txtQuant;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getTxtCor() {
        return txtCor;
    }

    public void setTxtCor(javax.swing.JTextField txtCor) {
        this.txtCor = txtCor;
    }

    public javax.swing.JTextField getTxtDesc() {
        return txtDesc;
    }

    public void setTxtDesc(javax.swing.JTextField txtDesc) {
        this.txtDesc = txtDesc;
    }

    public javax.swing.JTextArea getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(javax.swing.JTextArea txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public javax.swing.JTextField getTxtGarantia() {
        return txtGarantia;
    }

    public void setTxtGarantia(javax.swing.JTextField txtGarantia) {
        this.txtGarantia = txtGarantia;
    }

    public javax.swing.JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(javax.swing.JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public javax.swing.JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(javax.swing.JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public javax.swing.JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(javax.swing.JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public javax.swing.JTextField getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(javax.swing.JTextField txtPreco) {
        this.txtPreco = txtPreco;
    }

    public javax.swing.JSpinner getTxtQuant() {
        return txtQuant;
    }

    public void setTxtQuant(javax.swing.JSpinner txtQuant) {
        this.txtQuant = txtQuant;
    }

    public javax.swing.JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(javax.swing.JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public javax.swing.JTextField getTxtFornecedor() {
        return txtFornecedor;
    }

    public void setTxtFornecedor(javax.swing.JTextField txtFornecedor) {
        this.txtFornecedor = txtFornecedor;
    }

    public CadastrarProduto getProduto() {
        return produto;
    }

    public void setProduto(CadastrarProduto obj) {
        this.produto = obj;
    }

    public javax.swing.JButton getBtnInsertProd() {
        return btnInsertProd;
    }

    public void setBtnInsertProd(javax.swing.JButton btnInsertProd) {
        this.btnInsertProd = btnInsertProd;
    }

    public javax.swing.JComboBox getCboCategoria() {
        return cmbFiltroCategoria;
    }

    public void setCboCategoria(javax.swing.JComboBox cboCategoria) {
        this.cmbFiltroCategoria = cboCategoria;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public javax.swing.JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(javax.swing.JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public javax.swing.JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(javax.swing.JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(javax.swing.JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public javax.swing.JTextField getTxtIdFornecedor() {
        return txtIdFornecedor;
    }

    public void setTxtIdFornecedor(javax.swing.JTextField txtIdFornecedor) {
        this.txtIdFornecedor = txtIdFornecedor;
    }

    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(javax.swing.JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public javax.swing.JComboBox getCmbFiltroCategoria() {
        return cmbFiltroCategoria;
    }

    public void setCmbFiltroCategoria(javax.swing.JComboBox cmbFiltroCategoria) {
        this.cmbFiltroCategoria = cmbFiltroCategoria;
    }

    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public javax.swing.JTable getjTableProduto() {
        return jTableProduto;
    }

    public void setjTableProduto(javax.swing.JTable jTableProduto) {
        this.jTableProduto = jTableProduto;
    }

    public javax.swing.JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(javax.swing.JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }
    private static final Logger LOG = getLogger(FrmCadastrarProd.class.getName());
}
