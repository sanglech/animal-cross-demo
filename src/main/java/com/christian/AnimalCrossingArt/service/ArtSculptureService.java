package com.christian.AnimalCrossingArt.service;

import com.christian.AnimalCrossingArt.entity.ArtSculpture;

import java.util.List;

public interface ArtSculptureService {
    public List<ArtSculpture> findAll();
    public ArtSculpture getSculptureById(int id);
    public List<ArtSculpture> getSculptureByName(String name, String ifHave);
    public void saveArt(ArtSculpture artSculpture);
    public void deleteArtById(int theId);
}
