package controle;

/**
 * Tela que representa a consulta de Vendas.
 * @author Jovana e Leticia
 */

import conexao.Conexao; // Importa a classe Conexao para realizar a conexão com o banco de dados.
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos de mensagens.
import javax.swing.table.DefaultTableModel; // Importa a classe DefaultTableModel para manipular a tabela.
import java.sql.*; // Importa as classes para manipulação de banco de dados.
import java.util.logging.Level; // Importa a classe Level para definir o nível de log.
import java.util.logging.Logger; // Importa a classe Logger para registrar eventos.
import javax.swing.table.DefaultTableCellRenderer; // Import para centralizar a tabela
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.text.MaskFormatter;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public final class Home extends javax.swing.JFrame {
    
    Conexao conexao_home;

    public  Home() throws SQLException {
       
        setUndecorated(true);  // Remove a barra de título completamente
        setVisible(true);  // Exibe a janela
        initComponents();
        setLocationRelativeTo(null);

          
        conexao_home = new Conexao(); // Inicializa a conexão
        conexao_home.conecta(); // Estabelece a conexão

        // Gera o código do pedido ao abrir a página
        carregar_categorias();
        
        // Ajusta a consulta para a tabela Categoria
        conexao_home.executaSQL("SELECT * FROM cliente ORDER BY CPF_Cliente"); 

        // Categotia
        jComboBox_categoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém o item selecionado no jComboBox_categoria
                String categoriaSelecionada = jComboBox_categoria.getSelectedItem().toString();

                // Chama o método para carregar os produtos relacionados à categoria selecionada
                carregarProdutos(categoriaSelecionada);
            }
        });
            
        // Quando o produto for selecionado no JComboBox, capture o valor e passe para o método carregarPrecoProduto
        jComboBox_produto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Captura o nome do produto selecionado
                String produtoSelecionado = (String) jComboBox_produto.getSelectedItem();

                // Chama o método para carregar o preço do produto
                if (produtoSelecionado != null) {
                    carregarPrecoProduto(produtoSelecionado);
                }
            }
        });
        carregarProximoCodigoPedido(); // Preenche o código do pedido ao carregar a tela

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_data_exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_cod_pedido = new javax.swing.JTextField();
        jLabel_titulo1 = new javax.swing.JLabel();
        txt_cpf_cliente = new javax.swing.JTextField();
        botao_adicionar_produto = new javax.swing.JButton();
        txt_quantidade_produto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaItensPedido = new javax.swing.JTable();
        jComboBox_produto = new javax.swing.JComboBox<>();
        total_pagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_nome_cliente1 = new javax.swing.JLabel();
        txt_preco_uni = new javax.swing.JTextField();
        jLabel_data = new javax.swing.JLabel();
        jLabel_cod_cliente = new javax.swing.JLabel();
        jLabel_nome_cliente = new javax.swing.JLabel();
        jLabel_cod_cliente1 = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        txt_data = new javax.swing.JLabel();
        jLabel_nome_cliente4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_nome_cliente2 = new javax.swing.JLabel();
        botao_finalizar = new javax.swing.JButton();
        jLabel_nome_cliente3 = new javax.swing.JLabel();
        txt_total_pagar = new javax.swing.JTextField();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txt_data_exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 238));

        txt_cod_pedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_titulo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_titulo1.setFont(new java.awt.Font("Freestyle Script", 0, 70)); // NOI18N
        jLabel_titulo1.setForeground(new java.awt.Color(24, 51, 79));
        jLabel_titulo1.setText("Vendas");

        txt_cpf_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botao_adicionar_produto.setBackground(new java.awt.Color(153, 153, 255));
        botao_adicionar_produto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botao_adicionar_produto.setForeground(new java.awt.Color(255, 255, 255));
        botao_adicionar_produto.setText("Adicionar Produto");
        botao_adicionar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_adicionar_produtoActionPerformed(evt);
            }
        });

        txt_quantidade_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tabelaItensPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaItensPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Produto", "Nome Produto", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaItensPedido.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabelaItensPedido.setRowMargin(2);
        jScrollPane2.setViewportView(tabelaItensPedido);

        jComboBox_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opções" }));

        total_pagar.setBackground(new java.awt.Color(153, 153, 255));
        total_pagar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        total_pagar.setForeground(new java.awt.Color(255, 255, 255));
        total_pagar.setText("Calcular Preço");
        total_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_pagarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("VALOR DA UNIDADE:");

        jLabel_nome_cliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_cliente1.setText("PRODUTO:");

        txt_preco_uni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_data.setText("DATA:");

        jLabel_cod_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_cliente.setText("CPF DO CLIENTE:");

        jLabel_nome_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_cliente.setText("CATEGORIA  DO  PRODUTO:");

        jLabel_cod_cliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_cod_cliente1.setText("CÓDIGO:");

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opções" }));

        txt_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_nome_cliente4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_cliente4.setText("QUANTIDADE:");

        jPanel2.setBackground(new java.awt.Color(58, 157, 91));

        jLabel_nome_cliente2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nome_cliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/carrinho.png"))); // NOI18N

        botao_finalizar.setBackground(new java.awt.Color(255, 204, 51));
        botao_finalizar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botao_finalizar.setText("Finalizar");
        botao_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_finalizarActionPerformed(evt);
            }
        });

        jLabel_nome_cliente3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nome_cliente3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel_nome_cliente3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nome_cliente3.setText("TOTAL A PAGAR:");

        txt_total_pagar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel_nome_cliente2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nome_cliente3))))
                .addGap(0, 199, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(botao_finalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel_nome_cliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_nome_cliente3)
                .addGap(18, 18, 18)
                .addComponent(txt_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botao_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel_data)
                        .addGap(18, 18, 18)
                        .addComponent(txt_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_adicionar_produto))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_nome_cliente)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_cod_cliente1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_cod_cliente)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_cpf_cliente))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel_nome_cliente1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(txt_preco_uni, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_nome_cliente4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_data)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_titulo1)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cod_cliente1)
                    .addComponent(jLabel_cod_cliente)
                    .addComponent(txt_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome_cliente)
                    .addComponent(jComboBox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nome_cliente1)
                    .addComponent(jComboBox_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_preco_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_nome_cliente4)
                    .addComponent(txt_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botao_adicionar_produto)
                        .addGap(30, 30, 30)
                        .addComponent(total_pagar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_home.setText("Início");
        menu_home.setActionCommand("");

        sub_home.setText("Início");
        menu_home.add(sub_home);

        jMenuBar1.add(menu_home);

        menu_cliente.setText("Clientes");

        sub_cadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_data_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_data_exit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    
    
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

    private void sub_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_estoqueActionPerformed
     
    try {
            Produtos produto = new Produtos(); // Cria a instância do formulário
            produto.setVisible(true); // Torna o formulário visível
            this.dispose(); // Fecha a janela

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sub_estoqueActionPerformed

    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Pega a data do sistema
        Date dataSistema = new Date();
        // Formato da data
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
        // Atribui a data formatada ao JTextField
        txt_data.setText(formato.format(dataSistema));

    }//GEN-LAST:event_formWindowOpened

    
     // Método para criar o formato de data para o JFormattedTextField
    private static MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
            formatter.setValidCharacters("0123456789");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatter;
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botao_adicionar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_adicionar_produtoActionPerformed
        // Obter dados do produto e quantidade
        String nomeProdutoSelecionado = jComboBox_produto.getSelectedItem().toString();
        String quantidadeStr = txt_quantidade_produto.getText();
        int quantidadeVendida = 0;

        try {
            quantidadeVendida = Integer.parseInt(quantidadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida. Por favor, insira um valor numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (quantidadeVendida <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma quantidade maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar código do produto e verificar estoque
        int codigoProduto = 0;
        int quantidadeDisponivel = 0;
        BigDecimal valorProduto = BigDecimal.ZERO;

        try {
            String sqlBuscaProduto = "SELECT Cod_Produto, Quantidade_Produto_Disponivel, Preco_Produto FROM Produto WHERE Nome_Produto = '"
            + nomeProdutoSelecionado + "'";
            conexao_home.resultset = conexao_home.statement.executeQuery(sqlBuscaProduto);

            if (conexao_home.resultset.next()) {
                codigoProduto = conexao_home.resultset.getInt("Cod_Produto");
                quantidadeDisponivel = conexao_home.resultset.getInt("Quantidade_Produto_Disponivel");
                valorProduto = conexao_home.resultset.getBigDecimal("Preco_Produto");
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado no banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            erro.printStackTrace();
            return;
        }

        // Verificar disponibilidade no estoque
        if (quantidadeVendida > quantidadeDisponivel) {
            JOptionPane.showMessageDialog(null, "Estoque insuficiente. Disponível: " + quantidadeDisponivel + ", Solicitado: " + quantidadeVendida,
                "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Adicionar item à lista de itens do pedido
        ItemPedido item = new ItemPedido(codigoProduto, nomeProdutoSelecionado, quantidadeVendida, valorProduto.multiply(BigDecimal.valueOf(quantidadeVendida)));
        listaItensPedido.add(item);

        JOptionPane.showMessageDialog(null, "Produto adicionado ao pedido!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

        // Atualizar a interface para mostrar os itens adicionados
        atualizarTabelaItensPedido();

        // Limpar os campos após adicionar o produto
        txt_preco_uni.setText("");               // Limpa o campo de preço unitário
        txt_quantidade_produto.setText("");      // Limpa o campo de quantidade
        jComboBox_produto.setSelectedItem(null);   // Remove a seleção atual
        jComboBox_categoria.setSelectedItem(null); // Remove a seleção atual
    }//GEN-LAST:event_botao_adicionar_produtoActionPerformed

    private void total_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_pagarActionPerformed
        try {
            // Verificar se há itens no pedido
            if (listaItensPedido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum produto foi adicionado ao pedido.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Calcular o total somando os valores de todos os itens no pedido
            BigDecimal totalPedido = BigDecimal.ZERO;
            for (ItemPedido item : listaItensPedido) {
                totalPedido = totalPedido.add(item.getValorTotal());
            }

            // Formatar o valor total para exibição (2 casas decimais)
            String totalFormatted = String.format("%.2f", totalPedido);

            // Exibir o total no campo de texto 'txt_total_pagar'
            txt_total_pagar.setText(totalFormatted);
        } catch (Exception ex) {
            // Capturar erros inesperados
            JOptionPane.showMessageDialog(null, "Erro ao calcular o valor total: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_total_pagarActionPerformed

    private void botao_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_finalizarActionPerformed
        // Obter CPF do cliente
        String cpfCliente = txt_cpf_cliente.getText();

        // Verificar se o CPF está cadastrado no banco
        try {
            String sqlVerificaCpf = "SELECT COUNT(*) AS total FROM Cliente WHERE CPF_Cliente = '" + cpfCliente + "'";
            conexao_home.resultset = conexao_home.statement.executeQuery(sqlVerificaCpf);

            if (conexao_home.resultset.next()) {
                int total = conexao_home.resultset.getInt("total");
                if (total == 0) {
                    JOptionPane.showMessageDialog(null, "O CPF fornecido não está cadastrado. Por favor, registre o cliente antes de continuar.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao verificar o CPF. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            erro.printStackTrace();
            return;
        }

        // Verificar se há itens no pedido
        if (listaItensPedido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Adicione ao menos um produto antes de finalizar o pedido.", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Calcular o valor total do pedido com base nos itens
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : listaItensPedido) {
            valorTotal = valorTotal.add(item.getValorTotal());
        }

        // Validar o valor total
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor total válido.", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Obter a data do pedido
        String dataPedido = txt_data.getText();

        // Verificar formato da data
        try {
            LocalDate.parse(dataPedido);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido. Use o formato yyyy-MM-dd.", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Inserir pedido no banco
        String insertPedidoSql = "INSERT INTO Pedido (CPF_Cliente, Data_Pedido, Valor_Total) VALUES ('"
        + cpfCliente + "', '"
        + dataPedido + "', "
        + valorTotal + ")";
        int ultimoCodPedido;

        try {
            conexao_home.statement.executeUpdate(insertPedidoSql);

            // Recuperar o último código do pedido
            String sqlUltimoPedido = "SELECT MAX(Cod_Pedido) AS UltimoCod FROM Pedido";
            conexao_home.resultset = conexao_home.statement.executeQuery(sqlUltimoPedido);

            if (conexao_home.resultset.next()) {
                ultimoCodPedido = conexao_home.resultset.getInt("UltimoCod");
                txt_cod_pedido.setText(String.valueOf(ultimoCodPedido)); // Exibe o código do pedido no campo
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao recuperar o código do pedido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Exibir extrato do pedido
            exibirExtratoPedido(cpfCliente, valorTotal);

        } catch (SQLException erro) {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao registrar o pedido: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Inserir itens do pedido no banco
        try {
            for (ItemPedido item : listaItensPedido) {
                String insertItemSql = "INSERT INTO item_pedido (Cod_Pedido, Cod_Produto, Quantidade_Vendida, Valor_Vendido) VALUES ("
                + ultimoCodPedido + ", "
                + item.getCodigoProduto() + ", "
                + item.getQuantidade() + ", "
                + item.getValorTotal() + ")";
                conexao_home.statement.executeUpdate(insertItemSql);

                // Atualizar quantidade disponível no estoque
                String updateEstoqueSql = "UPDATE Produto SET Quantidade_Produto_Disponivel = Quantidade_Produto_Disponivel - "
                + item.getQuantidade() + " WHERE Cod_Produto = " + item.getCodigoProduto();
                conexao_home.statement.executeUpdate(updateEstoqueSql);
            }

            JOptionPane.showMessageDialog(null, "Pedido finalizado com sucesso!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            listaItensPedido.clear();
            atualizarTabelaItensPedido(); // Atualizar tabela após limpar itens
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar os itens do pedido: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            erro.printStackTrace();
        }
    }//GEN-LAST:event_botao_finalizarActionPerformed

    

    
    private class ItemPedido {
        private int codigoProduto;
        private String nomeProduto;
        private int quantidade;
        private BigDecimal valorTotal;

        public ItemPedido(int codigoProduto, String nomeProduto, int quantidade, BigDecimal valorTotal) {
            this.codigoProduto = codigoProduto;
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.valorTotal = valorTotal;
        }

        public int getCodigoProduto() {
            return codigoProduto;
        }

        public String getNomeProduto() {
            return nomeProduto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public BigDecimal getValorTotal() {
            return valorTotal;
        }
    }

    private void exibirExtratoPedido(String cpfCliente, BigDecimal valorTotal) {
        // Buscar nome do cliente pelo CPF
        String nomeCliente = "";
        try {
            String sqlNomeCliente = "SELECT Nome_Cliente FROM Cliente WHERE CPF_Cliente = '" + cpfCliente + "'";
            conexao_home.resultset = conexao_home.statement.executeQuery(sqlNomeCliente);

            if (conexao_home.resultset.next()) {
                nomeCliente = conexao_home.resultset.getString("Nome_Cliente");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o nome do cliente: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            erro.printStackTrace();
            return;
        }

        // Montar o extrato com os itens do pedido
        StringBuilder extrato = new StringBuilder();
        extrato.append("Extrato do Pedido\n");
        extrato.append("Cliente: ").append(nomeCliente).append("\n\n");

        // Adicionar produtos ao extrato
        extrato.append("Produtos Comprados:\n");
        for (ItemPedido item : listaItensPedido) {
            extrato.append("- ").append(item.getNomeProduto())
                   .append(" | Quantidade: ").append(item.getQuantidade())
                   .append(" | Preço Unitário: ").append(item.getValorTotal().divide(BigDecimal.valueOf(item.getQuantidade())))
                   .append(" | Total: ").append(item.getValorTotal())
                   .append("\n");
        }

        // Adicionar o valor total do pedido
        extrato.append("\nValor Total do Pedido: ").append(valorTotal);

        // Exibir o extrato para o cliente
        JOptionPane.showMessageDialog(null, extrato.toString(), "Extrato do Pedido", JOptionPane.INFORMATION_MESSAGE);
    }
     
    private List<ItemPedido> listaItensPedido = new ArrayList<ItemPedido>();

    // Método para atualizar a tabela de itens do pedido
    private void atualizarTabelaItensPedido() {
        DefaultTableModel model = (DefaultTableModel) tabelaItensPedido.getModel();
        model.setRowCount(0); // Limpa a tabela

        for (ItemPedido item : listaItensPedido) {
            model.addRow(new Object[] {
                item.getCodigoProduto(),
                item.getNomeProduto(),
                item.getQuantidade(),
                item.getValorTotal()
            });
        }
    }



    private void carregarProximoCodigoPedido() {
        try {
            // Consultar o maior código de pedido existente
            String sqlUltimoPedido = "SELECT MAX(Cod_Pedido) AS UltimoCod FROM Pedido";
            conexao_home.resultset = conexao_home.statement.executeQuery(sqlUltimoPedido);

            int proximoCodPedido = 1; // Começa com 1 caso não haja nenhum pedido ainda
            if (conexao_home.resultset.next()) {
                int ultimoCodPedido = conexao_home.resultset.getInt("UltimoCod");
                proximoCodPedido = ultimoCodPedido + 1; // Incrementa para obter o próximo código
            }

            // Preencher o campo com o próximo código
            txt_cod_pedido.setText(String.valueOf(proximoCodPedido));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o próximo código de pedido: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            erro.printStackTrace();
        }
    }
  
    
    
    //JCOMBO BOX SELECIONAR PRODUTOS
    public void carregar_categorias() {
        try {
            String sql = "SELECT * FROM Categoria";
            conexao_home.executaSQL(sql); // Executa a consulta no banco de dados

            jComboBox_categoria.removeAllItems(); // Limpa os itens atuais no combo box

            int count = 0; // Contador para rastrear quantas categorias foram adicionadas
            while (conexao_home.resultset.next()) {
                String nomeCategoria = conexao_home.resultset.getString("Nome_Categoria");
                jComboBox_categoria.addItem(nomeCategoria); // Adiciona o nome da categoria no combo box
                count++;
            }

            // Mensagem de depuração
            System.out.println(count + " categorias carregadas.");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar categorias: " + erro.getMessage());
        }
    }

    public void carregarProdutos(String categoriaNome) {
    try {
        // Consulta SQL para pegar todos os produtos da categoria específica
        String sql = "SELECT p.Nome_Produto FROM Produto p " +
                     "JOIN Categoria c ON p.Cod_Categoria = c.Cod_Categoria " +
                     "WHERE c.Nome_Categoria = '" + categoriaNome + "'";

        conexao_home.executaSQL(sql); // Executa a consulta no banco de dados

        // Criando o modelo do JComboBox
        DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();

        // Verifica se encontrou algum produto
        while (conexao_home.resultset.next()) {
            String nomeProduto = conexao_home.resultset.getString("Nome_Produto");
            // Adiciona cada produto ao modelo do JComboBox
            modeloComboBox.addElement(nomeProduto);
        }

        // Definindo o modelo no JComboBox
        jComboBox_produto.setModel(modeloComboBox);

        if (modeloComboBox.getSize() == 0) {
            // Se não houver produtos na categoria
            JOptionPane.showMessageDialog(null, "Não há produtos para esta categoria.");
        }

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar os produtos da categoria: " + erro.getMessage());
    }
 
}   
    
 public void carregarPrecoProduto(String nomeProduto) {
    try {
        
        // Consulta SQL
        String sql = "SELECT p.Preco_Produto FROM Produto p WHERE p.Nome_Produto = '" + nomeProduto + "'";
        
        conexao_home.executaSQL(sql); // Executa a consulta no banco de dados


        if (conexao_home.resultset.next()) {
            // Recupera o preço do produto
            double precoProduto = conexao_home.resultset.getDouble("Preco_Produto");
            // Exibe o preço na caixa de texto
            txt_preco_uni.setText(String.format("%.2f", precoProduto));
        } else {
            // Se o produto não for encontrado
            txt_preco_uni.setText("0.00");
        }

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar o preço do produto: " + erro.getMessage());
    }
}
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_adicionar_produto;
    private javax.swing.JButton botao_finalizar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_cod_cliente;
    private javax.swing.JLabel jLabel_cod_cliente1;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_nome_cliente;
    private javax.swing.JLabel jLabel_nome_cliente1;
    private javax.swing.JLabel jLabel_nome_cliente2;
    private javax.swing.JLabel jLabel_nome_cliente3;
    private javax.swing.JLabel jLabel_nome_cliente4;
    private javax.swing.JLabel jLabel_titulo1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_home;
    private javax.swing.JMenu menu_produtos;
    private javax.swing.JMenuItem sub_cadastro;
    private javax.swing.JMenuItem sub_categoria;
    private javax.swing.JMenuItem sub_estoque;
    private javax.swing.JMenuItem sub_home;
    private javax.swing.JTable tabelaItensPedido;
    private javax.swing.JButton total_pagar;
    private javax.swing.JTextField txt_cod_pedido;
    private javax.swing.JTextField txt_cpf_cliente;
    private javax.swing.JLabel txt_data;
    private javax.swing.JLabel txt_data_exit;
    private javax.swing.JTextField txt_preco_uni;
    private javax.swing.JTextField txt_quantidade_produto;
    private javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables


}
