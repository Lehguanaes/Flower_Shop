package controle;

/**
 * Tela que representa a apresentação do projeto
 * @author Jovana e Leticia
 */

public class Apresentacao extends javax.swing.JFrame {

    public Apresentacao() {
        
        setUndecorated(true);  // Remove a barra de título completamente
        setVisible(true);  // Exibe a janela
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_descricao_um = new javax.swing.JLabel();
        jLabel_descricao_dois = new javax.swing.JLabel();
        Jbutton_visualizar_login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_descricao_tres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inicio.setBackground(new java.awt.Color(255, 204, 238));

        jLabel_titulo.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo.setFont(new java.awt.Font("Freestyle Script", 0, 70)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(24, 51, 79));
        jLabel_titulo.setText("Projeto Flower Shop");

        jLabel_descricao_um.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel_descricao_um.setText("﻿ Projeto de Interface gráfica em java com integração de Banco de Dados");

        jLabel_descricao_dois.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel_descricao_dois.setText("  apresentado ao curso Desenvolvimento de Sistemas com a  ");

        Jbutton_visualizar_login.setBackground(new java.awt.Color(255, 125, 82));
        Jbutton_visualizar_login.setForeground(new java.awt.Color(255, 255, 255));
        Jbutton_visualizar_login.setText("Iniciar Projeto");
        Jbutton_visualizar_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jbutton_visualizar_login.setMaximumSize(new java.awt.Dimension(1519, 2009));
        Jbutton_visualizar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_visualizar_loginActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/icone_apresentacao_dez.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel_descricao_tres.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel_descricao_tres.setText(" obtenção da execução do software. ");

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(Jbutton_visualizar_login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_descricao_dois)
                    .addComponent(jLabel_descricao_um)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_descricao_tres)))
                .addGap(0, 107, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel_titulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel_descricao_um)
                .addGap(18, 18, 18)
                .addComponent(jLabel_descricao_dois)
                .addGap(18, 18, 18)
                .addComponent(jLabel_descricao_tres)
                .addGap(53, 53, 53)
                .addComponent(Jbutton_visualizar_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbutton_visualizar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_visualizar_loginActionPerformed
        Login mostra = new Login();
        mostra.setLocationRelativeTo(null); // Centraliza a tela
        mostra.setVisible(true); // Mostra a tela de Login
        this.dispose(); // Fecha a tela de Apresentação
    }//GEN-LAST:event_Jbutton_visualizar_loginActionPerformed
   
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Apresentacao apresentacaoForm = new Apresentacao();
            apresentacaoForm.setLocationRelativeTo(null); // Centraliza a tela
            apresentacaoForm.setVisible(true); // Mostra a tela de Apresentação
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton Jbutton_visualizar_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_descricao_dois;
    private javax.swing.JLabel jLabel_descricao_tres;
    private javax.swing.JLabel jLabel_descricao_um;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}