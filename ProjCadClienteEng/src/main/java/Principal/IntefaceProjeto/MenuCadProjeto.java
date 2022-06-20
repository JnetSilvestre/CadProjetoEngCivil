
package Principal.IntefaceProjeto;

import Controler.Controlador;
import Entidades.Cliente;
import Entidades.DetalhesProjeto;
import Entidades.Endereco;
import Entidades.Projeto;
import Servico.Exceptions.CadException;
import javax.swing.JOptionPane;

public class MenuCadProjeto extends javax.swing.JFrame {

    private static MenuCadProjeto menuCadProjeto = null;

    private MenuCadProjeto() {
        initComponents();
    }

    public static MenuCadProjeto getMenuCadProjeto() {

        if (menuCadProjeto == null) {
            menuCadProjeto = new MenuCadProjeto();
        }

        return menuCadProjeto;
    }

    public void insereDadosCliente(Cliente cliente) {
        cxNomeCliente.setText(cliente.getNome());
        cxCpfCliente.setText(cliente.getCpf());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel3 = new javax.swing.JPanel();
        cxNomeProj = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbCodigoId = new javax.swing.JLabel();
        cxCodigoProj = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSairCad = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        cxCpfCliente = new javax.swing.JLabel();
        lbDetalhesProjeto = new javax.swing.JLabel();
        lbComprimento = new javax.swing.JLabel();
        lbLargura = new javax.swing.JLabel();
        lbTipoSolo = new javax.swing.JLabel();
        lbInclinacao = new javax.swing.JLabel();
        cxInclinacao = new javax.swing.JTextField();
        cxComprimento = new javax.swing.JTextField();
        cxLargura = new javax.swing.JTextField();
        cxTipoSolo = new javax.swing.JTextField();
        lbDetalhesProjeto1 = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        cxRua = new javax.swing.JTextField();
        lbNum = new javax.swing.JLabel();
        cxNum = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        cxBairro = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        cxCep = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Cadastro de Projeto");
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

        Painel3.setBackground(new java.awt.Color(0, 0, 0));

        cxNomeProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeProjActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome: ");

        lbCodigoId.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCodigoId.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoId.setText("CodigoId: ");

        cxCodigoProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodigoProjActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btCadastrar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        btSairCad.setBackground(new java.awt.Color(102, 102, 102));
        btSairCad.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairCad.setForeground(new java.awt.Color(255, 255, 255));
        btSairCad.setText("Sair");
        btSairCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadActionPerformed(evt);
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

        lbDetalhesProjeto.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbDetalhesProjeto.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalhesProjeto.setText("DETALHES DO TERRENO");

        lbComprimento.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbComprimento.setForeground(new java.awt.Color(255, 255, 255));
        lbComprimento.setText("Comprimento:");

        lbLargura.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbLargura.setForeground(new java.awt.Color(255, 255, 255));
        lbLargura.setText("Largura:");

        lbTipoSolo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTipoSolo.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoSolo.setText("Tipo de Solo:");

        lbInclinacao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbInclinacao.setForeground(new java.awt.Color(255, 255, 255));
        lbInclinacao.setText("Inclinação:");

        cxInclinacao.setText("0.00");
        cxInclinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxInclinacaoActionPerformed(evt);
            }
        });

        cxComprimento.setText("0.00");
        cxComprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxComprimentoActionPerformed(evt);
            }
        });

        cxLargura.setText("0.00");
        cxLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxLarguraActionPerformed(evt);
            }
        });

        cxTipoSolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTipoSoloActionPerformed(evt);
            }
        });

        lbDetalhesProjeto1.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbDetalhesProjeto1.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalhesProjeto1.setText("DETALHES DO PROJETO");

        lbEndereco.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lbEndereco.setText("ENDEREÇO DO PROJETO");

        lbRua.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbRua.setForeground(new java.awt.Color(255, 255, 255));
        lbRua.setText("Rua:");

        cxRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRuaActionPerformed(evt);
            }
        });

        lbNum.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNum.setForeground(new java.awt.Color(255, 255, 255));
        lbNum.setText("Nº:");

        cxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumActionPerformed(evt);
            }
        });

        lbBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(255, 255, 255));
        lbBairro.setText("Bairro:");

        cxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBairroActionPerformed(evt);
            }
        });

        lbCep.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCep.setForeground(new java.awt.Color(255, 255, 255));
        lbCep.setText("CEP:");

        cxCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCepActionPerformed(evt);
            }
        });

        cxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeActionPerformed(evt);
            }
        });

        lbCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(255, 255, 255));
        lbCidade.setText("Cidade:");

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addComponent(lbCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbComprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbLargura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbInclinacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cxInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cxComprimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Painel3Layout.createSequentialGroup()
                                        .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGap(51, 51, 51)
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxCodigoProj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbDetalhesProjeto1))
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbDetalhesProjeto)))
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel3Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel3Layout.createSequentialGroup()
                                        .addComponent(btCadastrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSairCad)
                                        .addGap(14, 14, 14))
                                    .addGroup(Painel3Layout.createSequentialGroup()
                                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(Painel3Layout.createSequentialGroup()
                                                .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(Painel3Layout.createSequentialGroup()
                                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lbRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(cxRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEndereco)
                                .addGap(86, 86, 86))))))
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(lbCPF)
                            .addComponent(cxNomeCliente)
                            .addComponent(cxCpfCliente))
                        .addGap(18, 18, 18)
                        .addComponent(lbDetalhesProjeto1)
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCodigoProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigoId))
                        .addGap(17, 17, 17)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(lbDetalhesProjeto)
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbComprimento)
                            .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEndereco)
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRua)
                            .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNum))
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBairro)
                            .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCep)
                            .addComponent(cxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLargura))
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbInclinacao)
                            .addComponent(cxInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTipoSolo)
                            .addComponent(cxTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCidade)
                            .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSairCad)
                            .addComponent(btCadastrar))))
                .addGap(18, 18, 18))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lbCadastro.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lbCadastro.setText("Cadastro Projeto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lbCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lbCadastro)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxNomeProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeProjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeProjActionPerformed

    private void cxCodigoProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodigoProjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodigoProjActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
    if( cadastrar()){
        JOptionPane.showMessageDialog(null, "Cadastro Concluído!", "Cadastrado", 1);
    }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairCadActionPerformed

    public void sair() {
        this.dispose();
    }

    public void limpar() {
        cxNomeProj.setText("");
        cxCodigoProj.setText("");

        cxComprimento.setText("0.00");
        cxLargura.setText("0.00");
        cxInclinacao.setText("0.00");
        cxTipoSolo.setText("");

        cxRua.setText("");
        cxNum.setText("");
        cxBairro.setText("");
        cxCep.setText("");
        cxCidade.setText("");
    }

    public boolean cadastrar() {

        if (cxCodigoProj.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O código precisa existir!", "ERROR", 0);
            cxCodigoProj.requestFocus();
            return false;
        }
        
        Cliente cliente = new Cliente();
        cliente.setNome(cxNomeCliente.getText());
        cliente.setCpf(cxCpfCliente.getText());
        
        Projeto projeto = new Projeto();
        projeto.setNome(cxNomeProj.getText());
        projeto.setCodigoId(cxCodigoProj.getText());
        
        DetalhesProjeto dp = new DetalhesProjeto();
        
        try{
            dp.setComprimento(Float.parseFloat(cxComprimento.getText()));
            dp.setLargura(Float.parseFloat(cxLargura.getText()));
            dp.setInclinacao(Float.parseFloat(cxInclinacao.getText()));
            dp.setTipoSolo((cxTipoSolo.getText()));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O comprimento, inclinação e largura precisam ser números e separados por ponto!","Error",0);
            return false;
        }

        Endereco end = new Endereco();
        end.setRua(cxRua.getText());
        end.setNum(cxNum.getText());
        end.setBairro(cxBairro.getText());
        end.setCep(cxCep.getText());
        end.setCidade(cxCidade.getText());
        
        dp.setEndereco(end);
        projeto.setDetalhesProjeto(dp);
        
        try{
            Controlador.getControlador().getServico().cadProjeto(cliente, projeto);
            limpar();
        }catch(CadException ce){
            JOptionPane.showMessageDialog(null, "Erro no cadastro!","Error",0);
            return false;
        }
        return true;
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuProjetos.getMenuProjetos().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpar();
        MenuProjetos.getMenuProjetos().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void cxInclinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxInclinacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxInclinacaoActionPerformed

    private void cxComprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxComprimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxComprimentoActionPerformed

    private void cxLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxLarguraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxLarguraActionPerformed

    private void cxTipoSoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTipoSoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTipoSoloActionPerformed

    private void cxRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxRuaActionPerformed

    private void cxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumActionPerformed

    private void cxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxBairroActionPerformed

    private void cxCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCepActionPerformed

    private void cxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCadProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel Painel3;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSairCad;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCep;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxCodigoProj;
    private javax.swing.JTextField cxComprimento;
    private javax.swing.JLabel cxCpfCliente;
    private javax.swing.JTextField cxInclinacao;
    private javax.swing.JTextField cxLargura;
    private javax.swing.JLabel cxNomeCliente;
    private javax.swing.JTextField cxNomeProj;
    private javax.swing.JTextField cxNum;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefoneCli;
    private javax.swing.JTextField cxTelefoneCli1;
    private javax.swing.JTextField cxTipoSolo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCadastro;
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
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTipoSolo;
    // End of variables declaration//GEN-END:variables
}
