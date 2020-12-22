package TesteUnitario;

import Conn.BD;

public class TesteCon {
	
	public static void main(String[] args) {
		
		BD.conexao();
		BD.closeConn();
	}
}
