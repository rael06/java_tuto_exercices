package com.company;

public class Game {

    private String title;
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Game (int id, String title) {
        this.id= id;
        this.title = title;
    }

    public Game () {

    }
}
