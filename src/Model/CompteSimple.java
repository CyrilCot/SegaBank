package Model;

import Abstract.Compte;

public class CompteSimple extends Compte implements Interface.Compte {

    final int decouvert = 200;

    public CompteSimple(int solde) {
        this.solde = solde;
        this.numeroCompte = super.getNumeroCompte();
    }

    @Override
    public void Versement(double montant) {
        solde += montant;
    }

    @Override
    public void Retrait(double montant) {
        if(solde - montant >= decouvert) {
            solde -= montant;
        }else{
            System.out.println("Exception: Pas assez d'argent sur le compte pour faire cette opération");
        }
    }

}
