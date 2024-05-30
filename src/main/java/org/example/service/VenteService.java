package org.example.service;

import org.example.entity.Article;
import org.example.entity.Vente;
import org.example.interfaces.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class VenteService extends BaseService {

    public VenteService(){super();}

    public void createVente(Vente vente) {
       session = sessionFactory.openSession() ;
       session.beginTransaction();
        session.save(vente);
        session.getTransaction().commit();


    }

    public boolean updateVente(Vente vente){
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(vente);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean deleteVente(Vente vente){
        session =sessionFactory.openSession();
        session.beginTransaction();
        session.delete(vente);
        session.getTransaction().commit();
        session.close();
        return true;

    }

    public Vente findById(int id){
        session = sessionFactory.openSession();
        Vente vente = session.get(Vente.class, id );
        session.close();
        return vente;
    }

    public List<Vente> findAllVente(){
        List<Vente> venteList = null;
        session = sessionFactory.openSession();
        Query<Vente> venteQuery = session.createQuery("from Vente ", Vente.class);
        venteList =venteQuery.list();
        session.close();
        return venteList;

    }
    public void close(){sessionFactory.close();}






}
