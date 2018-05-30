package Model;

import Abstract.Compte;

public class CompteEpargne extends Compte implements Interface.Compte {

    final double tauxInteret = 5/100;

    public CompteEpargne(int solde) {
        this.solde = solde;
        this.numeroCompte = super.getNumeroCompte();
    }

    public void calculInteret(){
        double interet = solde*tauxInteret;
        solde += interet;
    }

    @Override
    public void Versement(double montant) {
        solde += montant;
    }

    @Override
    public void Retrait(double montant) {
        solde -= montant;
    }

}
