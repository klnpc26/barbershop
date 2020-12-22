package dao;

import Conn.BD;
import JDBC.AdministradorJDBC;

public class DAOFactory {
	
	public static AdministradorDao criandoAdministradorDao() {
		return new AdministradorJDBC(BD.conexao());
	}
	
//	public static AgendaDao criandoAgendaDao() {
//		return new AgendaJDBC(BD.conexao());
//	}
//	
//	public static BarbeiroDao criandoBarbeiroDao() {
//		return new BrbeiroJDBC(BD.conexao());
//	}
//	
//	public static ServicoDao criandoServicoDao() {
//		return new ServicoJDBC(BD.conexao());
//	}
}
