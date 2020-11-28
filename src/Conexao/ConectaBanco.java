package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectaBanco {
       
    public Statement stm;// responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs = null;// responsavel por armazenar o resultado de uma pesquisa passada para o Statement
    private String driver = "com.mysql.jdbc.Driver";// responsavel por indentificar o serviço de banco de dados 
    private String caminho = "jdbc:mysql://127.0.0.1:3306/barbearia";// responsavel por setar o local do banco de dados
    private String usuario = "root";
    private String senha = "kaique2613";
    public Connection conn;// responsavel por realizar a conexão com o  banco de dados
    
    public void conexao(){ // método responsavel por realizar a conexão com o banco de dados
        try {//tentativa inicial
            System.setProperty("jdbc.Drivers", driver);// seta a propriedade do Driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);// realiza a conexão com o banco de dados 
            JOptionPane.showConfirmDialog(null, "Conectado com sucesso!");// imprime uma caixa de mensagens
        } catch(SQLException ex){//excessão
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro: "+ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de executaSQL!\n Erro: "+ex.getMessage());;
        }
    }
    
    public void desconecta(){// método para fechar a conexão com o banco de dados
        try {
            conn.close();// fecha a conexão
            JOptionPane.showConfirmDialog(null, "Desconectado com sucesso!");// imprime uma caixa de mensagens
        } catch (SQLException ex){
            JOptionPane.showConfirmDialog(null, "Erro ao fechar a conexão!\n Erro: " + ex.getMessage());
        }
    }
}
