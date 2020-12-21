package model.entidades;

import java.io.Serializable;

public class Servico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id_serv;
	private String tipo_servico;
	private Integer tempo_servico;
	private Double valor;
	
	public Servico() {
	}

	public Servico(Integer id_serv, String tipo_servico, Integer tempo_servico, Double valor) {
		super();
		this.id_serv = id_serv;
		this.tipo_servico = tipo_servico;
		this.tempo_servico = tempo_servico;
		this.valor = valor;
	}

	public Integer getId_serv() {
		return id_serv;
	}

	public void setId_serv(Integer id_serv) {
		this.id_serv = id_serv;
	}

	public String getTipo_servico() {
		return tipo_servico;
	}

	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}

	public Integer getTempo_servico() {
		return tempo_servico;
	}

	public void setTempo_servico(Integer tempo_servico) {
		this.tempo_servico = tempo_servico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_serv == null) ? 0 : id_serv.hashCode());
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
		Servico other = (Servico) obj;
		if (id_serv == null) {
			if (other.id_serv != null)
				return false;
		} else if (!id_serv.equals(other.id_serv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Servico [id_serv=" + id_serv + ", tipo_servico=" + tipo_servico + ", tempo_servico=" + tempo_servico
				+ ", valor=" + valor + "]";
	}
}
