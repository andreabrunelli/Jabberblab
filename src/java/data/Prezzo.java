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
public class Prezzo {
    private int id_Prezzo;
    private String tipo;
    private double prezzo;

    /**
     * @return the id_Prezzo
     */
    public int getId_Prezzo() {
        return id_Prezzo;
    }

    /**
     * @param id_Prezzo the id_Prezzo to set
     */
    public void setId_Prezzo(int id_Prezzo) {
        this.id_Prezzo = id_Prezzo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
