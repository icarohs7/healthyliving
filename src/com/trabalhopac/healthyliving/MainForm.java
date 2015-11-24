package com.trabalhopac.healthyliving;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class MainForm extends javax.swing.JFrame {

    ArquivoUsuario arquivo = new ArquivoUsuario();
    ConexaoHTTP conn = new ConexaoHTTP();

    String usuario;

    float peso;
    float altura;
    float imc;

    //Creates new form MainForm
    public MainForm() {

        initComponents();
        setDados();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPai = new javax.swing.JTabbedPane();
        mtlayerpnlFerramentas = new javax.swing.JLayeredPane();
        btnIMC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mtlayerpnlNutricao = new javax.swing.JLayeredPane();
        btnDieta = new javax.swing.JButton();
        btnDicaDoDia = new javax.swing.JButton();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblIMC = new javax.swing.JLabel();
        lblTipoImc = new javax.swing.JLabel();
        mtlayerpnlUsuario = new javax.swing.JLayeredPane();
        lblInfoNome = new javax.swing.JLabel();
        lblInfoIdade = new javax.swing.JLabel();
        lblInfoSexo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblBoasVindas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Healthy Living");

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

        mtlayerpnlFerramentas.setLayer(btnIMC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlFerramentas.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mtlayerpnlFerramentasLayout = new javax.swing.GroupLayout(mtlayerpnlFerramentas);
        mtlayerpnlFerramentas.setLayout(mtlayerpnlFerramentasLayout);
        mtlayerpnlFerramentasLayout.setHorizontalGroup(
            mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        mtlayerpnlFerramentasLayout.setVerticalGroup(
            mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pnlPai.addTab("Ferramentas", mtlayerpnlFerramentas);

        btnDieta.setText("Dieta");
        btnDieta.setMaximumSize(new java.awt.Dimension(145, 29));
        btnDieta.setMinimumSize(new java.awt.Dimension(145, 29));
        btnDieta.setPreferredSize(new java.awt.Dimension(145, 29));
        btnDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietaActionPerformed(evt);
            }
        });

        btnDicaDoDia.setText("Dica do dia");
        btnDicaDoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDicaDoDiaActionPerformed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblPeso.setText("Peso:");

        lblAltura.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblAltura.setText("Altura:");

        lblIMC.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblIMC.setText("IMC:");

        lblTipoImc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTipoImc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        mtlayerpnlNutricao.setLayer(btnDieta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(btnDicaDoDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(lblPeso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(lblAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(lblIMC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(lblTipoImc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mtlayerpnlNutricaoLayout = new javax.swing.GroupLayout(mtlayerpnlNutricao);
        mtlayerpnlNutricao.setLayout(mtlayerpnlNutricaoLayout);
        mtlayerpnlNutricaoLayout.setHorizontalGroup(
            mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtlayerpnlNutricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDicaDoDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(lblIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoImc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mtlayerpnlNutricaoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDicaDoDia, btnDieta});

        mtlayerpnlNutricaoLayout.setVerticalGroup(
            mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlNutricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mtlayerpnlNutricaoLayout.createSequentialGroup()
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoImc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mtlayerpnlNutricaoLayout.createSequentialGroup()
                        .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDicaDoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pnlPai.addTab("Nutrição", mtlayerpnlNutricao);

        lblInfoNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoNome.setText("Nome:");

        lblInfoIdade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoIdade.setText("Idade:");

        lblInfoSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoSexo.setText("Sexo:");

        jButton1.setText("Alterar dados");

        mtlayerpnlUsuario.setLayer(lblInfoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlUsuario.setLayer(lblInfoIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlUsuario.setLayer(lblInfoSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlUsuario.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mtlayerpnlUsuarioLayout = new javax.swing.GroupLayout(mtlayerpnlUsuario);
        mtlayerpnlUsuario.setLayout(mtlayerpnlUsuarioLayout);
        mtlayerpnlUsuarioLayout.setHorizontalGroup(
            mtlayerpnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoNome)
                    .addComponent(lblInfoIdade)
                    .addComponent(lblInfoSexo)
                    .addComponent(jButton1))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        mtlayerpnlUsuarioLayout.setVerticalGroup(
            mtlayerpnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pnlPai.addTab("Usuário", mtlayerpnlUsuario);

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

        lblBoasVindas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBoasVindas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBoasVindasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout)))
                .addContainerGap())
            .addComponent(pnlPai)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair))
                    .addComponent(lblBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
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
        dispose(); //Fecha a Janela atual

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        //Torna a janela ControleDeCalorias visível
        new ControleDeCalorias().setVisible(true);

    }//GEN-LAST:event_jButton2MouseClicked

    private void btnDicaDoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDicaDoDiaActionPerformed

        new DicaDoDia().setVisible(true);

    }//GEN-LAST:event_btnDicaDoDiaActionPerformed

    private void btnDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDietaActionPerformed

        if (peso != 0 || altura != 0) {

            new DietaForm(imc).setVisible(true);

        } else {

            //chama form que adiciona dados
            
        }


    }//GEN-LAST:event_btnDietaActionPerformed

    private void lblBoasVindasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBoasVindasMouseClicked

        pnlPai.setSelectedIndex(2);

    }//GEN-LAST:event_lblBoasVindasMouseClicked

    private void setDados() {

        //Obtém o JSON do arquivo
        JSONObject userdata = arquivo.lerJson();

        try {

            lblBoasVindas.setText("Olá " + userdata.getString("Nome"));

            this.peso = Float.parseFloat(userdata.getString("Peso"));
            this.altura = Float.parseFloat(userdata.getString("Altura"));
            this.imc = new CalcIMC().getImc(peso, altura);

            lblPeso.setText("Peso: " + peso + "kg");
            lblAltura.setText("Altura: " + altura + "m");
            lblIMC.setText("IMC: " + String.format("%.2f", imc));
            lblTipoImc.setText(new CalcIMC().getTipoImc(imc));

            lblInfoNome.setText("Nome: " + userdata.getString("Nome"));

        } catch (JSONException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Calcula a idade de acordo com a data passada.
     *
     * @param data
     * @return A idade da pessoa
     * @author Isaias Pfaffenseller
     */
    public static Integer getIdade(Date data) {

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(data);
        Calendar dataAtual = Calendar.getInstance();

        Integer diferencaMes = dataAtual.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
        Integer diferencaDia = dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
        Integer idade = (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));

        if (diferencaMes < 0 || (diferencaMes == 0 && diferencaDia < 0)) {
            idade--;
        }

        return idade;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDicaDoDia;
    private javax.swing.JButton btnDieta;
    private javax.swing.JButton btnIMC;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBoasVindas;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblInfoIdade;
    private javax.swing.JLabel lblInfoNome;
    private javax.swing.JLabel lblInfoSexo;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTipoImc;
    private javax.swing.JLayeredPane mtlayerpnlFerramentas;
    private javax.swing.JLayeredPane mtlayerpnlNutricao;
    private javax.swing.JLayeredPane mtlayerpnlUsuario;
    private javax.swing.JTabbedPane pnlPai;
    // End of variables declaration//GEN-END:variables
}
