package com.christian.AnimalCrossingArt.service;

import com.christian.AnimalCrossingArt.dao.ArtSculptureDAO;
import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtSculptureServiceImpl implements ArtSculptureService{

    private ArtSculptureDAO artSculpt;


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
