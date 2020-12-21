package model.entidades;

import java.io.Serializable;

public class Administrador implements Serializable{
	
	private static final long serialVercionUID = 1L;
	
	private Integer id_admin;
	private String nome_admin;
	private String email;
	private String senha;
	
	public Administrador() {
	}

	public Administrador(Integer id_admin, String nome_admin, String email, String senha) {
		super();
		this.id_admin = id_admin;
		this.nome_admin = nome_admin;
		this.email = email;
		this.senha = senha;
	}

	public Integer getId_admin() {
		return id_admin;
	}

	public void setId_admin(Integer id_admin) {
		this.id_admin = id_admin;
	}

	public String getNome_admin() {
		return nome_admin;
	}

	public void setNome_admin(String nome_admin) {
		this.nome_admin = nome_admin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_admin == null) ? 0 : id_admin.hashCode());
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
		Administrador other = (Administrador) obj;
		if (id_admin == null) {
			if (other.id_admin != null)
				return false;
		} else if (!id_admin.equals(other.id_admin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Administrador [id_admin=" + id_admin + ", nome_admin=" + nome_admin + ", email=" + email + ", senha="
				+ senha + "]";
	}
}
