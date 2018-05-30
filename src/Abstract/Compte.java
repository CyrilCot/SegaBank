package Abstract;

public abstract class Compte {

    protected static int increment = 0;

    protected double solde;
    protected int numeroCompte;

    protected int getNumeroCompte() {
        return ++increment;
    }

    @Override
    public String toString() {
        return "Compte n°" + numeroCompte + " - Solde de " + solde ;
    }
}
