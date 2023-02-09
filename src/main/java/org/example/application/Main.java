package org.example.application;

import org.example.model.CocheCRUD;
import org.example.model.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}