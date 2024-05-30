package org.example.entity;
import javax.persistence.*;

@Entity

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String description;
    private String categorie;
    private String taille;
    private double prix;
    private int stock;

    public Article(){

    }

    public Article(String description, String categorie, String taille, double prix, int stock){
        this.description = description;
        this.categorie = categorie;
        this.taille= taille;
        this.prix = prix;
        this.stock = stock;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", categorie='" + categorie + '\'' +
                ", taille='" + taille + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
