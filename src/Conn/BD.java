package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String caminho = "jdbc:mysql://localhost:3306/barbearia?useSSL=false";
	private static String usuario = "root";
	private static String senha = "kaique2613";
	
	private static Connection conn = null;
	
	public static Connection conexao(){
        try{
            if(conn == null){
                Class.forName(driver);
                conn = DriverManager.getConnection(caminho, usuario, senha);
            }else if(conn.isClosed()){
                conn = null;
                return conn;
            }
            System.out.println("Conectado!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
       return conn;
    }
	
	public static void closeConn(){
        if(conn != null){
            try{
                conn.close();
                System.out.println("Desconectado!");
            }
            catch(SQLException e){
                throw new BdException(e.getMessage());
            }
        }
    }
    
    public static void closeStatement(Statement st){
        if(st != null){
            try{
                st.close();
            }
            catch(SQLException e){
                throw new BdException(e.getMessage());
            }
        }
    }
    
    public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }
            catch(SQLException e){
                throw new BdException(e.getMessage());
            }
        }
    }
}
