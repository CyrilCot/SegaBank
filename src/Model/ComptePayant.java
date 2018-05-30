package Model;

import Abstract.Compte;

public class ComptePayant extends Compte implements Interface.Compte {

    final double tauxTaxe= 5/100;

    public ComptePayant(int solde) {
        this.solde = solde;
        this.numeroCompte = super.getNumeroCompte();
    }

    @Override
    public void Versement(double montant) {
        solde += montant;

        double taxe = montant*tauxTaxe;
        solde -= taxe;
    }

    @Override
    public void Retrait(double montant) {
        solde -= montant;

        double taxe = montant*tauxTaxe;
        solde -= taxe;
    }

}