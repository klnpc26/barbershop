package TesteUnitario;

import java.util.List;

import dao.DAOFactory;
import dao.ServicoDao;
import model.entidades.Servico;

public class TesteServico {
	
	public static void main(String[] args) {
		
		ServicoDao servico = DAOFactory.criandoServicoDao();
		Servico sv = new Servico(1, "corte de cabelo", 40, 40.00);
		
//		System.out.println("====TESTE 1: inserir====");
//		servico.inserir(sv);
		
//		System.out.println("====TESTE 2: editar====");
//		servico.editar(sv);
		
//		System.out.println("====TESTE 3: recuperar tudo====");
//		List<Servico> list = servico.recuperarTudo();
//		for(Servico s : list) {
//			System.out.println(s);
//		}
		
//		System.out.println("====TESTE 4: exluir====");
//		servico.excluir(sv);
	}
}
