package Model;


public class Agence extends Abstract.Agence implements Interface.Agence {

    public Agence() { }

    public Agence(String adresse) {
        this.adresse = adresse;
    }

    public int getNumeroAgence(){
        return this.numeroAgence;
    }

}
