package com.example.myapplication.models;

import java.util.ArrayList;

public class Contact {
    private String mName;
    private int nim;
    private String alamat;
    private String jurusan;

    public Contact(String name, int nim, String alamat, String jurusan) {
        mName = name;
        nim = nim;
        alamat = alamat;
        jurusan = jurusan;
    }

    public String getName() {
        return mName;
    }

    public int getNim(){
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    //    private static int lastContactId = 0;
//
//    public static ArrayList<Contact> createContactsList(int numContacts) {
//        ArrayList<Contact> contacts = new ArrayList<Contact>();
//
//        for (int i = 1; i <= numContacts; i++) {
//            contacts.add(new Contact("Person " + ++lastContactId, i <= numContacts / 2));
//        }
//
//        return contacts;
//    }

}
