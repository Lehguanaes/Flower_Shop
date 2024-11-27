package controle;

/**
 * Tela que representa a consulta de Cliente.
 * @author Jovana e Leticia
 */

import conexao.Conexao; // Importa a classe Conexao para realizar a conexão com o banco de dados.
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos de mensagens.
import javax.swing.table.DefaultTableModel; // Importa a classe DefaultTableModel para manipular a tabela.
import java.sql.*; // Importa as classes para manipulação de banco de dados.
import java.util.logging.Level; // Importa a classe Level para definir o nível de log.
import java.util.logging.Logger; // Importa a classe Logger para registrar eventos.
import javax.swing.table.DefaultTableCellRenderer; // Import para centralizar a tabela

public class Cliente extends javax.swing.JFrame {
    
    Conexao conexao_cliente;

    public Cliente() throws SQLException {
          
        setUndecorated(true);  // Remove a barra de título completamente
        setVisible(true);  // Exibe a janela
        initComponents();
        setLocationRelativeTo(null);
        
        conexao_cliente = new Conexao(); // Inicializa a conexão
        conexao_cliente.conecta(); // Estabelece a conexão

        // Ajusta a consulta para a tabela Categoria
        conexao_cliente.executaSQL("SELECT * FROM cliente ORDER BY CPF_Cliente"); 
        preencherTabela(); // Preenche a tabela com os dados obtidos.
        posicionarRegistro(); // Posiciona no primeiro registro.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        primeiro_registro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cliente = new javax.swing.JTable();
        voltar_registro = new javax.swing.JButton();
        avancar_registro = new javax.swing.JButton();
        ultimo_registro = new javax.swing.JButton();
        jButton_novo_cliente = new javax.swing.JButton();
        jLabel_cod_cliente = new javax.swing.JLabel();
        jLabel_nome_cliente = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_quantidade = new javax.swing.JLabel();
        txt_cod_cliente = new javax.swing.JTextField();
        txt_nome_cliente = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        jLabel_status = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        pesquisar_registro = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel_pesquise = new javax.swing.JLabel();
        jLabel_titulo1 = new javax.swing.JLabel();
        jLabel_titulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_titulo3 = new javax.swing.JLabel();
        jButton_editar_cliente1 = new javax.swing.JButton();
        limpar_campos = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 238));

        primeiro_registro.setBackground(new java.awt.Color(255, 153, 0));
        primeiro_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primeiro_registro.setForeground(new java.awt.Color(255, 255, 255));
        primeiro_registro.setText("Primeiro Cliente");
        primeiro_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiro_registroActionPerformed(evt);
            }
        });

        cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        cliente.setGridColor(new java.awt.Color(204, 204, 255));
        cliente.setRowMargin(2);
        cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteMouseClicked(evt);
            }
        });
        cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clienteKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(cliente);

        voltar_registro.setBackground(new java.awt.Color(255, 153, 0));
        voltar_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        voltar_registro.setForeground(new java.awt.Color(255, 255, 255));
        voltar_registro.setText("<");
        voltar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_registroActionPerformed(evt);
            }
        });

        avancar_registro.setBackground(new java.awt.Color(255, 153, 0));
        avancar_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        avancar_registro.setForeground(new java.awt.Color(255, 255, 255));
        avancar_registro.setText(">");
        avancar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancar_registroActionPerformed(evt);
            }
        });

        ultimo_registro.setBackground(new java.awt.Color(255, 153, 0));
        ultimo_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ultimo_registro.setForeground(new java.awt.Color(255, 255, 255));
        ultimo_registro.setText("Ultimo Cliente");
        ultimo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimo_registroActionPerformed(evt);
            }
        });

        jButton_novo_cliente.setBackground(new java.awt.Color(153, 153, 255));
        jButton_novo_cliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_novo_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_novo_cliente.setText("Novo Cliente");
        jButton_novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_novo_clienteActionPerformed(evt);
            }
        });

        jLabel_cod_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_cliente.setText("CPF:");

        jLabel_nome_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_cliente.setText("NOME:");

        jLabel_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_email.setText("E-MAIL:");

        jLabel_quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_quantidade.setText("TELEFONE:");

        txt_cod_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nome_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefoneActionPerformed(evt);
            }
        });

        jLabel_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_status.setText("STATUS:");

        txt_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pesquisar_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisar_registroKeyReleased(evt);
            }
        });

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_pesquise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_pesquise.setText("PESQUISE:");

        jLabel_titulo1.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo1.setFont(new java.awt.Font("Freestyle Script", 0, 49)); // NOI18N
        jLabel_titulo1.setForeground(new java.awt.Color(58, 157, 91));
        jLabel_titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/cliente_cadastro_um.jpg"))); // NOI18N

        jLabel_titulo2.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo2.setFont(new java.awt.Font("Freestyle Script", 0, 70)); // NOI18N
        jLabel_titulo2.setForeground(new java.awt.Color(24, 51, 79));
        jLabel_titulo2.setText("Cliente");

        jLabel_titulo3.setBackground(new java.awt.Color(24, 51, 79));
        jLabel_titulo3.setFont(new java.awt.Font("Freestyle Script", 0, 49)); // NOI18N
        jLabel_titulo3.setForeground(new java.awt.Color(58, 157, 91));
        jLabel_titulo3.setText("Consultar Clientes");

        jButton_editar_cliente1.setBackground(new java.awt.Color(153, 153, 255));
        jButton_editar_cliente1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_editar_cliente1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editar_cliente1.setText("Editar Cliente");
        jButton_editar_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_cliente1ActionPerformed(evt);
            }
        });

        limpar_campos.setBackground(new java.awt.Color(153, 153, 255));
        limpar_campos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        limpar_campos.setForeground(new java.awt.Color(255, 255, 255));
        limpar_campos.setText("Limpar Campos");
        limpar_campos.setToolTipText("");
        limpar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_camposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 13, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_nome_cliente)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_cod_cliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_email)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_status)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_pesquise)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(primeiro_registro)
                                        .addGap(30, 30, 30)
                                        .addComponent(voltar_registro)
                                        .addGap(26, 26, 26)
                                        .addComponent(avancar_registro)
                                        .addGap(36, 36, 36)
                                        .addComponent(ultimo_registro))
                                    .addComponent(pesquisar_registro))
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_novo_cliente)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(limpar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jButton_editar_cliente1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel_titulo3)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_titulo1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel_titulo2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel_titulo2)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_nome_cliente)
                        .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_cod_cliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel_titulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_editar_cliente1)
                            .addComponent(limpar_campos)
                            .addComponent(jButton_novo_cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel_titulo3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pesquisar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_pesquise))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(primeiro_registro)
                                    .addComponent(voltar_registro)
                                    .addComponent(ultimo_registro)
                                    .addComponent(avancar_registro)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
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

        menu_cliente.setText("Clientes");

        sub_cadastro.setText("Cadastro");
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
            .addGap(0, 1301, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_categoriaActionPerformed

        try {
            Categoria categoria = new Categoria(); // Cria a instância do formulário
            categoria.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_categoriaActionPerformed

    private void sub_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_estoqueActionPerformed

        try {
            Produtos produto = new Produtos(); // Cria a instância do formulário
            produto.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_estoqueActionPerformed

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

    private void primeiro_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiro_registroActionPerformed
        try{
            conexao_cliente.resultset.first();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o 1° registro: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_primeiro_registroActionPerformed

    private void clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseClicked
        int linha_selecionada = cliente.getSelectedRow(); // Obtém a linha selecionada.

        // Preenche os campos de texto com os dados da linha selecionada.
        txt_cod_cliente.setText(cliente.getValueAt(linha_selecionada, 0).toString());
        txt_nome_cliente.setText(cliente.getValueAt(linha_selecionada, 1).toString());
        txt_telefone.setText(cliente.getValueAt(linha_selecionada, 2).toString());
        txt_email.setText(cliente.getValueAt(linha_selecionada, 3).toString());
        txt_status.setText(cliente.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_clienteMouseClicked

    private void clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteKeyPressed
        int linha_selecionada = cliente.getSelectedRow(); // Obtém a linha selecionada.

        // Preenche os campos de texto com os dados da linha selecionada.
        txt_cod_cliente.setText(cliente.getValueAt(linha_selecionada, 0).toString());
        txt_nome_cliente.setText(cliente.getValueAt(linha_selecionada, 1).toString());
        txt_telefone.setText(cliente.getValueAt(linha_selecionada, 2).toString());
        txt_email.setText(cliente.getValueAt(linha_selecionada, 3).toString());
        txt_status.setText(cliente.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_clienteKeyPressed

    private void voltar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_registroActionPerformed
        try{
            conexao_cliente.resultset.previous();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_voltar_registroActionPerformed

    private void avancar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancar_registroActionPerformed
        try{
            conexao_cliente.resultset.next();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_avancar_registroActionPerformed

    private void ultimo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimo_registroActionPerformed
        try{
            conexao_cliente.resultset.last();
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possivel acessar o registro anterior: \n" + erro,"Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ultimo_registroActionPerformed

    private void jButton_novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novo_clienteActionPerformed
        // Obtém o texto do campo de CPF e armazena na variável 'CPF_Cliente'
        String CPF_Cliente = txt_cod_cliente.getText();

        // Obtém o texto do campo de nome e armazena na variável 'Nome_Cliente'
        String Nome_Cliente = txt_nome_cliente.getText();

        // Obtém o texto do campo de telefone e armazena na variável 'Telefone_Cliente'
        String Telefone_Cliente = txt_telefone.getText();

        // Obtém o texto do campo de e-mail e armazena na variável 'Email_Cliente'
        String Email_Cliente = txt_email.getText();

        // Obtém o texto do campo de status e armazena na variável 'Status_Cliente'
        String Status_Cliente = txt_status.getText();

        try {
            // Monta a string SQL para inserir os dados no banco de dados
            String insert_sql = "INSERT INTO Cliente (CPF_Cliente, Nome_Cliente, Telefone_Cliente, Email_Cliente, Status_Cliente) " +
            "VALUES('" + CPF_Cliente + "','" + Nome_Cliente + "','" + Telefone_Cliente + "','" + Email_Cliente + "','" + Status_Cliente + "')";

            // Executa o comando SQL de inserção no banco de dados
            conexao_cliente.statement.executeUpdate(insert_sql);

            // Exibe uma mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            // Executa um novo comando SQL para selecionar todos os registros da tabela 'Cliente' ordenados por 'CPF_Cliente'
            conexao_cliente.executaSQL("SELECT * FROM Cliente ORDER BY CPF_Cliente");

            // Move o cursor para o primeiro registro no ResultSet
            conexao_cliente.resultset.first();

            // Chama o método para preencher a tabela na interface com os dados do banco
            preencherTabela();

            // Chama o método para mostrar os dados do registro atual nos campos da interface
            mostrar_Dados();

        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nErro ao gravar dados da tabela: \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_novo_clienteActionPerformed

    private void txt_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefoneActionPerformed

    private void pesquisar_registroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisar_registroKeyReleased
        try {
            // Monta a consulta SQL para pesquisar registros na tabela 'Cliente' onde o nome começa com o texto digitado
            String pesquisa = "SELECT * FROM Cliente WHERE Nome_Cliente LIKE '" + pesquisar_registro.getText() + "%'";
            conexao_cliente.executaSQL(pesquisa);

            // Verifica se o primeiro registro foi encontrado
            if (conexao_cliente.resultset.first()) {
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

    private void jButton_editar_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_cliente1ActionPerformed
        // Obtém o texto do campo de CPF e armazena na variável 'CPF_Cliente'
        String CPF_Cliente = txt_cod_cliente.getText();

        // Obtém o texto do campo de nome e armazena na variável 'Nome_Cliente'
        String Nome_Cliente = txt_nome_cliente.getText();

        // Obtém o texto do campo de telefone e armazena na variável 'Telefone_Cliente'
        String Telefone_Cliente = txt_telefone.getText();

        // Obtém o texto do campo de e-mail e armazena na variável 'Email_Cliente'
        String Email_Cliente = txt_email.getText();

        // Obtém o texto do campo de status e armazena na variável 'Status_Cliente'
        String Status_Cliente = txt_status.getText();

        // Variável para armazenar a instrução SQL que será executada
        String sql = "";

        // Variável para armazenar a mensagem que será exibida ao usuário
        String msg = "";

        try {
            // Verifica se o campo de CPF está vazio para decidir entre inserção ou atualização
            if (txt_cod_cliente.getText().equals("")) {
                // Se o campo de CPF estiver vazio, cria uma instrução SQL para inserir um novo registro
                sql = "INSERT INTO Cliente (CPF_Cliente, Nome_Cliente, Telefone_Cliente, Email_Cliente, Status_Cliente) " +
                "VALUES('" + CPF_Cliente + "','" + Nome_Cliente + "','" + Telefone_Cliente + "','" + Email_Cliente + "','" + Status_Cliente + "')";
                msg = "Gravação de um novo registro";
            } else {
                // Se o campo de CPF não estiver vazio, cria uma instrução SQL para atualizar um registro existente
                sql = "UPDATE Cliente SET Nome_Cliente = '" + Nome_Cliente + "', Telefone_Cliente = '" + Telefone_Cliente + "', Email_Cliente = '" + Email_Cliente + "', Status_Cliente = '" + Status_Cliente + "' " +
                "WHERE CPF_Cliente = '" + CPF_Cliente + "'";
                msg = "Alteração de registro";
            }

            // Executa a instrução SQL (inserção ou atualização)
            conexao_cliente.statement.executeUpdate(sql);

            // Exibe uma mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(null, msg + "\nCadastro realizado com sucesso! \n", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            // Executa um comando SQL para selecionar todos os registros da tabela 'Cliente' ordenados por 'CPF_Cliente'
            conexao_cliente.executaSQL("SELECT * FROM Cliente ORDER BY CPF_Cliente");

            // Move o cursor para o primeiro registro no ResultSet
            conexao_cliente.resultset.first();

            // Chama o método para preencher a tabela na interface com os dados do banco
            preencherTabela();

        } catch (SQLException erro) {
            // Em caso de erro, exibe uma mensagem ao usuário com a descrição do erro
            JOptionPane.showMessageDialog(null, "\nErro ao gravar dados da tabela: \n" + erro.getMessage(), "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_editar_cliente1ActionPerformed

    private void limpar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_camposActionPerformed
        //Para limpar os Campos
        txt_cod_cliente.setText(null);
        txt_nome_cliente.setText(null);
        txt_telefone.setText(null);
        txt_email.setText(null);
        txt_status.setText(null);
    }//GEN-LAST:event_limpar_camposActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
   
    // Preenche a tabela com os dados obtidos do banco de dados.
    public void preencherTabela() {
        // Define a largura das colunas da tabela.
        cliente.getColumnModel().getColumn(0).setPreferredWidth(14); // CPF_Cliente
        cliente.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome_Cliente
        cliente.getColumnModel().getColumn(2).setPreferredWidth(20);  // Telefone_Cliente
        cliente.getColumnModel().getColumn(3).setPreferredWidth(100); // Email_Cliente
        cliente.getColumnModel().getColumn(4).setPreferredWidth(5);   // Status_Cliente

        DefaultTableModel modelo = (DefaultTableModel) cliente.getModel(); // Obtém o modelo da tabela.
        modelo.setNumRows(0); // Remove todas as linhas existentes.

        try {
            conexao_cliente.resultset.beforeFirst(); // Move o cursor antes do primeiro registro.
            while (conexao_cliente.resultset.next()) { // Itera sobre os registros do ResultSet.
                modelo.addRow(new Object[] {
                    conexao_cliente.resultset.getString("CPF_Cliente"),
                    conexao_cliente.resultset.getString("Nome_Cliente"),
                    conexao_cliente.resultset.getString("Telefone_Cliente"),
                    conexao_cliente.resultset.getString("Email_Cliente"),
                    conexao_cliente.resultset.getString("Status_Cliente")
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela: \n" + erro, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Exibe os dados do registro atual nos campos de texto.
    public void mostrar_Dados() {  
        try {
            // Preenche os campos de texto com os dados da tabela Cliente
            txt_cod_cliente.setText(conexao_cliente.resultset.getString("CPF_Cliente"));
            txt_nome_cliente.setText(conexao_cliente.resultset.getString("Nome_Cliente"));
            txt_telefone.setText(conexao_cliente.resultset.getString("Telefone_Cliente"));
            txt_email.setText(conexao_cliente.resultset.getString("Email_Cliente"));
            txt_status.setText(conexao_cliente.resultset.getString("Status_Cliente"));
        } catch (SQLException erro) {
            // Exibe uma mensagem em caso de erro ao obter os dados
            JOptionPane.showMessageDialog(null, "\n Não localizou dados: \n" + erro, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Posiciona no primeiro registro e exibe os dados.
    public void posicionarRegistro() {
        try {
            conexao_cliente.resultset.first(); // Move o cursor para o primeiro registro.
            mostrar_Dados(); // Exibe os dados do registro atual.
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "\n Não foi possível posicionar no primeiro registro: \n" + erro, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancar_registro;
    private javax.swing.JTable cliente;
    private javax.swing.JButton jButton_editar_cliente1;
    private javax.swing.JButton jButton_novo_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_cod_cliente;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_nome_cliente;
    private javax.swing.JLabel jLabel_pesquise;
    private javax.swing.JLabel jLabel_quantidade;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JLabel jLabel_titulo1;
    private javax.swing.JLabel jLabel_titulo2;
    private javax.swing.JLabel jLabel_titulo3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpar_campos;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_home;
    private javax.swing.JMenu menu_produtos;
    private javax.swing.JTextField pesquisar_registro;
    private javax.swing.JButton primeiro_registro;
    private javax.swing.JMenuItem sub_cadastro;
    private javax.swing.JMenuItem sub_categoria;
    private javax.swing.JMenuItem sub_estoque;
    private javax.swing.JMenuItem sub_home;
    private javax.swing.JTextField txt_cod_cliente;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome_cliente;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JButton ultimo_registro;
    private javax.swing.JButton voltar_registro;
    // End of variables declaration//GEN-END:variables
}
