package org.jug.algeria.domain;

import javax.persistence.*;

@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEvt", nullable = false)
    private Long idEvt;
    @Column(name = "nomEvt", nullable = false)
    private String nomEvt;
    @Column(name = "lieuEvt")
    private String lieuEvt;
    @Column(name = "orgaEvt")
    private String orgaEvt;
    @Column(name = "dateEvt")
    private String dateEvt;
    @Column(name = "heureEvt")
    private String heureEvt;
    @Column(name = "descEvt")
    private String descEvt;
    @Column(name = "nbInscEvt")
    private int nbInscEvt;
    @Column(name = "nbPlacesEvt")
    private int nbPlacesEvt;
    @Column(name = "imageEvt")
    private String imageEvt;

    public Evenement() {

    }
    
    public Evenement(String nomEvt) {
        this.nomEvt = nomEvt;
    }

    public Evenement(Long id, String nom, String lieu, String orga, String date, String heure,
                     String description, int nb_inscriptions, int nb_places, String image) {
        this.idEvt = id;
        this.nomEvt = nom;
        this.lieuEvt = lieu;
        this.orgaEvt = orga;
        this.dateEvt = date;
        this.heureEvt = heure;
        this.descEvt = description;
        this.nbInscEvt = nb_inscriptions;
        this.nbPlacesEvt = nb_places;
        this.imageEvt = image;
    }

    public Long getIdEvt() {
        return idEvt;
    }

    public String getNomEvt() {
        return nomEvt;
    }

    public String getLieuEvt() {
        return lieuEvt;
    }

    public String getOrgaEvt() {
        return orgaEvt;
    }

    public String getDateEvt() {
        return dateEvt;
    }

    public String getHeureEvt() {
        return heureEvt;
    }

    public String getDescEvt() {
        return descEvt;
    }

    public int getNbInscEvt() {
        return nbInscEvt;
    }

    public int getNbPlacesEvt() {
        return nbPlacesEvt;
    }

    public String getImageEvt() {
        return imageEvt;
    }

    public void setIdEvt(Long id) {
        this.idEvt = id;
    }

    public void setNomEvt(String nom) {
        this.nomEvt = nom;
    }

    public void setLieuEvt(String lieu) {
        this.lieuEvt = lieu;
    }

    public void setOrgaEvt(String organisateur) {
        this.orgaEvt = organisateur;
    }

    public void setDateEvt(String date) {
        this.dateEvt = date;
    }

    public void setHeureEvt(String heure) {
        this.heureEvt = heure;
    }

    public void setDescEvt(String description) {
        this.descEvt = description;
    }

    public void setNbInscEvt(int nb_inscriptions) {
        this.nbInscEvt = nb_inscriptions;
    }

    public void setNbPlacesEvt(int nb_places) {
        this.nbPlacesEvt = nb_places;
    }

    public void setImageEvt(String image) {
        this.imageEvt = image;
    }

    @Override
    public String toString() {
        return String.format("Id : %d, Nom : %s, Lieu : %s.", idEvt, nomEvt, lieuEvt);
    }
}
