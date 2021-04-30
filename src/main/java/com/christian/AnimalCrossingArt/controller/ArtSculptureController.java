package com.christian.AnimalCrossingArt.controller;


import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import com.christian.AnimalCrossingArt.service.ArtSculptureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/art")
public class ArtSculptureController {

    private ArtSculptureService artSculptureService;

    @Autowired
    public ArtSculptureController(ArtSculptureService theArtSculptureService){
        artSculptureService=theArtSculptureService;
    }

    //expose /list endpoint to return all the art
    @GetMapping("/list")
    public String findAll(Model theModel){
        List<ArtSculpture> arts=artSculptureService.findAll();

        theModel.addAttribute("theArt",arts);

        return "/list-art";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
