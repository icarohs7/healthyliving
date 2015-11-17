package com.trabalhopac.healthyliving;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class MainForm extends javax.swing.JFrame {

    ArquivoUsuario arquivo = new ArquivoUsuario();

    //Creates new form MainForm
    public MainForm() {

	initComponents();

	//Pega o Escrever gravado no arquivo, e forma a mensagem de boas vindas
	BoasVindas.setText("Olá " + arquivo.Ler());

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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblIMC = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        BoasVindas = new javax.swing.JLabel();

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

        javax.swing.GroupLayout mtlayerpnlFerramentasLayout = new javax.swing.GroupLayout(mtlayerpnlFerramentas);
        mtlayerpnlFerramentas.setLayout(mtlayerpnlFerramentasLayout);
        mtlayerpnlFerramentasLayout.setHorizontalGroup(
            mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(598, Short.MAX_VALUE))
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
        mtlayerpnlFerramentas.setLayer(btnIMC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlFerramentas.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlPai.addTab("Ferramentas", mtlayerpnlFerramentas);

        btnDieta.setText("Dieta");
        btnDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietaActionPerformed(evt);
            }
        });

        jButton3.setText("Opção 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Opção 3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Seu IMC é:");

        lblIMC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblIMC.setText("IMC");

        javax.swing.GroupLayout mtlayerpnlNutricaoLayout = new javax.swing.GroupLayout(mtlayerpnlNutricao);
        mtlayerpnlNutricao.setLayout(mtlayerpnlNutricaoLayout);
        mtlayerpnlNutricaoLayout.setHorizontalGroup(
            mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtlayerpnlNutricaoLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtlayerpnlNutricaoLayout.createSequentialGroup()
                        .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addGap(52, 52, 52)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblIMC)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        mtlayerpnlNutricaoLayout.setVerticalGroup(
            mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlNutricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIMC)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        mtlayerpnlNutricao.setLayer(btnDieta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(lblIMC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlPai.addTab("Nutrição", mtlayerpnlNutricao);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnlPai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair))
                    .addComponent(BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
	dispose();

    }//GEN-LAST:event_btnIMCActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

	arquivo.LogoutUser(); //Executa o método que faz logout do usuário
	new LoginForm().setVisible(true); //Torna a janela TelaLogin visível
	dispose(); //Fecha a Janela atual

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

	//Torna a janela ControleDeCalorias visível
	new ControleDeCalorias().setVisible(true);
	dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

	//new DicasDeNutricao().setVisible(true);
	dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDietaActionPerformed

	//Necessária impletemtação de armazenamento do IMC do usuário para abrir uma dieta condizente com o mesmo
        //if (user.IMC() >= 18 && user.IMC() <= 25)
	//new DietaIMC18a25().setVisible(true);
	//else if (user.IMC() >25)
	//new DietaIMC25acima().setVisible(true);
	//else if (user.IMC() <18)
	//new DietaIMC18abaixo().setVisible(true);
	
	dispose();

    }//GEN-LAST:event_btnDietaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BoasVindas;
    private javax.swing.JButton btnDieta;
    private javax.swing.JButton btnIMC;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLayeredPane mtlayerpnlFerramentas;
    private javax.swing.JLayeredPane mtlayerpnlNutricao;
    private javax.swing.JTabbedPane pnlPai;
    // End of variables declaration//GEN-END:variables
}
