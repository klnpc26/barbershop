package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conn.BD;
import Conn.BdException;
import dao.AdministradorDao;
import model.entidades.Administrador;

public class AdministradorJDBC implements AdministradorDao{
	
	private Connection conn;
	
	public AdministradorJDBC() {
	}
	
	public AdministradorJDBC(Connection conn) {
		this.conn = conn;
	}
	
	
	@Override
	public void inserir(Administrador obj) {
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement("insert into administrador (nome_admin, email, senha) values (?, ?, ?)");
			
			pst.setString(1, obj.getNome_admin());
			pst.setString(2,  obj.getEmail());
			pst.setString(3, obj.getSenha());
			
			pst.executeUpdate();
			System.out.println("Inserido!");
		}
		 catch(SQLException e){
			 throw new BdException("Erro ao inserir dados");
	     }
	     finally{
	    	 BD.closeStatement(pst);
	     }
	}

	@Override
	public void editar(Administrador obj) {
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement("update administrador set nome_admin = ?, email = ?, senha = ? where id_admin = ?");
			
			pst.setString(1, obj.getNome_admin());
			pst.setString(2, obj.getEmail());
			pst.setString(3, obj.getSenha());
			pst.setInt(4, obj.getId_admin());
			
			pst.executeUpdate();
			System.out.println("Editado!");
		}
		catch(SQLException e) {
			throw new BdException("Erro ao editar dados");
		}
		finally {
			BD.closeStatement(pst);
		}
	}

	@Override
	public void excluir(Administrador obj) {
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("delete from administrador where id_admin = ?");
			
			pst.setInt(1, obj.getId_admin());
			
			pst.executeUpdate();
			System.out.println("Excluido");
		}
		catch(SQLException e) {
			throw new BdException("Erro ao exluir dados");
		}
		finally {
			BD.closeStatement(pst);
		}
		
	}
	
	@Override
	public List<Administrador> recuperarTudo() {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement("select * from administrador order by nome_admin");
			
			rs = pst.executeQuery();
			
			List<Administrador> list = new ArrayList<>();
			
			while(rs.next()) {
				Administrador ad = new Administrador();
				ad.setId_admin(rs.getInt("id_admin"));
				ad.setNome_admin(rs.getString("nome_admin"));
				ad.setEmail(rs.getString("email"));
				ad.setSenha(rs.getString("senha"));
				list.add(ad);
			}
			System.out.println("Dados encontrados!");
			return list;
		}
		catch(SQLException e) {
			throw new BdException("Error ao recuperar dados");
		}
		finally{
			BD.closeStatement(pst);
			BD.closeResultSet(rs);;
		}
	}

}
