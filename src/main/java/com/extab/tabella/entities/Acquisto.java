package com.extab.tabella.entities;

import java.time.LocalDate;

public class Acquisto {
    private String cfP;
    private String idL;
    private LocalDate data;
    private int prezzo;
    public Acquisto(String cfP, String idL, LocalDate data, int prezzo)
    {
       this.cfP = cfP;
       this.idL = idL;
       this.data = data;
       this.prezzo = prezzo;
    }
    public String getCfP()
    {
        return cfP;
    }
    public String getIdL()
    {
        return idL;
    }
    public LocalDate getData()
    {
        return data;
    }
    public int getPrezzo()
    {
        return prezzo;
    }
}
