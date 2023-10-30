package gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class About extends JFrame {

    public About() {
        initComponents();
        setTitle("Nama Lengkap-About");

        // Menggunakan path relatif untuk gambar (pastikan gambar ada dalam proyek Anda)
        String imagePath = "D:\\UTS_AndiHajriani_Pemrograman2\\Image\\andi hajriani - foto ktm.jpg";
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(imagePath));
        jLabel3.setIcon(icon);
    }

    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Mengganti EXIT_ON_CLOSE

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setText("NIM : 191011401857");

        jLabel4.setText("NIM");
        jLabel5.setText("KELAS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel6.setText("----------------------------------------");

        jLabel7.setText("NAMA");
        jLabel8.setText("PRODI");

        jLabel9.setText(": ANDI HAJRIANI");
        jLabel10.setText(": 191011401857");
        jLabel11.setText(": 05TPLE001");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36));
        jLabel1.setText("About");
        jLabel12.setText(": TEKNIK INFORMATIKA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setText("Program ini dibuat oleh :");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel13.setText("UNIVERSITAS PAMULANG");

        // Menambahkan JLabel ke JPanel
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel4);
        jPanel2.add(jLabel5);
        jPanel2.add(jLabel6);
        jPanel2.add(jLabel7);
        jPanel2.add(jLabel8);
        jPanel2.add(jLabel9);
        jPanel2.add(jLabel10);
        jPanel2.add(jLabel11);
        jPanel2.add(jLabel12);
        jPanel2.add(jLabel13);

        // Mengatur layout dan komponen
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5))
                                                                .addGap(57, 57, 57)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel13)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(jLabel6))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(188, 188, 188)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel2Layout(() -> {
                                            public void run() {
                                                new About().setVisible(true);
                                            }
                                        });
    }
    // Variables declaration - do not modify

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;

}
