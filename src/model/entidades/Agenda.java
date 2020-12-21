package model.entidades;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id_ag;
	private String nome_cliente;
	private Instant data_agenda;
	private Instant hora_agenda;
	
	private Administrador admin;
	private List<Barbeiro> barbeiro = new ArrayList<>();
	private List<Servico>  servico = new ArrayList<>();
	
	public Agenda() {
	}

	public Agenda(Integer id_ag, String nome_cliente, Instant data_agenda, Instant hora_agenda, Administrador admin) {
		super();
		this.id_ag = id_ag;
		this.nome_cliente = nome_cliente;
		this.data_agenda = data_agenda;
		this.hora_agenda = hora_agenda;
		this.setAdmin(admin);
	}

	public Integer getId_ag() {
		return id_ag;
	}

	public void setId_ag(Integer id_ag) {
		this.id_ag = id_ag;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public Instant getData_agenda() {
		return data_agenda;
	}

	public void setData_agenda(Instant data_agenda) {
		this.data_agenda = data_agenda;
	}

	public Instant getHora_agenda() {
		return hora_agenda;
	}

	public void setHora_agenda(Instant hora_agenda) {
		this.hora_agenda = hora_agenda;
	}
	
	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
	
	public List<Barbeiro> getBarbeiro() {
		return barbeiro;
	}
	
	public List<Servico> getServico() {
		return servico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_ag == null) ? 0 : id_ag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (id_ag == null) {
			if (other.id_ag != null)
				return false;
		} else if (!id_ag.equals(other.id_ag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agenda [id_ag=" + id_ag + ", nome_cliente=" + nome_cliente + ", data_agenda=" + data_agenda
				+ ", hora_agenda=" + hora_agenda + "]";
	}
}
