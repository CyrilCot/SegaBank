package Model;

import Interface.Agence;

import java.util.ArrayList;

public class ListeAgence {

    ArrayList<Agence> listeAgence = new ArrayList<Agence>();

    public String getListeAgence(){
        return listeAgence.toString();
    }

    public void setListeAgence(ArrayList<Agence> listeAgence){
        this.listeAgence = listeAgence;
    }

    public void add(Agence agence) {
        listeAgence.add(agence);
    }

    public void remove(Agence agence) {
        listeAgence.remove(agence);
    }
    
    public Agence getAgence(Integer numero){

        Agence agenceSearched = new Model.Agence();

        for (Agence agence : listeAgence) {

            if(numero.equals(agence.getNumeroAgence())){
                agenceSearched = agence;
            }

        }

        return agenceSearched;

    }
}
