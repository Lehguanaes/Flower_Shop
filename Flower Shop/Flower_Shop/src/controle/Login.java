package controle;

/**
 * Tela que representa o Login do usuario já cadastrado.
 * @author Jovana e Leticia
 */


import conexao.Conexao; // Importa a classe Conexao para realizar a conexão com o banco de dados.
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos de mensagens.
import javax.swing.table.DefaultTableModel; // Importa a classe DefaultTableModel para manipular a tabela.
import java.sql.*; // Importa as classes para manipulação de banco de dados.

public class Login extends javax.swing.JFrame {

    // Declaração de uma variável do tipo Conexao que será usada para conectar ao banco de dados.
    Conexao conexao_usuario;

    public Login() {
        
        setUndecorated(true);  // Remove a barra de título completamente
        setVisible(true);  // Exibe a janela
        initComponents();
        setLocationRelativeTo(null); 
        
        conexao_usuario = new Conexao(); // Inicializa o objeto Conexao.
        conexao_usuario.conecta(); // Estabelece a conexão com o banco de dados.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_login = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jLabel_senha = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        Jbutton_login = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_titulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(250, 247, 210));

        jPanel_login.setBackground(new java.awt.Color(255, 204, 238));
        jPanel_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 0, 176)));

        jLabel_titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setFont(new java.awt.Font("Freestyle Script", 0, 70)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(24, 51, 79));
        jLabel_titulo.setText(" Acesso ao Sistema");

        jLabel_usuario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel_usuario.setText("USUÁRIO:");

        jLabel_senha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel_senha.setText("SENHA:");

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 0, 188)));

        Jbutton_login.setBackground(new java.awt.Color(255, 153, 0));
        Jbutton_login.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Jbutton_login.setForeground(new java.awt.Color(255, 255, 255));
        Jbutton_login.setText("Logar");
        Jbutton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_loginActionPerformed(evt);
            }
        });

        txt_senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 0, 188)));

        jLabel1.setBackground(new java.awt.Color(58, 157, 91));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Esqueceu a senha?");

        javax.swing.GroupLayout jPanel_loginLayout = new javax.swing.GroupLayout(jPanel_login);
        jPanel_login.setLayout(jPanel_loginLayout);
        jPanel_loginLayout.setHorizontalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_senha)
                        .addComponent(jLabel_usuario)
                        .addComponent(txt_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addComponent(txt_usuario)))
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                        .addComponent(Jbutton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );
        jPanel_loginLayout.setVerticalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel_titulo)
                .addGap(62, 62, 62)
                .addComponent(jLabel_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Jbutton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
        );

        jLabel_titulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_titulo2.setFont(new java.awt.Font("Freestyle Script", 0, 64)); // NOI18N
        jLabel_titulo2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/user.png"))); // NOI18N
        jLabel_titulo2.setText("o");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addComponent(jPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(956, 956, 956)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbutton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_loginActionPerformed
        try {
            // Obtém o texto dos campos de usuário e senha
            String usuario = txt_usuario.getText();
            String senha = txt_senha.getText();

            // Monta a consulta SQL para verificar se existe um registro com o usuário e senha fornecidos
            // Note que é importante usar aspas ao redor de valores de texto em SQL
            String pesquisa = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND senha = '" + senha + "'";

            // Executa a consulta SQL
            conexao_usuario.executaSQL(pesquisa);

            // Verifica se algum registro foi encontrado
            if (conexao_usuario.resultset.first()) {
                // Se um registro foi encontrado, abre a tela principal e fecha a tela de login
                Home mostra = new Home();
                mostra.setVisible(true);
                dispose(); // Fecha a janela atual
            } else {
                // Se nenhum registro foi encontrado, exibe uma mensagem de erro
                JOptionPane.showMessageDialog(null, "\n Usuário não cadastrado! \n", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                conexao_usuario.desconecta(); // Fecha a conexão com o banco de dados
                System.exit(0); // Encerra a aplicação
            }
        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem com a descrição do erro
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados! \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Jbutton_loginActionPerformed
   
    public static void main(String args[]) {
        // Define o Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login loginForm = new Login(); // Cria a instância do formulário
                loginForm.pack(); // Ajusta o tamanho da janela com base nos componentes
                loginForm.setLocationRelativeTo(null); // Centraliza o formulário na tela
                loginForm.setVisible(true); // Torna o formulário visível
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbutton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JLabel jLabel_titulo2;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
