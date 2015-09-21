/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sgenerto7.alumnes
 */
public class Client {
    
    String nom;
    String aniversari;
    String dni;
    int visitats;
    int id;
    int telefon;
    
    public Client(){
        nom="";
        aniversari="";
        dni="";
        visitats=0;
        id=0;
        telefon=0;
    }

    public String getAniversari() {
        return aniversari;
    }

    public void setAniversari(String aniversari) {
        this.aniversari = aniversari;
    }

    public int getVisitats() {
        return visitats;
    }

    public void setVisitats(int visitats) {
        this.visitats = visitats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    
    public String toString(){
        return nom+", dni:"+ dni+", tel: "+ telefon ;
    
}
    
}
    

