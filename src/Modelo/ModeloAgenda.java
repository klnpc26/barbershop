package Modelo;

import java.util.Date;

public class ModeloAgenda {
    
    private int id_agenda;
    private String nome_cliente;
    private String nome_barbeiro;
    private int dia_agenda;
    private int mes_agenda;
    private Date hora_agenda;
    private String tipo_servico;
    private int id_admin;
    private int id_servico;
    private int id_barbeiro;
    
    public ModeloAgenda(){
        
    }

    public ModeloAgenda(int id_agenda, String nome_cliente, String nome_barbeiro, int dia_agenda, int mes_agenda, Date hora_agenda, String tipo_servico, int id_admin, int id_servico, int id_barbeiro) {
        this.id_agenda = id_agenda;
        this.nome_cliente = nome_cliente;
        this.nome_barbeiro = nome_barbeiro;
        this.dia_agenda = dia_agenda;
        this.mes_agenda = mes_agenda;
        this.hora_agenda = hora_agenda;
        this.tipo_servico = tipo_servico;
        this.id_admin = id_admin;
        this.id_servico = id_servico;
        this.id_barbeiro = id_barbeiro;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    
    public String getNome_barbeiro() {
        return nome_barbeiro;
    }
    
    public void setNome_barbeiro(String nome_barbeiro) {
        this.nome_barbeiro = nome_barbeiro;
    }

    public int getDia_agenda() {
        return dia_agenda;
    }

    public void setDia_agenda(int dia_agenda) {
        this.dia_agenda = dia_agenda;
    }

    public int getMes_agenda() {
        return mes_agenda;
    }

    public void setMes_agenda(int mes_agenda) {
        this.mes_agenda = mes_agenda;
    }

    public Date getHora_agenda() {
        return hora_agenda;
    }

    public void setHora_agenda(Date hora_agenda) {
        this.hora_agenda = hora_agenda;
    }
    
    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public int getId_barbeiro() {
        return id_barbeiro;
    }

    public void setId_barbeiro(int id_barbeiro) {
        this.id_barbeiro = id_barbeiro;
    }
    
}
