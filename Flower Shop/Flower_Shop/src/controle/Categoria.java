package controle;

/**
 * Tela que representa a consulta de categorias.
 * @author Jovana e Leticia
 */

import conexao.Conexao; // Importa a classe Conexao para realizar a conexão com o banco de dados.
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos de mensagens.
import javax.swing.table.DefaultTableModel; // Importa a classe DefaultTableModel para manipular a tabela.
import java.sql.*; // Importa as classes para manipulação de banco de dados.
import java.util.logging.Level; // Importa a classe Level para definir o nível de log.
import java.util.logging.Logger; // Importa a classe Logger para registrar eventos.
import javax.swing.table.DefaultTableCellRenderer; // Import para centralizar a tabela


public class Categoria extends javax.swing.JFrame {
    Conexao conexao_categoria;

    public Categoria() throws SQLException {
       
        setUndecorated(true);  // Remove a barra de título completamente
        setVisible(true);  // Exibe a janela
        initComponents();
        setLocationRelativeTo(null);
        
        conexao_categoria = new Conexao(); // Inicializa a conexão
        conexao_categoria.conecta(); // Estabelece a conexão

        // Ajusta a consulta para a tabela Categoria
        conexao_categoria.executaSQL("SELECT * FROM Categoria ORDER BY Cod_Categoria"); 
        preencherTabela(); // Preenche a tabela com os dados obtidos.
        posicionarRegistro(); // Posiciona no primeiro registro.
        categoria.setAutoCreateRowSorter(true); // Habilita o classificador automático de linhas na tabela.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_titulo2 = new javax.swing.JLabel();
        jLabel_cod_categoria = new javax.swing.JLabel();
        txt_cod_categoria = new javax.swing.JTextField();
        jLabel_preco = new javax.swing.JLabel();
        txt_nome_categoria = new javax.swing.JTextField();
        jLabel_titulo1 = new javax.swing.JLabel();
        jButton_editar_categoria = new javax.swing.JButton();
        ultimo_registro1 = new javax.swing.JButton();
        avancar_registro1 = new javax.swing.JButton();
        voltar_registro1 = new javax.swing.JButton();
        primeiro_registro1 = new javax.swing.JButton();
        jButton_nova_categoria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoria = new javax.swing.JTable();
        limpar_campos = new javax.swing.JButton();
        jLabel_titulo3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_home = new javax.swing.JMenu();
        sub_home = new javax.swing.JMenuItem();
        menu_cliente = new javax.swing.JMenu();
        sub_cadastro = new javax.swing.JMenuItem();
        menu_produtos = new javax.swing.JMenu();
        sub_categoria = new javax.swing.JMenuItem();
        sub_estoque = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 238));

        jLabel_titulo2.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo2.setFont(new java.awt.Font("Freestyle Script", 0, 70)); // NOI18N
        jLabel_titulo2.setForeground(new java.awt.Color(24, 51, 79));
        jLabel_titulo2.setText("Categoria");

        jLabel_cod_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_categoria.setText("CÓDIGO DA CATEGORIA");

        txt_cod_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_preco.setText("NOME:");

        txt_nome_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_categoriaActionPerformed(evt);
            }
        });

        jLabel_titulo1.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo1.setFont(new java.awt.Font("Freestyle Script", 0, 49)); // NOI18N
        jLabel_titulo1.setForeground(new java.awt.Color(58, 157, 91));
        jLabel_titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/cliente_cadastro_doiss.png"))); // NOI18N

        jButton_editar_categoria.setBackground(new java.awt.Color(153, 153, 255));
        jButton_editar_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_editar_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editar_categoria.setText("Editar Categoria");
        jButton_editar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_categoriaActionPerformed(evt);
            }
        });

        ultimo_registro1.setBackground(new java.awt.Color(255, 153, 0));
        ultimo_registro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ultimo_registro1.setForeground(new java.awt.Color(255, 255, 255));
        ultimo_registro1.setText("Ultima Categoria");
        ultimo_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimo_registro1ActionPerformed(evt);
            }
        });

        avancar_registro1.setBackground(new java.awt.Color(255, 153, 0));
        avancar_registro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        avancar_registro1.setForeground(new java.awt.Color(255, 255, 255));
        avancar_registro1.setText(">");
        avancar_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancar_registro1ActionPerformed(evt);
            }
        });

        voltar_registro1.setBackground(new java.awt.Color(255, 153, 0));
        voltar_registro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        voltar_registro1.setForeground(new java.awt.Color(255, 255, 255));
        voltar_registro1.setText("<");
        voltar_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_registro1ActionPerformed(evt);
            }
        });

        primeiro_registro1.setBackground(new java.awt.Color(255, 153, 0));
        primeiro_registro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primeiro_registro1.setForeground(new java.awt.Color(255, 255, 255));
        primeiro_registro1.setText("Primeira Categoria");
        primeiro_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiro_registro1ActionPerformed(evt);
            }
        });

        jButton_nova_categoria.setBackground(new java.awt.Color(153, 153, 255));
        jButton_nova_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_nova_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jButton_nova_categoria.setText("Nova Categoria");
        jButton_nova_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nova_categoriaActionPerformed(evt);
            }
        });

        categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo da Categoria", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        categoria.setRowMargin(2);
        categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriaMouseClicked(evt);
            }
        });
        categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoriaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(categoria);

        limpar_campos.setBackground(new java.awt.Color(153, 153, 255));
        limpar_campos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limpar_campos.setForeground(new java.awt.Color(255, 255, 255));
        limpar_campos.setText("Limpar Campos");
        limpar_campos.setToolTipText("");
        limpar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_camposActionPerformed(evt);
            }
        });

        jLabel_titulo3.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo3.setFont(new java.awt.Font("Freestyle Script", 0, 49)); // NOI18N
        jLabel_titulo3.setForeground(new java.awt.Color(58, 157, 91));
        jLabel_titulo3.setText("Consultar Categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_titulo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_titulo3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(primeiro_registro1)
                            .addGap(34, 34, 34)
                            .addComponent(voltar_registro1)
                            .addGap(18, 18, 18)
                            .addComponent(avancar_registro1)
                            .addGap(30, 30, 30)
                            .addComponent(ultimo_registro1))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_nova_categoria)
                    .addGap(69, 69, 69)
                    .addComponent(limpar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)
                    .addComponent(jButton_editar_categoria)
                    .addGap(59, 59, 59))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jLabel_cod_categoria)
                    .addGap(18, 18, 18)
                    .addComponent(txt_cod_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel_preco)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_nome_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel_titulo2)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo2)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cod_categoria)
                    .addComponent(txt_nome_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_nova_categoria)
                    .addComponent(jButton_editar_categoria)
                    .addComponent(limpar_campos))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel_titulo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(primeiro_registro1)
                            .addComponent(voltar_registro1)
                            .addComponent(avancar_registro1)
                            .addComponent(ultimo_registro1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_titulo1))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        menu_home.setText("Início");
        menu_home.setActionCommand("");

        sub_home.setText("Início");
        sub_home.setText("Início");
        sub_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_homeActionPerformed(evt);
            }
        });
        menu_home.add(sub_home);

        jMenuBar1.add(menu_home);

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
        menu_produtos.add(sub_categoria);

        sub_estoque.setText("Estoque");
        sub_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_estoqueActionPerformed(evt);
            }
        });
        menu_produtos.add(sub_estoque);

        jMenuBar1.add(menu_produtos);

        jMenu1.setText("Sair");

        jMenuItem1.setText("Encerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void sub_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_estoqueActionPerformed

        try {
            Produtos produto = new Produtos(); // Cria a instância do formulário
            produto.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_estoqueActionPerformed

    private void sub_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_cadastroActionPerformed
  
        try {
            Cliente cliente = new Cliente(); // Cria a instância do formulário
            cliente.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_cadastroActionPerformed

    private void txt_nome_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_categoriaActionPerformed

    private void jButton_editar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_categoriaActionPerformed
        // Obtém o texto dos campos e armazena nas variáveis
        String Cod_Categoria = txt_cod_categoria.getText();
        String Nome_Categoria = txt_nome_categoria.getText();

        // Variável para armazenar a instrução SQL que será executada
        String sql = "";

        // Variável para armazenar a mensagem que será exibida ao usuário
        String msg = "";

        try {
            // Verifica se o campo de código está vazio para decidir entre inserção ou atualização
            if (txt_cod_categoria.getText().equals("")) {
                // Se o campo de código estiver vazio, cria uma instrução SQL para inserir um novo registro
                sql = "INSERT INTO Categoria (Nome_Categoria) VALUES ('" + Nome_Categoria + "')";
                msg = "Gravação de um novo registro";
            } else {
                // Se o campo de código não estiver vazio, cria uma instrução SQL para atualizar um registro existente
                sql = "UPDATE Categoria SET Nome_Categoria = '" + Nome_Categoria + "' WHERE Cod_Categoria = '" + Cod_Categoria + "'";
                msg = "Alteração de registro";
            }

            // Executa a instrução SQL (inserção ou atualização)
            conexao_categoria.statement.executeUpdate(sql);

            // Exibe uma mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(null, msg + "\nCadastro realizado com sucesso! \n", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            // Executa um comando SQL para selecionar todos os registros da tabela 'Categoria' ordenados por 'Cod_Categoria'
            conexao_categoria.executaSQL("SELECT * FROM Categoria ORDER BY Cod_Categoria");

            // Move o cursor para o primeiro registro no ResultSet
            conexao_categoria.resultset.first();

            // Chama o método para preencher a tabela na interface com os dados do banco
            preencherTabela();


        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nErro ao gravar dados da tabela: \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_editar_categoriaActionPerformed

    private void ultimo_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimo_registro1ActionPerformed
        try{
            conexao_categoria.resultset.last();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
         // Chama o método para mostrar os dados do registro atual nos campos da interface
            mostrar_Dados();
    }//GEN-LAST:event_ultimo_registro1ActionPerformed

    private void avancar_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancar_registro1ActionPerformed
        try{
            conexao_categoria.resultset.next();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
         // Chama o método para mostrar os dados do registro atual nos campos da interface
            mostrar_Dados();
    }//GEN-LAST:event_avancar_registro1ActionPerformed

    private void voltar_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_registro1ActionPerformed
        try{
            conexao_categoria.resultset.previous();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
         // Chama o método para mostrar os dados do registro atual nos campos da interface
            mostrar_Dados();
    }//GEN-LAST:event_voltar_registro1ActionPerformed

    private void primeiro_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiro_registro1ActionPerformed
        try{
            conexao_categoria.resultset.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o 1° registro: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
         // Chama o método para mostrar os dados do registro atual nos campos da interface
            mostrar_Dados();
    }//GEN-LAST:event_primeiro_registro1ActionPerformed

    private void jButton_nova_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nova_categoriaActionPerformed
        // Obtém o texto dos campos de nome e código da categoria
        String Cod_Categoria = txt_cod_categoria.getText();
        String Nome_Categoria = txt_nome_categoria.getText();

        try {
            // Monta a string SQL para inserir os dados no banco de dados
            String insert_sql = "INSERT INTO Categoria (Cod_Categoria, Nome_Categoria) VALUES('" + Cod_Categoria + "','" + Nome_Categoria + "')";

            // Executa o comando SQL de inserção no banco de dados
            conexao_categoria.statement.executeUpdate(insert_sql);

            // Exibe uma mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            // Executa um novo comando SQL para selecionar todos os registros da tabela 'Categoria' ordenados por 'Cod_Categoria'
            conexao_categoria.executaSQL("SELECT * FROM Categoria ORDER BY Cod_Categoria");

            // Move o cursor para o primeiro registro no ResultSet
            conexao_categoria.resultset.first();

            // Chama o método para preencher a tabela na interface com os dados do banco
            preencherTabela();

           
        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nErro ao gravar dados da tabela: \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_nova_categoriaActionPerformed

    private void categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaMouseClicked
        int linha_selecionada = categoria.getSelectedRow(); // Obtém a linha selecionada.

        // Preenche os campos de texto com os dados da linha selecionada.
        txt_cod_categoria.setText(categoria.getValueAt(linha_selecionada, 0).toString()); // Cod_Categoria
        txt_nome_categoria.setText(categoria.getValueAt(linha_selecionada, 1).toString()); // Nome_Categoria
    }//GEN-LAST:event_categoriaMouseClicked

    private void categoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriaKeyPressed
        int linha_selecionada = categoria.getSelectedRow(); // Obtém a linha selecionada.

        // Preenche os campos de texto com os dados da linha selecionada.
        txt_cod_categoria.setText(categoria.getValueAt(linha_selecionada, 0).toString()); // Cod_Categoria
        txt_nome_categoria.setText(categoria.getValueAt(linha_selecionada, 1).toString()); // Nome_Categoria
    }//GEN-LAST:event_categoriaKeyPressed

    private void limpar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_camposActionPerformed
        //Para limpar os Campos
        txt_cod_categoria.setText(null);
        txt_nome_categoria.setText(null);
    }//GEN-LAST:event_limpar_camposActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

     System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Preenche a tabela com os dados obtidos do banco de dados.
    public void preencherTabela() {
        // Define a largura das colunas da tabela.
        categoria.getColumnModel().getColumn(0).setPreferredWidth(4);
        categoria.getColumnModel().getColumn(1).setPreferredWidth(150);

        DefaultTableModel modelo = (DefaultTableModel) categoria.getModel(); // Obtém o modelo da tabela.
        modelo.setNumRows(0); // Remove todas as linhas existentes.

        try {
            conexao_categoria.resultset.beforeFirst(); // Move o cursor antes do primeiro registro.
            while (conexao_categoria.resultset.next()) { // Itera sobre os registros do ResultSet.
                modelo.addRow(new Object[] {
                    conexao_categoria.resultset.getString("Cod_Categoria"), 
                    conexao_categoria.resultset.getString("Nome_Categoria")
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     // Exibe os dados do registro atual nos campos de texto.
    public void mostrar_Dados() {  
       try {
            // Preenche os campos de texto com os dados da tabela Categoria
            txt_cod_categoria.setText(conexao_categoria.resultset.getString("Cod_Categoria"));
            txt_nome_categoria.setText(conexao_categoria.resultset.getString("Nome_Categoria"));
            } catch (SQLException erro) {
                // Exibe uma mensagem em caso de erro ao obter os dados
                JOptionPane.showMessageDialog(null, "\n Não localizou dados: \n" + erro, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
    // Posiciona no primeiro registro e exibe os dados.
    public void posicionarRegistro() {
        try {
            conexao_categoria.resultset.first(); // Move o cursor para o primeiro registro.
            mostrar_Dados(); // Exibe os dados do registro atual.
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possível posicionar no primeiro registro: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Categoria().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancar_registro1;
    private javax.swing.JTable categoria;
    private javax.swing.JButton jButton_editar_categoria;
    private javax.swing.JButton jButton_nova_categoria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_cod_categoria;
    private javax.swing.JLabel jLabel_preco;
    private javax.swing.JLabel jLabel_titulo1;
    private javax.swing.JLabel jLabel_titulo2;
    private javax.swing.JLabel jLabel_titulo3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpar_campos;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_home;
    private javax.swing.JMenu menu_produtos;
    private javax.swing.JButton primeiro_registro1;
    private javax.swing.JMenuItem sub_cadastro;
    private javax.swing.JMenuItem sub_categoria;
    private javax.swing.JMenuItem sub_estoque;
    private javax.swing.JMenuItem sub_home;
    private javax.swing.JTextField txt_cod_categoria;
    private javax.swing.JTextField txt_nome_categoria;
    private javax.swing.JButton ultimo_registro1;
    private javax.swing.JButton voltar_registro1;
    // End of variables declaration//GEN-END:variables
}