package com.christian.AnimalCrossingArt.controller;


import com.christian.AnimalCrossingArt.entity.ArtSculpture;
import com.christian.AnimalCrossingArt.entity.SearchObject;
import com.christian.AnimalCrossingArt.service.ArtSculptureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/")
public class ArtSculptureController {

    private ArtSculptureService artSculptureService;

    @Autowired
    public ArtSculptureController(ArtSculptureService theArtSculptureService){
        artSculptureService=theArtSculptureService;
    }

    //Need so returning string is null instead of empty
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }



    //expose /list endpoint to return all the art
    @GetMapping("/list")
    public String findAll(Model theModel,Model searchModel){
        List<ArtSculpture> arts=artSculptureService.findAll();

        theModel.addAttribute("theArt",arts);
        searchModel.addAttribute("arts", new SearchObject());

        return "list-art";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/search")
    public String searchArts(@ModelAttribute("arts") SearchObject obj, Model theModel, Model searchModel){
        List<ArtSculpture> arts=null;
        if(obj.getName()==null && obj.getIfHave().equals("ALL")){
            System.out.println("Get all arts");
            arts=artSculptureService.findAll();
        }

        // add query for if i have
        // add query for name
        else{
            System.out.println(">>>>>> Get: name: "+obj.getName());
            arts=artSculptureService.getSculptureByName(obj.getName(),obj.getIfHave());
        }

        theModel.addAttribute("theArt",arts);
        //System.out.println(">>>>>>>" + obj.getName());
        //System.out.println(">>>>>>>" + obj.getIfHave());
        return "list-art";
    }
}
