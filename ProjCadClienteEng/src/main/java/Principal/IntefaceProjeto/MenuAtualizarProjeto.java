/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal.IntefaceProjeto;

import Controler.Controlador;
import Entidades.Cliente;
import Entidades.DetalhesProjeto;
import Entidades.Endereco;
import Entidades.Projeto;
import Servico.Exceptions.AtualizaException;
import javax.swing.JOptionPane;


public class MenuAtualizarProjeto extends javax.swing.JFrame {

    private static MenuAtualizarProjeto menuAtualizarProjeto = null;
    
    
    private MenuAtualizarProjeto() {
        initComponents();
    }
    
    public static MenuAtualizarProjeto getMenuAtualizarProjeto(){
        if(menuAtualizarProjeto==null){
            menuAtualizarProjeto = new MenuAtualizarProjeto();
        }
        return menuAtualizarProjeto;
    }
public void insereDadosProj(Cliente cliente, Projeto pj) {

        cxNomeCliente.setText(cliente.getNome());
        cxCpfCliente.setText(cliente.getCpf());
       
        cxNomeProj.setText(pj.getNome());
        cxCodigo.setText(pj.getCodigoId());
        
        cxComprimento.setText((pj.getDetalhesProjeto().getComprimento()).toString());
        cxLargura.setText(pj.getDetalhesProjeto().getLargura().toString());
        cxInclinacao.setText(pj.getDetalhesProjeto().getInclinacao().toString());
        cxTipoSolo.setText(pj.getDetalhesProjeto().getTipoSolo());
        
        cxRua.setText(pj.getDetalhesProjeto().getEndereco().getRua());
        cxNum.setText(pj.getDetalhesProjeto().getEndereco().getNum());
        cxBairro.setText(pj.getDetalhesProjeto().getEndereco().getBairro());
        cxCep.setText(pj.getDetalhesProjeto().getEndereco().getBairro());
        cxCidade.setText(pj.getDetalhesProjeto().getEndereco().getCidade());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        lbAtualiza = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btAtualizar = new javax.swing.JButton();
        btSairMenuConsultaCliente = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        cxCpfCliente = new javax.swing.JLabel();
        lbDetalhesProjeto1 = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbCodigoId = new javax.swing.JLabel();
        lbNome2 = new javax.swing.JLabel();
        lbDetalhesProjeto = new javax.swing.JLabel();
        lbComprimento = new javax.swing.JLabel();
        lbLargura = new javax.swing.JLabel();
        lbInclinacao = new javax.swing.JLabel();
        lbTipoSolo = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JLabel();
        cxNomeProj = new javax.swing.JTextField();
        cxComprimento = new javax.swing.JTextField();
        cxLargura = new javax.swing.JTextField();
        cxInclinacao = new javax.swing.JTextField();
        cxTipoSolo = new javax.swing.JTextField();
        cxRua = new javax.swing.JTextField();
        cxNum = new javax.swing.JTextField();
        cxBairro = new javax.swing.JTextField();
        cxCep = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu de Atualização do Projeto");
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

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        lbAtualiza.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbAtualiza.setForeground(new java.awt.Color(255, 255, 255));
        lbAtualiza.setText("Atualiza Projeto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lbAtualiza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbAtualiza)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        btAtualizar.setBackground(new java.awt.Color(102, 102, 102));
        btAtualizar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
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

        lbCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbCliente.setText("Cliente:");

        cxNomeCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        cxNomeCliente.setText("...");

        lbCPF.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(255, 255, 255));
        lbCPF.setText("CPF: ");

        cxCpfCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCpfCliente.setForeground(new java.awt.Color(255, 255, 255));
        cxCpfCliente.setText("...");

        lbDetalhesProjeto1.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbDetalhesProjeto1.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalhesProjeto1.setText("DETALHES DO PROJETO");

        lbEndereco.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lbEndereco.setText("ENDEREÇO DO PROJETO");

        lbCodigoId.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCodigoId.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoId.setText("CodigoId: ");

        lbNome2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNome2.setForeground(new java.awt.Color(255, 255, 255));
        lbNome2.setText("Nome: ");

        lbDetalhesProjeto.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbDetalhesProjeto.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalhesProjeto.setText("DETALHES DO TERRENO");

        lbComprimento.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbComprimento.setForeground(new java.awt.Color(255, 255, 255));
        lbComprimento.setText("Comprimento:");

        lbLargura.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbLargura.setForeground(new java.awt.Color(255, 255, 255));
        lbLargura.setText("Largura:");

        lbInclinacao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbInclinacao.setForeground(new java.awt.Color(255, 255, 255));
        lbInclinacao.setText("Inclinação:");

        lbTipoSolo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTipoSolo.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoSolo.setText("Tipo de Solo:");

        lbCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(255, 255, 255));
        lbCidade.setText("Cidade:");

        lbCep.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCep.setForeground(new java.awt.Color(255, 255, 255));
        lbCep.setText("CEP:");

        lbBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(255, 255, 255));
        lbBairro.setText("Bairro:");

        lbNum.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNum.setForeground(new java.awt.Color(255, 255, 255));
        lbNum.setText("Nº:");

        lbRua.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbRua.setForeground(new java.awt.Color(255, 255, 255));
        lbRua.setText("Rua:");

        cxCodigo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCodigo.setForeground(new java.awt.Color(255, 255, 255));
        cxCodigo.setText("...");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbCliente)
                        .addGap(12, 12, 12)
                        .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCPF)
                        .addGap(6, 6, 6)
                        .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lbDetalhesProjeto1)
                        .addGap(141, 141, 141)
                        .addComponent(lbEndereco))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addComponent(lbRua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(lbNum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbDetalhesProjeto)
                        .addGap(153, 153, 153)
                        .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSairMenuConsultaCliente))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(cxTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(lbInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(cxInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lbLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lbComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(39, 39, 39)
                        .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCliente)
                    .addComponent(cxNomeCliente)
                    .addComponent(lbCPF)
                    .addComponent(cxCpfCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDetalhesProjeto1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbEndereco)))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigoId)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cxCodigo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbRua))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome2)
                            .addComponent(lbNum))))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbBairro))
                    .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDetalhesProjeto)
                    .addComponent(lbCep)
                    .addComponent(cxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbComprimento)
                            .addComponent(lbCidade))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbLargura))
                    .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbInclinacao))
                    .addComponent(cxInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTipoSolo)
                    .addComponent(cxTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAtualizar)
                    .addComponent(btSairMenuConsultaCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuConsultaProjeto.getMenuConsultaProjeto().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuConsultaProjeto.getMenuConsultaProjeto().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        
        if(atualizar()){
            Cliente cliente = capturaCliente();
            MenuConsultaProjeto.getMenuConsultaProjeto().insereDadosProj(cliente, cliente.getProjetos().get(0));
            MenuListaProjetos.getMenuListaProjetos().listaTabela();
            sair();
        }
       
    }//GEN-LAST:event_btAtualizarActionPerformed

    public void sair(){
        this.dispose();
    }
    
    public Cliente capturaCliente(){
    
        Cliente cliente = new Cliente();
        cliente.setNome(cxNomeCliente.getText());
        cliente.setCpf(cxCpfCliente.getText());
        
        Projeto projeto = new Projeto();
        projeto.setNome(cxNomeProj.getText());
        projeto.setCodigoId(cxCodigo.getText());
        
        DetalhesProjeto dp = new DetalhesProjeto();
        
        try{
            dp.setComprimento(Float.parseFloat(cxComprimento.getText()));
            dp.setLargura(Float.parseFloat(cxLargura.getText()));
            dp.setInclinacao(Float.parseFloat(cxInclinacao.getText()));
            dp.setTipoSolo((cxTipoSolo.getText()));
        }catch(NumberFormatException nfe){
            JOptionPane.showConfirmDialog(null, "O comprimento, inclinação e largura precisam ser números e separados por ponto!","Error",0);
            return null;
        }

        Endereco end = new Endereco();
        end.setRua(cxRua.getText());
        end.setNum(cxNum.getText());
        end.setBairro(cxBairro.getText());
        end.setCep(cxCep.getText());
        end.setCidade(cxCidade.getText());
        
        dp.setEndereco(end);
        projeto.setDetalhesProjeto(dp);
        
        cliente.addProjeto(projeto);
        
        
        return cliente;
    }
    
    public boolean atualizar(){
    
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar?", "Confirmação de atualização", JOptionPane.YES_NO_OPTION);
        if (resp != 0) {
            return false;
        }
        
        Cliente cliente = capturaCliente();
        
        try{
            Controlador.getControlador().getServico().atualizaProjeto(cliente, cliente.getProjetos().get(0));
            
        }catch(AtualizaException ae){
            JOptionPane.showMessageDialog(null, "Erro na atualização. Tente Novamente!", "Error", 0);
            return false;
        }
        return true;
    }
    
    private void btSairMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuConsultaClienteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuConsultaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAtualizarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAtualizarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAtualizarProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btSairMenuConsultaCliente;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCep;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JLabel cxCodigo;
    private javax.swing.JTextField cxComprimento;
    private javax.swing.JLabel cxCpfCliente;
    private javax.swing.JTextField cxInclinacao;
    private javax.swing.JTextField cxLargura;
    private javax.swing.JLabel cxNomeCliente;
    private javax.swing.JTextField cxNomeProj;
    private javax.swing.JTextField cxNum;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTipoSolo;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbAtualiza;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCodigoId;
    private javax.swing.JLabel lbComprimento;
    private javax.swing.JLabel lbDetalhesProjeto;
    private javax.swing.JLabel lbDetalhesProjeto1;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbInclinacao;
    private javax.swing.JLabel lbLargura;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTipoSolo;
    // End of variables declaration//GEN-END:variables
}
