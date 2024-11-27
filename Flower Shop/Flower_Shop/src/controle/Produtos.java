/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import conexao.Conexao; // Importa a classe Conexao para realizar a conexão com o banco de dados.
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos de mensagens.
import javax.swing.table.DefaultTableModel; // Importa a classe DefaultTableModel para manipular a tabela.
import java.sql.*; // Importa as classes para manipulação de banco de dados.
import java.util.logging.Level; // Importa a classe Level para definir o nível de log.
import java.util.logging.Logger; // Importa a classe Logger para registrar eventos.
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableCellRenderer; // Import para centralizar a tabela

/**
 *
 * @author Jovana e Letícia
 */
public class Produtos extends javax.swing.JFrame {

   Conexao conexao_produto;

    public Produtos() throws SQLException {
        setUndecorated(true);  // Remove a barra de título completamente
        setVisible(true);  // Exibe a janela
        initComponents();
        setLocationRelativeTo(null);
        
      
        conexao_produto = new Conexao(); // Inicializa o objeto Conexao.
        conexao_produto.conecta(); // Estabelece a conexão com o banco de dados.
        
        conexao_produto.executaSQL("select * from produto order by Cod_Produto"); // Executa a consulta SQL para obter os dados.conexao_produto.executaSQL("select * from produto order by cod_produto"); // Executa a consulta SQL para obter os dados.
        preencherTabela(); // Preenche a tabela com os dados obtidos.
          
        posicionarRegistro(); // Posiciona no primeiro registro.
        produto.setAutoCreateRowSorter(true); // Habilita o classificador automático de linhas na tabela.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_preco = new javax.swing.JTextField();
        jButton_editar_produto = new javax.swing.JButton();
        jLabel_cod_produto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_nome_produto = new javax.swing.JLabel();
        jLabel_preco = new javax.swing.JLabel();
        jLabel_quantidade = new javax.swing.JLabel();
        txt_cod_produto = new javax.swing.JTextField();
        txt_nome_produto = new javax.swing.JTextField();
        txt_quantidade_disponivel = new javax.swing.JTextField();
        jLabel_cod_categoria = new javax.swing.JLabel();
        avancar_registro = new javax.swing.JButton();
        pesquisar_registro = new javax.swing.JTextField();
        primeiro_registro = new javax.swing.JButton();
        jLabel_pesquise = new javax.swing.JLabel();
        jLabel_titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        produto = new javax.swing.JTable();
        ultimo_registro = new javax.swing.JButton();
        txt_cod_categoria = new javax.swing.JTextField();
        voltar_registro = new javax.swing.JButton();
        jButton_novo_produto = new javax.swing.JButton();
        jLabel_cod_categoria1 = new javax.swing.JLabel();
        jLabel_nome_produto2 = new javax.swing.JLabel();
        jLabel_nome_produto3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_cod_produto1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_home = new javax.swing.JMenu();
        sub_home = new javax.swing.JMenuItem();
        menu_cliente = new javax.swing.JMenu();
        sub_cadastro = new javax.swing.JMenuItem();
        menu_produtos = new javax.swing.JMenu();
        sub_categoria = new javax.swing.JMenuItem();
        sub_estoque = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(58, 157, 91));

        jPanel2.setBackground(new java.awt.Color(255, 204, 238));

