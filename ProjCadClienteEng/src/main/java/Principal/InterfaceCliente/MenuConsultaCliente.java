
package Principal.InterfaceCliente;

import Controler.Controlador;
import Entidades.Cliente;
import Principal.IntefaceProjeto.MenuProjetos;
import Servico.Exceptions.RemoveException;
import javax.swing.JOptionPane;

public class MenuConsultaCliente extends javax.swing.JFrame {

    private static MenuConsultaCliente menuConsultaCliente = null;

    private MenuConsultaCliente() {
        initComponents();
    }

    public static MenuConsultaCliente getMenuConsultaCliente() {
        if (menuConsultaCliente == null) {
            menuConsultaCliente = new MenuConsultaCliente();
        }
        return menuConsultaCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTelefoneCli = new javax.swing.JLabel();
        lbEmailCli = new javax.swing.JLabel();
        lbCpfCli = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        cxTelefoneCli = new javax.swing.JLabel();
        cxEmailCli = new javax.swing.JLabel();
        cxCpfCli = new javax.swing.JLabel();
        cxNomeCli = new javax.swing.JLabel();
        cxCpfBusca = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btRemoverCli = new javax.swing.JButton();
        btEditarCli = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSairMenuConsultaCliente = new javax.swing.JButton();
        btProj = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbConsultaCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Consulta Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lbTelefoneCli.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefoneCli.setText("Telefone:");

        lbEmailCli.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailCli.setText("Email:");

        lbCpfCli.setForeground(new java.awt.Color(255, 255, 255));
        lbCpfCli.setText("CPF:");

        lbNomeCli.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeCli.setText("Nome:");

        cxTelefoneCli.setForeground(new java.awt.Color(255, 255, 255));
        cxTelefoneCli.setText("...");

        cxEmailCli.setForeground(new java.awt.Color(255, 255, 255));
        cxEmailCli.setText("...");

        cxCpfCli.setForeground(new java.awt.Color(255, 255, 255));
        cxCpfCli.setText("...");

        cxNomeCli.setForeground(new java.awt.Color(255, 255, 255));
        cxNomeCli.setText("...");

        cxCpfBusca.setForeground(new java.awt.Color(51, 51, 51));
        cxCpfBusca.setText("Digite o CPF");
        cxCpfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfBuscaActionPerformed(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(102, 102, 102));
        btConsultar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btRemoverCli.setBackground(new java.awt.Color(102, 102, 102));
        btRemoverCli.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btRemoverCli.setForeground(new java.awt.Color(255, 255, 255));
        btRemoverCli.setText("Remover");
        btRemoverCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverCliActionPerformed(evt);
            }
        });

        btEditarCli.setBackground(new java.awt.Color(102, 102, 102));
        btEditarCli.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btEditarCli.setForeground(new java.awt.Color(255, 255, 255));
        btEditarCli.setText("Editar");
        btEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCliActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btLimpar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSairMenuConsultaCliente.setBackground(new java.awt.Color(102, 102, 102));
        btSairMenuConsultaCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairMenuConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btSairMenuConsultaCliente.setText("Sair");
        btSairMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuConsultaClienteActionPerformed(evt);
            }
        });

        btProj.setBackground(new java.awt.Color(102, 102, 102));
        btProj.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btProj.setForeground(new java.awt.Color(255, 255, 255));
        btProj.setText("Projetos");
        btProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbNomeCli)
                            .addGap(35, 35, 35)
                            .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbCpfCli)
                            .addGap(48, 48, 48)
                            .addComponent(cxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbEmailCli)
                            .addGap(38, 38, 38)
                            .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(lbTelefoneCli)
                            .addGap(18, 18, 18)
                            .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxCpfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConsultar)))
                .addGap(18, 18, 18)
                .addComponent(btProj)
                .addGap(18, 18, 18)
                .addComponent(btEditarCli)
                .addGap(18, 18, 18)
                .addComponent(btRemoverCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSairMenuConsultaCliente)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeCli)
                    .addComponent(cxNomeCli))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCpfCli)
                    .addComponent(cxCpfCli))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmailCli)
                    .addComponent(cxEmailCli))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTelefoneCli)
                    .addComponent(cxTelefoneCli))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCpfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btConsultar)
                                .addComponent(btProj)
                                .addComponent(btEditarCli))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btSairMenuConsultaCliente)
                                .addComponent(btLimpar)
                                .addComponent(btRemoverCli)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbConsultaCliente.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbConsultaCliente.setText("Consulta Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbConsultaCliente)
                .addGap(239, 239, 239))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lbConsultaCliente)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCpfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfBuscaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btRemoverCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverCliActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente remover?", "Confirmação de remoção", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            remover();
            limpar();
        }

        
    }//GEN-LAST:event_btRemoverCliActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCliActionPerformed
        Cliente cliente = verificaCliente();
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "O cliente não existe!", "ERROR", 0);

        } else {
            MenuAtualizarCliente.getMenuAtualizarCliente().setVisible(true);
            MenuAtualizarCliente.getMenuAtualizarCliente().impDados(cliente);
        }
    }//GEN-LAST:event_btEditarCliActionPerformed

    private void btSairMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuConsultaClienteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuConsultaClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuClientes.getMenuClientes().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpar();
        MenuClientes.getMenuClientes().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProjActionPerformed
        openProj();
    }//GEN-LAST:event_btProjActionPerformed

    public boolean openProj(){
    
        if (cxCpfBusca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            return false;
        }
        
        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpfBusca.getText());
        cliente = Controlador.getControlador().getServico().consultaCliente(cliente);
        if(cliente!= null){
            MenuProjetos.getMenuProjetos().insereDadosCliente(cliente);
            MenuProjetos.getMenuProjetos().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "O cliente não está cadastrado!", "ERROR", 0);
            return false;
        }
        return true;
    }
     
    
    public void sair(){
        this.dispose();
    }
    
    public Cliente verificaCliente() {
        if (cxCpfBusca.getText().isEmpty()) {
            return null;
        }
        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpfBusca.getText());
        cliente = Controlador.getControlador().getServico().consultaCliente(cliente);
        return cliente;
    }

    public void limpar() {

        cxCpfBusca.setText("Digite o CPF");
        cxNomeCli.setText("...");
        cxCpfCli.setText("...");
        cxEmailCli.setText("...");
        cxTelefoneCli.setText("...");

    }

    public boolean remover() {

        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpfBusca.getText());

        if (cxCpfBusca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            return false;
        }

        try {
            Controlador.getControlador().getServico().removeCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!", "Removido", 1);
        } catch (RemoveException re) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "ERROR", 0);
            return false;
        }

        return true;
    }

    public void consultar() {
        Cliente cliente = new Cliente();

        cliente.setCpf(cxCpfBusca.getText());

        cliente = Controlador.getControlador().getServico().consultaCliente(cliente);

        if (cliente != null) {
            cxNomeCli.setText(cliente.getNome());
            cxCpfCli.setText(cliente.getCpf());
            cxEmailCli.setText(cliente.getEmail());
            cxTelefoneCli.setText(cliente.getTelefone());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "ERROR", 0);
        }

    }

    public void consultaAtualizada(Cliente cliente) {
        cxNomeCli.setText(cliente.getNome());
        cxCpfCli.setText(cliente.getCpf());
        cxEmailCli.setText(cliente.getEmail());
        cxTelefoneCli.setText(cliente.getTelefone());
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
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditarCli;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btProj;
    private javax.swing.JButton btRemoverCli;
    private javax.swing.JButton btSairMenuConsultaCliente;
    private javax.swing.JTextField cxCpfBusca;
    private javax.swing.JLabel cxCpfCli;
    private javax.swing.JLabel cxEmailCli;
    private javax.swing.JLabel cxNomeCli;
    private javax.swing.JLabel cxTelefoneCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbConsultaCliente;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
