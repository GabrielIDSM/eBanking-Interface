package Contas.pkg;

import Classes_utilit.pkg.*;
import java.math.BigDecimal;

public class listaFuncionarios extends javax.swing.JInternalFrame {
    //Atributos
    String[] funcionarios = null;
    String[] nomes = null;
    String[] profissoes = null;
    String[] salarios = null;
    String[] diaDePagamento = null;
    String conta;
    String saldo;
    String nome;
    String senha;
    //Métodos construtor
    public listaFuncionarios(String conta, String saldo, String nome, String senha) {
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
        this.senha = senha;
        this.funcionarios = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                + conta + "\\Funcionarios.txt");
        //Coletando dados dos funcionários;
        String[] Aux;
        int cont = funcionarios.length;
        nomes = new String[cont];
        profissoes = new String[cont];
        salarios = new String[cont];
        diaDePagamento = new String[cont];
        if(funcionarios != null) for(int i = 0; i < funcionarios.length; i++){
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"
            +funcionarios[i]+"\\Salario.txt");
            salarios[i] = Aux[0];
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"
            +funcionarios[i]+"\\Profissao.txt");
            profissoes[i] = Aux[0];
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+conta+"\\FuncionariosDados\\"
            +funcionarios[i]+"\\DiaPagamento.txt");
            diaDePagamento[i] = Aux[0];
            Aux = leituraEscrita.Leitura("Arquivos\\DadosContas\\"+funcionarios[i]+"\\Nome.txt");
            nomes[i] = Aux[0];
        }     
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.addItem("Selecionar");
        for(int i = 0;i<this.funcionarios.length;i++){
            jComboBox1.addItem(funcionarios[i]);
        }
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lImagem = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lNome1 = new javax.swing.JLabel();
        lProf = new javax.swing.JLabel();
        lNome3 = new javax.swing.JLabel();
        lSal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lNome2 = new javax.swing.JLabel();
        lDia = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lNome4 = new javax.swing.JLabel();
        lDataProximoPagamento = new javax.swing.JLabel();
        bEfetuarPagamento = new javax.swing.JButton();
        bEfetuarPagamento.setVisible(false);
        bAumento = new javax.swing.JButton();
        bAumento.setVisible(false);
        bMudarDiaPagamento = new javax.swing.JButton();
        bMudarDiaPagamento.setVisible(false);
        TP = new javax.swing.JPanel();
        Default = new javax.swing.JPanel();
        PagamentoPanel = new javax.swing.JPanel();
        lConfirmaSenha = new javax.swing.JLabel();
        jConfirmaSenha = new javax.swing.JPasswordField();
        jConfirma = new javax.swing.JButton();
        MudaDiaPagamentoPane = new javax.swing.JPanel();
        AumentoPane = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setTitle("Funcionários");

        jPanel1.setBackground(new java.awt.Color(70, 0, 0));

        jComboBox1.setBackground(new java.awt.Color(70, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(230, 230, 230));
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        jPanel3.setBackground(new java.awt.Color(214, 214, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome.setForeground(new java.awt.Color(70, 0, 0));
        lNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome.setText("---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        lNome1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome1.setForeground(new java.awt.Color(0, 0, 0));
        lNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome1.setText("Profissão:");

        lProf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lProf.setForeground(new java.awt.Color(70, 0, 0));
        lProf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProf.setText("---");

        lNome3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome3.setForeground(new java.awt.Color(0, 0, 0));
        lNome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome3.setText("Salário:");

        lSal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lSal.setForeground(new java.awt.Color(70, 0, 0));
        lSal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSal.setText("---");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(lProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(214, 214, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(370, 0));
        jPanel5.setName(""); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(370, 80));

        lNome2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome2.setForeground(new java.awt.Color(0, 0, 0));
        lNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome2.setText("Dia de Pagamento:");

        lDia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lDia.setForeground(new java.awt.Color(70, 0, 0));
        lDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia.setText("---");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(214, 214, 214));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 0, 0)));

        lNome4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome4.setForeground(new java.awt.Color(0, 0, 0));
        lNome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome4.setText("Data do próximo pagamento:");

        lDataProximoPagamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lDataProximoPagamento.setForeground(new java.awt.Color(70, 0, 0));
        lDataProximoPagamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDataProximoPagamento.setText("---");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lDataProximoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDataProximoPagamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bEfetuarPagamento.setBackground(new java.awt.Color(70, 0, 0));
        bEfetuarPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bEfetuarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        bEfetuarPagamento.setText("Efetuar Pagamento");
        bEfetuarPagamento.setBorder(null);
        bEfetuarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEfetuarPagamentoActionPerformed(evt);
            }
        });

        bAumento.setBackground(new java.awt.Color(70, 0, 0));
        bAumento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAumento.setForeground(new java.awt.Color(255, 255, 255));
        bAumento.setText("Aumento");
        bAumento.setBorder(null);
        bAumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAumentoActionPerformed(evt);
            }
        });

        bMudarDiaPagamento.setBackground(new java.awt.Color(70, 0, 0));
        bMudarDiaPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bMudarDiaPagamento.setForeground(new java.awt.Color(255, 255, 255));
        bMudarDiaPagamento.setText("Dia de pagamento");
        bMudarDiaPagamento.setBorder(null);
        bMudarDiaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarDiaPagamentoActionPerformed(evt);
            }
        });

        TP.setLayout(new java.awt.CardLayout());

        Default.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        TP.add(Default, "card4");

        PagamentoPanel.setBackground(new java.awt.Color(230, 230, 230));

        lConfirmaSenha.setBackground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lConfirmaSenha.setForeground(new java.awt.Color(200, 0, 0));
        lConfirmaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConfirmaSenha.setText("Confirme sua senha:");

        jConfirmaSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jConfirma.setBackground(new java.awt.Color(70, 0, 0));
        jConfirma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jConfirma.setForeground(new java.awt.Color(255, 255, 255));
        jConfirma.setText("Confirmar");
        jConfirma.setBorder(null);
        jConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagamentoPanelLayout = new javax.swing.GroupLayout(PagamentoPanel);
        PagamentoPanel.setLayout(PagamentoPanelLayout);
        PagamentoPanelLayout.setHorizontalGroup(
            PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lConfirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PagamentoPanelLayout.createSequentialGroup()
                        .addComponent(jConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PagamentoPanelLayout.setVerticalGroup(
            PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lConfirmaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jConfirmaSenha)
                    .addComponent(jConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TP.add(PagamentoPanel, "card2");

        MudaDiaPagamentoPane.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout MudaDiaPagamentoPaneLayout = new javax.swing.GroupLayout(MudaDiaPagamentoPane);
        MudaDiaPagamentoPane.setLayout(MudaDiaPagamentoPaneLayout);
        MudaDiaPagamentoPaneLayout.setHorizontalGroup(
            MudaDiaPagamentoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        MudaDiaPagamentoPaneLayout.setVerticalGroup(
            MudaDiaPagamentoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        TP.add(MudaDiaPagamentoPane, "card3");

        AumentoPane.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout AumentoPaneLayout = new javax.swing.GroupLayout(AumentoPane);
        AumentoPane.setLayout(AumentoPaneLayout);
        AumentoPaneLayout.setHorizontalGroup(
            AumentoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        AumentoPaneLayout.setVerticalGroup(
            AumentoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        TP.add(AumentoPane, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bEfetuarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMudarDiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bAumento, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(bMudarDiaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEfetuarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(270, Short.MAX_VALUE)
                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int index = jComboBox1.getSelectedIndex();
        if(index > 0){
            bEfetuarPagamento.setVisible(true);
            bAumento.setVisible(true);
            bMudarDiaPagamento.setVisible(true);
            lNome.setText(this.nomes[index-1]);
            lProf.setText(this.profissoes[index-1]);
            lSal.setText("R$"+this.salarios[index-1].replace('.', ','));
            lDia.setText(this.diaDePagamento[index-1]);
            lDataProximoPagamento.setText(temporizadorDataTempo.proximoPagamento(this.conta, this.funcionarios[index-1]));
            lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pkg/"+this.funcionarios[index-1]+".png")));
        }else{
            lNome.setText("---");
            lProf.setText("---");
            lSal.setText("---");
            lDia.setText("---");
            lDataProximoPagamento.setText("---");
            lImagem.setIcon(null);
            bEfetuarPagamento.setVisible(false);
            bAumento.setVisible(false);
            bMudarDiaPagamento.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bEfetuarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEfetuarPagamentoActionPerformed
        TP.removeAll();
        TP.repaint();
        TP.revalidate();
        TP.add(PagamentoPanel);
        TP.repaint();
        TP.revalidate();
    }//GEN-LAST:event_bEfetuarPagamentoActionPerformed

    private void bAumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAumentoActionPerformed
        
    }//GEN-LAST:event_bAumentoActionPerformed

    private void bMudarDiaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarDiaPagamentoActionPerformed
        
    }//GEN-LAST:event_bMudarDiaPagamentoActionPerformed

    private void jConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmaActionPerformed
        
    }//GEN-LAST:event_jConfirmaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AumentoPane;
    private javax.swing.JPanel Default;
    private javax.swing.JPanel MudaDiaPagamentoPane;
    private javax.swing.JPanel PagamentoPanel;
    private javax.swing.JPanel TP;
    private javax.swing.JButton bAumento;
    private javax.swing.JButton bEfetuarPagamento;
    private javax.swing.JButton bMudarDiaPagamento;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jConfirma;
    private javax.swing.JPasswordField jConfirmaSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lConfirmaSenha;
    private javax.swing.JLabel lDataProximoPagamento;
    private javax.swing.JLabel lDia;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNome1;
    private javax.swing.JLabel lNome2;
    private javax.swing.JLabel lNome3;
    private javax.swing.JLabel lNome4;
    private javax.swing.JLabel lProf;
    private javax.swing.JLabel lSal;
    // End of variables declaration//GEN-END:variables
}