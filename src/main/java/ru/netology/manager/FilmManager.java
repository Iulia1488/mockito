package ru.netology.manager;

public class FilmManager {

    private String[] films = new String[0];
    private final int limit;


    public FilmManager() {
        this.limit = 5;
    }


    public FilmManager(int limit) {
        this.limit = limit;
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];


        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public String[] findLast() {
        int resultLength;
        if (limit > films.length) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }


    public String[] findAll() {
        return films;
    }


}
