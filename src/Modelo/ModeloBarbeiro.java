package Modelo;

import java.util.Date;

public class ModeloBarbeiro {
    
    private int id_barbeiro;
    private String nome;
    private int dia_barbeiro;
    private int mes_barbeiro;
    private Date hora_barbeiro;
    
    public ModeloBarbeiro(){
        
    }

    public ModeloBarbeiro(int id_barbeiro, String nome, int dia_barbeiro, int mes_barbeiro, Date hora_barbeiro) {
        this.id_barbeiro = id_barbeiro;
        this.nome = nome;
        this.dia_barbeiro = dia_barbeiro;
        this.mes_barbeiro = mes_barbeiro;
        this.hora_barbeiro = hora_barbeiro;
    }

    public int getId_barbeiro() {
        return id_barbeiro;
    }

    public void setId_barbeiro(int id_barbeiro) {
        this.id_barbeiro = id_barbeiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia_barbeiro() {
        return dia_barbeiro;
    }

    public void setDia_barbeiro(int dia_barbeiro) {
        this.dia_barbeiro = dia_barbeiro;
    }

    public int getMes_barbeiro() {
        return mes_barbeiro;
    }

    public void setMes_barbeiro(int mes_barbeiro) {
        this.mes_barbeiro = mes_barbeiro;
    }

    public Date getHora_barbeiro() {
        return hora_barbeiro;
    }

    public void setHora_barbeiro(Date hora_barbeiro) {
        this.hora_barbeiro = hora_barbeiro;
    }
    
}
