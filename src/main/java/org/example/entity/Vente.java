package org.example.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "vente")
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idVente ;
    private Date date;
    private String etat;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    private  int stock;

    public int getIdVente() {
        return idVente;
    }

    public void setIdVente(int idVente) {
        this.idVente = idVente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
