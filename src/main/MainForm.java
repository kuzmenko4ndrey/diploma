/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Neophron
 */
public class MainForm extends javax.swing.JFrame {

    Graphics g;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
//        loadButton.setVisible(false);
//        saveButton.setVisible(false);
        fRB.setVisible(false);
    }

    private void init() {
        g = canvas1.getGraphics();
        tr = new Terrain(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        plainRB = new javax.swing.JRadioButton();
        waterRB = new javax.swing.JRadioButton();
        swampRB = new javax.swing.JRadioButton();
        hillRB = new javax.swing.JRadioButton();
        colonyRB = new javax.swing.JRadioButton();
        fRB = new javax.swing.JRadioButton();
        runBatton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas1MousePressed(evt);
            }
        });
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);
            }
        });

        plainRB.setText("Plain");

        waterRB.setText("Water");

        swampRB.setText("Swamp");

        hillRB.setText("Hill");

        colonyRB.setText("Colony");

        fRB.setText("F");

        runBatton.setText("Run");
        runBatton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBattonActionPerformed(evt);
            }
        });

        pauseButton.setText("Pause");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        jTextField2.setText("0");

        jTextField3.setText("0");

        jLabel1.setText("Agent count");

        jLabel2.setText("Probability to change colony");

        jLabel3.setText("Probability to start war");

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(runBatton)
                        .addGap(18, 18, 18)
                        .addComponent(pauseButton)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(waterRB)
                                            .addComponent(swampRB)
                                            .addComponent(hillRB)
                                            .addComponent(colonyRB)
                                            .addComponent(plainRB)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fRB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(runBatton)
                        .addComponent(pauseButton))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plainRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waterRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(swampRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hillRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colonyRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fRB)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        int h = Integer.parseInt(jSpinner2.getValue().toString());
        jLabel5.setText(evt.getX() + ";" + evt.getY());
        if (plainRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 2);
                }
            }
            draw(evt.getX(), evt.getY(), 2, h);
        } else if (waterRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 1);
                }
            }
            draw(evt.getX(), evt.getY(), 1, h);
        } else if (hillRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 4);
                }
            }
            draw(evt.getX(), evt.getY(), 4, h);
        } else if (swampRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 5);
                }
            }
            draw(evt.getX(), evt.getY(), 5, h);
        } else if (fRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    for (int c = 0; c < colCount; c++) {
                        tr.addFer(evt.getX() + i, evt.getY() + j, c, 7000);
                    }
                }
            }
        }
    }//GEN-LAST:event_canvas1MouseDragged

    public void addText(String txt) {
        //jTextArea1.setText(jTextArea1.getText() + "\n" + txt);
    }
    
    private void canvas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MousePressed
        int h = Integer.parseInt(jSpinner2.getValue().toString());
        jLabel5.setText(evt.getX() + ";" + evt.getY());
        if (plainRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 2);
                }
            }
            draw(evt.getX(), evt.getY(), 2, h);
        } else if (waterRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 1);
                }
            }
            draw(evt.getX(), evt.getY(), 1, h);
        } else if (hillRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 4);
                }
            }
            draw(evt.getX(), evt.getY(), 4, h);
        } else if (swampRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    tr.setTer(evt.getX() + i, evt.getY() + j, 5);
                }
            }
            draw(evt.getX(), evt.getY(), 5, h);
        } else if (fRB.isSelected()) {
            for (int i = 0; i < h && i < 500; i++) {
                for (int j = 0; j < h && j < 500; j++) {
                    for (int c = 0; c < colCount; c++) {
                        tr.addFer(evt.getX() + i, evt.getY() + j, c, 7000);
                    }
                }
            }
            }else if (colonyRB.isSelected()) {
            try {
                int agnum = Integer.parseInt(jSpinner1.getValue().toString());
                double chP = Double.parseDouble(jTextField2.getText());
                double warP = Double.parseDouble(jTextField3.getText());
                Colony c = new Colony(evt.getX(), evt.getY(), agnum, warP, chP);
                c.initA(agnum);
                tr.addColony(c);
                tr.setTer(evt.getX(), evt.getY(), 1);
                draw(evt.getX(), evt.getY(), 0, 1);
                colCount++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_canvas1MousePressed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        tr.pause();
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void runBattonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBattonActionPerformed
        tr.unpause();
        Thread t = new Thread(tr);
        t.start();
    }//GEN-LAST:event_runBattonActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
//        if (fRB.isVisible()) {
//            fRB.setVisible(false);
//            fRB.setSelected(false);
//        } else {
//            fRB.setVisible(true);
//        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private int colCount = 0;

    public void draw(int x, int y, int c, int h) {
        switch (c) {
            case 0:
                g.setColor(Color.black);
                break;
            case 1:
                g.setColor(Color.blue);
                break;
            case 2:
                g.setColor(Color.green);
                break;
            case 4:
                g.setColor(Color.yellow);
                break;
            case 5:
                g.setColor(Color.darkGray);
                break;
            case -1:
                g.setColor(Color.white);
                break;
        }

        g.fillRect(x, y, h, h);
//        canvas1.getGraphics().setColor(Color.yellow);
//        canvas1.getGraphics().fillRect(x, y, 1, 1);
    }

    private Terrain tr;

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        MainForm mf = new MainForm();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mf.setVisible(true);
            }
        });
        mf.init();
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                mf.tr.setTer(i, j, 2);
            }
        }
        mf.draw(0, 0, 2, 500);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JRadioButton colonyRB;
    private javax.swing.JRadioButton fRB;
    private javax.swing.JRadioButton hillRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton pauseButton;
    private javax.swing.JRadioButton plainRB;
    private javax.swing.JButton runBatton;
    private javax.swing.JRadioButton swampRB;
    private javax.swing.JRadioButton waterRB;
    // End of variables declaration//GEN-END:variables
}