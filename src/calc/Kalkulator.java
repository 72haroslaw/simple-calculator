package calc;

import javax.swing.JOptionPane;

public class Kalkulator extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Kalkulator() {
        initComponents();
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_Title = new javax.swing.JLabel();
        jTextField1_Arg1 = new javax.swing.JTextField();
        jTextField2_Arg2 = new javax.swing.JTextField();
        jButton1_Policz = new javax.swing.JButton();
        jTextField3_Wynik = new javax.swing.JTextField();
        jComboBox1_Operacje = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setBackground(new java.awt.Color(255, 0, 0));

        jLabel1_Title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1_Title.setForeground(java.awt.Color.blue);
        jLabel1_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_Title.setText("Kalkulator");
        jLabel1_Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTextField1_Arg1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1_Arg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_Arg1ActionPerformed(evt);
            }
        });

        jTextField2_Arg2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField2_Arg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_Arg2ActionPerformed(evt);
            }
        });

        jButton1_Policz.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1_Policz.setText("Oblicz");
        jButton1_Policz.setAlignmentY(0.0F);
        jButton1_Policz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_PoliczActionPerformed(evt);
            }
        });

        jTextField3_Wynik.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField3_Wynik.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox1_Operacje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1_Operacje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", "mod" }));
        jComboBox1_Operacje.setToolTipText("");
        jComboBox1_Operacje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_OperacjeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Liczba 1");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Liczba 2");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Działanie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3_Wynik)
                            .addComponent(jButton1_Policz, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1_Arg1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1_Operacje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 82, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_Arg2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_Arg1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1_Operacje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_Arg2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton1_Policz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3_Wynik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_PoliczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_PoliczActionPerformed

    przelicz();
        
    }//GEN-LAST:event_jButton1_PoliczActionPerformed

    private void jComboBox1_OperacjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_OperacjeActionPerformed
        
    przelicz();   

    }//GEN-LAST:event_jComboBox1_OperacjeActionPerformed

    private void jTextField1_Arg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_Arg1ActionPerformed
    przelicz(); 
    }//GEN-LAST:event_jTextField1_Arg1ActionPerformed

    private void jTextField2_Arg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_Arg2ActionPerformed
    przelicz();
    }//GEN-LAST:event_jTextField2_Arg2ActionPerformed

    private void przelicz() {
    
    try {
            String arg1String = jTextField1_Arg1.getText();
            String arg2String = jTextField2_Arg2.getText();

            String operacja = (String) jComboBox1_Operacje.getSelectedItem();

            double arg1 = Double.parseDouble(arg1String.replace(',', '.'));
            double arg2 = Double.parseDouble(arg2String.replace(',', '.'));

            double wynik = Logika.policz(arg1, arg2, operacja);

            jTextField3_Wynik.setText("" + wynik);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Oooo...", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    
}
    
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Policz;
    private javax.swing.JComboBox<String> jComboBox1_Operacje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Title;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1_Arg1;
    private javax.swing.JTextField jTextField2_Arg2;
    private javax.swing.JTextField jTextField3_Wynik;
    // End of variables declaration//GEN-END:variables
}
