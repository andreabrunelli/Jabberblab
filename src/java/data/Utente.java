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
public class Utente {
    private int id_Utente;
    private String email;
    private String password;
    private double credito;
    private int id_Ruolo;

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the credito
     */
    public double getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(double credito) {
        this.credito = credito;
    }

    /**
     * @return the id_Ruolo
     */
    public int getId_Ruolo() {
        return id_Ruolo;
    }

    /**
     * @param id_Ruolo the id_Ruolo to set
     */
    public void setId_Ruolo(int id_Ruolo) {
        this.id_Ruolo = id_Ruolo;
    }
    
    
}
