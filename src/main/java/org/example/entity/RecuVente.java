package org.example.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reçu")
public class RecuVente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idRecu;
    private Date date;
    private double total;

    @OneToOne
    @JoinColumn(name="vente_id")
    private Vente vente ;

    public int getIdRecu() {
        return idRecu;
    }

    public void setIdRecu(int idRecu) {
        this.idRecu = idRecu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }
}
