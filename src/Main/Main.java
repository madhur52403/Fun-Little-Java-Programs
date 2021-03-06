/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author kev
 */
public class Main extends javax.swing.JFrame {

   
    int xMouse;
    int yMouse;
    public Main() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JLabel();
        TTT = new javax.swing.JLabel();
        Widget = new javax.swing.JLabel();
        TTS = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 20));

        TTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TTTMouseReleased(evt);
            }
        });
        getContentPane().add(TTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 360, 50));

        Widget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Widget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                WidgetMouseReleased(evt);
            }
        });
        getContentPane().add(Widget, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 360, 50));

        TTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TTSMouseReleased(evt);
            }
        });
        getContentPane().add(TTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 174, 360, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/Main.png"))); // NOI18N
        Background.setText("jLabel1");
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        setSize(new java.awt.Dimension(600, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void TTTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTTMouseReleased
        this.setVisible(false);
        TicTacToe t = new TicTacToe();
        t.setVisible(true);
    }//GEN-LAST:event_TTTMouseReleased

    private void TTSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTSMouseReleased
        this.setVisible(false);
        TTS t = new TTS();
        t.setVisible(true);
    }//GEN-LAST:event_TTSMouseReleased

    private void WidgetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WidgetMouseReleased
        this.setVisible(false);
        Widget w = new Widget();
        w.setVisible(true);
       
    }//GEN-LAST:event_WidgetMouseReleased

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel TTS;
    private javax.swing.JLabel TTT;
    private javax.swing.JLabel Widget;
    // End of variables declaration//GEN-END:variables
}
