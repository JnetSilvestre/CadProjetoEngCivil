
package Principal.IntefaceFuncionario;

import Controler.Controlador;
import Entidades.Arquiteto;
import Entidades.Engenheiro;
import Entidades.FuncGerais;
import Entidades.Funcionario;
import Servico.Exceptions.CadException;
import javax.swing.JOptionPane;

public class MenuCadastroFuncionarios extends javax.swing.JFrame {

    private static MenuCadastroFuncionarios menuCadastroFuncionarios = null;

    private MenuCadastroFuncionarios() {
        initComponents();
    }

    public static MenuCadastroFuncionarios getMenuCadastroFuncionarios() {

        if (menuCadastroFuncionarios == null) {
            menuCadastroFuncionarios = new MenuCadastroFuncionarios();
        }

        return menuCadastroFuncionarios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSairMenuFunc = new javax.swing.JButton();
        lbNomeFunc = new javax.swing.JLabel();
        cxNomeFunc = new javax.swing.JTextField();
        opcFunc = new javax.swing.JComboBox<>();
        btCadastrarFunc = new javax.swing.JButton();
        lbId = new javax.swing.JLabel();
        cxCod = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        lbHora = new javax.swing.JLabel();
        cxHoraTrabalhada = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbFunc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Cadastro de Funcionários");
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

        btSairMenuFunc.setBackground(new java.awt.Color(102, 102, 102));
        btSairMenuFunc.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairMenuFunc.setForeground(new java.awt.Color(255, 255, 255));
        btSairMenuFunc.setText("Sair");
        btSairMenuFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuFuncActionPerformed(evt);
            }
        });

        lbNomeFunc.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNomeFunc.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeFunc.setText("Nome: ");

        opcFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engenheiro", "Arquiteto", "Funcionário Geral" }));
        opcFunc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcFuncItemStateChanged(evt);
            }
        });
        opcFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcFuncActionPerformed(evt);
            }
        });

        btCadastrarFunc.setBackground(new java.awt.Color(102, 102, 102));
        btCadastrarFunc.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btCadastrarFunc.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrarFunc.setText("Cadastrar");
        btCadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncActionPerformed(evt);
            }
        });

        lbId.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbId.setForeground(new java.awt.Color(255, 255, 255));
        lbId.setText("CREA:");

        cxCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodActionPerformed(evt);
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

        lbHora.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        lbHora.setForeground(new java.awt.Color(255, 255, 255));
        lbHora.setText("Hora Trabalhada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeFunc)
                    .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 41, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCadastrarFunc)))
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSairMenuFunc)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxHoraTrabalhada, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeFunc)
                    .addComponent(cxNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHora)
                    .addComponent(cxHoraTrabalhada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarFunc)
                    .addComponent(btLimpar)
                    .addComponent(btSairMenuFunc))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbFunc.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbFunc.setForeground(new java.awt.Color(255, 255, 255));
        lbFunc.setText("Cadastro de Funcionários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(lbFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbFunc)
                .addContainerGap(21, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairMenuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuFuncActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuFuncActionPerformed

    public void sair() {
        this.dispose();
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuFuncionario.getMenuFuncionario().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpar();
        MenuFuncionario.getMenuFuncionario().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btCadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncActionPerformed
        cadastrar();
        MenuListaFuncionarios.getMenuListaFuncionarios().listaTabelas();
    }//GEN-LAST:event_btCadastrarFuncActionPerformed

    private void cxCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodActionPerformed

    private void opcFuncItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcFuncItemStateChanged

        switch ((String) opcFunc.getSelectedItem()) {

            case "Engenheiro":
                lbId.setText("CREA:");
                break;

            case "Arquiteto":
                lbId.setText("Código Registro:");
                break;

            case "Funcionário Geral":
                lbId.setText("CPF:");
                break;
        }
    }//GEN-LAST:event_opcFuncItemStateChanged

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void opcFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcFuncActionPerformed

    public void limpar() {
        cxNomeFunc.setText("");
        cxCod.setText("");
        cxHoraTrabalhada.setText("");
        cxNomeFunc.requestFocus();
    }

    public boolean cadastrar() {

        if (cxCod.getText().isEmpty() || cxNomeFunc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todas os campos precisam ser preenchidos", "ERROR", 0);
            return false;
        }
        try {
            if ((Double.parseDouble(cxHoraTrabalhada.getText()) < 0)) {
                JOptionPane.showMessageDialog(null, "Erro no Cadastro! A hora trabalhada precisa ser positiva ou o serapada por ponto.", "ERROR", 0);
                return false;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Erro no Cadastro! o código precisa ser um número separado por ponto.", "ERROR", 0);
            cxHoraTrabalhada.requestFocus();
            cxHoraTrabalhada.setText("0.0");
            return false;
        }

        Funcionario funcCad = null;
        if (((String) (opcFunc.getSelectedItem())).equals("Engenheiro")) {
            Engenheiro eng = new Engenheiro();
            eng.setNome(cxNomeFunc.getText());
            eng.setCrea(cxCod.getText());
            eng.setHoraTrabalhada(Double.parseDouble(cxHoraTrabalhada.getText()));
            funcCad = eng;
        } else if (((String) (opcFunc.getSelectedItem())).equals("Arquiteto")) {
            Arquiteto arq = new Arquiteto();
            arq.setNome(cxNomeFunc.getText());
            arq.setCodRegistro(cxCod.getText());
            arq.setHoraTrabalhada(Double.parseDouble(cxHoraTrabalhada.getText()));
            funcCad = arq;
        } else {

            FuncGerais func = new FuncGerais();
            func.setNome(cxNomeFunc.getText());
            func.setCpf(cxCod.getText());
            func.setHoraTrabalhada(Double.parseDouble(cxHoraTrabalhada.getText()));
            funcCad = func;
        }

        try {
            Controlador.getControlador().getServico().cadFuncionario(funcCad);
            JOptionPane.showMessageDialog(null, "Cadastro Concluído!", "Cadastrado", 1);
            limpar();
            return true;

        } catch (CadException ce) {
            JOptionPane.showMessageDialog(null, "Erro no Cadastro! Identificador repetido no banco.", "ERROR", 0);
            cxCod.requestFocus();
        }

        return false;
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
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarFunc;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSairMenuFunc;
    private javax.swing.JTextField cxCod;
    private javax.swing.JTextField cxHoraTrabalhada;
    private javax.swing.JTextField cxNomeFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbFunc;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNomeFunc;
    private javax.swing.JComboBox<String> opcFunc;
    // End of variables declaration//GEN-END:variables
}
