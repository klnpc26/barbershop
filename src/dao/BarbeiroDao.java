package dao;

import java.util.List;

import model.entidades.Barbeiro;

public interface BarbeiroDao {
	
	void inserir(Barbeiro obj);
	void editar(Barbeiro obj);
	void excluir(Barbeiro obj);
	List<Barbeiro> recuperarTudo();
}
