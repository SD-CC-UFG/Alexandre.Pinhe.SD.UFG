package cliente;

import java.io.Serializable;

public class Eleitor implements Serializable{
    
    private String titulo;

    public Eleitor(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
