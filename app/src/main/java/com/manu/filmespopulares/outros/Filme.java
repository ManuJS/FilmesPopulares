package com.manu.filmespopulares.outros;

/**
 * Created by emanu on 31/08/2016.
 */
public class Filme {

    private String tituloFilme;
    private String sinopseFilme;

    public Filme() {
        this("", "");
    }


    public Filme(String tituloFilme, String sinopseFilme) {
        this.tituloFilme = tituloFilme;
        this.sinopseFilme = sinopseFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getSinopseFilme() {
        return sinopseFilme;
    }

    public void setSinopseFilme(String sinopseFilme) {
        this.sinopseFilme = sinopseFilme;
    }
}
