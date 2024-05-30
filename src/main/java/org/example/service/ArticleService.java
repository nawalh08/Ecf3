package org.example.service;

import org.example.entity.Article;
import org.example.interfaces.Repository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ArticleService extends BaseService implements Repository<Article> {

    public ArticleService(){super();}

    public boolean create(Article ar){
        session =sessionFactory.openSession();
        session.beginTransaction();
        session.save(ar);
        session.getTransaction().commit();
        session.close();
        return true;
}

public boolean update(Article ar){
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(ar);
        session.getTransaction().commit();
        session.close();
        return true;
}

public boolean delete(Article ar){
        session =sessionFactory.openSession();
        session.beginTransaction();
        session.delete(ar);
        session.getTransaction().commit();
        session.close();
        return true;
}

public Article findById(int id){
        //Article article = null;
        session = sessionFactory.openSession();
        Article article = session.get(Article.class, id);
        session.close();
        return article;
}

public List<Article> findAll(){
    List<Article> articleList = null;
    session = sessionFactory.openSession();
    Query<Article> articleQuery = session.createQuery("from Article ", Article.class);
    articleList = articleQuery.list();
    session.close();
    return articleList;
}

public void close(){sessionFactory.close();}


}
