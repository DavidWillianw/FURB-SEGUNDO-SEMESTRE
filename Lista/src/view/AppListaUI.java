/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Produto;
import model.Disponivel;

/**
 *
 * @author sunse
 */
public class AppListaUI extends javax.swing.JFrame {

    Produto produto;

    /**
     * Creates new form AppUI
     */
    public AppListaUI() {
        initComponents();
        
    }

 public Produto getProduto() {
        return produto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        NmProduto = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dsProduto = new javax.swing.JLabel();
        TxtDescricao = new javax.swing.JTextField();
        vLProduto = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        Sim = new javax.swing.JRadioButton();
        Nao = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NmProduto.setText("Nome do Produto:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        dsProduto.setText("Descrição do Produto:");

        vLProduto.setText("Valor do Produto:");

        buttonGroup1.add(Sim);
        Sim.setText("Sim");
        Sim.setToolTipText("");
        Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimActionPerformed(evt);
            }
        });

        buttonGroup1.add(Nao);
        Nao.setText("Não");
        Nao.setToolTipText("");

        jLabel4.setText("Disponivel pra venda?");

        txtSalvar.setText("Cadastrar dados");
        txtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Sim)
                                .addGap(20, 20, 20)
                                .addComponent(Nao)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dsProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NmProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2))
                            .addComponent(vLProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(TxtDescricao)
                            .addComponent(txtValor))
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(txtSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NmProduto)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dsProduto)
                    .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vLProduto)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sim)
                    .addComponent(Nao))
                .addGap(18, 18, 18)
                .addComponent(txtSalvar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void SimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SimActionPerformed

    private void txtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalvarActionPerformed
        produto = new Produto();
        produto.setProduto(txtNome.getText());
        produto.setDescricao(TxtDescricao.getText());
        produto.setPreco(Double.parseDouble(txtValor.getText()));
        
        produto.incluirProduto(produto);
        

        if (Sim.isSelected()) {
            produto.setDisponivel(Disponivel.SIM);
        } else if (Nao.isSelected()) {
            produto.setDisponivel(Disponivel.NÃO);
        }
        
        
        ListaDeDados telaRelatorio = new ListaDeDados(this, true);   
        telaRelatorio.definirProduto(produto);
        telaRelatorio.setVisible(true);
        txtNome.setText("");
        TxtDescricao.setText("");
        txtValor.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_txtSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(AppListaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppListaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppListaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppListaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppListaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Nao;
    private javax.swing.JLabel NmProduto;
    private javax.swing.JRadioButton Sim;
    private javax.swing.JTextField TxtDescricao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dsProduto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNome;
    private javax.swing.JButton txtSalvar;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel vLProduto;
    // End of variables declaration//GEN-END:variables
}
