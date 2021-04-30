package com.christian.AnimalCrossingArt.entity;

import javax.persistence.*;

@Entity
@Table(name="art_and_sculpture")
public class ArtSculpture {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="HAVE")
    private String have;

    @Column(name="REAL")
    private String real;

    @Column(name="FAKE")
    private String fake;

    @Column(name="DESC")
    private String desc;

    public ArtSculpture(){

    }

    public ArtSculpture(String name, String have, String real, String fake, String desc) {
        this.name = name;
        this.have = have;
        this.real = real;
        this.fake = fake;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHave() {
        return have;
    }

    public void setHave(String have) {
        this.have = have;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public String getFake() {
        return fake;
    }

    public void setFake(String fake) {
        this.fake = fake;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ArtSculpture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", have='" + have + '\'' +
                ", real='" + real + '\'' +
                ", fake='" + fake + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
