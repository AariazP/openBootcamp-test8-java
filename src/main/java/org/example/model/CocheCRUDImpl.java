package org.example.model;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("CocheCRUDImpl.save()");
    }

    @Override
    public void findAll() {
        System.out.println("CocheCRUDImpl.findAll()");
    }

    @Override
    public void delete() {
        System.out.println("CocheCRUDImpl.delete()");
    }



}
