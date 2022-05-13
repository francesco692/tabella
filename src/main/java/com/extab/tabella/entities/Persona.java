package com.extab.tabella.entities;

public class Persona {
    private String cf;
    private String nome;
    private String cognome;
    private int anno_nascita;
    private int citta;
    private String genere;
    public Persona(String cf, String nome, String cognome, int anno_nascita, int citta, String genere)
    {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.anno_nascita = anno_nascita;
        this.citta = citta;
        this.genere = genere;
    }
    public String getCf()
    {
        return cf;
    }
    public String getNome()
    {
        return nome;
    }
    public String getCognome()
    {
        return cognome;
    }
    public int getAnno_nascita()
    {
        return anno_nascita;
    }
    public int getCitta()
    {
        return citta;
    }
    public String getGenere()
    {
        return genere;
    }
}
