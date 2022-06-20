
package Principal.IntefaceProjeto;

import Controler.Controlador;
import Entidades.Cliente;
import Entidades.Projeto;
import Servico.Exceptions.RemoveException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuListaProjetos extends javax.swing.JFrame {

    private static MenuListaProjetos menuListaProjetos = null;

    public MenuListaProjetos() {
        initComponents();
    }

    public static MenuListaProjetos getMenuListaProjetos() {
        if (menuListaProjetos == null) {
            menuListaProjetos = new MenuListaProjetos();
        }

        return menuListaProjetos;
    }

    public void insereDadosCliente(Cliente cliente) {

        cxNome.setText(cliente.getNome());
        cxCpf.setText(cliente.getCpf());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        cxNome = new javax.swing.JLabel();
        cxCpf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProj = new javax.swing.JTable();
        lbCodigo = new javax.swing.JLabel();
        cxBusca = new javax.swing.JTextField();
        btConsulta = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Lista de Projetos");
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

        btSair.setBackground(new java.awt.Color(102, 102, 102));
        btSair.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbCliente.setText("Cliente:");

        lbCPF.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(255, 255, 255));
        lbCPF.setText("CPF: ");

        cxNome.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxNome.setForeground(new java.awt.Color(255, 255, 255));
        cxNome.setText("...");

        cxCpf.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCpf.setForeground(new java.awt.Color(255, 255, 255));
        cxCpf.setText("...");

        tbProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane1.setViewportView(tbProj);

        lbCodigo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("Código:");

        btConsulta.setBackground(new java.awt.Color(102, 102, 102));
        btConsulta.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btConsulta.setText("Consultar");
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        btRemove.setBackground(new java.awt.Color(102, 102, 102));
        btRemove.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btRemove.setForeground(new java.awt.Color(255, 255, 255));
        btRemove.setText("Remover");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(btRemove)
                        .addGap(26, 26, 26)
                        .addComponent(btSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(lbCPF)
                    .addComponent(cxNome)
                    .addComponent(cxCpf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(lbCodigo)
                    .addComponent(cxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsulta)
                    .addComponent(btRemove))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        lbClientes.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbClientes.setForeground(new java.awt.Color(255, 255, 255));
        lbClientes.setText("Projetos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(lbClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lbClientes)
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
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuProjetos.getMenuProjetos().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpar();
        MenuProjetos.getMenuProjetos().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public void limpar(){
        cxBusca.setText("");
    }
    
    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        Projeto pj = consultaProj();
        if(pj != null){
           Cliente cliente = new Cliente();
           cliente.setNome(cxNome.getText());
           cliente.setCpf(cxCpf.getText());
           MenuConsultaProjeto.getMenuConsultaProjeto().insereDadosProj(cliente, pj);
           MenuConsultaProjeto.getMenuConsultaProjeto().setVisible(true);
       }
        else{
            JOptionPane.showMessageDialog(null, "Código Inválido!", "Error", 0);
        }
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente remover?", "Confirmação de Remoção", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            remover();
            listaTabela();
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    public void remover(){
    
        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpf.getText());
        
        Projeto pj = new Projeto();
        
        pj.setCodigoId(cxBusca.getText());
        
        try{
            Controlador.getControlador().getServico().removeProjeto(cliente, pj);
            JOptionPane.showMessageDialog(null, "Removido!", "Confirmação de Remoção", 1);
        }catch(RemoveException re){
        JOptionPane.showMessageDialog(null, "Erro na remoção! Verifique o código", "Error", 0);
        }
    
    }
    
    public Projeto consultaProj(){
        if(cxBusca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário o código!", "Error", 0);
            cxBusca.requestFocus();
            return null;
       }
        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpf.getText());
        Projeto pj = new Projeto();
        pj.setCodigoId(cxBusca.getText());
        
        pj = Controlador.getControlador().getServico().getProjetoCliente(cliente, pj);
        if(pj == null){
            return null;
        }
                
        return pj;
    }
       
       
    
    
    public void sair() {
        this.dispose();
    }

    public void listaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tbProj.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        Cliente cliente = new Cliente();
        cliente.setCpf(cxCpf.getText());
        //for alternativo
        List<Projeto> listaProj = Controlador.getControlador().getServico().getProjetosCliente(cliente);
        
        if (!(listaProj==null)) {
            for (Projeto proj : listaProj) {
                modelo.insertRow(posLin, new Object[]{proj.getCodigoId(), proj.getNome()});
                posLin++;
            }
        }

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
            java.util.logging.Logger.getLogger(MenuListaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuListaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuListaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListaProjetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxBusca;
    private javax.swing.JLabel cxCpf;
    private javax.swing.JLabel cxNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JTable tbProj;
    // End of variables declaration//GEN-END:variables
}
