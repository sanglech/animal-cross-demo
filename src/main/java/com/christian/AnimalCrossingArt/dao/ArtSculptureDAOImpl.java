package com.christian.AnimalCrossingArt.dao;

import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Locale;

@Repository
public class ArtSculptureDAOImpl implements ArtSculptureDAO{

    //define field for entity manager
    private EntityManager entityManager;

    public ArtSculptureDAOImpl(){

    }

    @Autowired
    public ArtSculptureDAOImpl (EntityManager _entityManager){
        entityManager=_entityManager;
    }


    @Override
    public List<ArtSculpture> findAll() {
        Session currentSession=entityManager.unwrap(Session.class);
        //create query
        Query<ArtSculpture> theQuery= currentSession.createQuery("from ArtSculpture",ArtSculpture.class);

        // execute query et result list
        List<ArtSculpture> arts=theQuery.getResultList();

        for(ArtSculpture a: arts){
            System.out.println(">>>>>>>ART: "+ a);
        }

        // return list
        return arts;
    }

    @Override
    public ArtSculpture getSculptureById(int id) {
        return null;
    }

    @Override
    public List<ArtSculpture> getSculptureByName(String name,String ifHave) {
        List<ArtSculpture> arts=null;
        Session currentSession=entityManager.unwrap(Session.class);
        String queryStr;

        if(name!=null){
            name=name.substring(0,1).toUpperCase()+ name.substring(1,name.length()-1);
            if(ifHave.equals("ALL")){
                queryStr="FROM ArtSculpture as Art where Art.name like :name_art";
                Query q=currentSession.createQuery(queryStr,ArtSculpture.class).
                        setParameter("name_art", "%"+name+"%");
                arts=q.getResultList();
            }
            else{
                queryStr="FROM ArtSculpture as Art where Art.name like :name_art AND Art.have= :have";
                Query q=currentSession.createQuery(queryStr,ArtSculpture.class).
                        setParameter("name_art", "%"+name+"%")
                        .setParameter("have",ifHave);
                arts=q.getResultList();
            }
        }

        else{
            queryStr="FROM ArtSculpture as Art where Art.have= :have";
            Query q=currentSession.createQuery(queryStr,ArtSculpture.class)
                    .setParameter("have",ifHave);
            arts=q.getResultList();
        }

        //Query<ArtSculpture> theQuery= currentSession.createQuery(query,ArtSculpture.class);

        System.out.println(">>>>>>IN DAO: "+ arts);
        return arts;
    }


    @Override
    public void saveArt(ArtSculpture artSculpture) {
        //Stubbed code wont have update func
    }

    @Override
    public void deleteArtById(int theId) {
        //Stubbed func wont have delete func
    }

}
