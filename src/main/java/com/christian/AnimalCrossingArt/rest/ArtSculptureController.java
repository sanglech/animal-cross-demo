package com.christian.AnimalCrossingArt.rest;


import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import com.christian.AnimalCrossingArt.service.ArtSculptureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/art")
public class ArtSculptureController {

    private ArtSculptureService artSculptureService;

    @Autowired
    public ArtSculptureController(ArtSculptureService theArtSculptureService){
        artSculptureService=theArtSculptureService;
    }

    //expose /list endpoint to return all the art
    @GetMapping("/list")
    public List<ArtSculpture> findAll(){
        return null;
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
