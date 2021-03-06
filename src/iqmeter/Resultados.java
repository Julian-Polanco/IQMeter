/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iqmeter;

import java.awt.Color;

/**
 *
 * @author Julian polanco
 */
public class Resultados extends javax.swing.JFrame {

    public static String[][] preguntas = new String[5][3];

    /**
     * Creates new form Resultados
     */
    public Resultados() {
        initComponents();
        this.setLocationRelativeTo(null);
        analizarResultados();
    }

    public void analizarResultados() {
        for (int i = 0; i < 5; i++) {
            if (preguntas[i][2].equals("Correcta")) {
                progress.setValue(progress.getValue() + 20);
            }

        }
        Pregunta.setText(preguntas[0][0]);
        Respuesta.setText(preguntas[0][1]);
        valor.setText(preguntas[0][2]);
        if (preguntas[0][2].equals("Correcta")) {
            valor.setForeground(Color.green);
        } else {
            valor.setForeground(Color.red);
        }
        Pregunta1.setText(preguntas[1][0]);
        Respuesta1.setText(preguntas[1][1]);
        valor1.setText(preguntas[1][2]);
        if (preguntas[1][2].equals("Correcta")) {
            valor1.setForeground(Color.green);
        } else {
            valor1.setForeground(Color.red);
        }
        Pregunta2.setText(preguntas[2][0]);
        Respuesta2.setText(preguntas[2][1]);
        valor2.setText(preguntas[2][2]);
        if (preguntas[2][2].equals("Correcta")) {
            valor2.setForeground(Color.green);
        } else {
            valor2.setForeground(Color.red);
        }
        Pregunta3.setText(preguntas[3][0]);
        Respuesta3.setText(preguntas[3][1]);
        valor3.setText(preguntas[3][2]);
        if (preguntas[3][2].equals("Correcta")) {
            valor3.setForeground(Color.green);
        } else {
            valor3.setForeground(Color.red);
        }
        Pregunta4.setText(preguntas[4][0]);
        Respuesta4.setText(preguntas[4][1]);
        valor4.setText(preguntas[4][2]);
        if (preguntas[4][2].equals("Correcta")) {
            valor4.setForeground(Color.green);
        } else {
            valor4.setForeground(Color.red);
        }
        if (progress.getValue() >= 0 && progress.getValue() <= 40) {
            jLabel2.setText("Segun sus respuestas su IQ es Deficiente");
        }
        if (progress.getValue() > 40 && progress.getValue() <= 60) {
            jLabel2.setText("Segun sus respuestas su IQ es Bueno");
        }
        if (progress.getValue() > 60 && progress.getValue() <= 100) {
            jLabel2.setText("Segun sus respuestas su IQ es Excelente");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        Pregunta = new javax.swing.JLabel();
        Respuesta = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        valor1 = new javax.swing.JLabel();
        Respuesta1 = new javax.swing.JLabel();
        Pregunta1 = new javax.swing.JLabel();
        valor2 = new javax.swing.JLabel();
        Respuesta2 = new javax.swing.JLabel();
        Pregunta2 = new javax.swing.JLabel();
        valor3 = new javax.swing.JLabel();
        Respuesta3 = new javax.swing.JLabel();
        Pregunta3 = new javax.swing.JLabel();
        valor4 = new javax.swing.JLabel();
        Respuesta4 = new javax.swing.JLabel();
        Pregunta4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("IQMeter");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brain.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Segun sus respuestas su IQ es Lorem");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Volver a Jugar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Volver al Inicio");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pregunta1)
                                    .addComponent(Pregunta2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pregunta4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pregunta3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Respuesta1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(valor1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Respuesta2)
                                        .addGap(12, 12, 12)
                                        .addComponent(valor2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Respuesta3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(valor3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Respuesta4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(valor4))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pregunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Respuesta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pregunta)
                    .addComponent(Respuesta)
                    .addComponent(valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pregunta1)
                    .addComponent(Respuesta1)
                    .addComponent(valor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor2)
                    .addComponent(Respuesta2)
                    .addComponent(Pregunta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor3)
                    .addComponent(Respuesta3)
                    .addComponent(Pregunta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor4)
                    .addComponent(Pregunta4)
                    .addComponent(Respuesta4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pregunta1 interfaz = new Pregunta1();
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio interfaz = new Inicio();
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pregunta;
    private javax.swing.JLabel Pregunta1;
    private javax.swing.JLabel Pregunta2;
    private javax.swing.JLabel Pregunta3;
    private javax.swing.JLabel Pregunta4;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JLabel Respuesta1;
    private javax.swing.JLabel Respuesta2;
    private javax.swing.JLabel Respuesta3;
    private javax.swing.JLabel Respuesta4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel valor;
    private javax.swing.JLabel valor1;
    private javax.swing.JLabel valor2;
    private javax.swing.JLabel valor3;
    private javax.swing.JLabel valor4;
    // End of variables declaration//GEN-END:variables
}
