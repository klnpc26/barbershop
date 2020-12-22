package dao;

import java.util.List;

import model.entidades.Servico;

public interface ServicoDao {

	void inserir(Servico obj);
	void editar(Servico obj);
	void excluir(Servico obj);
	List<Servico> recuperarTudo();
}
