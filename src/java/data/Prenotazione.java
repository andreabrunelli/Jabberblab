/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Date;

/**
 *
 * @author Andrea
 */
public class Prenotazione {
    private int id_Prenotazione;
    private int id_Spettacolo;
    private int id_Utente;
    private int id_Prezzo;
    private int id_Posto;
    private Date data_Ora_Operazione;

    /**
     * @return the id_Prenotazione
     */
    public int getId_Prenotazione() {
        return id_Prenotazione;
    }

    /**
     * @param id_Prenotazione the id_Prenotazione to set
     */
    public void setId_Prenotazione(int id_Prenotazione) {
        this.id_Prenotazione = id_Prenotazione;
    }

    /**
     * @return the id_Spettacolo
     */
    public int getId_Spettacolo() {
        return id_Spettacolo;
    }

    /**
     * @param id_Spettacolo the id_Spettacolo to set
     */
    public void setId_Spettacolo(int id_Spettacolo) {
        this.id_Spettacolo = id_Spettacolo;
    }

    /**
     * @return the id_Utente
     */
    public int getId_Utente() {
        return id_Utente;
    }

    /**
     * @param id_Utente the id_Utente to set
     */
    public void setId_Utente(int id_Utente) {
        this.id_Utente = id_Utente;
    }

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
     * @return the data_Ora_Operazione
     */
    public Date getData_Ora_Operazione() {
        return data_Ora_Operazione;
    }

    /**
     * @param data_Ora_Operazione the data_Ora_Operazione to set
     */
    public void setData_Ora_Operazione(Date data_Ora_Operazione) {
        this.data_Ora_Operazione = data_Ora_Operazione;
    }
    
    
    
    
}
