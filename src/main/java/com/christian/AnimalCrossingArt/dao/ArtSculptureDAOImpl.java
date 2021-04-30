package com.christian.AnimalCrossingArt.dao;

import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtSculptureDAOImpl implements ArtSculptureDAO{

    @Override
    public List<ArtSculpture> findAll() {
        return null;
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
