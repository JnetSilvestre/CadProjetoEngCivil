
package Principal.IntefaceFuncionario;

import Principal.IntefaceProjeto.MenuCadFuncionarioProj;
import Controler.Controlador;
import Entidades.Arquiteto;
import Entidades.Engenheiro;
import Entidades.FuncGerais;
import Entidades.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuListaFuncionarios extends javax.swing.JFrame {

    private static MenuListaFuncionarios menuListaFuncionarios = null;

    private MenuListaFuncionarios() {
        initComponents();
    }

    public static MenuListaFuncionarios getMenuListaFuncionarios() {
        if (menuListaFuncionarios == null) {
            menuListaFuncionarios = new MenuListaFuncionarios();
        }
        return menuListaFuncionarios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbFunc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btSairMenuFunc = new javax.swing.JButton();
        lbEng = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEng = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbArq = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFunc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Lista de Funcionários");
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

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbFunc.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbFunc.setForeground(new java.awt.Color(255, 255, 255));
        lbFunc.setText("Lista de Funcionários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lbFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lbFunc)
                .addContainerGap())
        );

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

        lbEng.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbEng.setForeground(new java.awt.Color(255, 255, 255));
        lbEng.setText("ENGENHEIROS");

        tbEng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CREA", "Sálario Total"
            }
        ));
        jScrollPane1.setViewportView(tbEng);

        tbArq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código Registro", "Salário Total"
            }
        ));
        jScrollPane2.setViewportView(tbArq);

        tbFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Salário Total"
            }
        ));
        jScrollPane3.setViewportView(tbFunc);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARQUITETOS");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FUNCIONÁRIOS GERAIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEng)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btSairMenuFunc)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbEng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSairMenuFunc)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairMenuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuFuncActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuFuncActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listaTabelas();
        if(MenuFuncionario.getMenuFuncionario().isVisible()){
            MenuFuncionario.getMenuFuncionario().setVisible(false);
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(!MenuCadFuncionarioProj.getMenuCadFuncionarioProj().isVisible()){
            MenuFuncionario.getMenuFuncionario().setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    public void sair() {
        this.dispose();
    }

    public void listaTabelas() {
        DefaultTableModel modelo = (DefaultTableModel) tbEng.getModel();
        DefaultTableModel modelo1 = (DefaultTableModel) tbArq.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) tbFunc.getModel();
        int posLin = 0;
        int posLin1 = 0;
        int posLin2 = 0;
        modelo.setRowCount(posLin);
        modelo1.setRowCount(posLin1);
        modelo2.setRowCount(posLin2);
        //for alternativo  
        for (Funcionario func : Controlador.getControlador().getServico().funcionarioList()) {
            if (func.getClass() == new Engenheiro().getClass()) {
                modelo.insertRow(posLin, new Object[]{((Engenheiro) func).getNome(), ((Engenheiro) func).getCrea(), ((Engenheiro) func).getSalario()});
                posLin++;
            } else if (func.getClass() == new Arquiteto().getClass()) {
                modelo1.insertRow(posLin1, new Object[]{((Arquiteto) func).getNome(), ((Arquiteto) func).getCodRegistro(), ((Arquiteto) func).getSalario()});
                posLin1++;
            } else {
                modelo2.insertRow(posLin2, new Object[]{((FuncGerais) func).getNome(), ((FuncGerais) func).getCpf(), ((FuncGerais) func).getSalario()});
                posLin2++;
            }
        }
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
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairMenuFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbEng;
    private javax.swing.JLabel lbFunc;
    private javax.swing.JTable tbArq;
    private javax.swing.JTable tbEng;
    private javax.swing.JTable tbFunc;
    // End of variables declaration//GEN-END:variables
}
