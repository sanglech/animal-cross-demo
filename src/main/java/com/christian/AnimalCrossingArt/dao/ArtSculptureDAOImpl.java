package com.christian.AnimalCrossingArt.dao;

import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

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
    public List<ArtSculpture> getSculptureByName(String name) {
        return null;
    }

    @Override
    public List<ArtSculpture> getSculptureByHave(String have) {
        return null;
    }

    @Override
    public void saveArt(ArtSculpture artSculpture) {

    }

    @Override
    public void deleteArtById(int theId) {

    }

}
