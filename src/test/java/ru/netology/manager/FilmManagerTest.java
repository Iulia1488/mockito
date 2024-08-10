package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FilmManagerTest {


    @Test
    public void addFilms() {
        FilmManager manager = new FilmManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Джентльмены");


        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Джентльмены"};


        assertArrayEquals(actual, expected);
    }


    @Test
    public void LimitLessThanQuantity() {
        FilmManager manager = new FilmManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек - невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");


        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентльмены", "Отель Белград"};


        assertArrayEquals(actual, expected);
    }


    @Test
    public void LimitMoreThanQuantity() {
        FilmManager manager = new FilmManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");


        String[] actual = manager.findLast();
        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};


        assertArrayEquals(actual, expected);
    }


}
