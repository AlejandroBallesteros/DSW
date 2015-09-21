/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import contolador.Controlador;
import java.util.Scanner;

/**
 *
 * @author sgenerto7.alumnes
 */
public class Main {
    
    static Controlador control= new Controlador();
    static Scanner sc =new Scanner(System.in);
    static int select = -1;
    static int selectC = -1;
    static int selectP = -1;
    static int selectV = -1;
   
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //eaaaaaaaaaaaaaa  
        while(select != 0){
            try {
                System.out.println("MENU PRINCIPAL:");
                System.out.println("1.- Clients");
                System.out.println("2.- Pisos");
                System.out.println("3.- Visites");
                System.out.println("0.- Sortir");
                select = Integer.parseInt(sc.nextLine());
                
                switch(select){
                    case 1:
                        while(selectC != 0){
                            try {
                                System.out.println("MENU CLIENTS:");
                                System.out.println("1.- Nou client");
                                System.out.println("2.- Editar Client");
                                System.out.println("3.- Eliminar Client");
                                System.out.println("0.- Enrere");
                                selectC = Integer.parseInt(sc.nextLine());
                                switch(selectC) {
                                    
                                    case 1:
                                        System.out.println("Has seleccionat afegir un nou client.");
                                        System.out.println("Nom:");
                                        String nom = sc.nextLine();
                                        System.out.println("DNI:");
                                        String dni = sc.nextLine();
                                        System.out.println("ID:");
                                        int id = sc.nextInt();
                                        System.out.println("Telefon:");
                                        int tlf = sc.nextInt();
                                        control.afegirClient(nom,id,dni,tlf);
                                        System.out.println("Client afegit.");
                                        break;
                                    
                                    case 2:
                                        System.out.println("Has seleccionat editar un client.");
                                        control.mostrarClients();
                                        System.out.println("Selecciona el numero del client:");
                                        int c = sc.nextInt();
                                        System.out.println("Nou nom:");
                                        String nomC = sc.nextLine();
                                        System.out.println("Nou DNI:");
                                        String dniC = sc.nextLine();
                                        System.out.println("Nou ID:");
                                        int idC = sc.nextInt();
                                        System.out.println("Nou telefon:");
                                        int tlfC = sc.nextInt();
                                        control.editarClient(control.getDades().getLlistaClients().get(c), nomC, idC, dniC, tlfC);
                                        System.out.println("Client editat.");
                                        break;
                                    
                                    case 3:
                                        System.out.println("Has seleccionat eliminar un client.");
                                        control.mostrarClients();
                                        System.out.println("Selecciona el numero del client:");
                                        int ec = sc.nextInt();
                                        control.borrarClient(ec-1);
                                        System.out.println("Client eliminat.");
                                        break;
                                    
                                    default:
                                        System.out.println("Numero no reconegut");
                                        break;
                                }
                                System.out.println("\n");
                            }
                            catch(Exception e){
                                System.out.println("Error");
                            }
                        }
                        break;
                    case 2:
                        while (selectP != 0) {
                            try {
                                System.out.println("MENU PISOS:");
                                System.out.println("1.- Nou Pis");
                                System.out.println("2.- Editar Pis");
                                System.out.println("3.- Eliminar Pis");
                                System.out.println("0.- Enrere");
                                selectP = Integer.parseInt(sc.nextLine());
                                switch(selectP) {
                                    
                                    case 1:
                                        System.out.println("Has seleccionat afegir un nou pis.");
                                        System.out.println("Direccio:");
                                        String direccioP = sc.nextLine();
                                        System.out.println("ID:");
                                        int idP = sc.nextInt();
                                        System.out.println("Preu:");
                                        double preuP = sc.nextDouble();
                                        System.out.println("Oferta (0-no, 1-si):");
                                        int o = sc.nextInt();
                                        boolean ofertaP = false;
                                        if (o == 1) {
                                            ofertaP = true;
                                        }
                                        control.afegirPis(direccioP, idP, ofertaP, preuP);
                                        System.out.println("Pis afegit.");
                                        break;
                                    
                                    case 2:
                                        System.out.println("Has seleccionat editar un pis.");
                                        control.mostrarPisos();
                                        System.out.println("Selecciona el numero del pis:");
                                        int p = sc.nextInt();
                                        System.out.println("Nova direccio:");
                                        String direccio = sc.nextLine();
                                        System.out.println("Nou ID:");
                                        int id = sc.nextInt();
                                        System.out.println("Nou preu:");
                                        double preu = sc.nextDouble();
                                        System.out.println("Nova oferta (0-no, 1-si:");
                                        int s = sc.nextInt();
                                        boolean oferta = false;
                                        if (s == 1) {
                                            oferta = true;
                                        }
                                        control.editarPis(control.getDades().getLlistaPisos().get(p), direccio, id, oferta, preu);
                                        System.out.println("Pis editat.");
                                        break;
                                    
                                    case 3:
                                        System.out.println("Has seleccionat eliminar un Pis.");
                                        control.mostrarPisos();
                                        System.out.println("Selecciona el numero del pis:");
                                        int ep = sc.nextInt();
                                        control.borrarPis(ep-1);
                                        System.out.println("Pis eliminat.");
                                        break;
                                   
                                    default:
                                        System.out.println("Numero no reconegut");
                                        break;
                                }
                                System.out.println("\n");
                            }
                            catch(Exception e){
                                System.out.println("Error");
                            }
                        }
                        break;
                    case 3:
                        while (selectV != 0) {
                            try {
                                System.out.println("MENU VISITES:");
                                System.out.println("1.- Nova Visita");
                                System.out.println("2.- Editar Visita");
                                System.out.println("3.- Eliminar Visita");
                                System.out.println("0.- Enrere");
                                selectV = Integer.parseInt(sc.nextLine());
                                switch(selectV) {
                                    
                                    case 1:
                                        System.out.println("Has seleccionat afegir una nova visita.");
                                        control.mostrarClients();
                                        System.out.println("Selecciona el numero d'un client:");
                                        int posC = sc.nextInt();
                                        control.mostrarPisos();
                                        System.out.println("Selecciona el numero d'un pis:");
                                        int posP = sc.nextInt();
                                        System.out.println("ID:");
                                        int id = sc.nextInt();
                                        System.out.println("Data:");
                                        String data = sc.nextLine();
                                        System.out.println("Hora:");
                                        String hora = sc.nextLine();
                                        control.afegirVisita(posC, posP, id, data, hora);
                                        System.out.println("Visita afegida.");
                                        break;
                                    
                                    case 2:
                                        System.out.println("Has seleccionat editar una visita.");
                                        control.mostrarVisites();
                                        System.out.println("Selecciona el numero de la visita:");
                                        int v = sc.nextInt();
                                        control.mostrarClients();
                                        System.out.println("Selecciona el numero del client:");
                                        int client = sc.nextInt();
                                        control.mostrarPisos();
                                        System.out.println("Selecciona el numero del pis:");
                                        int pis = sc.nextInt();
                                        System.out.println("ID:");
                                        int idV = sc.nextInt();
                                        System.out.println("Data:");
                                        String dataV = sc.nextLine();
                                        System.out.println("Hora");
                                        String horaV = sc.nextLine();
                                        control.editarVisita(control.getDades().getLlistaVisites().get(v), control.getDades().getLlistaClients().get(client),
                                                            control.getDades().getLlistaPisos().get(pis), idV, horaV, dataV);
                                        System.out.println("Visita editada.");
                                        break;
                                    
                                    case 3:
                                        System.out.println("Has seleccionat eliminar una visita.");
                                        control.mostrarVisites();
                                        System.out.println("Selecciona el numero de la visita:");
                                        int vi = sc.nextInt();
                                        control.borrarVista(vi-1);
                                        System.out.println("Visita eliminada.");
                                        break;
                                    
                                    default:
                                        System.out.println("Numero no reconegut");
                                        break;
                                }
                                System.out.println("\n");
                            }
                            catch(Exception e){
                                System.out.println("Error");
                            }
                        }
                    default:
                        System.out.println("Numero no reconegut");
                        break;
                }
                System.out.println("\n");
            }
            catch(Exception e){
                System.out.println("Error");
            }
        }
    }
    
}