package conexao;

import com.mysql.jdbc.Driver; // Importa a classe Driver do MySQL para registrar o driver.
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir mensagens de diálogo.
import java.sql.*; // Importa todas as classes do pacote java.sql, necessário para operações com banco de dados.

/**
 * @author Jovana e Letícia
 * 
 * Esta classe será responsável pela conexão com MYSQL
 * terá 3 métodos:
 * - abertura da conexão
 * - fechamento da conexão
 * - execução de comandos SQL
 */

public class Conexao {

    public static Connection getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Definição do driver MySQL para acesso aos dados.
    final private String driver = "com.mysql.jdbc.Driver";
    
    // URL para acessar o banco de dados chamado "clientes" no servidor local.
    final private String url = "jdbc:mysql://localhost/floricultura";
  
    // Usuário e senha para conectar ao MySQL.
    final private String usuario = "root";
    final private String senha = "";
    
    // Variável que armazenará a conexão aberta.
    private Connection conexao;
    
    // Variável para executar comandos SQL no ambiente Java.
    public Statement statement;
    
    // Variável que armazena o resultado da execução de um comando SQL.
    public ResultSet resultset;
    
    // Parece haver uma variável não utilizada chamada Driver.
    private String Driver;

    // Método para abrir a conexão com o banco de dados.
    public boolean conecta() {
        boolean result = true;
        try {
            // Carrega o driver do MySQL.
            Class.forName(driver);
            
            // Estabelece a conexão com o banco de dados usando a URL, usuário e senha.
            conexao = DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException Driver) {
            // Captura a exceção caso o driver não seja encontrado e exibe uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "Driver não localizado" + Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        } catch (SQLException Fonte) {
            // Captura a exceção caso ocorra um erro de SQL e exibe uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada" + Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }

    // Método para fechar a conexão com o banco de dados.
    public void desconecta() {
        try {
            // Fecha a conexão.
            conexao.close();
            
            // Exibe uma mensagem informando que a conexão foi fechada.
            JOptionPane.showMessageDialog(null, "Conexão com banco de dados fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException fecha) {
            // A captura da exceção aqui está vazia, não há tratamento ou mensagem de erro.
        }
    }

    // Método para executar um comando SQL no banco de dados.
    public void executaSQL(String sql) throws SQLException {
        try {
            // Cria um Statement para a execução de comandos SQL. 
            // ResultSet.TYPE_SCROLL_SENSITIVE permite a navegação bidirecional pelos dados.
            // ResultSet.CONCUR_READ_ONLY indica que os dados não podem ser alterados.
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            // Executa o comando SQL passado como argumento e armazena o resultado no ResultSet.
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao) {
            // Captura a exceção caso ocorra um erro de SQL e exibe uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}