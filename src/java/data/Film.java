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
public class Film {
    private int id_Film;
    private String titolo;
    private int id_Genere;
    private String url_Trailer;
    private int durata;
    private String trama;
    private String url_Locandina;

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
     * @return the titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * @param titolo the titolo to set
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * @return the id_Genere
     */
    public int getId_Genere() {
        return id_Genere;
    }

    /**
     * @param id_Genere the id_Genere to set
     */
    public void setId_Genere(int id_Genere) {
        this.id_Genere = id_Genere;
    }

    /**
     * @return the url_Trailer
     */
    public String getUrl_Trailer() {
        return url_Trailer;
    }

    /**
     * @param url_Trailer the url_Trailer to set
     */
    public void setUrl_Trailer(String url_Trailer) {
        this.url_Trailer = url_Trailer;
    }

    /**
     * @return the durata
     */
    public int getDurata() {
        return durata;
    }

    /**
     * @param durata the durata to set
     */
    public void setDurata(int durata) {
        this.durata = durata;
    }

    /**
     * @return the trama
     */
    public String getTrama() {
        return trama;
    }

    /**
     * @param trama the trama to set
     */
    public void setTrama(String trama) {
        this.trama = trama;
    }

    /**
     * @return the url_Locandina
     */
    public String getUrl_Locandina() {
        return url_Locandina;
    }

    /**
     * @param url_Locandina the url_Locandina to set
     */
    public void setUrl_Locandina(String url_Locandina) {
        this.url_Locandina = url_Locandina;
    }
    
    
    
}
