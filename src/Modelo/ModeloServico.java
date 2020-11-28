package Modelo;

public class ModeloServico {
    
    private int id_servico;
    private String tipo_servico;
    private int tempo_servico;
    private double valor;
    
    public ModeloServico(){
        
    }

    public ModeloServico(int id_servico, String tipo_servico, int tempo_servico, double valor) {
        this.id_servico = id_servico;
        this.tipo_servico = tipo_servico;
        this.tempo_servico = tempo_servico;
        this.valor = valor;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public int getTempo_servico() {
        return tempo_servico;
    }

    public void setTempo_servico(int tempo_servico) {
        this.tempo_servico = tempo_servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
