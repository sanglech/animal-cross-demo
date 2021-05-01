package com.christian.AnimalCrossingArt.entity;

public class SearchObject {
    private String name;
    private String ifHave;

    public SearchObject(){

    }

    public SearchObject(String name, String ifHave) {
        this.name = name;
        this.ifHave=ifHave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIfHave() {
        return ifHave;
    }

    public void setIfHave(String ifHave) {
        this.ifHave = ifHave;
    }

    @Override
    public String toString() {
        return "SearchObject{" +
                "name='" + name + '\'' +
                ", ifHave='" + ifHave + '\'' +
                '}';
    }
}
