package dao;

import java.util.List;

import model.entidades.Administrador;

public interface AdministradorDao {
	
	void inserir(Administrador obj);
	void editar(Administrador obj);
	void excluir(Administrador obj);
	List<Administrador> recuperarTudo();
}
