package org.fasttrackit;

public class Player extends Game{

    private String name;
    private int elorating;
    private String nationality;
    private int age;

    // style of play: Range between 0-10
    private int dynamic;
    private int positional;
    private int aggressive;
    private int defensive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElorating() {
        return elorating;
    }

    public void setElorating(int elorating) {
        this.elorating = elorating;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDynamic() {
        return dynamic;
    }

    public void setDynamic(int dynamic) {
        this.dynamic = dynamic;
    }

    public int getPositional() {
        return positional;
    }

    public void setPositional(int positional) {
        this.positional = positional;
    }

    public int getAggressive() {
        return aggressive;
    }

    public void setAggressive(int aggressive) {
        this.aggressive = aggressive;
    }

    public int getDefensive() {
        return defensive;
    }

    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }
}