        txt_preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_editar_produto.setBackground(new java.awt.Color(153, 153, 255));
        jButton_editar_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_editar_produto.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editar_produto.setText("Editar Produto");
        jButton_editar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_produtoActionPerformed(evt);
            }
        });

        jLabel_cod_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_produto.setText("CÓDIGO DO PRODUTO:");

        jLabel_nome_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_produto.setText("NOME:");

        jLabel_preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_preco.setText("PREÇO:");

        jLabel_quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_quantidade.setText("QUANTIDADE DISPONIVEL:");

        txt_cod_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nome_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_quantidade_disponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_cod_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_categoria.setText("CATEGORIA:");

        avancar_registro.setBackground(new java.awt.Color(255, 153, 0));
        avancar_registro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        avancar_registro.setForeground(new java.awt.Color(250, 249, 228));
        avancar_registro.setText(">");
        avancar_registro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        avancar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancar_registroActionPerformed(evt);
            }
        });

        pesquisar_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisar_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisar_registroKeyReleased(evt);
            }
        });

        primeiro_registro.setBackground(new java.awt.Color(255, 153, 0));
        primeiro_registro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        primeiro_registro.setForeground(new java.awt.Color(250, 249, 228));
        primeiro_registro.setText("Primeiro Produto");
        primeiro_registro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        primeiro_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiro_registroActionPerformed(evt);
            }
        });

        jLabel_pesquise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_pesquise.setText("PESQUISE:");

        jLabel_titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setFont(new java.awt.Font("Freestyle Script", 0, 70)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(24, 51, 79));
        jLabel_titulo.setText(" Produtos");

        produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Produto", "Categoria", "Nome", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        produto.setRowMargin(2);
        produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoMouseClicked(evt);
            }
        });
        produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(produto);

        ultimo_registro.setBackground(new java.awt.Color(255, 153, 0));
        ultimo_registro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ultimo_registro.setForeground(new java.awt.Color(250, 249, 228));
        ultimo_registro.setText("Ultimo Produto");
        ultimo_registro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ultimo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimo_registroActionPerformed(evt);
            }
        });

        txt_cod_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        voltar_registro.setBackground(new java.awt.Color(255, 153, 0));
        voltar_registro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        voltar_registro.setForeground(new java.awt.Color(250, 249, 228));
        voltar_registro.setText("<");
        voltar_registro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        voltar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_registroActionPerformed(evt);
            }
        });

        jButton_novo_produto.setBackground(new java.awt.Color(153, 153, 255));
        jButton_novo_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_novo_produto.setForeground(new java.awt.Color(255, 255, 255));
        jButton_novo_produto.setText("Novo Produto");
        jButton_novo_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_novo_produtoActionPerformed(evt);
            }
        });

        jLabel_cod_categoria1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_categoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/mulher.png"))); // NOI18N
        jLabel_cod_categoria1.setText(".");

        jLabel_nome_produto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_produto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/compra.png"))); // NOI18N

        jLabel_nome_produto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_produto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/lupa.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Limpar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(729, 729, 729)
                        .addComponent(avancar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ultimo_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_nome_produto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_pesquise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel_nome_produto2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel_quantidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_quantidade_disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel_cod_produto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_cod_produto)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel_cod_categoria)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_cod_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel_preco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel_nome_produto)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(primeiro_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(voltar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_cod_categoria1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_novo_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_editar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(96, 96, 96))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_nome_produto3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel_nome_produto)
                                            .addComponent(txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_cod_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_cod_categoria)
                                            .addComponent(txt_cod_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_cod_produto))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel_quantidade)
                                                .addComponent(txt_quantidade_disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_preco)
                                                .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel_nome_produto2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jButton_editar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jButton_novo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel_cod_categoria1)))
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(voltar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(primeiro_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pesquisar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_pesquise)
                                        .addComponent(ultimo_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(avancar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(322, 322, 322))))
        );

        jLabel_cod_produto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_produto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/oiii.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/vaso.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/sementes (2).png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/sementes (2).png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/vaso.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/buque-de-flores.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/buque-de-flores.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel_cod_produto1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addComponent(jLabel_cod_produto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        menu_home.setText("Início");
        menu_home.setActionCommand("");

        sub_home.setText("Início");
        sub_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_homeActionPerformed(evt);
            }
        });
        menu_home.add(sub_home);

        jMenuBar1.add(menu_home);

        menu_cliente.setBorder(null);
        menu_cliente.setText("Clientes");

        sub_cadastro.setText("Cadastro");
        sub_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_cadastroActionPerformed(evt);
            }
        });
        menu_cliente.add(sub_cadastro);

        jMenuBar1.add(menu_cliente);

        menu_produtos.setText("Produtos");

        sub_categoria.setText("Categoria");
        sub_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_categoriaActionPerformed(evt);
            }
        });
        menu_produtos.add(sub_categoria);

        sub_estoque.setText("Estoque");
        menu_produtos.add(sub_estoque);

        jMenuBar1.add(menu_produtos);

        menu_sair.setText("Sair");

        jMenuItem1.setText("Encerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_sair.add(jMenuItem1);

        jMenuBar1.add(menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_homeActionPerformed
        Home home = null;
        try {
            home = new Home(); // Cria a instância do formulário
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        home.setVisible(true); // Torna o formulário visível
        this.dispose(); // Fecha a janela
    }//GEN-LAST:event_sub_homeActionPerformed

    private void sub_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_cadastroActionPerformed

        try {
            Cliente cliente = new Cliente(); // Cria a instância do formulário
            cliente.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_cadastroActionPerformed

    private void sub_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_categoriaActionPerformed
        try {
            Categoria categoria = new Categoria(); // Cria a instância do formulário
            categoria.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_categoriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Fechar a aplicação quando o item "Sair" for clicado
        System.exit(0);  // Encerra a aplicação
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_editar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_produtoActionPerformed
        // Obtém o texto do campo de nome e armazena na variável 'nome'
        String Cod_Produto = txt_cod_produto.getText();

        // Obtém o texto do campo de data de nascimento e armazena na variável 'data_nasc'
        String Cod_Categoria = txt_cod_categoria.getText();

        // Obtém o texto do campo de telefone e armazena na variável 'telefone'
        String Nome_Produto = txt_nome_produto.getText();

        // Obtém o texto do campo de e-mail e armazena na variável 'email'
        String Quantidade_Produto_Disponivel = txt_quantidade_disponivel.getText();

        // Obtém o texto do campo de e-mail e armazena na variável 'email'
        String Preco_Produto = txt_preco.getText();

        // Variável para armazenar a instrução SQL que será executada
        String sql = "";

        // Variável para armazenar a mensagem que será exibida ao usuário
        String msg = "";

        try {
            // Verifica se o campo de código está vazio para decidir entre inserção ou atualização
            if (txt_cod_produto.getText().equals("")) {
                // Se o campo de código estiver vazio, cria uma instrução SQL para inserir um novo registro
                sql = "INSERT INTO produto (Cod_Produto, Cod_Categoria, Nome_Produto, Quantidade_Produto_Disponivel, Preco_Produto) VALUES('" + Cod_Produto + "','" + Cod_Categoria + "','" + Nome_Produto + "','" + Quantidade_Produto_Disponivel + "','" + Preco_Produto + "')";
                msg = "Gravação de um novo registro";
            } else {
                // Se o campo de código não estiver vazio, cria uma instrução SQL para atualizar um registro existente
                sql = "UPDATE produto SET Cod_Categoria = '" + Cod_Categoria + "', Nome_Produto = '" + Nome_Produto + "', Quantidade_Produto_Disponivel = '" + Quantidade_Produto_Disponivel + "', Preco_Produto = '" + Preco_Produto + "' WHERE Cod_Produto = '" + Cod_Produto + "'";
                msg = "Alteração de registro";
            }

            // Executa a instrução SQL (inserção ou atualização)
            conexao_produto.statement.executeUpdate(sql);

            // Exibe uma mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(null, msg + "\nCadastro realizado com sucesso! \n", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            // Executa um comando SQL para selecionar todos os registros da tabela 'tbClientes' ordenados por 'cod'
            conexao_produto.executaSQL("SELECT * FROM produto ORDER BY Cod_Produto");

            // Move o cursor para o primeiro registro no ResultSet
            conexao_produto.resultset.first();

            // Chama o método para preencher a tabela na interface com os dados do banco
            preencherTabela();

            // Chama o método para mostrar os dados do registro atual nos campos da interface
            mostrar_Dados();

        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nErro ao gravar dados da tabela: \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_editar_produtoActionPerformed

    private void avancar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancar_registroActionPerformed
        try{
            conexao_produto.resultset.next();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_avancar_registroActionPerformed

    private void pesquisar_registroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisar_registroKeyReleased
        try {
            // Monta a consulta SQL para pesquisar registros na tabela 'tbClientes' onde o nome começa com o texto digitado
            String pesquisa = "SELECT * FROM produto WHERE Nome_Produto LIKE '" + pesquisar_registro.getText() + "%'";
            conexao_produto.executaSQL(pesquisa);

            // Verifica se o primeiro registro foi encontrado
            if (conexao_produto.resultset.first()) {
                // Preenche a tabela na interface com os dados do ResultSet
                preencherTabela();
            } else {
                // Caso nenhum registro tenha sido encontrado, informa ao usuário
                JOptionPane.showMessageDialog(null, "Não existem dados com este parâmetro!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nOs dados digitados não foram localizados! \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pesquisar_registroKeyReleased

    private void primeiro_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiro_registroActionPerformed
        try{
            conexao_produto.resultset.first();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o 1° registro: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_primeiro_registroActionPerformed

    private void produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoMouseClicked
        int linha_selecionada = produto.getSelectedRow(); // Obtém a linha selecionada.

        // Preenche os campos de texto com os dados da linha selecionada.
        txt_cod_produto.setText(produto.getValueAt(linha_selecionada,0).toString());
        txt_cod_categoria.setText(produto.getValueAt(linha_selecionada,1).toString());
        txt_nome_produto.setText(produto.getValueAt(linha_selecionada,2).toString());
        txt_quantidade_disponivel.setText(produto.getValueAt(linha_selecionada,3).toString());
        txt_preco.setText(produto.getValueAt(linha_selecionada,4).toString());
    }//GEN-LAST:event_produtoMouseClicked

    private void produtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoKeyPressed
        int linha_selecionada = produto.getSelectedRow();// Obtém a linha selecionada.

        // Preenche os campos de texto com os dados da linha selecionada.
        txt_cod_produto.setText(produto.getValueAt(linha_selecionada,0).toString());
        txt_cod_categoria.setText(produto.getValueAt(linha_selecionada,1).toString());
        txt_nome_produto.setText(produto.getValueAt(linha_selecionada,2).toString());
        txt_quantidade_disponivel.setText(produto.getValueAt(linha_selecionada,3).toString());
        txt_preco.setText(produto.getValueAt(linha_selecionada,4).toString());
    }//GEN-LAST:event_produtoKeyPressed

    private void ultimo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimo_registroActionPerformed
        try{
            conexao_produto.resultset.last();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ultimo_registroActionPerformed

    private void voltar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_registroActionPerformed
        try{
            conexao_produto.resultset.previous();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_voltar_registroActionPerformed

    private void jButton_novo_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novo_produtoActionPerformed
        // Obtém o texto do campo de nome e armazena na variável 'nome'
        String Cod_Produto = txt_cod_produto.getText();

        // Obtém o texto do campo de data de nascimento e armazena na variável 'data_nasc'
        String Cod_Categoria = txt_cod_categoria.getText();

        // Obtém o texto do campo de telefone e armazena na variável 'telefone'
        String Nome_Produto = txt_nome_produto.getText();

        // Obtém o texto do campo de e-mail e armazena na variável 'email'
        String Quantidade_Produto_Disponivel = txt_quantidade_disponivel.getText();

        // Obtém o texto do campo de e-mail e armazena na variável 'email'
        String Preco_Produto = txt_preco.getText();

        try {
            // Monta a string SQL para inserir os dados no banco de dados
            String insert_sql = "INSERT INTO produto (Cod_Produto, Cod_Categoria, Nome_Produto, Quantidade_Produto_Disponivel,Preco_Produto) VALUES('" + Cod_Produto + "','" + Cod_Categoria + "','" + Nome_Produto + "','" + Quantidade_Produto_Disponivel + "','" + Preco_Produto + "')";

            // Executa o comando SQL de inserção no banco de dados
            conexao_produto.statement.executeUpdate(insert_sql);

            // Exibe uma mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            // Executa um novo comando SQL para selecionar todos os registros da tabela 'tbClientes' ordenados por 'cod'
            conexao_produto.executaSQL("SELECT * FROM produto ORDER BY Cod_Produto");

            // Move o cursor para o primeiro registro no ResultSet
            conexao_produto.resultset.first();

            // Chama o método para preencher a tabela na interface com os dados do banco
            preencherTabela();

           
        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nErro ao gravar dados da tabela: \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_novo_produtoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        txt_cod_produto.setText("");
        txt_cod_categoria.setText("");
        txt_nome_produto.setText("");
        txt_quantidade_disponivel.setText("");
        txt_preco.setText("");
        pesquisar_registro.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    // Preenche a tabela com os dados obtidos do banco de dados.
    public void preencherTabela() {
        // Define a largura das colunas da tabela.
        produto.getColumnModel().getColumn(0).setPreferredWidth(4);
        produto.getColumnModel().getColumn(1).setPreferredWidth(150);
        produto.getColumnModel().getColumn(2).setPreferredWidth(11);
        produto.getColumnModel().getColumn(3).setPreferredWidth(14);
        produto.getColumnModel().getColumn(4).setPreferredWidth(100);

        DefaultTableModel modelo = (DefaultTableModel) produto.getModel(); // Obtém o modelo da tabela.
        modelo.setNumRows(0); // Remove todas as linhas existentes.

        try {
            conexao_produto.resultset.beforeFirst(); // Move o cursor antes do primeiro registro.
            while (conexao_produto.resultset.next()) { // Itera sobre os registros do ResultSet.
                modelo.addRow(new Object[] {
                    conexao_produto.resultset.getString("Cod_Produto"), 
                    conexao_produto.resultset.getString("Cod_Categoria"),
                    conexao_produto.resultset.getString("Nome_Produto"),
                    conexao_produto.resultset.getString("Quantidade_Produto_Disponivel"),
                    conexao_produto.resultset.getString("Preco_Produto")
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Posiciona no primeiro registro e exibe os dados.
    public void posicionarRegistro() {
        try {
            conexao_produto.resultset.first(); // Move o cursor para o primeiro registro.
            mostrar_Dados(); // Exibe os dados do registro atual.
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possível posicionar no primeiro registro: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     // Exibe os dados do registro atual nos campos de texto.
    public void mostrar_Dados() {  
        try {
            txt_cod_produto.setText(conexao_produto.resultset.getString("Cod_Produto"));
            txt_cod_categoria.setText(conexao_produto.resultset.getString("Cod_Categoria"));
            txt_nome_produto.setText(conexao_produto.resultset.getString("Nome_Produto"));
            txt_quantidade_disponivel.setText(conexao_produto.resultset.getString("Quantidade_Produto_Disponivel"));
            txt_preco.setText(conexao_produto.resultset.getString("Preco_Produto"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não localizou dados: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Produtos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancar_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_editar_produto;
    private javax.swing.JButton jButton_novo_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel_cod_categoria;
    private javax.swing.JLabel jLabel_cod_categoria1;
    private javax.swing.JLabel jLabel_cod_produto;
    private javax.swing.JLabel jLabel_cod_produto1;
    private javax.swing.JLabel jLabel_nome_produto;
    private javax.swing.JLabel jLabel_nome_produto2;
    private javax.swing.JLabel jLabel_nome_produto3;
    private javax.swing.JLabel jLabel_pesquise;
    private javax.swing.JLabel jLabel_preco;
    private javax.swing.JLabel jLabel_quantidade;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_home;
    private javax.swing.JMenu menu_produtos;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JTextField pesquisar_registro;
    private javax.swing.JButton primeiro_registro;
    private javax.swing.JTable produto;
    private javax.swing.JMenuItem sub_cadastro;
    private javax.swing.JMenuItem sub_categoria;
    private javax.swing.JMenuItem sub_estoque;
    private javax.swing.JMenuItem sub_home;
    private javax.swing.JTextField txt_cod_categoria;
    private javax.swing.JTextField txt_cod_produto;
    private javax.swing.JTextField txt_nome_produto;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_quantidade_disponivel;
    private javax.swing.JButton ultimo_registro;
    private javax.swing.JButton voltar_registro;
    // End of variables declaration//GEN-END:variables
}
