
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahil
 */
public class Frame4 extends javax.swing.JFrame {
    int s;
    static  int avg;

    /** Frame3.sum+= 4;
     * 
     * Creates new form Frame4
     */
    public Frame4() {setVisible (true);
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

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        g1 = new javax.swing.JCheckBox();
        g2 = new javax.swing.JCheckBox();
        g3 = new javax.swing.JCheckBox();
        g4 = new javax.swing.JCheckBox();
        g5 = new javax.swing.JCheckBox();
        h2 = new javax.swing.JCheckBox();
        h3 = new javax.swing.JCheckBox();
        h4 = new javax.swing.JCheckBox();
        h5 = new javax.swing.JCheckBox();
        h1 = new javax.swing.JCheckBox();
        i5 = new javax.swing.JCheckBox();
        i1 = new javax.swing.JCheckBox();
        i2 = new javax.swing.JCheckBox();
        i3 = new javax.swing.JCheckBox();
        i4 = new javax.swing.JCheckBox();
        j5 = new javax.swing.JCheckBox();
        j1 = new javax.swing.JCheckBox();
        j2 = new javax.swing.JCheckBox();
        j3 = new javax.swing.JCheckBox();
        j4 = new javax.swing.JCheckBox();
        z1 = new javax.swing.JCheckBox();
        z2 = new javax.swing.JCheckBox();
        z3 = new javax.swing.JCheckBox();
        z4 = new javax.swing.JCheckBox();
        z5 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TYPE:B");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setText("TEACHING-LEARNING PROCESS");

        jLabel3.setText("6.");

        jLabel4.setText("The teacher is punctual to the class");

        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });

        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });

        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });

        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });

        h3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3ActionPerformed(evt);
            }
        });

        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });

        h5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5ActionPerformed(evt);
            }
        });

        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });

        i5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i5ActionPerformed(evt);
            }
        });

        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });

        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });

        i3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i3ActionPerformed(evt);
            }
        });

        i4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i4ActionPerformed(evt);
            }
        });

        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z1ActionPerformed(evt);
            }
        });

        z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z2ActionPerformed(evt);
            }
        });

        z3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z3ActionPerformed(evt);
            }
        });

        z4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z4ActionPerformed(evt);
            }
        });

        z5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z5ActionPerformed(evt);
            }
        });

        jLabel5.setText("7.");

        jLabel6.setText("8.");

        jLabel7.setText("9.");

        jLabel8.setText("10.");

        jLabel9.setText("The teacher engage the class forthe full duration");

        jLabel10.setText("The teacher comes fully prepare for the class");

        jLabel11.setText("The teacher provides guidance counselling in academic  ");

        jLabel12.setText("The behaviour of teacher while answering the query of student");

        jLabel13.setText("and non academic matters in /outside class");

        jLabel14.setText(" and complete the course in time");

        jButton1.setText("Sumbit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setText("5");

        jLabel16.setText("4");

        jLabel17.setText("3");

        jLabel18.setText("2");

        jLabel19.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(i1)
                        .addGap(18, 18, 18)
                        .addComponent(i2)
                        .addGap(18, 18, 18)
                        .addComponent(i3)
                        .addGap(18, 18, 18)
                        .addComponent(i4)
                        .addGap(18, 18, 18)
                        .addComponent(i5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j1)
                        .addGap(18, 18, 18)
                        .addComponent(j2)
                        .addGap(18, 18, 18)
                        .addComponent(j3)
                        .addGap(18, 18, 18)
                        .addComponent(j4)
                        .addGap(18, 18, 18)
                        .addComponent(j5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(z1)
                        .addGap(18, 18, 18)
                        .addComponent(z2)
                        .addGap(18, 18, 18)
                        .addComponent(z3)
                        .addGap(18, 18, 18)
                        .addComponent(z4)
                        .addGap(18, 18, 18)
                        .addComponent(z5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(g2)
                                .addGap(18, 18, 18)
                                .addComponent(g3)
                                .addGap(18, 18, 18)
                                .addComponent(g4)
                                .addGap(18, 18, 18)
                                .addComponent(g5))
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(h1)
                        .addGap(18, 18, 18)
                        .addComponent(h2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h3)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h4)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(h5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(113, 113, 113)
                .addComponent(jButton1)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1)
                    .addComponent(g2)
                    .addComponent(g3)
                    .addComponent(g4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(g5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h1)
                    .addComponent(h2)
                    .addComponent(h3)
                    .addComponent(h4)
                    .addComponent(h5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i1)
                    .addComponent(i2)
                    .addComponent(i3)
                    .addComponent(i4)
                    .addComponent(i5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel10)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j1)
                    .addComponent(j2)
                    .addComponent(j3)
                    .addComponent(j4)
                    .addComponent(j5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z1)
                    .addComponent(z2)
                    .addComponent(z3)
                    .addComponent(z4)
                    .addComponent(z5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        // TODO add your handling code here:
         if(g4.isSelected()){       
            g2.setSelected(false);
              g3.setSelected(false);
                g1.setSelected(false);
                  g5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_g4ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
         if(g2.isSelected()){       
            g1.setSelected(false);
              g3.setSelected(false);
                g4.setSelected(false);
                  g5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_g2ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
         if(g3.isSelected()){       
            g2.setSelected(false);
              g1.setSelected(false);
                g4.setSelected(false);
                  g5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_g3ActionPerformed

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
        // TODO add your handling code here:
        if(h2.isSelected()){       
            h1.setSelected(false);
              h3.setSelected(false);
                h4.setSelected(false);
                  h5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_h2ActionPerformed

    private void h3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3ActionPerformed
        // TODO add your handling code here:
        if(h3.isSelected()){       
            h2.setSelected(false);
              h1.setSelected(false);
                h4.setSelected(false);
                  h5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_h3ActionPerformed

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4ActionPerformed
        // TODO add your handling code here:
        if(h4.isSelected()){       
            h2.setSelected(false);
              h3.setSelected(false);
                h1.setSelected(false);
                  h5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_h4ActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
        // TODO add your handling code here:
         if(i2.isSelected()){       
            i1.setSelected(false);
              i3.setSelected(false);
                i4.setSelected(false);
                  i5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_i2ActionPerformed

    private void i3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i3ActionPerformed
        // TODO add your handling code here:
         if(i3.isSelected()){       
            i2.setSelected(false);
              i1.setSelected(false);
                i4.setSelected(false);
                  i5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_i3ActionPerformed

    private void i4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i4ActionPerformed
        // TODO add your handling code here:
         if(i4.isSelected()){       
            i2.setSelected(false);
              i3.setSelected(false);
                i1.setSelected(false);
                  i5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_i4ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
        if(j2.isSelected()){       
            j3.setSelected(false);
              j1.setSelected(false);
                j4.setSelected(false);
                  j5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        // TODO add your handling code here:
        if(j3.isSelected()){       
            j2.setSelected(false);
              j1.setSelected(false);
                j4.setSelected(false);
                  j5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
        if(j4.isSelected()){       
            j2.setSelected(false);
              j3.setSelected(false);
                j1.setSelected(false);
                  j5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_j4ActionPerformed

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
        // TODO add your handling code here:
        if(z2.isSelected()){       
            z1.setSelected(false);
              z3.setSelected(false);
                z4.setSelected(false);
                  z5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_z2ActionPerformed

    private void z3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z3ActionPerformed
        // TODO add your handling code here:
        if(z3.isSelected()){       
            z2.setSelected(false);
              z1.setSelected(false);
                z4.setSelected(false);
                  z5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_z3ActionPerformed

    private void z4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z4ActionPerformed
        // TODO add your handling code here:
        if(z4.isSelected()){       
            z2.setSelected(false);
              z3.setSelected(false);
                z1.setSelected(false);
                  z5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_z4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Frame3 f=new Frame3();
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
        if(g1.isSelected()){       
            g2.setSelected(false);
              g3.setSelected(false);
                g4.setSelected(false);
                  g5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_g1ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        // TODO add your handling code here:
         if(g5.isSelected()){       
            g2.setSelected(false);
              g3.setSelected(false);
                g4.setSelected(false);
                  g1.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_g5ActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        // TODO add your handling code here:
         if(h1.isSelected()){       
            h2.setSelected(false);
              h3.setSelected(false);
                h4.setSelected(false);
                  h5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_h1ActionPerformed

    private void h5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5ActionPerformed
        // TODO add your handling code here:
        if(h5.isSelected()){       
            h2.setSelected(false);
              h3.setSelected(false);
                h4.setSelected(false);
                  h1.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_h5ActionPerformed

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
        // TODO add your handling code here:
        if(i1.isSelected()){       
            i2.setSelected(false);
              i3.setSelected(false);
                i4.setSelected(false);
                  i5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_i1ActionPerformed

    private void i5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i5ActionPerformed
        // TODO add your handling code here:
         if(i5.isSelected()){       
            i2.setSelected(false);
              i3.setSelected(false);
                i4.setSelected(false);
                  i1.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_i5ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        // TODO add your handling code here:
         if(j1.isSelected()){       
            j2.setSelected(false);
              j3.setSelected(false);
                j4.setSelected(false);
                  j5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_j1ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:
        if(j5.isSelected()){       
            j2.setSelected(false);
              j3.setSelected(false);
                j4.setSelected(false);
                  j1.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_j5ActionPerformed

    private void z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z1ActionPerformed
        // TODO add your handling code here:
        if(z1.isSelected()){       
            z2.setSelected(false);
              z3.setSelected(false);
                z4.setSelected(false);
                  z5.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_z1ActionPerformed

    private void z5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z5ActionPerformed
        // TODO add your handling code here:
        if(z5.isSelected()){       
            z2.setSelected(false);
              z3.setSelected(false);
                z4.setSelected(false);
                  z1.setSelected(false);
        } else{JOptionPane.showMessageDialog(this,"please check the box");}
    }//GEN-LAST:event_z5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (g1.isSelected()) s+=5;
        if (g2.isSelected()) s+=4;
        if (g3.isSelected()) s+=3;
        if (g4.isSelected()) s+=2;
        if (g5.isSelected()) s+=1;
        if (h1.isSelected()) s+=5;
        if (h2.isSelected()) s+=4;
        if (h3.isSelected()) s+=3;
        if (h4.isSelected()) s+=2;
        if (h5.isSelected()) s+=1;
        if (i1.isSelected()) s+=5;
        if (i2.isSelected()) s+=4;
        if (i3.isSelected()) s+=3;
        if (i4.isSelected()) s+=2;
        if (i5.isSelected()) s+=1;
        if (j1.isSelected()) s+=5;
        if (j2.isSelected()) s+=4;
        if (j3.isSelected()) s+=3;
        if (j4.isSelected()) s+=2;
        if (j5.isSelected()) s+=1;
         if (z1.isSelected()) s+=5;
        if (z2.isSelected()) s+=4;
        if (z3.isSelected()) s+=3;
        if (z4.isSelected()) s+=2;
        if (z5.isSelected()) s+=1;
        
        avg=(Frame3.sum+s)/10;
        
        Frame5 s=new Frame5();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox g1;
    private javax.swing.JCheckBox g2;
    private javax.swing.JCheckBox g3;
    private javax.swing.JCheckBox g4;
    private javax.swing.JCheckBox g5;
    private javax.swing.JCheckBox h1;
    private javax.swing.JCheckBox h2;
    private javax.swing.JCheckBox h3;
    private javax.swing.JCheckBox h4;
    private javax.swing.JCheckBox h5;
    private javax.swing.JCheckBox i1;
    private javax.swing.JCheckBox i2;
    private javax.swing.JCheckBox i3;
    private javax.swing.JCheckBox i4;
    private javax.swing.JCheckBox i5;
    private javax.swing.JCheckBox j1;
    private javax.swing.JCheckBox j2;
    private javax.swing.JCheckBox j3;
    private javax.swing.JCheckBox j4;
    private javax.swing.JCheckBox j5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox z1;
    private javax.swing.JCheckBox z2;
    private javax.swing.JCheckBox z3;
    private javax.swing.JCheckBox z4;
    private javax.swing.JCheckBox z5;
    // End of variables declaration//GEN-END:variables
}
