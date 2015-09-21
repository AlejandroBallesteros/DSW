/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sgenerto7.alumnes
 */
public class Dades {
    ArrayList<Client> llistaClients;
    ArrayList<Pis> llistaPisos;
    ArrayList<Visita> llistaVisites;
    
    public Dades(){
        
        llistaClients = new ArrayList();
        llistaPisos = new ArrayList();
        llistaVisites = new ArrayList();
    }
    
    
    public ArrayList<Client> getLlistaClients(){
        
        return llistaClients;
        
    }
    
    public ArrayList<Pis> getLlistaPisos() {
        
        return llistaPisos;
        
    }
    
    public ArrayList<Visita> getLlistaVisites() {
        
        return llistaVisites;
        
    }
    
    public void afegirClient(String nom, int id, String dni, int telefon){
        
        Client client = new Client();
        client.setDni(dni);
        client.setNom(nom);
        client.setId(id);
        client.setTelefon(telefon);
        llistaClients.add(client);
        
    }
    
    public void editarClient(Client client,String nom, int id, String dni, int telefon){
        
        client.setDni(dni);
        client.setId(id);
        client.setNom(nom);
        client.setTelefon(telefon);
        
    }
    
    public void borrarClient(Client client){
        
        llistaClients.remove(client);
        
    }
    
    
    
    
    public void afegirPis(String direccio, int id, boolean oferta, double preu){
        
        Pis pis = new Pis();
        pis.setIdPis(id);
        pis.setDireccio(direccio);
        pis.setOferta(oferta);
        pis.setPreu(preu);
        llistaPisos.add(pis);
        
    }
    
    public void editarPis(Pis pis,String direccio, int id, boolean oferta, double preu){
        
        pis.setDireccio(direccio);
        pis.setIdPis(id);
        pis.setOferta(oferta);
        pis.setPreu(preu);
        
    }
    
    public void borrarPis(Pis pis){
       
        llistaPisos.remove(pis);
        
    }
    
    public void mostrarPisos() {
        
        String linea = "";
        Integer i = 1;
        Iterator it = llistaPisos.iterator();
        while (it.hasNext()) {
            Object seguent = it.next();
            Pis pis = (Pis) seguent;
            linea = linea = linea + "\n" + (i) + " " + pis;
            i++;
        }
        System.out.println(linea);
        
    }
    
    public void mostrarClients() {
        
        String linea = "";
        Integer i = 1;
        Iterator it = llistaClients.iterator();
        while (it.hasNext()) {
            Object seguent = it.next();
           Client client = (Client) seguent;
            linea = linea = linea + "\n" + (i) + " " + client;
            i++;
        }
        System.out.println(linea);
        
    }
    public void mostrarVisites() {
        
        String linea = "";
        Integer i = 1;
        Iterator it = llistaVisites.iterator();
        while (it.hasNext()) {
            Object seguent = it.next();
            Visita visita = (Visita) seguent;
            linea = linea = linea + "\n" + (i) + " " + visita;
            i++;
        }
        System.out.println(linea);
        
    }
    
    public void afegirVisita(int cPos, int pPos, int id, String data, String hora) {
        
        Visita visita = new Visita();
        visita.setClient(llistaClients.get(cPos));
        visita.setPis(llistaPisos.get(pPos));
        visita.setIdVisita(id);
        visita.setHoraVisita(hora);
        visita.setDataVisita(data);
        llistaVisites.add(visita);
        
    }
    
    public void editarVisita(Visita visita, Client client1, Pis pis1, int idVisita, String horaVisita, String dataVisita){
        
        visita.setPis(pis1);
        visita.setClient(client1);
        visita.setHoraVisita(horaVisita);
        visita.setDataVisita(dataVisita);
        visita.setIdVisita(idVisita);
        
    }
    
    public void borrarVisita(Visita visita){
        
        llistaVisites.remove(visita);
        
    }
    
    
    
}
