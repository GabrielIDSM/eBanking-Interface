package Contas.pkg;

import Classes_utilit.pkg.*;
import Interface.pkg.interfaceFrame;
import javax.swing.JFormattedTextField;
import java.math.BigDecimal;
/**
 *
 * @author Gabri
 */
public class fazerTransferencia extends javax.swing.JInternalFrame {
    //Atributos IN
    String conta;
    String senha;
    //Método construtor IN
    public fazerTransferencia(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contaDestino = new javax.swing.JFormattedTextField();
        valorTransferido = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        senhaConfirmada = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(70, 70, 70));
        setBorder(null);
        setClosable(true);
        setResizable(true);
        setTitle("Transferência");
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(390, 310));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Conta destino");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Valor");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha");

        try {
            contaDestino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contaDestino.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        contaDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contaDestinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contaDestinoFocusLost(evt);
            }
        });

        valorTransferido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        valorTransferido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        valorTransferido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorTransferidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valorTransferidoFocusLost(evt);
            }
        });
        valorTransferido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorTransferidoMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 200, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(20, 20, 20));
        jButton1.setText("Confirmar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        senhaConfirmada.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(contaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorTransferido)
                            .addComponent(senhaConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valorTransferido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] auxLeitura;
        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                                + this.conta + "\\Saldo.txt");
        String saldo = auxLeitura[0];
        String contaDest = contaDestino.getText();
        String valor = valorTransferido.getText();
        valor = valor.replace(',', '.');
        char[] confirmaSenha = senhaConfirmada.getPassword();
        //Criar string IN
        String confirmaSenhaString = "";
        for(int i = 0; i < confirmaSenha.length; i++) confirmaSenhaString += confirmaSenha[i];
        if(!this.senha.equals(confirmaSenhaString)){
            this.dispose();
            mensagens.exibeMensagemFracasso("Senha incorreta");
        }else if(this.conta.equals(contaDest)){
            this.dispose();       
            mensagens.exibeMensagemFracasso("Não é possível efetuar uma transferência\npara a própria conta");
        }else{
            try{
                BigDecimal saldoAux = new BigDecimal(saldo);
                BigDecimal valorAux = new BigDecimal(valor);
                if(saldoAux.compareTo(valorAux) < 0 || saldoAux.compareTo(new BigDecimal("0.0")) < 0){
                    this.dispose();                    
                }else{
                    String[] contasC = interfaceFrame.ContasC;
                    String[] contasE = interfaceFrame.ContasE;
                    boolean verifica = false;
                    for( int i = 0; i < contasC.length; i+=2){
                        if(contasC[i].equals(contaDest)){
                            verifica = true;
                            break;
                        }
                    }
                    for( int i = 0; i < contasE.length; i+=2){
                        if(contasE[i].equals(contaDest)){
                            verifica = true;
                            break;
                        }
                    }
                    if(verifica){
                        //Efetua a transferência IN
                        //Diminui saldo da conta em <valor>
                        saldoAux = saldoAux.subtract(valorAux);
                        leituraEscrita.Reescrita("Arquivos\\DadosContas\\"
                                + this.conta + "\\Saldo.txt", saldoAux.toPlainString());
                        //Aumenta saldo da conta destino em <valor>
                        String[] saldoAumentado = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                                + contaDest + "\\Saldo.txt");
                        BigDecimal saldoAumentadoAux = new BigDecimal(saldoAumentado[0]);
                        saldoAumentadoAux = saldoAumentadoAux.add(valorAux);
                        leituraEscrita.Reescrita("Arquivos\\DadosContas\\"
                                + contaDest + "\\Saldo.txt", saldoAumentadoAux.toPlainString());
                        //Adiconar ao Extrato
                        
                        String dataTransf = temporizadorDataTempo.retornaStringDataAtual();
                        String nomeAt;
                        String nomePa;
                        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                                + this.conta + "\\Nome.txt");
                        nomeAt = auxLeitura[0];
                        auxLeitura = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
                                + contaDest + "\\Nome.txt");
                        nomePa = auxLeitura[0];
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + this.conta + "\\Extrato.txt", "\n\nTransferência feita\nValor: "+stringSaldo.retornaStringSaldo(valorAux.toPlainString()));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + this.conta + "\\Extrato.txt","\nData: "+dataTransf);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + this.conta + "\\Extrato.txt","\nPara: "+nomePa);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + this.conta + "\\Extrato.txt","\nConta: "+contaDest);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + contaDest + "\\Extrato.txt", "\n\nTransferência recebida\nValor: "+stringSaldo.retornaStringSaldo(valorAux.toPlainString()));
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + contaDest + "\\Extrato.txt","\nData: "+dataTransf);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + contaDest + "\\Extrato.txt","\nDe: "+nomeAt);
                        leituraEscrita.Escrita("Arquivos\\DadosContas\\"
                                + contaDest + "\\Extrato.txt","\nConta: "+this.conta);
                        
                        this.dispose(); 
                        mensagens.exibeMensagemSucesso();
                    }
                }
            }catch(Exception e){
                this.dispose();
                mensagens.exibeMensagemFracasso();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contaDestinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contaDestinoFocusLost
        contaDestino.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_contaDestinoFocusLost

    private void valorTransferidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorTransferidoFocusLost
        valorTransferido.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_valorTransferidoFocusLost

    private void contaDestinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contaDestinoFocusGained
        contaDestino.setText("");
    }//GEN-LAST:event_contaDestinoFocusGained

    private void valorTransferidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorTransferidoFocusGained
        valorTransferido.setText("");
    }//GEN-LAST:event_valorTransferidoFocusGained

    private void valorTransferidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorTransferidoMouseClicked
        valorTransferido.setText("");
        valorTransferido.setCaretPosition(0);
    }//GEN-LAST:event_valorTransferidoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField contaDestino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senhaConfirmada;
    private javax.swing.JFormattedTextField valorTransferido;
    // End of variables declaration//GEN-END:variables
}
