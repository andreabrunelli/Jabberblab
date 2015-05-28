/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Andrea
 */
public class Posto {
    private int id_Posto;
    private int id_Sala;
    private int riga;
    private int colonna;
    private boolean esiste;

    /**
     * @return the id_Posto
     */
    public int getId_Posto() {
        return id_Posto;
    }

    /**
     * @param id_Posto the id_Posto to set
     */
    public void setId_Posto(int id_Posto) {
        this.id_Posto = id_Posto;
    }

    /**
     * @return the id_Sala
     */
    public int getId_Sala() {
        return id_Sala;
    }

    /**
     * @param id_Sala the id_Sala to set
     */
    public void setId_Sala(int id_Sala) {
        this.id_Sala = id_Sala;
    }

    /**
     * @return the riga
     */
    public int getRiga() {
        return riga;
    }

    /**
     * @param riga the riga to set
     */
    public void setRiga(int riga) {
        this.riga = riga;
    }

    /**
     * @return the colonna
     */
    public int getColonna() {
        return colonna;
    }

    /**
     * @param colonna the colonna to set
     */
    public void setColonna(int colonna) {
        this.colonna = colonna;
    }

    /**
     * @return the esiste
     */
    public boolean isEsiste() {
        return esiste;
    }

    /**
     * @param esiste the esiste to set
     */
    public void setEsiste(boolean esiste) {
        this.esiste = esiste;
    }
    
    
}
