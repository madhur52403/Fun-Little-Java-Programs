/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Madhur
 */
public class TicTacToe extends javax.swing.JFrame {
    
   

    private String Turn = "X";
    private String P1 = "Player One";
    private String P2 = "Player Two";
    private int P1_Count = 0;
    private int P2_Count = 0;
    private int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
    private String P_Turn = "";
    private Color B_Color; 
    public TicTacToe() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        Get_Players();
        Set_Score();
        B_Color = jButton1.getBackground();

        
    }
    
    private void Get_Players(){
        P1 = JOptionPane.showInputDialog(this,
                "Player One Name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
    
     P2 = JOptionPane.showInputDialog(this,
                "Player Two Name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
     if(P1.equals("")){
         P1 = "Player One";
     }
     if(P2.equals("")){
         P2 = "Player Two";
     }
     P_Turn = P1;
    }
 
    private void Next_Turn(){
        if(Turn.equalsIgnoreCase("X")){
            
            Turn = "O";
        }
        else{
            Turn = "X";
        }
         if(Turn.equalsIgnoreCase("X")){
            
            P_Turn = P1;
        }
        else{
            P_Turn = P2;
        }
          jLabelScore.setText(P1 + "'s Score: " + String.valueOf(P1_Count) + "         "+P_Turn+"'s turn"+"         " + P2 + "'s Score: " + String.valueOf(P2_Count));
        
      
    }
    
    private void X_Wins(){
        JOptionPane.showMessageDialog( this , P1 + " " + "Wins", "Winner" , JOptionPane.INFORMATION_MESSAGE);
        P1_Count++;
        Reset();
        
    }
    
    private void O_Wins(){
        JOptionPane.showMessageDialog( this , P2 + " " + "Wins", "Winner" , JOptionPane.INFORMATION_MESSAGE);
        P2_Count++;
        Reset();
        
    }
    
    private void Set_Score(){
          
        
        
        jLabelScore.setText(P1 + "'s Score: " + String.valueOf(P1_Count) + "         "+P_Turn+"'s turn"+"         " + P2 + "'s Score: " + String.valueOf(P2_Count));
    }
    
    private void Reset(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton1.setBackground(B_Color);
        jButton2.setBackground(B_Color);
        jButton3.setBackground(B_Color);
        jButton4.setBackground(B_Color);
        jButton5.setBackground(B_Color);
        jButton6.setBackground(B_Color);
        jButton7.setBackground(B_Color);
        jButton8.setBackground(B_Color);
        jButton9.setBackground(B_Color);
        Set_Score();
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
        h=0;
        i=0;
      
    }
    
   
    
    private void Win(){
        
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        //if X wins
        if(one == "X" && two == "X" && three == "X"){
            jButton1.setBackground(Color.green);
            jButton2.setBackground(Color.green);
            jButton3.setBackground(Color.green);
            X_Wins();
        }
         if(four == "X" && five == "X" && six == "X"){
             jButton4.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton6.setBackground(Color.green);
            X_Wins();
         }
         if(seven == "X" && eight == "X" && nine == "X"){
             jButton7.setBackground(Color.green);
            jButton8.setBackground(Color.green);
            jButton9.setBackground(Color.green);
            X_Wins();
         }
         if(one == "X" && four == "X" && seven == "X"){
             jButton1.setBackground(Color.green);
            jButton4.setBackground(Color.green);
            jButton7.setBackground(Color.green);
            X_Wins();
         }
         if (two == "X" && five == "X" && eight== "X"){
           jButton2.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton8.setBackground(Color.green);
             X_Wins();
         }
         if (three == "X" && six == "X" && nine == "X"){
             jButton3.setBackground(Color.green);
            jButton6.setBackground(Color.green);
            jButton9.setBackground(Color.green);
          X_Wins();
         }
         if (one == "X" && five == "X" && nine == "X"){
             jButton1.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton9.setBackground(Color.green);
             X_Wins();
             }
         if (three == "X" && five == "X" && seven == "X"){
             jButton3.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton7.setBackground(Color.green);
             X_Wins();
         }
         
         //if O wins
                if(one == "O" && two == "O" && three == "O"){
                jButton1.setBackground(Color.green);
            jButton2.setBackground(Color.green);
            jButton3.setBackground(Color.green);
            O_Wins();
        }
         if(four == "O" && five == "O" && six == "O"){
             jButton4.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton6.setBackground(Color.green);
            O_Wins();
         }
         if(seven == "O" && eight == "O" && nine == "O"){
              jButton7.setBackground(Color.green);
            jButton8.setBackground(Color.green);
            jButton9.setBackground(Color.green);
            O_Wins();
         }
         if(one == "O" && four == "O" && seven == "O"){
             jButton1.setBackground(Color.green);
            jButton4.setBackground(Color.green);
            jButton7.setBackground(Color.green);
            O_Wins();
         }
         if (two == "O" && five == "O" && eight== "O"){
             jButton2.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton8.setBackground(Color.green);
           O_Wins();
         }
         if (three == "O" && six == "O" && nine == "O"){
             jButton3.setBackground(Color.green);
            jButton6.setBackground(Color.green);
            jButton9.setBackground(Color.green);
          O_Wins();
         }
         if (one == "O" && five == "O" && nine == "O"){
             jButton1.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton9.setBackground(Color.green);
             O_Wins();
             }
         if (three == "O" && five == "O" && seven == "O"){
             jButton3.setBackground(Color.green);
            jButton5.setBackground(Color.green);
            jButton7.setBackground(Color.green);
             O_Wins();
         }
    }
    
    private void Tie(){
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        if(one != "" && two != "" && three != "" && four != "" && five != "" && six != "" &&
                seven != "" && eight != "" && nine != ""){
            
            JOptionPane.showMessageDialog( this ,"Game is a Tie!!", "Tie" , JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
            
    }
   
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelScore = new javax.swing.JLabel();
        jPanel_Grid = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic_Tac_Toe");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabelScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelScore.setForeground(new java.awt.Color(255, 255, 255));
        jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore.setText("Scores");
        jPanel1.add(jLabelScore, java.awt.BorderLayout.PAGE_END);

        jPanel_Grid.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_Grid.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanel_9);

        jPanel1.add(jPanel_Grid, java.awt.BorderLayout.CENTER);

        Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setText("HOME");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HomeMouseReleased(evt);
            }
        });
        jPanel1.add(Home, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a++;
        if(a<=1){
        jButton1.setText(Turn);
       
        if(Turn.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.RED);
           // jButton1.computeVisibleRe;
            
        }else{
            jButton1.setForeground(Color.BLUE);
        }
        jButton1.setFocusPainted(false);
        Win();
        Tie();
        Next_Turn();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         b++;
        if(b<=1){
        jButton2.setText(Turn);
        
       
          if(Turn.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.RED);
        }else{
            jButton2.setForeground(Color.BLUE);
        }
          jButton2.setFocusPainted(false);
          Win();
          Tie();
        Next_Turn();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        c++;
        if(c<=1){
        jButton3.setText(Turn);
        
      
          if(Turn.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.RED);
        }else{
            jButton3.setForeground(Color.BLUE);
        }
          jButton3.setFocusPainted(false);
          Win();
          Tie();
        Next_Turn();
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        d++;
        if(d<=1){
        jButton4.setText(Turn);
        
       
          if(Turn.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.RED);
        }else{
            jButton4.setForeground(Color.BLUE);
        }
          jButton4.setFocusPainted(false);
          Win();
          Tie();
        Next_Turn();
        
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        e++;
        if(e<=1){
        jButton5.setText(Turn);
        
     
          if(Turn.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.RED);
        }else{
            jButton5.setForeground(Color.BLUE);
        }
          jButton5.setFocusPainted(false);
          Win();
          Tie();
        Next_Turn();
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        f++;
        if(f<=1){
        jButton6.setText(Turn);
      
          if(Turn.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.RED);
        }else{
            jButton6.setForeground(Color.BLUE);
        }
          jButton6.setFocusPainted(false);
    
          Win();
          Tie();
        Next_Turn();
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        g++;
        if(g<=1){
        jButton7.setText(Turn);
        
      
          if(Turn.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.RED);
        }else{
            jButton7.setForeground(Color.BLUE);
        }
          jButton7.setFocusPainted(false);
          Win();
          Tie();
        Next_Turn();
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        h++;
        if(h<=1){
        jButton8.setText(Turn);
        
     
         if(Turn.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.RED);
        }else{
            jButton8.setForeground(Color.BLUE);
        }
         jButton8.setFocusPainted(false);
         Win();
         Tie();
        Next_Turn();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         i++;
        if(i<=1){
        jButton9.setText(Turn);
        
      
          if(Turn.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.RED);
        }else{
            jButton9.setForeground(Color.BLUE);
        }
          jButton9.setFocusPainted(false);
          Win();
          Tie();
        Next_Turn();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void HomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseReleased
       this.setVisible(false);
       Main m = new Main();
       m.setVisible(true);
      // System.exit(0);
       
    }//GEN-LAST:event_HomeMouseReleased

    
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_Grid;
    // End of variables declaration//GEN-END:variables
}
