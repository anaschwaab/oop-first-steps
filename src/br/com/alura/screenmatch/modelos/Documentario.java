package br.com.alura.screenmatch.modelos;

public class Documentario extends Titulo {
    private String tema;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void exibeTema() {
        System.out.println(this.tema);
    }
}
