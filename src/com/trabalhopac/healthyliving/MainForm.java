package com.trabalhopac.healthyliving;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class MainForm extends javax.swing.JFrame implements Runnable {

    ArquivoUsuario arquivo = new ArquivoUsuario();
    ConexaoHTTP conn = new ConexaoHTTP();

    String usuario;

    float peso;
    float altura;
    float imc;
    JSONObject my_obj = new JSONObject();

    //Creates new form MainForm
    public MainForm() {
        
        initComponents();
        new Thread(this).start();
        conferedados();
        start(); //Método usado para atribuir valor às labels
        centralizar();
       

        //Pega o Escrever gravado no arquivo, e forma a mensagem de boas vindas
        this.usuario = arquivo.Ler();
        BoasVindas.setText("Olá, " + this.usuario);
    }

    //Entra com o usuário informado por parâmetro
    public MainForm(String user) {
        
        initComponents();
        new Thread(this).start();
        conferedados();
        start();
        centralizar();
       
        //Pega o usuário informado por parâmetro, e forma a mensagem de boas vindas
        this.usuario = user;
        BoasVindas.setText("Olá, " + user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        BoasVindas = new javax.swing.JLabel();
        lblIMC = new javax.swing.JLabel();
        btnDieta = new javax.swing.JButton();
        btnIMC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Healthy Living");

        btnLogout.setText("Mudar Usuário");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        BoasVindas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        lblIMC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblIMC.setText("Seu IMC é:");

        btnDieta.setText("Dieta");
        btnDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietaActionPerformed(evt);
            }
        });

        btnIMC.setText("Calculadora de IMC");
        btnIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMCActionPerformed(evt);
            }
        });

        jButton2.setText("Controle de Calorias");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPeso.setText("Seu Peso é: Kg");
        lblPeso.setToolTipText("Clique para mudar");
        lblPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesoMouseClicked(evt);
            }
        });

        lblAltura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAltura.setText("Sua Altura é: m");
        lblAltura.setToolTipText("Clique para mudar");

        lblEstado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jLabel1.setText("Clique nos Campos para alterar (Peso e Altura)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 99, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(lblIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEstado)
                        .addGap(32, 32, 32)
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIMC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lblPeso.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        //Abre a mensagem de diálogo para fechar o programa
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Saindo...", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0); //Fecha o programa
        }

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMCActionPerformed

        //Torna a janela CalcIMC visível
        new CalcIMC().setVisible(true);
    }//GEN-LAST:event_btnIMCActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        arquivo.LogoutUser(); //Executa o método que faz logout do usuário
        new LoginForm().setVisible(true); //Torna a janela TelaLogin visível
        dispose();; //Fecha a Janela atual

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        //Torna a janela ControleDeCalorias visível
        new ControleDeCalorias().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void btnDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDietaActionPerformed

        //Necessária impletemtação de armazenamento do IMC do usuário para abrir uma dieta condizente com o mesmo
        if (imc >=18 && imc <= 25){
            new DietaForm("imc18a25").setVisible(true);
        }
        
        else if (imc < 18){
            new DietaForm("imc18abaixo").setVisible(true);
        }
        
        else if (imc > 25){
            new DietaForm("imc25acima").setVisible(true);
        }
        dispose();

    }//GEN-LAST:event_btnDietaActionPerformed

    private void lblPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesoMouseClicked
        // TODO add your handling code here:
        alterarpeso();
    }//GEN-LAST:event_lblPesoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Para chamar esse método, use o seguinte
     *
     * new Thread(this).start();
     *
     * Ele inicia a thread. Esse método busca o peso e altura do Banco de Dados
     */
    @Override
    public void run() {

        String site = "http://healthyliving.aduv.com.br/admin/consulta.php";
        String parametros = "usuario=" + this.usuario;

        JSONObject resposta = conn.httpJson(site, parametros);

        try {

            this.altura = Float.valueOf(resposta.getString("Altura"));
            this.peso = Float.valueOf(resposta.getString("Peso"));
            
            

        } catch (JSONException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void start(){
        lblPeso.setText("Seu Peso é: "+ String.format("%.2f", peso) + " Kg");
        lblAltura.setText("Sua Altura é: "+ String.format("%.2f", altura) + " m");
        imc = peso / (altura*altura);
        lblIMC.setText("Seu IMC é: "+ String.format("%.2f", imc) + " Kg/m²");
        
        alterarestado();
    }
    
    public void conferedados(){
            if (peso == 0){
                alterarpeso();
            }
            
            if (altura == 0){
                alteraraltura();
            }
    }
    
    public void alterarpeso(){
        String temp = null;
        while (temp == null || temp.equals("")){
            temp = JOptionPane.showInputDialog(null, "Informe seu peso (use . para separar decimais)", "Alterar peso", JOptionPane.PLAIN_MESSAGE);
        }
        peso = Float.parseFloat(temp);
        lblPeso.setText("Seu Peso é: "+ String.format("%.2f", peso) + " Kg");
        imc = peso / (altura*altura);
        lblIMC.setText("Seu IMC é: "+ String.format("%.2f", imc) + " Kg/m²");
        alterarestado();
    }
    
    public void alteraraltura(){
        String temp = null;
        while (temp == null || temp.equals("")){
            temp = JOptionPane.showInputDialog(null, "Informe sua altura (use . para separar decimais)", "Altura não encontrada", JOptionPane.PLAIN_MESSAGE);
        }
        altura = Float.parseFloat(temp);
        lblAltura.setText("Sua Altura é: "+ String.format("%.2f", altura) + " m");
        imc = peso / (altura*altura);
        lblIMC.setText("Seu IMC é: "+ String.format("%.2f", imc) + " Kg/m²");
        alterarestado();
    }
    
    public void alterarestado(){
        if (imc <= 18.5) {
            lblEstado.setText("Abaixo do peso.");
        } else if (imc > 18.5 && imc < 25) {
            lblEstado.setText("Peso normal.");
        } else if (imc >= 25 && imc < 30) {
            lblEstado.setText("Sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            lblEstado.setText("Obesidade I.");
        } else if (imc >= 35 && imc < 40) {
            lblEstado.setText("Obesidade II (severa).");
        } else if (imc >= 40) {
            lblEstado.setText("Obesidade III (mórbita).");
        }
    }
    
    public void gravararquivo() throws JSONException{ //mds é mt dificil usar json =\
        
    }
    
    public void lerarquivo() throws JSONException{ //mds²
       
    }
    
    public void centralizar() {
        this.setLocationRelativeTo(null); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BoasVindas;
    private javax.swing.JButton btnDieta;
    private javax.swing.JButton btnIMC;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblPeso;
    // End of variables declaration//GEN-END:variables
}
