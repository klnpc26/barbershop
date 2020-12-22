package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conn.BD;
import Conn.BdException;
import dao.ServicoDao;
import model.entidades.Servico;

public class ServicoJDBC implements ServicoDao{
	
	private Connection conn;
	
	public ServicoJDBC() {
	}
	
	public ServicoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void inserir(Servico obj) {
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement("insert into servico (tipo_servico, tempo_servico, valor) values (?, ?, ?)");
		
			pst.setString(1, obj.getTipo_servico());
			pst.setInt(2, obj.getTempo_servico());
			pst.setDouble(3, obj.getValor());
			
			pst.executeUpdate();
			System.out.println("Inserido");
		}
		catch(SQLException e){
			 throw new BdException("Erro ao inserir dados");
	     }
	     finally{
	    	 BD.closeStatement(pst);
	     }	
	}

	@Override
	public void editar(Servico obj) {
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement("update servico set tipo_servico = ?, tempo_servico = ?, valor = ? where id_servico = ? ");
		
			pst.setString(1, obj.getTipo_servico());
			pst.setInt(2, obj.getTempo_servico());
			pst.setDouble(3, obj.getValor());
			pst.setInt(4, obj.getId_servico());
			
			pst.executeUpdate();
			System.out.println("Editado");
		}
		catch(SQLException e){
			 throw new BdException("Erro ao editar dados");
	     }
	     finally{
	    	 BD.closeStatement(pst);
	     }
	}

	@Override
	public void excluir(Servico obj) {
		PreparedStatement pst = null;
		
		try {
			pst = conn.prepareStatement("delete from servico where id_servico = ?");
			
			pst.setInt(1, obj.getId_servico());
			
			pst.executeUpdate();
			
			System.out.println("Excluido");
		}
		catch(SQLException e){
			 throw new BdException("Erro ao inserir dados");
	     }
	     finally{
	    	 BD.closeStatement(pst);
	     }	
	}

	@Override
	public List<Servico> recuperarTudo() {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement("select * from servico order by id_servico");
			
			rs = pst.executeQuery();
			
			List<Servico> list = new ArrayList<>();
			
			while(rs.next()) {
				Servico sv = new Servico();
				sv.setId_servico(rs.getInt("id_servico"));
				sv.setTipo_servico(rs.getString("tipo_servico"));
				sv.setTempo_servico(rs.getInt("tempo_servico"));
				sv.setValor(rs.getDouble("valor"));
				list.add(sv);
			}
			
			System.out.println("Recuperado todos os dados");
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
