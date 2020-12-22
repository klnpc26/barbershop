package dao;

import java.util.List;

import model.entidades.Agenda;

public interface AgendaDao {

	void inserir(Agenda obj);
	void editar(Agenda obj);
	void excluir(Agenda obj);
	List<Agenda> recuperarTudo();
}
