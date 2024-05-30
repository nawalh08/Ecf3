package org.example.service;

import org.example.entity.RecuVente;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class RecuService {

//    public RecuService(){super();}
//
//    public void createRecu(RecuVente rv) {
//
//
//
//
//    }
//
//    public boolean updateRecuVente(RecuVente vente){
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.update(vente);
//        session.getTransaction().commit();
//        session.close();
//        return true;
//    }
//
//    public boolean deleteRecuVente(RecuVente vente){
//        session =sessionFactory.openSession();
//        session.beginTransaction();
//        session.delete(vente);
//        session.getTransaction().commit();
//        session.close();
//        return true;
//
//    }
//
//    public Vente findById(int id){
//        session = sessionFactory.openSession();
//        Vente vente = session.get(Vente.class, id );
//        session.close();
//        return vente;
//    }
//
//    public List<RecuVente> findAllVente(){
//        List<RecuVente> venteList = null;
//        session = sessionFactory.openSession();
//        Query<RecuVente> recuVenteQuery = session.createQuery("from RecuVente ", RecuVente.class);
//        recuVenteList =recuVenteQuery.list();
//        session.close();
//        return venteList;
//
//    }
//    public void close(){sessionFactory.close();}
}
