package com.christian.AnimalCrossingArt.service;

import com.christian.AnimalCrossingArt.dao.ArtSculptureDAO;
import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArtSculptureServiceImpl implements ArtSculptureService{


    //Service calls DAO and uses transactional
    private ArtSculptureDAO artSculpt;

    public ArtSculptureServiceImpl(){

    }

    @Autowired
    public ArtSculptureServiceImpl(ArtSculptureDAO thisArtSculptureDAO){
        artSculpt=thisArtSculptureDAO;
    }


    @Override
    @Transactional
    public List<ArtSculpture> findAll() {
        return artSculpt.findAll();
    }

    @Override
    @Transactional
    public ArtSculpture getSculptureById(int id) {
        return artSculpt.getSculptureById(id);
    }

    @Override
    @Transactional
    public List<ArtSculpture> getSculptureByName(String name) {
        return artSculpt.getSculptureByName(name);
    }

    @Override
    @Transactional
    public List<ArtSculpture> getSculptureByHave(String have) {
        return artSculpt.getSculptureByHave(have);
    }

    @Override
    @Transactional
    public void saveArt(ArtSculpture artSculpture) {
        artSculpt.saveArt(artSculpture);
    }

    @Override
    public void deleteArtById(int theId) {
        artSculpt.deleteArtById(theId);
    }
}
