/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Natth
 */
public class CountAlphaFromSentence extends javax.swing.JFrame {

    /**
     * Creates new form CountAlphaFromSentence
     */
    public CountAlphaFromSentence() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarEnter = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        ckbVowel = new javax.swing.JCheckBox();
        ckbVowelNotVowel = new javax.swing.JCheckBox();
        ckbNotVowel = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Created By Natthira");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel1.setText("Pleas Enter Senten :");

        tarEnter.setColumns(20);
        tarEnter.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        tarEnter.setRows(5);
        jScrollPane1.setViewportView(tarEnter);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Count Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Angsana New", 3, 36))); // NOI18N

        buttonGroup1.add(ckbVowel);
        ckbVowel.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        ckbVowel.setText("Vowel(สระ)");
        ckbVowel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVowelActionPerformed(evt);
            }
        });

        buttonGroup1.add(ckbVowelNotVowel);
        ckbVowelNotVowel.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        ckbVowelNotVowel.setText("Vowel & Not Vowel & Count each vowel");
        ckbVowelNotVowel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVowelNotVowelActionPerformed(evt);
            }
        });

        buttonGroup1.add(ckbNotVowel);
        ckbNotVowel.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        ckbNotVowel.setText("Not Vowel");
        ckbNotVowel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbNotVowelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ckbVowelNotVowel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckbVowel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckbNotVowel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbVowel)
                    .addComponent(ckbNotVowel))
                .addGap(34, 34, 34)
                .addComponent(ckbVowelNotVowel)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel2.setText("Result :");

        tarResult.setColumns(20);
        tarResult.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        tarResult.setRows(5);
        jScrollPane2.setViewportView(tarResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnClear.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCount.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        btnCount.setText("Count");
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    tarEnter.setText("");
    tarResult.setText("");
    buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

    private void ckbVowelNotVowelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVowelNotVowelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbVowelNotVowelActionPerformed

    private void ckbVowelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVowelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbVowelActionPerformed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        int p = 0, v = 0, a = 0, e = 0, i = 0, o = 0, u = 0;
        String s="";
        String sentence = tarEnter.getText();
        if (ckbVowel.isSelected()) {
            for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                    v++;
                    if (c == 'a' || c == 'A') {
                        a++;
                    } else if (c == 'e' || c == 'E') {
                        e++;
                    } else if (c == 'i' || c == 'I') {
                        i++;
                    } else if (c == 'o' || c == 'O') {
                        o++;
                    } else if (c == 'u' || c == 'U') {
                        u++;
                    }
                }
            }
            tarResult.setText("Input : '" + sentence + "' contains " + v + " Vowel" + "\n-->A = " + a + ",E = " + e + ",I = " + i + ",O = " + o + ",U = " + u);
        } else if (ckbNotVowel.isSelected()) {
           for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                    v++;
                }else{
                    p++;
                    c = sentence.charAt(j);
                    s += String.valueOf(c);
                }
            }
                    tarResult.setText("Input : '" + sentence + "' contains " + p + " Alphabets(Not vowel)\n-->Not Vowel are : "+ ""+s); 
                
            
        } else if (ckbVowelNotVowel.isSelected()) {
 for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                    v++;
                    if (c == 'a' || c == 'A') {
                        a++;
                    } else if (c == 'e' || c == 'E') {
                        e++;
                    } else if (c == 'i' || c == 'I') {
                        i++;
                    } else if (c == 'o' || c == 'O') {
                        o++;
                    } else if (c == 'u' || c == 'U') {
                        u++;
                    }
                }else{
                    p++;
                    c = sentence.charAt(j);
                    s += String.valueOf(c);
                }
            }
            tarResult.setText("Input : '" + sentence + "' contains " + v + " Vowel" + "\n-->A = " + a + ",E = " + e + ",I = " + i + ",O = " + o + ",U = " + u+"\nInput : '" + sentence + "' contains " + p + " Alphabets(Not vowel)\n-->Not Vowel are : "+ ""+s);
        
        }
    }//GEN-LAST:event_btnCountActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void ckbNotVowelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbNotVowelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbNotVowelActionPerformed

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
            java.util.logging.Logger.getLogger(CountAlphaFromSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountAlphaFromSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountAlphaFromSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountAlphaFromSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountAlphaFromSentence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbNotVowel;
    private javax.swing.JCheckBox ckbVowel;
    private javax.swing.JCheckBox ckbVowelNotVowel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tarEnter;
    private javax.swing.JTextArea tarResult;
    // End of variables declaration//GEN-END:variables
}