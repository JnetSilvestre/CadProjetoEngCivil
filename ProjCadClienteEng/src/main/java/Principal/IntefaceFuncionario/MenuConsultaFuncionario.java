
package Principal.IntefaceFuncionario;

import Controler.Controlador;
import Entidades.Arquiteto;
import Entidades.Engenheiro;
import Entidades.FuncGerais;
import Entidades.Funcionario;
import Servico.Exceptions.RemoveException;
import javax.swing.JOptionPane;

public class MenuConsultaFuncionario extends javax.swing.JFrame {

    private static MenuConsultaFuncionario menuConsultaFuncionario = null;

    private MenuConsultaFuncionario() {
        initComponents();
    }

    public static MenuConsultaFuncionario getMenuConsultaFuncionario() {
        if (menuConsultaFuncionario == null) {
            menuConsultaFuncionario = new MenuConsultaFuncionario();
        }
        return menuConsultaFuncionario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lbToltalSalario = new javax.swing.JLabel();
        lbHT = new javax.swing.JLabel();
        lbCod = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        cxTotalSalario = new javax.swing.JLabel();
        cxHT = new javax.swing.JLabel();
        cxCod = new javax.swing.JLabel();
        cxNome = new javax.swing.JLabel();
        cxCodIdentificador = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSairMenuConsultaCliente = new javax.swing.JButton();
        opcFunc = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        lbConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Consulta Funcionário");
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

        lbToltalSalario.setForeground(new java.awt.Color(255, 255, 255));
        lbToltalSalario.setText("Total Salário");

        lbHT.setForeground(new java.awt.Color(255, 255, 255));
        lbHT.setText("Hora Trabalhada");

        lbCod.setForeground(new java.awt.Color(255, 255, 255));
        lbCod.setText("CREA: ");

        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome:");

        cxTotalSalario.setForeground(new java.awt.Color(255, 255, 255));
        cxTotalSalario.setText("...");

        cxHT.setForeground(new java.awt.Color(255, 255, 255));
        cxHT.setText("...");

        cxCod.setForeground(new java.awt.Color(255, 255, 255));
        cxCod.setText("...");

        cxNome.setForeground(new java.awt.Color(255, 255, 255));
        cxNome.setText("...");

        cxCodIdentificador.setForeground(new java.awt.Color(51, 51, 51));
        cxCodIdentificador.setText("Digite o ID");
        cxCodIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodIdentificadorActionPerformed(evt);
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

        btRemover.setBackground(new java.awt.Color(102, 102, 102));
        btRemover.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btRemover.setForeground(new java.awt.Color(255, 255, 255));
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(102, 102, 102));
        btEditar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
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

        opcFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engenheiro", "Arquiteto", "Funcionário Geral" }));
        opcFunc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcFuncItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lbCod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lbNome)
                        .addGap(157, 157, 157)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(opcFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cxCodIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btConsultar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSairMenuConsultaCliente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(lbHT))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(lbToltalSalario)))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTotalSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxHT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCod)
                    .addComponent(cxCod))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHT)
                    .addComponent(cxHT))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbToltalSalario)
                    .addComponent(cxTotalSalario))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(opcFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cxCodIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btConsultar)
                .addGap(18, 18, 18)
                .addComponent(btRemover)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLimpar)
                            .addComponent(btSairMenuConsultaCliente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        lbConsulta.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lbConsulta.setText("Consulta Funcionário");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lbConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbConsulta)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuFuncionario.getMenuFuncionario().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpar();
        MenuFuncionario.getMenuFuncionario().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void opcFuncItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcFuncItemStateChanged

        switch ((String) opcFunc.getSelectedItem()) {

            case "Engenheiro":
                lbCod.setText("CREA:");
                break;

            case "Arquiteto":
                lbCod.setText("Código Registro:");
                break;

            case "Funcionário Geral":
                lbCod.setText("CPF:");
                break;
        }
    }//GEN-LAST:event_opcFuncItemStateChanged

    private void btSairMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuConsultaClienteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            limpar();
            sair();
        }
    }//GEN-LAST:event_btSairMenuConsultaClienteActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        Funcionario func = null;

        func = verificaFuncionario();

        if (func == null) {
            JOptionPane.showMessageDialog(null, "O funcionário não existe!", "ERROR", 0);

        } else {
            MenuAtualizarFuncionario.getMenuAtualizarFuncionario().setVisible(true);
            MenuAtualizarFuncionario.getMenuAtualizarFuncionario().impDados(func);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente remover?", "Confirmação de remoção", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            remover();
            limpar();
        }

    }//GEN-LAST:event_btRemoverActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cxCodIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodIdentificadorActionPerformed

    public Funcionario verificaFuncionario() {
        if (cxCodIdentificador.getText().isEmpty()) {
            return null;
        }
        Funcionario func = null;
        switch ((String) opcFunc.getSelectedItem()) {

            case "Engenheiro":
                Engenheiro eng = new Engenheiro();
                eng.setCrea(cxCodIdentificador.getText());
                func = eng;
                break;

            case "Arquiteto":
                Arquiteto arq = new Arquiteto();
                arq.setCodRegistro(cxCodIdentificador.getText());
                func = arq;
                break;

            case "Funcionário Geral":
                FuncGerais funcGerais = new FuncGerais();
                funcGerais.setCpf(cxCodIdentificador.getText());
                func = funcGerais;
                break;
        }
        func = Controlador.getControlador().getServico().consultaFuncionario(func);
        return func;
    }

    public void consultaAtualizada(Funcionario func) {
        if (func.getClass() == new Engenheiro().getClass()) {
            cxNome.setText(((Engenheiro) func).getNome());
            lbCod.setText("CREA:");
            cxCod.setText(((Engenheiro) func).getCrea());
            cxHT.setText(((Engenheiro) func).getHoraTrabalhada().toString());
            cxTotalSalario.setText(((Engenheiro) func).getSalario().toString());
        } else if (func.getClass() == new Arquiteto().getClass()) {
            cxNome.setText(((Arquiteto) func).getNome());
            lbCod.setText("Código Registro:");
            cxCod.setText(((Arquiteto) func).getCodRegistro());
            cxHT.setText(((Arquiteto) func).getHoraTrabalhada().toString());
            cxTotalSalario.setText(((Arquiteto) func).getSalario().toString());
        } else {
            cxNome.setText(((FuncGerais) func).getNome());
            lbCod.setText("CPF:");
            cxCod.setText(((FuncGerais) func).getCpf());
            cxHT.setText(((FuncGerais) func).getHoraTrabalhada().toString());
            cxTotalSalario.setText(((FuncGerais) func).getSalario().toString());
        }

    }

    public void limpar() {
        cxNome.setText("...");
        cxCod.setText("...");
        cxHT.setText("...");
        cxTotalSalario.setText("...");
        cxCodIdentificador.setText("Digite o ID");
        cxCodIdentificador.requestFocus();
    }

    public void sair() {
        this.dispose();
    }

    public void consultar() {

        switch (((String) opcFunc.getSelectedItem())) {

            case "Engenheiro":
                Engenheiro eng = new Engenheiro();
                eng.setCrea(cxCodIdentificador.getText());
                eng = (Engenheiro) Controlador.getControlador().getServico().consultaFuncionario(eng);
                if (eng != null) {
                    cxNome.setText(eng.getNome());
                    cxCod.setText(eng.getCrea());
                    cxHT.setText(eng.getHoraTrabalhada().toString());
                    cxTotalSalario.setText(eng.getSalario().toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na consulta! Não existe engenherio com esse Crea.", "ERROR", 0);
                    cxCodIdentificador.requestFocus();
                }

                break;

            case "Arquiteto":
                Arquiteto arq = new Arquiteto();
                arq.setCodRegistro(cxCodIdentificador.getText());
                arq = (Arquiteto) Controlador.getControlador().getServico().consultaFuncionario(arq);
                if (arq != null) {
                    cxNome.setText(arq.getNome());
                    cxCod.setText(arq.getCodRegistro());
                    cxHT.setText(arq.getHoraTrabalhada().toString());
                    cxTotalSalario.setText(arq.getSalario().toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na consulta! Não existe arquiteto com esse Código de Registro.", "ERROR", 0);
                    cxCodIdentificador.requestFocus();
                }

                break;

            case "Funcionário Geral":
                FuncGerais func = new FuncGerais();
                func.setCpf(cxCodIdentificador.getText());
                func = (FuncGerais) Controlador.getControlador().getServico().consultaFuncionario(func);
                if (func != null) {
                    cxNome.setText(func.getNome());
                    cxCod.setText(func.getCpf());
                    cxHT.setText(func.getHoraTrabalhada().toString());
                    cxTotalSalario.setText(func.getSalario().toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na consulta! Não existe Funcionário com esse CPF.", "ERROR", 0);
                    cxCodIdentificador.requestFocus();
                }

                break;
        }

    }

    public boolean remover() {

        if (cxCodIdentificador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            return false;
        }

        Funcionario func = null;

        switch (((String) opcFunc.getSelectedItem())) {

            case "Engenheiro":
                Engenheiro eng = new Engenheiro();
                eng.setCrea(cxCodIdentificador.getText());
                func = eng;
                break;

            case "Arquiteto":
                Arquiteto arq = new Arquiteto();
                arq.setCodRegistro(cxCodIdentificador.getText());
                func = arq;
                break;

            case "Funcionário Geral":
                FuncGerais funcGerais = new FuncGerais();
                funcGerais.setCpf(cxCodIdentificador.getText());
                func = funcGerais;
                break;
        }

        try {
            Controlador.getControlador().getServico().removeFuncionario(func);
            JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso!", "Removido", 1);
        } catch (RemoveException re) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!", "ERROR", 0);
            return false;
        }

        return true;
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
            java.util.logging.Logger.getLogger(MenuConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsultaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSairMenuConsultaCliente;
    private javax.swing.JLabel cxCod;
    private javax.swing.JTextField cxCodIdentificador;
    private javax.swing.JLabel cxHT;
    private javax.swing.JLabel cxNome;
    private javax.swing.JLabel cxTotalSalario;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbConsulta;
    private javax.swing.JLabel lbHT;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbToltalSalario;
    private javax.swing.JComboBox<String> opcFunc;
    // End of variables declaration//GEN-END:variables
}
