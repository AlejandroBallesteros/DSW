package contolador;


import model.Client;
import model.Dades;
import model.Pis;
import model.Visita;
public class Controlador implements java.io.Serializable {

    Dades dades = new Dades();

    public Dades getDades() {
        return dades;
    }

    public void afegirClient(String nom, int id, String dni, int telefon) {
        dades.afegirClient(nom, id, dni, telefon);
    }
    
    public void editarClient(Client client,String nom, int id, String dni, int telefon) {
        dades.editarClient(client, nom, id, dni, telefon);
    }

    public void borrarClient(int pos) {
        dades.borrarClient(dades.getLlistaClients().get(pos));
    }
    
    public void afegirPis(String direccio, int id, boolean oferta, double preu) {
        dades.afegirPis(direccio, id, oferta, preu);
    }
    
    public void mostrarPisos() {
        dades.mostrarPisos();
    }
    
     public void editarPis(Pis pis,String direccio, int id, boolean oferta, double preu){
        dades.editarPis(pis, direccio, id, oferta, preu);
    }
    
    public void borrarPis(int pos) {
        dades.borrarPis(dades.getLlistaPisos().get(pos));
    }

    public void mostrarClients() {
        dades.mostrarClients();
    }
    
    public void mostrarVisites() {
        dades.mostrarVisites();
    }
    
    public void afegirVisita(int cPos, int pPos, int id, String data, String hora) {
        dades.afegirVisita(cPos, pPos, id, data, hora);
    }

    public void borrarVista(int pos) {
        dades.borrarVisita(dades.getLlistaVisites().get(pos));
    }
    
    public void editarVisita(Visita visita, Client client1, Pis pis1, int idVisita, String horaVisita, String dataVisita){
        dades.editarVisita(visita, client1, pis1, idVisita, horaVisita, dataVisita);
    }




   
}
