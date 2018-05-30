import Interface.Compte;
import Model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choix = new String();

        boolean exit = false;

        ListeAgence listeAgence = new ListeAgence();
        ListeCompte listeCompte = new ListeCompte();

        menuMain();

        do{
            choix = menuPrincipal();

        } while(!exit);

    }

    public static void menuMain(){
        System.out.println("Bienvenue dans notre application de gestion d'agences et de comptes bancaires");
        System.out.println("_____________________________________________________________________________");
        System.out.println("");
    }

    public static String menuPrincipal() {
        System.out.println("1. Liste des agences");
        System.out.println("2. Liste des comptes bancaires");
        System.out.println("3. Créer une agence");
        System.out.println("4. Créer un compte bancaire");
        return saisie();
    }

    public void menuListeAgences(){
        ListeAgence listeAgence = new ListeAgence();
        System.out.println(listeAgence);
    }

    public void menuListeComptesBancaires(){
        ListeCompte listeCompte = new ListeCompte();
        System.out.println(listeCompte);
    }

    public void menuCreerAgence(ListeAgence listeAgence){
        System.out.println("Saisissez l'adresse de l'agence");
        Agence agence = new Agence(saisie());
        listeAgence.add(agence);
    }

    public void menuCreerCompteBancaire(){

        Compte nouveauCompte;

        System.out.println("Quel type de compte voulez-vous créer?");
        System.out.println("1. Compte Simple");
        System.out.println("2. Compte Epargne");
        System.out.println("3. Compte Payant");

        String typeCompte = saisie();

        System.out.println("Quel est le montant versé à la création?");

        Integer solde = Integer.parseInt(saisie());

        switch (typeCompte){
            case "1":
                nouveauCompte = new CompteSimple(solde);
                break;
            case "2":
                nouveauCompte = new CompteEpargne(solde);
                break;
            case "3":
                nouveauCompte = new ComptePayant(solde);
                break;
            default:
                break;
        }

        System.out.println("Dans quelle agence souhaitez-vous affecter ce compte?");

        menuListeAgences();
        String choix = saisie();

        switch(choix){
            // Créer le compte avec le solde
        }

        //  Affecter à l'agence

    }

    public static String saisie(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
