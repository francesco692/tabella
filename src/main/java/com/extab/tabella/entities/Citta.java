package com.extab.tabella.entities;

public class Citta {
    private int cap;
    private String nome;
    private String regione;
    private String provincia;
    private int n_abitanti;
    private int estensione;
    public Citta(int cap, String nome, String regione, String provincia, int n_abitanti, int estensione)
    {
        this.cap = cap;
        this.nome = nome;
        this.regione = regione;
        this.provincia = provincia;
        this.n_abitanti = n_abitanti;
        this.estensione = estensione;
    }
    public int getCap()
    {
        return cap;
    }
    public String getNome()
    {
        return nome;
    }
    public String getRegione()
    {
        return regione;
    }
    public String getProvincia()
    {
        return provincia;
    }
    public int getN_abitanti()
    {
        return n_abitanti;
    }
    public int getEstensione()
    {
        return estensione;
    }
}
