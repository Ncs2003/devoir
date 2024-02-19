import java.util.List;
import java.util.Scanner;

import entities.zone;
import services.bienservices;
import services.zoneservices;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);

        bienservices bienservice=new bienservices();
        zoneservices zoneservices=new zoneservices();

        do {
            System.out.println("1-creer une zone");
            System.out.println("2-Lister les zones"); 
            System.out.println("3-ajouter un bien et lui associe une zone"); 
            System.out.println("4-lister les biens en affichant le nom de la zone");
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrer un id");
                String id=sc.nextLine(); 
                System.out.println("Entrer un nom");
                String nom=sc.nextLine();  
                 zone ag=new zone();
                 ag.setId(id);
                 ag.setNom(nom);
                 zoneservices.creerunezone(ag);
               break;
               case 2:
                    List<zone> zone=  zoneservices.listerzone();
                     for ( zone zone: zone) {
                          System.out.println("id "+ zone.getId());
                          System.out.println("nom"+ zone.getNom());
                          System.out.println("=================================");
                     }
                    break;

                }
    
        }
}

}
