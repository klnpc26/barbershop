package testeUnitarios;

import Conexao.ConectaBanco;

public class TesteCon {
    
    public static void main(String[] args) {
    ConectaBanco con = new ConectaBanco();
    
    con.conexao();
    con.desconecta();
    }
    
}
