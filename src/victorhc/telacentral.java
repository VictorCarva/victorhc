/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package victorhc;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class telacentral extends javax.swing.JFrame {

    /**
     * Creates new form telacentral
     */
    public telacentral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuarquivo = new javax.swing.JMenu();
        cadmed1 = new javax.swing.JMenuItem();
        pacientetela = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        sairmenu1 = new javax.swing.JMenuItem();
        menusobre = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unimed");

        menuarquivo.setText("Arquivo");

        cadmed1.setText("1 - Cadastrar Med");
        cadmed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadmed1ActionPerformed(evt);
            }
        });
        menuarquivo.add(cadmed1);

        pacientetela.setText("2 - Paciente Tela");
        pacientetela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientetelaActionPerformed(evt);
            }
        });
        menuarquivo.add(pacientetela);

        jMenuItem1.setText("3 - Consulta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuarquivo.add(jMenuItem1);

        sairmenu1.setText("4 - Sair");
        sairmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairmenu1ActionPerformed(evt);
            }
        });
        menuarquivo.add(sairmenu1);

        jMenuBar1.add(menuarquivo);

        menusobre.setText("Sobre");
        menusobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusobreActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Credito.");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menusobre.add(jMenuItem2);

        jMenuBar1.add(menusobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadmed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadmed1ActionPerformed
cadmed tela = new cadmed(); // Cria o formulário de Cadastro
tela.show(); // Exibe o formulário de Cadastro        // TODO add your handling code here:
    }//GEN-LAST:event_cadmed1ActionPerformed

    private void sairmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairmenu1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_sairmenu1ActionPerformed

    private void menusobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusobreActionPerformed
JOptionPane.showMessageDialog(rootPane,"SISTEMA DE MEDICINA\nDESENVOLVIDO POR VICTOR H.CARVALHO...");     // TODO add your handling code here:
    }//GEN-LAST:event_menusobreActionPerformed

    private void pacientetelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientetelaActionPerformed
Cadpaciente tela = new Cadpaciente(); // Cria o formulário de Cadastro
tela.show(); // Exibe o formulário de Cadastro        // TODO add your handling code here:
    }//GEN-LAST:event_pacientetelaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
Consulta tela = new Consulta(); // Cria o formulário de Cadastro
tela.show(); // Exibe o formulário de Cadastro        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
JOptionPane.showMessageDialog(rootPane,"SISTEMA MEDICO DEV POR VICTOR H.CARVALHO...");     // TODO add your handling code here:
                                                     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(telacentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telacentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telacentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telacentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telacentral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadmed1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuarquivo;
    private javax.swing.JMenu menusobre;
    private javax.swing.JMenuItem pacientetela;
    private javax.swing.JMenuItem sairmenu1;
    // End of variables declaration//GEN-END:variables
}
