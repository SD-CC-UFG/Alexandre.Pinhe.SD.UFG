package cliente;

import java.io.Serializable;

public class Candidato implements Serializable{
    
    private String numero;
    private String nome;
    private int voto;

    public Candidato(String numero, String nome, int voto) {
        this.numero = numero;
        this.nome = nome;
        this.voto = voto;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

}
