package Abstract;

import java.util.ArrayList;

public abstract class Agence {

    protected static int increment = 0;
    protected String adresse;
    protected ArrayList<Compte> listeCompte = new ArrayList<Compte>();
    protected int numeroAgence = 0;

    protected int getNumeroAgence() {
        return ++increment;
    }

    protected void setAdresse(String adresse){
        this.adresse = adresse;
    }

    protected String getAdresse(String adresse){
        return this.adresse;
    }

    protected void addCompte(Compte compte) {
        listeCompte.add(compte);
    }

    protected void removeCompte(Compte compte) {
        listeCompte.remove(compte);
    }

}
