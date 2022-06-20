
package Principal.InterfaceCliente;

import Controler.Controlador;
import Entidades.Cliente;
import Servico.Exceptions.CadException;
import javax.swing.JOptionPane;

public class MenuCadastroClientes extends javax.swing.JFrame {
    
    public static MenuCadastroClientes menuCadastroClientes = null;

    private MenuCadastroClientes() {
        initComponents();
    }
    
    public static MenuCadastroClientes getMenuCadastroClientes(){
        if(menuCadastroClientes == null){
            menuCadastroClientes = new MenuCadastroClientes();
        }
        return menuCadastroClientes;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel1 = new javax.swing.JPanel();
        cxTelefoneCli = new javax.swing.JTextField();
        lbTelefoneCli = new javax.swing.JLabel();
        lbEmailCli = new javax.swing.JLabel();
        cxEmailCli = new javax.swing.JTextField();
        cxCpfCli = new javax.swing.JTextField();
        lbCpfCli = new javax.swing.JLabel();
        lbNomeCli = new javax.swing.JLabel();
        cxNomeCli = new javax.swing.JTextField();
        btCadastrarCliente = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSairCadClientes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbCadastroCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Clientes");
        setBackground(new java.awt.Color(255, 255, 255));
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

        Painel1.setBackground(new java.awt.Color(0, 0, 0));

        cxTelefoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneCliActionPerformed(evt);
            }
        });

        lbTelefoneCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTelefoneCli.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefoneCli.setText("Telefone: ");

        lbEmailCli.setBackground(new java.awt.Color(255, 255, 255));
        lbEmailCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbEmailCli.setForeground(new java.awt.Color(255, 255, 255));
        lbEmailCli.setText("Email: ");

        cxEmailCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmailCliActionPerformed(evt);
            }
        });

        cxCpfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfCliActionPerformed(evt);
            }
        });

        lbCpfCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCpfCli.setForeground(new java.awt.Color(255, 255, 255));
        lbCpfCli.setText("CPF: ");

        lbNomeCli.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNomeCli.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeCli.setText("Nome: ");

        cxNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeCliActionPerformed(evt);
            }
        });

        btCadastrarCliente.setBackground(new java.awt.Color(102, 102, 102));
        btCadastrarCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrarCliente.setText("Cadastrar");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
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

        btSairCadClientes.setBackground(new java.awt.Color(102, 102, 102));
        btSairCadClientes.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairCadClientes.setForeground(new java.awt.Color(255, 255, 255));
        btSairCadClientes.setText("Sair");
        btSairCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btCadastrarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSairCadClientes))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addComponent(lbEmailCli)
                        .addGap(51, 51, 51)
                        .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addComponent(lbTelefoneCli)
                        .addGap(30, 30, 30)
                        .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeCli))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpfCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbEmailCli))
                    .addComponent(cxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbTelefoneCli))
                    .addComponent(cxTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSairCadClientes)
                    .addComponent(btCadastrarCliente))
                .addGap(21, 21, 21))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lbCadastroCliente.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbCadastroCliente.setText("Cadastro Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lbCadastroCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lbCadastroCliente)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadClientesActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairCadClientesActionPerformed

    private void cxEmailCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEmailCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEmailCliActionPerformed

    private void cxNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeCliActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
     cadastrar();
     
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxCpfCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfCliActionPerformed

    private void cxTelefoneCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefoneCliActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuClientes.getMenuClientes().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpar();
        MenuClientes.getMenuClientes().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public void limpar(){
    cxNomeCli.setText("");
    cxCpfCli.setText("");
    cxEmailCli.setText("");
    cxTelefoneCli.setText("");
    cxNomeCli.requestFocus();

    }
    
    public boolean cadastrar(){
        Cliente cliente = new Cliente();
        
        cliente.setNome(cxNomeCli.getText());
        cliente.setCpf(cxCpfCli.getText());
        cliente.setEmail(cxEmailCli.getText());
        cliente.setTelefone(cxTelefoneCli.getText());
        
        if(cxCpfCli.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            cxCpfCli.requestFocus();
            return false;
        }
  
        try{
        Controlador.getControlador().getServico().addCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ", "Cadastrado", 1);
        limpar();
        }
        catch(CadException ce){
             JOptionPane.showMessageDialog(null, "O Cadastro não deu certo! Verifique o código.", "ERROR", 0);
             cxCpfCli.requestFocus();
        }
        
        
        return true;
    
    }
    
    public void sair() {
        this.dispose();
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
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel1;
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSairCadClientes;
    private javax.swing.JTextField cxCpfCli;
    private javax.swing.JTextField cxEmailCli;
    private javax.swing.JTextField cxNomeCli;
    private javax.swing.JTextField cxTelefoneCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCadastroCliente;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
