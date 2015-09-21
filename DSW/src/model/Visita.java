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
public class Visita {
    Client client;
    Pis pis;
    int idVisita;
    String horaVisita;
    String dataVisita;
    
    public Visita(){
        client=new Client();
        pis=new Pis();
        idVisita=0;
        horaVisita="";
        dataVisita="";
        
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Pis getPis() {
        return pis;
    }

    public void setPis(Pis pis) {
        this.pis = pis;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }
    public String toString(){
        return client.getNom()+" "+"| dia:"+ dataVisita+", hora: "+ horaVisita;
    
}
}
