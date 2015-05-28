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
public class Spettacolo {
    private int id_Spettacolo;
    private int id_Film;
    private Date data_Ora;
    private int id_Sala;

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
     * @return the id_Film
     */
    public int getId_Film() {
        return id_Film;
    }

    /**
     * @param id_Film the id_Film to set
     */
    public void setId_Film(int id_Film) {
        this.id_Film = id_Film;
    }

    /**
     * @return the data_Ora
     */
    public Date getData_Ora() {
        return data_Ora;
    }

    /**
     * @param data_Ora the data_Ora to set
     */
    public void setData_Ora(Date data_Ora) {
        this.data_Ora = data_Ora;
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
    
    
            
}
