package com.trabalhopac.healthyliving;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos, Suellen, Vitor e Ícaro
 */
public class DietaForm extends javax.swing.JFrame implements Runnable {

    String dieta;

    public DietaForm(String dieta) {

        initComponents();
        
        this.setLocationRelativeTo(null); 
        this.dieta = dieta;
        new Thread(this).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        htmlPane = new javax.swing.JEditorPane();
        progresso = new javax.swing.JProgressBar();
        progresso.setIndeterminate(true);
        txtLoading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        htmlPane.setEditable(false);
        htmlPane.setContentType("text/html"); // NOI18N
        htmlPane.setText("");
        htmlPane.setToolTipText("");
        jScrollPane1.setViewportView(htmlPane);

        txtLoading.setText("Carregando...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtLoading)
                            .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(292, 292, 292)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLoading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        new MainForm().setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        //Abre a mensagem de diálogo para fechar o programa
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Saindo...", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0); //Fecha o programa
        }

    }//GEN-LAST:event_btnSairActionPerformed

    @Override
    public void run() {

        String site = "http://healthyliving.aduv.com.br/admin/dietas/dieta.php";
        String parametros = "dieta=" + dieta;
        
        StringBuilder resposta = new ConexaoHTTP().httpBuffer(site, parametros);
        htmlPane.setText(resposta.toString());

        txtLoading.setVisible(false);
        progresso.setVisible(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JEditorPane htmlPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progresso;
    private javax.swing.JLabel txtLoading;
    // End of variables declaration//GEN-END:variables
}
