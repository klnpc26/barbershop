package model.entidades;

import java.io.Serializable;
import java.time.Instant;

public class Barbeiro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id_barbeiro;
	private String nome_barbeiro;
	private Instant data_barbeiro;
	private Instant hora_barbeiro;
	
	private Agenda agenda;
	
	public Barbeiro() {
	}

	public Barbeiro(Integer id_barbeiro, String nome_barbeiro, Instant data_barbeiro, Instant hora_barbeiro, Agenda agenda) {
		super();
		this.id_barbeiro = id_barbeiro;
		this.nome_barbeiro = nome_barbeiro;
		this.data_barbeiro = data_barbeiro;
		this.hora_barbeiro = hora_barbeiro;
		this.agenda = agenda;
	}

	public Integer getId_barbeiro() {
		return id_barbeiro;
	}

	public void setId_barbeiro(Integer id_barbeiro) {
		this.id_barbeiro = id_barbeiro;
	}

	public String getNome_barbeiro() {
		return nome_barbeiro;
	}

	public void setNome_barbeiro(String nome_barbeiro) {
		this.nome_barbeiro = nome_barbeiro;
	}

	public Instant getData_barbeiro() {
		return data_barbeiro;
	}

	public void setData_barbeiro(Instant data_barbeiro) {
		this.data_barbeiro = data_barbeiro;
	}

	public Instant getHora_barbeiro() {
		return hora_barbeiro;
	}

	public void setHora_barbeiro(Instant hora_barbeiro) {
		this.hora_barbeiro = hora_barbeiro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_barbeiro == null) ? 0 : id_barbeiro.hashCode());
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
		Barbeiro other = (Barbeiro) obj;
		if (id_barbeiro == null) {
			if (other.id_barbeiro != null)
				return false;
		} else if (!id_barbeiro.equals(other.id_barbeiro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Barbeiro [id_barbeiro=" + id_barbeiro + ", nome_barbeiro=" + nome_barbeiro + ", data_barbeiro="
				+ data_barbeiro + ", hora_barbeiro=" + hora_barbeiro + "]";
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
}
