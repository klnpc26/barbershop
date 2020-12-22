package TesteUnitario;

import java.util.ArrayList;
import java.util.List;

import dao.AdministradorDao;
import dao.DAOFactory;
import model.entidades.Administrador;

public class TesteAdmin {
	
	public static void main(String[] args) {
		
		AdministradorDao admin = DAOFactory.criandoAdministradorDao();
		Administrador ad = new Administrador(1, null, null, null);
		
//		System.out.println("====TESTE 1: inserir====");
//		admin.inserir(ad);
		
//		System.out.println("====TESTE 2: editar====");
//		admin.editar(ad);
		
//		System.out.println("====TESTE 3: recuperar tudo====");
//		List<Administrador> list = admin.recuperarTudo();
//		for(Administrador a : list) {
//			System.out.println(a);
//		}
		
//		System.out.println("====TESTE 4: exluir====");
//		admin.excluir(ad);
	}
}
