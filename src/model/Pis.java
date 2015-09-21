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
public class Pis {
    String direccio;
    int idPis;
    int visites;
    boolean oferta;
    double preu;
    
    
    public Pis(){
        
        direccio="";
        idPis=0;
        visites=0;
        oferta=false;
        preu=0;
        
    }

    public int getVisites() {
        return visites;
    }

    public void setVisites(int visites) {
        this.visites = visites;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getIdPis() {
        return idPis;
    }

    public void setIdPis(int idPis) {
        this.idPis = idPis;
    }

    public boolean getOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
     public String toString(){
        return idPis+" "+"| direccio:"+ direccio+", oferta: "+ oferta+", preu: "+ preu;
    
}
    
}
