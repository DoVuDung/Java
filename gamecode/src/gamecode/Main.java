/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author Administrator
 */
public class Main extends javax.swing.JFrame {

    public int a, b, c, thoigian, diem, checkcauhoi;
    public Timer time;
    boolean gameover;
    

    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Progress = new javax.swing.JProgressBar();
        cauhoi = new javax.swing.JLabel();
        dung = new javax.swing.JButton();
        sai = new javax.swing.JButton();
        choi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tongDiem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bé Học Làm Toán");

        cauhoi.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        cauhoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cauhoi.setText("Câu hỏi");

        dung.setText("ĐÚNG");
        dung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dungActionPerformed(evt);
            }
        });

        sai.setText("SAI");
        sai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saiActionPerformed(evt);
            }
        });

        choi.setText("CHƠI");
        choi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Điểm: ");

        tongDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tongDiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tongDiem.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cauhoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(sai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dung, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tongDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tongDiem))
                .addGap(18, 18, 18)
                .addComponent(cauhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sai, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dung, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(choi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dungActionPerformed
        if (!gameover) {
            if (a + b == c) {
                load();
                thoigian = 100;
                time.start();
            } else {
                thoigian = 0;
                cauhoi.setText("Thua");
                gameover=true;
            }
        }
    }//GEN-LAST:event_dungActionPerformed

    private void saiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saiActionPerformed
        if (!gameover) {
            if (a + b != c) {
                load();
                thoigian = 100;
                time.start();
            } else {
                thoigian = 0;
                cauhoi.setText("Thua");
                gameover=true;
            }
        }
    }//GEN-LAST:event_saiActionPerformed

    private void choiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiActionPerformed
        gameover = false;
        diem = -1;
        load();
        thoigian = 100;
        time = new Timer(100, new loadtime());
        time.start();
    }//GEN-LAST:event_choiActionPerformed

    public void load() {
        diem++;
        tongDiem.setText(diem + "");
        Random rd = new Random();
        a = rd.nextInt(10) + 1;
        b = rd.nextInt(10) + 1;
        checkcauhoi = rd.nextInt(5);
        if (checkcauhoi % 2 == 0) {
            c = a + b;
        } else {
            c = rd.nextInt(20);
        }
        cauhoi.setText(a + "+" + b + "=" + c);
    }

    public class loadtime implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (thoigian > 0) {
                thoigian--;
                Progress.setValue(thoigian);
            } else {
                cauhoi.setText("Thua");
            }
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progress;
    private javax.swing.JLabel cauhoi;
    private javax.swing.JButton choi;
    private javax.swing.JButton dung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sai;
    private javax.swing.JLabel tongDiem;
    // End of variables declaration//GEN-END:variables
}