package com.extab.tabella.entities;

public class Libro {
    private String id;
    private String titolo;
    private String tipologia;
    private String descrizione;
    public Libro(String id, String titolo, String tipologia, String descrizione)
    {
        this.id = id;
        this.titolo = titolo;
        this.tipologia = tipologia;
        this.descrizione = descrizione;
    }
    public String getId()
    {
        return id;
    }
    public String getTitolo()
    {
        return titolo;
    }
    public String getTipologia()
    {
        return tipologia;
    }
    public String getDescrizione()
    {
        return descrizione;
    }
}
