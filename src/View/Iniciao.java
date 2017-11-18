package View;

import Classes.Tabela;
import javax.swing.JOptionPane;
import View.*;
import Factory.JogandoFac;
import Classes.*;
import javax.swing.JButton;

public class Iniciao extends javax.swing.JFrame {

    JogandoFac jogandoFac = new JogandoFac();
    Jogando jogando = new Jogando();
    String j1;
    String j2;
    boolean jogador1 = true;
    boolean jogador2 = false;

    String x;
    String o;

    public Iniciao() {
        initComponents();
    }

    public void VezJogador() {
        if (jogador1 == true) {
             //JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
            jogador1 = false;
            jogador2 = true;
        } else {
           // JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
            jogador1 = true;
            jogador2 = false;
        }

        Jogada("X");
        Jogada("0");
    }

    public void Jogada(String jogador) {

        
        // Verificando Linhas 
         
        if (jButton1.getText().equals(jogador)
                && jButton2.getText().equals(jogador)
                && jButton3.getText().equals(jogador)) {

            if (jButton1.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        if (jButton4.getText().equals(jogador)
                && jButton5.getText().equals(jogador)
                && jButton6.getText().equals(jogador)) {

            if (jButton4.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        if (jButton7.getText().equals(jogador)
                && jButton8.getText().equals(jogador)
                && jButton9.getText().equals(jogador)) {

            if (jButton7.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

       // Verificando Colunas
        if (jButton1.getText().equals(jogador)
                && jButton4.getText().equals(jogador)
                && jButton7.getText().equals(jogador)) {

            if (jButton1.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        if (jButton2.getText().equals(jogador)
                && jButton5.getText().equals(jogador)
                && jButton8.getText().equals(jogador)) {

            if (jButton2.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        if (jButton3.getText().equals(jogador)
                && jButton6.getText().equals(jogador)
                && jButton9.getText().equals(jogador)) {

            if (jButton3.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        //Verificando Diagonais 
        if (jButton1.getText().equals(jogador)
                && jButton5.getText().equals(jogador)
                && jButton9.getText().equals(jogador)) {

            if (jButton1.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        if (jButton3.getText().equals(jogador)
                && jButton5.getText().equals(jogador)
                && jButton7.getText().equals(jogador)) {

            if (jButton3.getText().equals("X")) {
                Vencedor("jogador 1");
            } else {
                Vencedor("jogador 2");
            }

        }

        //Verificando Empate 
        if (!jButton1.getText().equals("")
                && !jButton2.getText().equals("")
                && !jButton3.getText().equals("")
                && !jButton4.getText().equals("")
                && !jButton5.getText().equals("")
                && !jButton6.getText().equals("")
                && !jButton7.getText().equals("")
                && !jButton8.getText().equals("")
                && !jButton9.getText().equals("")) {

            Vencedor("Empate");
        }

    }

    public void Vencedor(String Jogada) {

        if (Jogada.equals("jogador 1")) {
            JOptionPane.showMessageDialog(null, "Parabéns " + j1 + " Você venceu o Jogo!");
            
        }

        if (Jogada.equals("jogador 2")) {
            JOptionPane.showMessageDialog(null, "Parabéns " + j2 + " Você venceu o Jogo!");
            
        }

        if (Jogada.equals("Empate")) {
            JOptionPane.showMessageDialog(null, "Jogo Empatado! Joguem Novamente!");
            
        }

    }

    public void LimparCampos() {

        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        jogador1 = true;
        jogador2 = false;

    }

    public void novoJogo (){
        LimparCampos();
        JOptionPane.showMessageDialog(null, "Novo Jogo!!" + "\n" + "\n" + "Informe os jogadores:");

        j1 = JOptionPane.showInputDialog(null, "jogador 1");
        j2 = JOptionPane.showInputDialog(null, "jogador 2");
        
        JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
        /*Xou0 xou0 = new Xou0();
         xou0.setVisible(true);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Novo Jogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        JOptionPane.showMessageDialog(null, "ok");
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       novoJogo();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jogador1 == true) {
            if (jButton1.getText().equals("")) {
                jButton1.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton1.getText().equals("")) {
                jButton1.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jogador1 == true) {
            if (jButton2.getText().equals("")) {
                jButton2.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton2.getText().equals("")) {
                jButton2.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jogador1 == true) {
            if (jButton3.getText().equals("")) {
                jButton3.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton3.getText().equals("")) {
                jButton3.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jogador1 == true) {
            if (jButton4.getText().equals("")) {
                jButton4.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton4.getText().equals("")) {
                jButton4.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jogador1 == true) {
            if (jButton5.getText().equals("")) {
                jButton5.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton5.getText().equals("")) {
                jButton5.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jogador1 == true) {
            if (jButton6.getText().equals("")) {
                jButton6.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton6.getText().equals("")) {
                jButton6.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jogador1 == true) {
            if (jButton7.getText().equals("")) {
                jButton7.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton7.getText().equals("")) {
                jButton7.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jogador1 == true) {
            if (jButton8.getText().equals("")) {
                jButton8.setText("X");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton8.getText().equals("")) {
                jButton8.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jogador1 == true) {
            if (jButton9.getText().equals("")) {
                jButton9.setText("X");
                 JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j2);
                VezJogador();
            }
        } else {
            if (jButton9.getText().equals("")) {
                jButton9.setText("0");
                JOptionPane.showMessageDialog(null, "Sua vez de jogar "+ j1);
                VezJogador();
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        novoJogo();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Iniciao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
