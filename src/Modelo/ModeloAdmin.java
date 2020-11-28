
package Modelo;

public class ModeloAdmin {
    
    private int id_admin;
    private String nome;
    private String email;
    private String senha;
    
    public ModeloAdmin(){
        
    }

    public ModeloAdmin(int id_admin, String nome, String email, String senha) {
        this.id_admin = id_admin;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

}
