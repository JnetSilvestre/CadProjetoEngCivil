
package Principal.IntefaceFuncionario;

import Controler.Controlador;
import Entidades.Arquiteto;
import Entidades.Engenheiro;
import Entidades.FuncGerais;
import Entidades.Funcionario;
import Servico.Exceptions.AtualizaException;
import javax.swing.JOptionPane;

public class MenuAtualizarFuncionario extends javax.swing.JFrame {

    private static MenuAtualizarFuncionario menuAtualizarFuncionario = null;

    private MenuAtualizarFuncionario() {
        initComponents();
    }

    public static MenuAtualizarFuncionario getMenuAtualizarFuncionario() {

        if (menuAtualizarFuncionario == null) {
            menuAtualizarFuncionario = new MenuAtualizarFuncionario();
        }

        return menuAtualizarFuncionario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        cxCod = new javax.swing.JLabel();
        lbNomeFunc = new javax.swing.JLabel();
        lbCod = new javax.swing.JLabel();
        lbHT = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxHT = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        brSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Atualizar");
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

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        cxCod.setForeground(new java.awt.Color(255, 255, 255));
        cxCod.setText("...");

        lbNomeFunc.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeFunc.setText("Nome: ");

        lbCod.setForeground(new java.awt.Color(255, 255, 255));
        lbCod.setText("CREA: ");

        lbHT.setForeground(new java.awt.Color(255, 255, 255));
        lbHT.setText("Hora trabalhada:");

        btAtualizar.setBackground(new java.awt.Color(102, 102, 102));
        btAtualizar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        brSair.setBackground(new java.awt.Color(102, 102, 102));
        brSair.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        brSair.setForeground(new java.awt.Color(255, 255, 255));
        brSair.setText("Sair");
        brSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNomeFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbHT)
                        .addGap(30, 30, 30)
                        .addComponent(cxHT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addGap(18, 18, 18)
                .addComponent(brSair)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeFunc)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCod)
                    .addComponent(cxCod))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbHT))
                    .addComponent(cxHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brSair)
                    .addComponent(btAtualizar))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atualiza Funcionário");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (atualizar()) {
            Funcionario func = capturaDados();
            MenuConsultaFuncionario.getMenuConsultaFuncionario().consultaAtualizada(func);
            sair();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void brSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_brSairActionPerformed

    public void sair() {
        this.dispose();
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuConsultaFuncionario.getMenuConsultaFuncionario().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuConsultaFuncionario.getMenuConsultaFuncionario().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public boolean atualizar() {

        int resp = JOptionPane.showConfirmDialog(null, "Todos os campos serão atualizados. Deseja realmente Atualizar? ", "Confirmação de Atualização", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {

            try {
                if ((Double.parseDouble(cxHT.getText()) < 0)) {
                    JOptionPane.showMessageDialog(null, "Erro na Atualização! A hora trabalhada precisa ser positiva ou separada por ponto.", "ERROR", 0);
                    return false;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Erro na Atualização! o código precisa ser um número separado por ponto.", "ERROR", 0);
                cxHT.requestFocus();
                cxHT.setText("0.0");
                return false;
            }

            Funcionario funcAt = null;
            switch (lbCod.getText()) {

                case "CREA:":
                    Engenheiro eng = new Engenheiro();
                    eng.setNome(cxNome.getText());
                    eng.setCrea(cxCod.getText());
                    eng.setHoraTrabalhada(Double.parseDouble(cxHT.getText()));
                    funcAt = eng;
                    break;

                case "Código Registro:":
                    Arquiteto arq = new Arquiteto();
                    arq.setNome(cxNome.getText());
                    arq.setCodRegistro(cxCod.getText());
                    arq.setHoraTrabalhada(Double.parseDouble(cxHT.getText()));
                    funcAt = arq;
                    break;

                case "CPF:":
                    FuncGerais func = new FuncGerais();
                    func.setNome(cxNome.getText());
                    func.setCpf(cxCod.getText());
                    func.setHoraTrabalhada(Double.parseDouble(cxHT.getText()));
                    funcAt = func;
                    break;

            }
                      
            try {
                Controlador.getControlador().getServico().atualizaFuncionario(funcAt);
                return true;
            } catch (AtualizaException ae) {
                JOptionPane.showMessageDialog(null, "Erro Encontrado!", "ERROR", 0);
            }

        }
        return false;
    }

    public void impDados(Funcionario func) {
        if (func.getClass() == new Engenheiro().getClass()) {
            cxNome.setText(((Engenheiro) func).getNome());
            lbCod.setText("CREA:");
            cxCod.setText(((Engenheiro) func).getCrea());
            cxHT.setText(((Engenheiro) func).getHoraTrabalhada().toString());
        } else if (func.getClass() == new Arquiteto().getClass()) {
            cxNome.setText(((Arquiteto) func).getNome());
            lbCod.setText("Código Registro:");
            cxCod.setText(((Arquiteto) func).getCodRegistro());
            cxHT.setText(((Arquiteto) func).getHoraTrabalhada().toString());
        } else {
            cxNome.setText(((FuncGerais) func).getNome());
            lbCod.setText("CPF:");
            cxCod.setText(((FuncGerais) func).getCpf());
            cxHT.setText(((FuncGerais) func).getHoraTrabalhada().toString());
        }
    }

    public Funcionario capturaDados() {
        Funcionario funAux = null;
            switch (lbCod.getText()) {

                case "CREA:":
                    Engenheiro eng = new Engenheiro();
                    eng.setNome(cxNome.getText());
                    eng.setCrea(cxCod.getText());
                    eng.setHoraTrabalhada(Double.parseDouble(cxHT.getText()));
                    funAux = eng;
                    break;

                case "Código Registro:":
                    Arquiteto arq = new Arquiteto();
                    arq.setNome(cxNome.getText());
                    arq.setCodRegistro(cxCod.getText());
                    arq.setHoraTrabalhada(Double.parseDouble(cxHT.getText()));
                    funAux = arq;
                    break;

                case "CPF:":
                    FuncGerais func = new FuncGerais();
                    func.setNome(cxNome.getText());
                    func.setCpf(cxCod.getText());
                    func.setHoraTrabalhada(Double.parseDouble(cxHT.getText()));
                    funAux = func;
                    break;

            }
            return funAux;
    }
    
    
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
            java.util.logging.Logger.getLogger(MenuAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAtualizarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brSair;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btAtualizarCli;
    private javax.swing.JButton btAtualizarCli1;
    private javax.swing.JLabel cxCod;
    private javax.swing.JLabel cxCpfCli;
    private javax.swing.JLabel cxCpfCli1;
    private javax.swing.JTextField cxEmailCli;
    private javax.swing.JTextField cxEmailCli1;
    private javax.swing.JTextField cxHT;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeCli;
    private javax.swing.JTextField cxNomeCli1;
    private javax.swing.JTextField cxTelefoneCli;
    private javax.swing.JTextField cxTelefoneCli1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbCpfCli;
    private javax.swing.JLabel lbCpfCli1;
    private javax.swing.JLabel lbEmailCli;
    private javax.swing.JLabel lbEmailCli1;
    private javax.swing.JLabel lbHT;
    private javax.swing.JLabel lbNomeCli;
    private javax.swing.JLabel lbNomeCli1;
    private javax.swing.JLabel lbNomeFunc;
    private javax.swing.JLabel lbTelefoneCli;
    private javax.swing.JLabel lbTelefoneCli1;
    // End of variables declaration//GEN-END:variables
}
