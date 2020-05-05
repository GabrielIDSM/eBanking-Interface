package Interface.pkg;

import java.io.File;
import javax.swing.JFileChooser;
import Classes_utilit.pkg.*;
import java.util.Random;

public class CadastroEmpresa extends javax.swing.JInternalFrame {

    JFileChooser chooser = null;
    File file = null;
    int op = 0;
    String novaConta = "";

    public CadastroEmpresa() {
        //Instanciar todas as contas
        String[] contasEmpresa = contas.obtemContas(1);
        boolean verifica = true;
        Random random = new Random();
        int Conta = 0;
        String auxConta = "";
        do {
            Conta = random.nextInt(90000);
            auxConta = contas.preencheComZero(Conta);
            for (int i = 0; i < contasEmpresa.length; i++) {
                if (auxConta.equals(contasEmpresa[i])) {
                    verifica = false;
                    break;
                }
            }
        } while (!verifica);
        novaConta = auxConta;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ContaL = new javax.swing.JLabel();
        SenhaL = new javax.swing.JLabel();
        SenhaText = new javax.swing.JPasswordField();
        ContaText = new javax.swing.JFormattedTextField();
        NomeL = new javax.swing.JLabel();
        NomeText = new javax.swing.JTextField();
        ConfirmaB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Imagem = new javax.swing.JLabel();
        EscolheB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 200, 200));
        setClosable(true);
        setTitle("Cadastro Empresarial");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(210, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apenas letras e números");

        ContaL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ContaL.setForeground(new java.awt.Color(70, 0, 0));
        ContaL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ContaL.setText("Conta");

        SenhaL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SenhaL.setForeground(new java.awt.Color(70, 0, 0));
        SenhaL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SenhaL.setText("Senha");

        SenhaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        ContaText.setEditable(false);
        try {
            ContaText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ContaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContaText.setText("");
        ContaText.setToolTipText("");
        ContaText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ContaText.setText(this.novaConta);

        NomeL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NomeL.setForeground(new java.awt.Color(70, 0, 0));
        NomeL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        NomeL.setText("Empresa");

        NomeText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NomeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ConfirmaB.setBackground(new java.awt.Color(0, 255, 0));
        ConfirmaB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ConfirmaB.setForeground(new java.awt.Color(0, 0, 0));
        ConfirmaB.setText("Confirmar");
        ConfirmaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaBActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(214, 200, 200));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70)));

        Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        EscolheB.setBackground(new java.awt.Color(153, 153, 255));
        EscolheB.setForeground(new java.awt.Color(0, 0, 0));
        EscolheB.setText("Escolher arquivo");
        EscolheB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolheBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tamanho máximo: 120x120p");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(EscolheB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(EscolheB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(210, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mínimo de 6 dígitos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ContaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SenhaL, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(SenhaText)
                    .addComponent(ContaText)
                    .addComponent(NomeText)
                    .addComponent(ConfirmaB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeL)
                            .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContaL))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenhaL))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmaB)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaBActionPerformed
        String[] auxLeitura;
        String novaConta = this.novaConta;
        char[] novaSenhaChar = SenhaText.getPassword();
        String novaSenha = "";
        for (int i = 0; i < novaSenhaChar.length; i++) {
            novaSenha += novaSenhaChar[i];
        }
        String nome = NomeText.getText();
        try {
            //Verificar se a senha é válida
            if (novaSenhaChar == null || novaSenhaChar.length < 6) {
                throw new Exception();
            }
            for (int i = 0; i < novaSenhaChar.length; i++) {
                if (!(Character.isDigit(novaSenhaChar[i]) || Character.isLetter(novaSenhaChar[i]))) {
                    throw new Exception();
                }
            }
            //Verificar se nome é valido
            if (nome == "") {
                throw new Exception();
            }
            //Cria uma nova conta IN
            //Adicionar contas a ContasComum.txt
            leituraEscrita.Escrita("Arquivos\\ContasEmpresas.txt", "\n" + novaConta);
            leituraEscrita.Escrita("Arquivos\\ContasEmpresas.txt", "\n" + novaSenha);
            //Cria um diretório
            File f = new File("Arquivos\\DadosContas\\" + novaConta);
            f.mkdir();
            //Cria arquivos txt presentes nas contas
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\Saldo.txt", "0.0");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\Extrato.txt", "Conta Criada!");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\Nome.txt", nome);
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\PagamentoAuto.txt", "Desativado");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\Funcionarios.txt", "");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\Poupanca.txt", "");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\Emprestimo.txt", "");
            leituraEscrita.Reescrita("Arquivos\\DadosContas\\" + novaConta + "\\LimiteEmprestimo.txt", "");
            f = new File("Arquivos\\DadosContas\\" + novaConta + "\\FuncionariosDados");
            f.mkdir();
            //Configurar imagem da conta
            if (file == null) {
                if (copiaImagem.FazCopiadefault("src\\Imagens\\pkg\\default.png", "src\\Imagens\\pkg\\" + novaConta + ".png")) {
                    System.out.println("Imagem transferida!");
                }
            } else {
                if (copiaImagem.FazCopia(this.file.getAbsolutePath(), "src\\Imagens\\pkg\\" + novaConta + ".png")) {
                    System.out.println("Imagem transferida!");
                }
            }
            //FIM
            System.out.println("Foi possível criar a conta!");

            this.dispose();
        } catch (Exception e) {
            System.out.println("Não foi possível criar a conta");
            this.dispose();
        }
    }//GEN-LAST:event_ConfirmaBActionPerformed

    private void EscolheBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolheBActionPerformed
        if (chooser == null) {
            chooser = new JFileChooser();
            op = chooser.showOpenDialog(null);
            if (op == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
                System.out.println("Path do arquivo escolhido: \n" + file.getAbsolutePath());
                try {
                    String P = file.getAbsolutePath();
                    Imagem.setIcon(new javax.swing.ImageIcon(P));
                } catch (Exception e) {
                    System.out.println("Não foi possível modificar a imagem");
                }
            } else {
                chooser = null;
            }
        }
    }//GEN-LAST:event_EscolheBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmaB;
    private javax.swing.JLabel ContaL;
    private javax.swing.JFormattedTextField ContaText;
    private javax.swing.JButton EscolheB;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel NomeL;
    private javax.swing.JTextField NomeText;
    private javax.swing.JLabel SenhaL;
    private javax.swing.JPasswordField SenhaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
